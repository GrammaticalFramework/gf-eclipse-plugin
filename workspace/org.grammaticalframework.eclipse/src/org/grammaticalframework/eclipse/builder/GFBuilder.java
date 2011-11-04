/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.builder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.grammaticalframework.eclipse.GFPreferences;

import org.apache.log4j.Logger;

/**
 * Custom GF builder, yeah!
 * Some refs..
 * 	http://wiki.eclipse.org/FAQ_How_do_I_implement_an_incremental_project_builder%3F
 * 	http://www.eclipse.org/articles/Article-Builders/builders.html
 * 
 * TODO Adding of markers to files
 * TODO Should this class actually be moved to the UI plugin?
 * TODO Support for monitor, when building takes a long time (progress, cancellation)
 * 
 * @author John J. Camilleri
 *
 */
public class GFBuilder extends IncrementalProjectBuilder {

	/**
	 * The Constant BUILDER_ID.
	 */
	public static final String BUILDER_ID = "org.grammaticalframework.eclipse.ui.build.GFBuilderID"; //$NON-NLS-1$

	/**
	 * The Constant BUILD_FOLDER.
	 */
	public static final String BUILD_FOLDER = ".gfbuild"; //$NON-NLS-1$

	/**
	 * The Constant USE_INDIVIDUAL_FOLDERS.
	 */
	public static final Boolean USE_INDIVIDUAL_FOLDERS = false;

	/**
	 * The GF paths.
	 */
	private String gfPath;
	private String gfLibPath;

	/**
	 * The Constant log.
	 */
	private static final Logger log = Logger.getLogger(GFBuilder.class);
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		// Get some prefs
		gfPath = GFPreferences.getRuntimePath();
		if (gfPath == null || gfPath.trim().isEmpty()) {
			log.error("Error during build: GF path not specified.");
			return null;
		}
		gfLibPath = GFPreferences.getLibraryPath();
		
