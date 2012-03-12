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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.grammaticalframework.eclipse.scoping.GFTagsFileException;
import org.grammaticalframework.eclipse.scoping.TagEntry;

public class GFBuilderHelper {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFBuilderHelper.class);
	
	/**
	 * Gets the tags file name, relative to the source file
	 * Only pieces the name together; does not do any checking!
	 * @param sourceFileName
	 * @return
	 */
	public static String getTagsFileNameRelative(String sourceFileName) {
		return GFBuilder.BUILD_FOLDER
				+ java.io.File.separator
				+ sourceFileName + "-tags";
	}
	
	/**
	 * Gets the tags file name, relative to the source file as a URI
	 * Only pieces the name together; does not do any checking!
	 * @param sourceFileName
	 * @return relative URI of tags file
	 */
	public static URI getTagsFileURIRelative(String sourceFileName) {
		String uri = GFBuilder.BUILD_FOLDER
				+ "/"
				+ sourceFileName + "-tags";
		return URI.createURI(uri);
	}

	/**
	 * Gets the tags file path as a raw location.
	 * Only pieces the name together; does not do any checking!
	 * @param sourceFileName
	 * @return
	 */
	public static String getTagsFileFullPath(IFile file) {
		return file.getRawLocation().removeLastSegments(1).toOSString()
				+ java.io.File.separator
				+ getTagsFileNameRelative(file.getName());
	}
	
	public static Set<String> readTagsFile(IFile file) {
		boolean includeSelf = false;
		String tagsFileName = getTagsFileNameRelative(file.getName());
		try {
			IFile tagsFile = (IFile)file.getParent().findMember(tagsFileName);
			InputStream is = tagsFile.getContents(true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			HashSet<String> importSet = new HashSet<String>();
			String line;
			while ((line = reader.readLine()) != null) {
				TagEntry tag;
				try {
					tag = new TagEntry(line);
					importSet.add(tag.getModuleName());
				} catch (GFTagsFileException e) {
					// The tags file is malformed somehow
					continue;
				}
			}
			// Clean up
			reader.close();
			is.close();
			
			// Remove self
			String moduleName = file.getName().substring(0, file.getName().length()-file.getFileExtension().length()-1);
			if (!includeSelf && importSet.contains(moduleName)) {
				importSet.remove(moduleName);
			}
				
			return importSet;
		} catch (NullPointerException e) {
			// just means no file was present, don't worry
		} catch (IOException e) {
			log.warn("Error reading tags file "+tagsFileName, e);
		} catch (CoreException e) {
			log.warn("Error reading tags file "+tagsFileName, e);
		}
		return null;		
	}

	/**
	 * Get the build directory for a file. Only pieces the name together; does not do any checking!
	 * @param file
	 * @return
	 */
	public static String getBuildDirectory(IFile file) {
		return getBuildDirectory(file, false);
	}
	private static String getBuildDirectory(IFile file, boolean useIndividualFolders) {
		String filename = file.getName();
		return file.getRawLocation().removeLastSegments(1).toOSString()
				+ java.io.File.separator
				+ getBuildSubfolder(filename, useIndividualFolders);
	}
	private static String getBuildSubfolder(String sourceFileName, boolean useIndividualFolders) {
		if (useIndividualFolders) {
			int dotIx = sourceFileName.lastIndexOf('.');
			return GFBuilder.BUILD_FOLDER
					+ java.io.File.separator
					+ ((dotIx > 0) ? sourceFileName.substring(0, dotIx) : sourceFileName)
					+ java.io.File.separator;
		} else {
			return GFBuilder.BUILD_FOLDER
				+ java.io.File.separator;
		}
	}
	
	
	/**
	 * To aid the build process, we save a list of all modulenames a file imports using
	 * the Eclipse IResource properties. These methods are all concerned with this.
	 */
	private static QualifiedName importsPropertyKey = new QualifiedName("org.grammaticalframework.eclipse", "imports");
	public static Set<String> getFileImports(IResource file) {
		try {
			@SuppressWarnings("unchecked")
			Set<String> ret = (Set<String>)file.getSessionProperty(importsPropertyKey);
			return ret;
		} catch (ClassCastException e) {
			// They were saved incorrectly! Clear them to be safe
			clearFileImports(file);
		} catch (CoreException e) {
		}
		return null;
	}
	public static void saveFileImports(IResource file, Set<String> imports) {
		try {
			file.setSessionProperty(importsPropertyKey, imports);
		} catch (CoreException e) {
			
		}		
	}
	public static void clearFileImports(IResource file) {
		try {
			file.setSessionProperty(importsPropertyKey, null);
		} catch (CoreException e) {
			
		}		
	}
	
}
