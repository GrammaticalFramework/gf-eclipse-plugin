/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.views;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;

public class TreebankManagerHelper {
	
	/**
	 * List of valid treebank-file file extensions
	 */
	public static List<String> extensions = Arrays.asList(new String[]{"trees"});
	
	/**
	 * Is the given file a treebank file?
	 * This does perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isTreebankFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && extensions.contains(ext));
	}
	
	/**
	 * Does the given treebank file have a gold standard?
	 * @param file
	 * @return boolean
	 */
	public static boolean hasGoldStandardFile(IFile file) {
		return getGoldStandardFile(file) != null;
	}
	
	/**
	 * Find and return a gold standard file for the given treebank file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param file
	 * @return The corresponding gold standard file, or <code>null</code>.
	 */
	public static IFile getGoldStandardFile(IFile file) {
		if (!isTreebankFile(file)) {
			return null;
		}
		String gsFileName = file.getName().replaceFirst(file.getFileExtension(), "gold");
		try {
			return (IFile) file.getParent().findMember(gsFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}

}
