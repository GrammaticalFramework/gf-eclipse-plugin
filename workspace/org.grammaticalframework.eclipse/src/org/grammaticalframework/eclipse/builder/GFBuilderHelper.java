package org.grammaticalframework.eclipse.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.grammaticalframework.eclipse.scoping.GFTagsFileException;
import org.grammaticalframework.eclipse.scoping.TagEntry;

public class GFBuilderHelper {

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
//		Hashtable<String, Collection<TagEntry>> strTagMap = new Hashtable<String, Collection<TagEntry>>();
		try {
			String tagsFileName = getTagsFileNameRelative(file.getName());
			IFile tagsFile = (IFile)file.getParent().findMember(tagsFileName);
			InputStream is = tagsFile.getContents();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			HashSet<String> importSet = new HashSet<String>();
			String line;
			while ((line = reader.readLine()) != null) {
				TagEntry tag;
				try {
					tag = new TagEntry(line);
					importSet.add(tag.getModuleName());
				} catch (GFTagsFileException e) {
					//log.warn(e); // Would happen if the tags file is malformed somehow
					continue;
				}
			}
			// Clean up
			reader.close();
			is.close();
			return importSet;
		} catch (IOException _) {
		} catch (CoreException e) {
		} catch (NullPointerException e) {
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
	
	
	public static void saveFileImports(IResource file, Set<String> imports) {
		try {
			file.setSessionProperty(new QualifiedName("org.grammaticalframework.eclipse", "imports"), imports);
		} catch (CoreException e) {
			
		}		
	}
	
	public static Set<String> readFileImports(IResource file) {
		try {
			@SuppressWarnings("unchecked")
			Set<String> ret = (Set<String>)file.getSessionProperty(new QualifiedName("org.grammaticalframework.eclipse", "imports"));
			return ret;
		} catch (ClassCastException e) {
			saveFileImports(file, null);
		} catch (CoreException e) {
		}
		return null;
	}

}
