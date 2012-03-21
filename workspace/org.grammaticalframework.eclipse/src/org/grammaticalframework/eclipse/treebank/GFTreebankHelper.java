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

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
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
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTreebankHelper.class);

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
	 * @param treebankFile
	 * @param outputFile
	 * @param goldStandardFile
	 * @param view
	 */
	public static TreebankResults compareOutputWithGoldStandard(IFile treebankFile, IFile outputFile, IFile goldStandardFile) {
		
		Treebank treebank = new Treebank(treebankFile);
		TreebankOutput output = new TreebankOutput(outputFile);
		GoldStandard goldStandard = new GoldStandard(goldStandardFile);

		TreebankResults results = new TreebankResults();
		if (output.getSize() != treebank.getSize()) {
			log.warn(String.format("Size mis-match between treebank (%d) and output (%d).", treebank.getSize(), output.getSize()));
			return results;
		}
		if (output.getSize() != goldStandard.getSize()) {
			log.warn(String.format("Size mis-match output (%d) and gold standard (%d).", output.getSize(), goldStandard.getSize()));
			return results;
		}
		
		int i = 0;
		for (SyntaxTree tree : treebank.getIterable()) {
			List<OutputItem> outGroup = output.getGroup(i);
			List<OutputItem> goldGroup = goldStandard.getGroup(i);
			int j = 0;
			for (OutputItem outItem : outGroup) {
				OutputItem goldItem = goldGroup.get(j++);
				
				TreebankResultItem item = new TreebankResultItem(tree, outItem, goldItem);
				results.addItem(item);
			}
			i++;
		}
		return results;
	}
	

}
