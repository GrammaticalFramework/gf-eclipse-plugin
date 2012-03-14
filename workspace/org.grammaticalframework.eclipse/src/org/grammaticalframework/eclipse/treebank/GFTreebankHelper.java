/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.treebank;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;

/**
 * Helper methods for dealing with treebanks and associated files. We are assuming the
 * following file name conventions:
 * <dl>
 * <dt><code>nouns.trees</code></dt><dd>Treebank file</dd>
 * <dt><code>nouns.trees.out</code></dt><dd>Output file</dd>
 * <dt><code>nouns.trees.gold</code></dt><dd>Gold standard file</dd>
 * </dl>
 * 
 * @author John J. Camilleri
 */
public class GFTreebankHelper {
	
	/**
	 * List of valid treebank-file file extensions
	 */
	private static List<String> OUTPUT_EXTENSIONS = Arrays.asList(new String[]{"out"});
	
	/**
	 * List of valid treebank-file file extensions
	 */
	private static List<String> TREEBANK_EXTENSIONS = Arrays.asList(new String[]{"trees"});
	
	/**
	 * List of valid gold standard-file file extensions
	 */
	private static List<String> GOLD_STANDARD_EXTENSIONS = Arrays.asList(new String[]{"gold"});
	
	/**
	 * Get extension for output file
	 * @param withDot Include leading dot?
	 * @return extension (with or without leading dot)
	 */
	public static String getOutputExtension(boolean withDot) {
		return (withDot ? "." : "") + OUTPUT_EXTENSIONS.get(0);
	}
	
	/**
	 * Get extension for treebank file
	 * @param withDot Include leading dot?
	 * @return extension (with or without leading dot)
	 */
	public static String getTreebankExtension(boolean withDot) {
		return (withDot ? "." : "") + TREEBANK_EXTENSIONS.get(0);
	}
	
	/**
	 * Get extension for gold standard file
	 * @param withDot Include leading dot?
	 * @return extension (with or without leading dot)
	 */
	public static String getGoldStandardExtension(boolean withDot) {
		return (withDot ? "." : "") + GOLD_STANDARD_EXTENSIONS.get(0);
	}
	
	/**
	 * Is the given file a treebank output file?
	 * This doesn't perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isOutputFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && OUTPUT_EXTENSIONS.contains(ext));
	}
	
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
	 * @param treebankFile
	 * @return boolean
	 */
	public static boolean hasGoldStandardFile(IFile treebankFile) {
		return getGoldStandardFile(treebankFile) != null;
	}
	
	/**
	 * Find and return a gold standard file for the given treebank file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param treebankFile
	 * @return The corresponding gold standard file, or <code>null</code>.
	 */
	public static IFile getGoldStandardFile(IFile treebankFile) {
		if (!isTreebankFile(treebankFile)) {
			return null;
		}
//		String gsFileName = file.getName().replaceFirst(file.getFileExtension(), "gold");
		String gsFileName = treebankFile.getName() + getGoldStandardExtension(true);
		try {
			return (IFile) treebankFile.getParent().findMember(gsFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * Does the given treebank file have an output file?
	 * @param treebankFile
	 * @return boolean
	 */
	public static boolean hasOutputFile(IFile treebankFile) {
		return getOutputFile(treebankFile) != null;
	}
	
	/**
	 * Find and return a output file for the given treebank file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param treebankFile
	 * @return The corresponding output standard file, or <code>null</code>.
	 */
	public static IFile getOutputFile(IFile treebankFile) {
		if (!isTreebankFile(treebankFile)) {
			return null;
		}
		String outputFileName = treebankFile.getName() + getOutputExtension(true);
		try {
			return (IFile) treebankFile.getParent().findMember(outputFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * Find and return a treebank files file for the given output file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param outputFile
	 * @return The corresponding treebank standard file, or <code>null</code>.
	 */
	public static IFile getTreebankFileFromOutputFile(IFile outputFile) {
		if (!isOutputFile(outputFile)) {
			return null;
		}
		String treebankFileName = outputFile.getName().replace(getOutputExtension(true), "");
		try {
			return (IFile) outputFile.getParent().findMember(treebankFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	
	/**
	 * Compare a given output file with a gold standard, and write the results directly to the supplied view.
	 * @param outputFile
	 * @param goldStandardFile
	 * @param view
	 */
	public static TreebankResults compareOutputWithGoldStandard(IFile outputFile, IFile goldStandardFile) {
		
		TreebankResults results = new TreebankResults();
		
		BufferedReader outReader = null;
		BufferedReader goldReader = null;
		try {
			outReader = new BufferedReader(new InputStreamReader(new DataInputStream(outputFile.getContents(true))));
			goldReader = new BufferedReader(new InputStreamReader(new DataInputStream(goldStandardFile.getContents(true))));
			
			String outLine;
			String goldLine;
			int passed = 0;
			int failed = 0;
			while ((outLine = outReader.readLine()) != null) {
				// Sync with gold standard file
				goldLine = goldReader.readLine();
				if (goldLine == null) {
//					log.error(String.format("Output file \"%s\" and gold standard file \"%s\" do not match in length.", outputFile.getName(), goldStandardFile.getName()));
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
				results.addItem(sb.toString());
			}
			
			// Set items in viewer
			int total = passed+failed;
			results.setPassed(passed);
			results.setFailed(failed);
			results.setTotal(total);
		} catch (Exception e) {
//			log.error("Error running comparison",  e);
		} finally {
			try {
				outReader.close();
			} catch (Exception _) {	}
			try {
				goldReader.close();
			} catch (Exception _) {	}
		}
		
		return results;
	}
	

}
