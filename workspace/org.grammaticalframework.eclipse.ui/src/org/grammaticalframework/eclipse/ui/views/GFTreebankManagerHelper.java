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

public class GFTreebankManagerHelper {
	
	/**
	 * List of valid treebank-file file extensions
	 */
	public static List<String> TREEBANK_EXTENSIONS = Arrays.asList(new String[]{"trees"});
	
	/**
	 * List of valid gold standard-file file extensions
	 */
	public static List<String> GOLD_STANDARD_EXTENSIONS = Arrays.asList(new String[]{"gold"});
	
	/**
	 * Is the given file a treebank file?
	 * This doesn't perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isTreebankFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && TREEBANK_EXTENSIONS.contains(ext));
	}
	
	/**
	 * Is the given file a gold standard file?
	 * This doesn't perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isGoldStandardFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && GOLD_STANDARD_EXTENSIONS.contains(ext));
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
