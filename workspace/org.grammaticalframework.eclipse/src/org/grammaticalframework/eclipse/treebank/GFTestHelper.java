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
 * <dt><code>nouns.trees</code></dt><dd>Trees file</dd>
 * <dt><code>nouns.trees.out</code></dt><dd>Output file</dd>
 * <dt><code>nouns.trees.gold</code></dt><dd>Gold standard file</dd>
 * </dl>
 * 
 * Also <code>nouns.sentences</code> would fit into the same scheme, for testing parsing.
 * 
 * @author John J. Camilleri
 */
public class GFTestHelper {
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTestHelper.class);
	
	/**
	 * Extension for <em>trees</em> file
	 */
	private static String TREES_FILE_EXTENSION = "trees";
	
	/**
	 * Extension for <em>sentences</em> file
	 */
	private static String SENTENCES_FILE_EXTENSION = "sentences";

	/**
	 * List of valid input-file file extensions
	 */
	private static List<String> INPUT_EXTENSIONS = Arrays.asList(new String[]{TREES_FILE_EXTENSION, SENTENCES_FILE_EXTENSION});
	
	/**
	 * List of valid output-file file extensions
	 */
	private static List<String> OUTPUT_EXTENSIONS = Arrays.asList(new String[]{"out"});
	
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
	 * Get extension for trees file
	 * @param withDot Include leading dot?
	 * @return extension (with or without leading dot)
	 */
	public static String getTreesFileExtension(boolean withDot) {
		return (withDot ? "." : "") + TREES_FILE_EXTENSION;
	}
	
	/**
	 * Get extension for sentences file
	 * @param withDot Include leading dot?
	 * @return extension (with or without leading dot)
	 */
	public static String getSentencesFileExtension(boolean withDot) {
		return (withDot ? "." : "") + SENTENCES_FILE_EXTENSION;
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
	 * Is the given file an input file (either trees file or sentences file)?
	 * This doesn't perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isInputFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && INPUT_EXTENSIONS.contains(ext));
	}
	
	/**
	 * Is the given file a trees file?
	 * This doesn't perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isTreesFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && TREES_FILE_EXTENSION.equalsIgnoreCase(ext));
	}
	
	/**
	 * Is the given file a sentences file?
	 * This doesn't perform any deep file checks, but only checks file extension.
	 * @param file
	 * @return boolean
	 */
	public static boolean isSentencesFile(IFile file) {
		String ext = file.getFileExtension();
		return (ext != null && SENTENCES_FILE_EXTENSION.equalsIgnoreCase(ext));
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
	 * Does the given input file have a gold standard?
	 * @param inputFile
	 * @return boolean
	 */
	public static boolean hasGoldStandardFile(IFile inputFile) {
		return getGoldStandardFile(inputFile) != null;
	}
	
	/**
	 * Find and return a gold standard file for the given input file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param inputFile
	 * @return The corresponding gold standard file, or <code>null</code>.
	 */
	public static IFile getGoldStandardFile(IFile inputFile) {
		if (!isInputFile(inputFile)) {
			return null;
		}
		String gsFileName = inputFile.getName() + getGoldStandardExtension(true);
		try {
			return (IFile) inputFile.getParent().findMember(gsFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * Does the given input file have an output file?
	 * @param inputFile
	 * @return boolean
	 */
	public static boolean hasOutputFile(IFile inputFile) {
		return getOutputFile(inputFile) != null;
	}
	
	/**
	 * Find and return a output file for the given input file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param inputFile
	 * @return The corresponding output standard file, or <code>null</code>.
	 */
	public static IFile getOutputFile(IFile inputFile) {
		if (!isInputFile(inputFile)) {
			return null;
		}
		String outputFileName = inputFile.getName() + getOutputExtension(true);
		try {
			return (IFile) inputFile.getParent().findMember(outputFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * Find and return an input file for the given output file.
	 * Does not perform any checking on the actual file, it only matches based on filenames.
	 * @param outputFile
	 * @return The corresponding treebank standard file, or <code>null</code>.
	 */
	public static IFile getInputFileFromOutputFile(IFile outputFile) {
		if (!isOutputFile(outputFile)) {
			return null;
		}
		String inputFileName = outputFile.getName().replace(getOutputExtension(true), "");
		try {
			return (IFile) outputFile.getParent().findMember(inputFileName);
		} catch (ClassCastException e) {
			return null;
		}
	}
	
	
	/**
	 * Compare a given output file with a gold standard, and write the results directly to the supplied view.
	 * @param inputFile
	 * @param outputFile
	 * @param goldStandardFile
	 * @param view
	 */
	public static TestResults compareOutputWithGoldStandard(IFile inputFile, IFile outputFile, IFile goldStandardFile) {
		InputFile inputSet = new InputFile(inputFile);
		OutputFile outputSet = new OutputFile(outputFile);
		GoldFile goldSet = new GoldFile(goldStandardFile);
		TestResults results = new TestResults();
		
		// Check sizes
		if (outputSet.getSize() != goldSet.getSize()) {
			log.warn(String.format("Size mis-match: output (%d) and gold standard (%d).", outputSet.getSize(), goldSet.getSize()));
			return results;
		}
		int inputIxMultiplier = 1;
		if (outputSet.getSize() > inputSet.getSize()) {
			// Our usual grouping is wrong, so we spread the inputs evenly over all the outputs
			if (outputSet.getSize() % inputSet.getSize() != 0) {
				log.warn(String.format("Cannot accurately match inputs (%d) to output groups (%d); the associations are probably misaligned.", inputSet.getSize(), outputSet.getSize()));
			}
//			treebankIxMultiplier = (output.getSize() - 1) / (treebank.getSize() + 1); // equivalent to: ceil( outSize / treeSize )
			inputIxMultiplier = (outputSet.getSize() + inputSet.getSize() - 1) / inputSet.getSize(); // equivalent to: ceil( outSize / treeSize )
		}

		// Iterate over groups
		for (int outGroupIx = 0; outGroupIx < outputSet.getSize(); outGroupIx++) {
			List<OutputItem> outGroup = outputSet.getGroup(outGroupIx);
			List<OutputItem> goldGroup = goldSet.getGroup(outGroupIx);
			
			if (outGroup.size() != goldGroup.size()) {
				log.warn(String.format("Size mis-match: output group (%d) and gold standard group (%d). Skipping group.", outGroup.size(), goldGroup.size()));
				results.addError();
				continue;
			}
			
			int inputIx = outGroupIx / inputIxMultiplier;
			InputItem inputItem = inputSet.get(inputIx);
			
			for (int groupItemIx = 0; groupItemIx < outGroup.size(); groupItemIx++) {
				OutputItem outItem = outGroup.get(groupItemIx);
				OutputItem goldItem = goldGroup.get(groupItemIx);
				TestResultItem item = new TestResultItem(inputItem, outItem, goldItem);
				results.addItem(item);
			}
		}
		return results;
	}
	

}