		if (kind == IncrementalProjectBuilder.FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	/**
	 * Incremental build.
	 *
	 * @param delta the delta
	 * @param monitor the monitor
	 */
	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
		log.info("Incremental build on " + delta.getResource().getName());
		try {
			delta.accept(new IResourceDeltaVisitor() {
				public boolean visit(IResourceDelta delta) {
					IResource resource = delta.getResource();
					int kind = delta.getKind(); 
					if (kind == IResourceDelta.ADDED || kind == IResourceDelta.CHANGED) {
						if (shouldBuild(resource)) {
							if (USE_INDIVIDUAL_FOLDERS) {
								cleanFile((IFile) resource);
							}
							if (buildFile((IFile) resource)) {
								log.info("  + " + delta.getResource().getRawLocation());
							} else {
								log.warn("  > Failed: " + delta.getResource().getRawLocation());
							}
						}
						
					}
					return true; // visit children too
				}
			});
			getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Full build.
	 *
	 * @param monitor the monitor
	 * @throws CoreException the core exception
	 */
	private void fullBuild(IProgressMonitor monitor) throws CoreException {
		log.info("Full build on " + getProject().getName());
		recursiveDispatcher(getProject().members(), new CallableOnResource() {
			public void call(IResource resource) {
				if (shouldBuild(resource)) {
					if (buildFile((IFile) resource)) {
						log.info("  + " + resource.getName());
					} else {
						log.warn("  > Failed: " + resource.getName());
					}
				}
			}
		});
		getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#clean(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		log.info("Clean " + getProject().getName());
		
		// TODO Delete markers with getProject().deleteMarkers()
		recursiveDispatcher(getProject().members(), new CallableOnResource() {
			public void call(IResource resource) {
				if (resource.getType() == IResource.FILE && resource.getFileExtension().equals("gfh")) {
					try {
						resource.delete(true, monitor);
						log.info("  - " + resource.getName());
					} catch (CoreException e) {
						log.warn("  > Failed: " + resource.getName());
						e.printStackTrace();
					}
				}
			}
		});
	}
  
	
	/**
	 * For recursively applying a function to an IResource.
	 */
	interface CallableOnResource {
		
		/**
		 * Call.
		 *
		 * @param resource the resource
		 */
		public void call(IResource resource);
	}
	
	/**
	 * Recursive dispatcher.
	 *
	 * @param res the res
	 * @param func the func
	 */
	private void recursiveDispatcher(IResource[] res, CallableOnResource func) {
		try {
			for (IResource r : res) {
				if (r.getType() == IResource.FOLDER) {
					recursiveDispatcher(((IFolder)r).members(), func);
				} else {
					func.call(r);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Determine if a resource should be built, based on its properties.
	 *
	 * @param resource the resource
	 * @return true, if successful
	 */
	private boolean shouldBuild(IResource resource) {
		try {
			return resource.getType() == IResource.FILE && resource.getFileExtension().equals("gf");
		} catch (NullPointerException _) {
			return false;
		}
	}
	
	/**
	 * Gets the builds the directory.
	 *
	 * @param file the file
	 * @return the builds the directory
	 */
	private String getBuildDirectory(IFile file) {
		String filename = file.getName();
		if (USE_INDIVIDUAL_FOLDERS) {
			return file.getRawLocation().removeLastSegments(1).toOSString()
					+ java.io.File.separator
					+ BUILD_FOLDER
					+ java.io.File.separator
					+ filename
					+ java.io.File.separator;
		} else {
			return file.getRawLocation().removeLastSegments(1).toOSString()
				+ java.io.File.separator
				+ BUILD_FOLDER
				+ java.io.File.separator;
		}
	}

	/**
	 * For a single .gf file, compile it with GF and run "ss -strip -save" to
	 * capture all the GF headers in the build subfolder.
	 * 
	 * TODO Share a single process for the whole build cycle to save on overheads
	 *
	 * @param file the file
	 * @return true, if successful
	 */
	private boolean buildFile(IFile file) {
		/* 
		 * We want to compile each source file in .gf with these commands:
		 * i --retain HelloEng.gf
		 * ss -strip -save
		 * 
		 * Shell command: echo "ss -strip -save" | gf -retain HelloEng.gf
		 */
		String filename = file.getName();
		String buildDir = getBuildDirectory(file);
		
		ArrayList<String> command = new ArrayList<String>();
		command.add(gfPath);
		command.add("--retain");
		
		// Use library path in command (if supplied)
		if (gfLibPath != null && !gfLibPath.isEmpty()) {
			command.add(String.format("--gf-lib-path=\"%s\"", gfLibPath));
		}
		
		if (USE_INDIVIDUAL_FOLDERS) {
			command.add(String.format("..%1$s..%1$s%2$s", java.io.File.separator, filename));
		} else {
			command.add(".." + java.io.File.separator + filename);
		}
		
		try {
			// Check the build directory and try to create it
			File buildDirFile = new File(buildDir);
			if (!buildDirFile.exists()) {
				buildDirFile.mkdir();
			}
			
			// Piece together our GF process
			ProcessBuilder b = new ProcessBuilder(command);
			b.directory(buildDirFile);
			b.redirectErrorStream(true);
			Process process = b.start();
			
			// Feed it our commands, then quit
			BufferedWriter processInput = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
			processInput.write("ss -strip -save");
			processInput.newLine();
			processInput.flush();
			processInput.write("quit");
			processInput.newLine();
			processInput.flush();
			
			// Consume & log all output
			BufferedReader processOutput = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String out_str;
			while ((out_str = processOutput.readLine()) != null) {
				log.debug(out_str);
			}
			
			// Tidy up
			processInput.close();
//			processOutput.close();
			process.waitFor();
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return false;		
	}
	
	/**
	 * Clean all the files in the build directory for a given file.
	 *
	 * @param file the file
	 */
	private void cleanFile(IFile file) {
		log.info("  Cleaning build directory for " + file.getName());
		
		String buildDir = getBuildDirectory(file);
		// Check the build directory and try to create it
		File buildDirFile = new File(buildDir);
		if (buildDirFile.exists()) {
			File[] files = buildDirFile.listFiles();
			for (File f : files) {
				try {
					f.delete();
					log.info("  - " + f.getName());
				} catch (Exception _) {
					log.warn("  > Failed: " + f.getName());
				}
			}
		}
	}
	
}
