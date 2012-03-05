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

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;

public class GFTreebankManagerHelper {
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTreebankManagerHelper.class);
	
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
	
	/**
	 * Does the given treebank file have an output file?
	 * @param file
	 * @return boolean
	 */
	public static boolean hasOutputFile(IFile file) {
		return getOutputFile(file) != null;
	}
	
	/**
	 * Find and return a output file for the given treebank file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param file
	 * @return The corresponding gold standard file, or <code>null</code>.
	 */
	public static IFile getOutputFile(IFile file) {
		if (!isTreebankFile(file)) {
			return null;
		}
		String gsFileName = file.getName() + ".out";
		try {
			return (IFile) file.getParent().findMember(gsFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	public static void compareOutputWithGoldStandard(IFile outputFile, IFile goldStandardFile, GFTreebankManagerView view) {
		BufferedReader outReader = null;
		BufferedReader goldReader = null;
		try {
			outReader = new BufferedReader(new InputStreamReader(new DataInputStream(outputFile.getContents())));
			goldReader = new BufferedReader(new InputStreamReader(new DataInputStream(goldStandardFile.getContents())));
			
			String outLine;
			String goldLine;
			final ArrayList<Object> viewerItems = new ArrayList<Object>();
			int passed = 0;
			int failed = 0;
			while ((outLine = outReader.readLine()) != null) {
				// Sync with gold standard file
				goldLine = goldReader.readLine();
				if (goldLine == null) {
					log.error(String.format("Output file \"%s\" and gold standard file \"%s\" do not match in length.", outputFile.getName(), goldStandardFile.getName()));
					break;
				}
				
				// Skip empty lines
				outLine = outLine.trim();
				goldLine = goldLine.trim();
				if (outLine.isEmpty())  {
					continue;
				}
				
				// Do the comparison
				StringBuilder sb = new StringBuilder();
				sb.append(outLine);
				if (outLine.equals(goldLine)) {
					passed++;
				} else {
					failed++;
					sb.append("\n" + goldLine);
				}
				viewerItems.add(sb.toString());
			}
			
			// Set items in viewer
			int total = passed+failed;
			view.setStatusText("Results of "+outputFile.getName()); // TODO the FillLayout needs to adjust for this!
			view.setPassedText(String.format("%d/%d", passed, total));
			view.setFailedText(String.format("%d/%d", failed, total));
			view.getOutputViewer().setItemCount(0);
			view.getOutputViewer().add(viewerItems.toArray());
			
		} catch (Exception e) {
			log.error("Error running comparison",  e);
		} finally {
			try {
				outReader.close();
			} catch (Exception _) {	}
			try {
				goldReader.close();
			} catch (Exception _) {	}
		}
	}

}
