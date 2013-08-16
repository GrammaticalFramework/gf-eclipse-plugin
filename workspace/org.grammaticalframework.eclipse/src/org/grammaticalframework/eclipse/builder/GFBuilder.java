/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.grammaticalframework.eclipse.GFPreferences;
import org.apache.log4j.Logger;

/**
 * Custom GF builder
 * Some refs..
 * 	http://wiki.eclipse.org/FAQ_How_do_I_implement_an_incremental_project_builder%3F
 * 	http://www.eclipse.org/articles/Article-Builders/builders.html
 * 
 * @author John J. Camilleri
 *
 */
public class GFBuilder extends IncrementalProjectBuilder {

	/**
	 * Builder ID.
	 */
	public static final String BUILDER_ID = "org.grammaticalframework.eclipse.ui.build.GFBuilderID"; //$NON-NLS-1$

	/**
	 * Folder for tags files
	 */
	public static final String BUILD_FOLDER = ".gfbuild"; //$NON-NLS-1$
	
	/**
	 * Folder for links to external files
	 * Since 1.5, this has been made the same as the build folder.
	 */
//	public static final String EXTERNAL_FOLDER = ".gfexternal"; //$NON-NLS-1$
	public static final String EXTERNAL_FOLDER = BUILD_FOLDER;
	
	/**
	 * Use a single external folder per project, or in every source code folder?
	 */
	public static final Boolean USE_GLOBAL_EXTERNAL_FOLDER = false;

	/**
	 * Settings for during the build process
	 */
	private String gfPath;
	private String gfLibPath;
//	private Boolean buildDependents;
	private IFile[] buildFiles;
	private HashSet<IFile> buildFilesSet;
	private Boolean buildFilesInclusiveMode;
	
	/**
	 * For avoiding duplicate work
	 */
	private Long buildStartTime;

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFBuilder.class);

	/**
	 * Main build method
	 */
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws OperationCanceledException, CoreException {
		// Get some prefs
		gfPath = GFPreferences.getRuntimePath();
		if (gfPath == null || gfPath.trim().isEmpty()) {
			log.error("GF path not specified. Please check your preferences.");
			return null;
		}
		gfLibPath = GFPreferences.getLibraryPath();
//		buildDependents = GFPreferences.getBuildDependents();
		buildFiles = GFBuilderHelper.getBuildFiles(getProject());
		buildFilesSet = new HashSet<IFile>(buildFiles.length);
		for (int i = 0; i < buildFiles.length; i++) {
			buildFilesSet.add(buildFiles[i]);
		}
		buildFilesInclusiveMode = GFBuilderHelper.getBuildFileInclusiveMode(getProject());
		
		// Test GF path
		if (!checkGFPath()) {
			log.error("GF path '"+gfPath+"' is not valid/executable. Please check your preferences.");
			return null;
		}
		
		// Record start time
		buildStartTime = new Date().getTime();
		
		try {
			switch (kind) {
			case IncrementalProjectBuilder.FULL_BUILD:
				fullBuild(monitor);
				break;
			case IncrementalProjectBuilder.INCREMENTAL_BUILD:
			case IncrementalProjectBuilder.AUTO_BUILD:
				IResourceDelta delta = getDelta(getProject());
				if (delta == null) {
					fullBuild(monitor);
				} else if (buildFilesInclusiveMode && buildFiles.length > 0) {
					guidedBuild(delta, monitor);
				} else {
					incrementalBuild(delta, monitor);
				}
				break;
			}
			
			// Force project refresh
			getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			
		} catch (OperationCanceledException e) {
			log.info("Build cancelled");
			throw e; // handled by the platform
		}
		
		// build has no dependencies on other projects
		return null;
	}

	/**
	 * Full build.
	 *
	 * @param monitor the monitor
	 * @throws CoreException the core exception
	 */
	private void fullBuild(final IProgressMonitor monitor) throws OperationCanceledException, CoreException {
		log.info("Full build on: " + getProject().getName());
		
		// If we have some build files selected, use those
		if (buildFilesInclusiveMode && buildFiles.length > 0) {
			monitor.beginTask("Building " + getProject().getName(), buildFiles.length);
			for (int i = 0; i < buildFiles.length; i++) {
				// Check for cancellation
				if (monitor.isCanceled()) {
					throw new OperationCanceledException();
				}
				// Build
				if (isBuildable(buildFiles[i])) {
					monitor.subTask("Building "+buildFiles[i].getName());
					buildFile(buildFiles[i]);
					monitor.worked(1);
				}
			}
			monitor.done();
		}
		// Otherwise visit every file in project
		else {
			int total_work = GFBuilderHelper.estimateProjectSize(getProject());
			monitor.beginTask("Building " + getProject().getName(), total_work);
			getProject().accept(new IResourceVisitor() {
				public boolean visit(IResource resource) {
					// Check for cancellation
					if (monitor.isCanceled()) {
						throw new OperationCanceledException();
					}
					// Build
					if (isBuildable(resource)) {
						monitor.subTask("Building "+resource.getName());
						buildFile((IFile) resource);
						monitor.worked(1);
					}
					
					// Visit children too
					return true;
				}
			});
			monitor.done();
		}
		
	}

	/**
	 * Incremental build when (inclusive) build files are specified
	 * For each build file, see if any of the files in the delta are in the build files imports
	 * If so then build the build file (never attempt to build a file not in the build files!)
	 *
	 * @param delta the delta
	 * @param monitor the monitor
	 * @throws CoreException 
	 */
	private void guidedBuild(final IResourceDelta projectDelta, final IProgressMonitor monitor) throws OperationCanceledException, CoreException {
		log.info("Guided build on: " + projectDelta.getResource().getName());
		monitor.beginTask("Building " + getProject().getName(), buildFiles.length);
		
		// Iterate over build files
		for (int i = 0; i < buildFiles.length; i++) {
			final IFile buildFile = buildFiles[i];			                       

			// Check for cancellation
			if (monitor.isCanceled()) {
				throw new OperationCanceledException();
			}

			// Get dependencies of build file - if null then always build
//			Set<String> imports = GFBuilderHelper.getFileImports(buildFile);
			final Set<String> dependencies = GFBuilderHelper.getDependenciesFromTagsFile(buildFile);
			if (dependencies == null) {
				monitor.subTask("Building "+buildFile.getName());
				buildFile(buildFile);
				monitor.worked(1);
				continue;
			}

			// Visit all affected files
			projectDelta.accept(new IResourceDeltaVisitor() {
				public boolean visit(IResourceDelta delta) {
					IResource res = delta.getResource();			                       			                       
					if (isBuildable(res)) {
						IFile deltaFile = (IFile)res;
						// This check is weak, but quick and in the worst case just results in
						// slightly over-zealous building.
						if (deltaFile.equals(buildFile) || dependencies.contains(GFBuilderHelper.getModuleNameFromFile(deltaFile))) {
							buildFile(buildFile);
							return false; // stop visitor
						}
					}
					return true; // Visit children too
				}
			});
			monitor.worked(1);
		}
		monitor.done();
	}

	/**
	 * Incremental build (when no build files are specified)
	 * Just attempt to build everything
	 *
	 * @param delta the delta
	 * @param monitor the monitor
	 * @throws CoreException 
	 */
	private void incrementalBuild(final IResourceDelta projectDelta, final IProgressMonitor monitor) throws OperationCanceledException, CoreException {
		log.info("Incremental build on: " + projectDelta.getResource().getName());

		// For being able to measure the work completed
		int total_work = 5; // avg size of incremental build? no way to know beforehand
		monitor.beginTask("Building " + getProject().getName(), total_work);
		
		// Rebuild changed files
		projectDelta.accept(new IResourceDeltaVisitor() {
			public boolean visit(IResourceDelta delta) {
				
				// Check for cancellation
				if (monitor.isCanceled()) {
					throw new OperationCanceledException();
				}
				
				// Do we want to bother further? 
				if (!isBuildable(delta.getResource())) {
					monitor.worked(1);
					return true;
				}
				IFile file = (IFile)delta.getResource(); 
				
				int kind = delta.getKind();
				int flags = delta.getFlags();
				int mask_new = IResourceDelta.COPIED_FROM | IResourceDelta.MOVED_FROM;
				int mask_change = IResourceDelta.CONTENT;
				
				// Only build if new or changed
				boolean isAddOrEdit = false;
				if (kind == IResourceDelta.ADDED || (flags & mask_new) == mask_new) {
					isAddOrEdit = true;
				}
				else if (kind == IResourceDelta.CHANGED && (flags & mask_change) == mask_change) {
					isAddOrEdit = true;
				}
				if (isAddOrEdit && !isExcluded(file)) {
					monitor.subTask("Building "+file.getName());
					buildFile(file);
				}
				
				// Visit children too
				monitor.worked(1);
				return true;
			}
		});
		monitor.done();
	}
	
	/**
	 * Clean Project (invoked by user via menu)
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		log.info("Clean on: " + getProject().getName());
		
		int total_work = GFBuilderHelper.estimateProjectSize(getProject());
		monitor.beginTask("Cleaning " + getProject().getName(), total_work);
		
		// Delete all markers
		getProject().deleteMarkers(null, true, IResource.DEPTH_INFINITE);
		
		// Visit everyone!
		getProject().accept(new IResourceVisitor() {
			public boolean visit(IResource resource) {
				// Check for cancellation
				if (monitor.isCanceled()) {
					throw new OperationCanceledException();
				}
				
				// If it's a buildable file, then clear its 'imports' data!
				if (isBuildable(resource)) {
					GFBuilderHelper.clearFileImports(resource);
					monitor.worked(1);
					return true;
				}
				
				// Decide if we want to delete it
				boolean isFile = resource instanceof IFile;
				boolean isFolder = resource instanceof IFolder;
				String extension = (resource.getFileExtension() != null) ? resource.getFileExtension() : "";
				String parent = (resource.getParent() != null) ? resource.getParent().getName() : "";

				boolean delete = false;
				
				// Just delete the build/external folders outright
				if (isFolder && (resource.getName().equals(BUILD_FOLDER) || resource.getName().equals(BUILD_FOLDER))) {
					delete = true;
				}
				
				// This is to handle the upgrade to 1.5, where build and external folders were combined
				else if (isFolder && (resource.getName().equals(".gfexternal"))) {
					delete = true;
				}
				
				// Delete gfo files, build/external files (should be obsolete cos of above)
				else if (isFile && (extension.equals("gfo") || parent.equals(BUILD_FOLDER) || parent.equals(EXTERNAL_FOLDER))) {
					delete = true;
				}
				
				// Do the deed
				if (delete) {
					try {
						resource.delete(true, monitor);
						log.info("Deleted: " + resource.getFullPath());
					} catch (CoreException e) {
						log.warn("Delete failed: " + resource.getFullPath(), e);
					}
				}

				// Only visit children of something not deleted
				monitor.worked(1);
				return !delete;
			}
		});		
		monitor.done();
	}
	
	/**
	 * Determine if a resource should be built, based on its properties.
	 *
	 * @param resource the resource
	 * @return true, if this is a source file which should be built
	 */
	private boolean isBuildable(IResource resource) {
		if (resource == null)
			return false;
		boolean isFile = resource.getType() == IResource.FILE;
		String ext = resource.getFileExtension();
		boolean isGF = ext != null && ext.equals("gf");
		IContainer parent = resource.getParent();
		boolean notInBuildFolder = !parent.getName().equals(GFBuilder.BUILD_FOLDER);
		boolean notInExternalFolder = !parent.getName().equals(GFBuilder.EXTERNAL_FOLDER);
		if (isFile && isGF && notInBuildFolder && notInExternalFolder) {
			IFile file = (IFile) resource;
			if (isExcluded(file)) {
				log.info("Skipping excluded file: " + file.getFullPath());
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	/**
	 * Determine if a resource is in an exclusion list
	 *
	 * @param resource the resource
	 * @return true, if this is a source file which should be excluded
	 */
	private boolean isExcluded(IFile file) {
		if (buildFilesInclusiveMode || buildFiles.length == 0) {
			return false;
		} else {
			return buildFilesSet.contains(file);
		}
	}

	/**
	 * Test if path to GF executable is correct and runnable
	 *
	 * @return true, if GF can be run OK
	 */
	private boolean checkGFPath() {
		try {
			// Put together call
			ArrayList<String> command = new ArrayList<String>();
			command.add(gfPath);
			command.add("--version");

			// Execute command
			ProcessBuilder pbTags = new ProcessBuilder(command);
			pbTags.redirectErrorStream(false);
			Process procTags = pbTags.start();
			
			// Consume & log all output
			BufferedReader processOutput = new BufferedReader(new InputStreamReader(procTags.getInputStream()));
			String out_str;
			StringBuilder out = new StringBuilder();
			while ((out_str = processOutput.readLine()) != null) {
				out.append(out_str);
			}
			
			// If compile failed, parse error messages and add markers
			if (procTags.waitFor() == 0) {
				return true;
			} else {
				return false;
			}

		} catch (IOException e) {
//			log.error("GF test failed");
			return false;
		} catch (InterruptedException e) {
			log.error("GF test interrupted");
			return false;
		}

	}
	
	/**
	 * Build an individual file, including pre & post tasks
	 * @param file
	 * @return
	 */
	private void buildFile(IFile file) {
		// See if it's already been computed in this cycle
		long mtime = GFBuilderHelper.getTagsFileMTime(file);
		if (mtime > this.buildStartTime) {
			log.info("Skipping: " + file.getFullPath());
			return;
		}
		
		// Clean up first
		try {
			file.deleteMarkers(null, true, IResource.DEPTH_ZERO);
		} catch(CoreException e) {
			log.warn("Error deleting markers for: " + file.getFullPath(), e);
		}
		
		// Do it
		buildFileTags(file);
		
		// Process tags file and save imports
		Set<String> imports = GFBuilderHelper.getDependenciesFromTagsFile(file);
		GFBuilderHelper.saveFileImports(file, imports);
	}
	
	/**
	 * For a single .gf file, compile it with the GF -tags flag which outputs
	 * a single tags file.
	 *
	 * @param file the file
	 */
	private void buildFileTags(IFile file) {

		String filename = file.getName();
		String workingDir = file.getRawLocation().removeLastSegments(1).toOSString() + java.io.File.separator;
		String buildDir = GFBuilderHelper.getBuildDirectory(file);

		try {
			// Check the build directory and try to create it
			File workingDirFile = new File(workingDir);
			File buildDirFile = new File(buildDir);
			if (!buildDirFile.exists()) {
				buildDirFile.mkdir();
			}

			// Compile to get tags with: gf --tags HelloEng.gf
			ArrayList<String> command = new ArrayList<String>();
			command.add(gfPath);
			command.add("--v=0"); // quiet - errors are still displayed
			command.add("--tags");
			command.add("--output-dir=" + buildDir);

			// Use library path in command (if supplied)
			if (gfLibPath != null && !gfLibPath.isEmpty()) {
//				command.add("--gf-lib-path=" + gfLibPath); 
				command.add("--path=" + gfLibPath); 
			}
			
			command.add(filename);
			
			// For debugging what's getting called
			StringBuilder sb = new StringBuilder("Running command:");
			for (String s : command) sb.append(" "+s);
			log.debug(sb.toString());

			// Execute command
			ProcessBuilder pbTags = new ProcessBuilder(command);
			pbTags.directory(workingDirFile);
			pbTags.redirectErrorStream(false);
			Process procTags = pbTags.start();
			
            // Gobble out/err streams in new threads
            StreamReader errorGobbler = new StreamReader(procTags.getErrorStream(), "ERROR");            
            StreamReader outputGobbler = new StreamReader(procTags.getInputStream(), "OUTPUT");
            errorGobbler.start();
			outputGobbler.start();
			
			// If compile failed, parse error messages and add markers
			if (procTags.waitFor() != 0) {
				String message = parseGFErrorStream(file, errorGobbler);
				log.warn(String.format("Build failed on: %s\n%s", file.getFullPath(), message));
			} else {
				log.info("Built: "+ file.getFullPath());
			}

		} catch (IOException e) {
			log.error("Build failed on: "+file.getFullPath(), e);
		} catch (InterruptedException e) {
			log.error("Build interrupted on: "+file.getFullPath(), e);
		}
	}
	
	/**
	 * Separate method for parsing the GF error stream and adding markers as necessary
	 * 
	 * @param file
	 * @param errStream
	 */
	private String parseGFErrorStream(IFile file, StreamReader errorGobbler) {
		List<String> errorLines = errorGobbler.getLines();
		String errorString = errorGobbler.getContents();
		try {
			// ===== First just the types of errors than only occur once =====

			// module name Wkbx differs from file name Wkb
			if (errorLines.get(0).matches("^module name (.+) differs from file name (.+)$")) {
				setMarker(file, errorLines.get(0));
				return errorLines.get(0);
			}
			
			//	/home/john/repositories/gf-eclipse-plugin/workspace-demo/Hello/ResEng.gf:5:17:
			//	   syntax error
//			if (errorLines.get(0).matches(".+\\.gf:(\\d+):(\\d+):.*")) {
			if (errorLines.size() > 1 && errorLines.get(1).equals("   syntax error")) {
				StringBuilder sb = new StringBuilder();
				for (String s : errorLines) {
				    sb.append(s);
				    sb.append("\n");
				}
				return sb.toString();
			}

			//	File ParadXXigmsEng.gf does not exist.
			//	searched in: ./
            //				/home/john/repositories/gf-eclipse-plugin/workspace-demo/Functors
            //				/home/john/.cabal/share/gf-3.3/lib
            //				/home/john/.cabal/share/gf-3.3/lib/present
            //				/home/john/.cabal/share/gf-3.3/lib/prelude
			if (errorLines.get(0).matches("^File (.+) does not exist.$")) {
				setMarker(file, errorLines.get(0));
				return errorString.toString();
			}
			
			// ===== Now the warnings than can occur more than once =====
			
			//	/home/john/repositories/gf-eclipse-plugin/workspace-demo/Hello/HelloEng.gf:9:
			//	Happened in the renaming of Recipient
			//	   constant not found: Gender
			//	   given ResEng, HelloEng
			int i = 0;
			Pattern pattern = Pattern.compile("([^/\\\\]+\\.gf):(\\d+)(-(\\d+))?:$");
			Matcher matcher;
			while (i < errorLines.size()) {
				matcher = pattern.matcher(errorLines.get(i++));
				if (matcher.find()) {
					Integer lineNo = Integer.parseInt(matcher.group(2));
//					Integer lineTo = Integer.parseInt(matcher.group(4));

					// Cosume message until end of indentation
					StringBuilder sb = new StringBuilder();
					sb.append(errorLines.get(i++));
					while (true) {
						if (i >= errorLines.size() || !errorLines.get(i).startsWith("   "))
							break;
						sb.append("\n").append(errorLines.get(i++));
					}
					setMarker(file, sb.toString(), lineNo);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			log.info("Unrecognized error format when building: " + file.getFullPath(), e);
		} catch (NullPointerException e) {
			log.info("Unrecognized error format when building: " + file.getFullPath(), e);
		}		
		return errorString.toString();
	}

	/**
	 * Add a marker to a file
	 * @param file
	 * @param message
	 */
	private void setMarker(IFile file, String message) {
		setMarker(file, message, null);
	}

	/**
	 * Add a marker to a file, including line number
	 * @param file
	 * @param message
	 * @param lineNo
	 */
	private void setMarker(IFile file, String message, Integer lineNo) {
		IMarker marker;
		try {
			marker = file.createMarker("org.eclipse.xtext.ui.check.normal"); // Instead of IMarker.PROBLEM
			marker.setAttribute(IMarker.USER_EDITABLE, false);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			marker.setAttribute(IMarker.LOCATION, file.getFullPath().toString());
			if (message != null)
				marker.setAttribute(IMarker.MESSAGE, message);
			if (lineNo != null)
				marker.setAttribute(IMarker.LINE_NUMBER, lineNo);
		} catch (CoreException e) {
			log.warn("Error creating marker on: " + file.getFullPath(), e);
		}

	}
	
}
