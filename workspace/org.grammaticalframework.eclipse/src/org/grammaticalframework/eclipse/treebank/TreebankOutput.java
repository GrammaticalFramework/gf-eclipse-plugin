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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

/**
 * Represents a treebank output file, with each non-empty line
 * stored in an internal collection of strings. 
 * @author John J. Camilleri
 *
 */
public class TreebankOutput extends AbstractCollectionFile<List<OutputItem>> {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(TreebankOutput.class);

	private static Pattern leadingSpaceRegEx = Pattern.compile("^\\s\\S.*");
	
	public TreebankOutput(IFile outFile) {
		super(outFile);
	}
	
	/**
	 * Parse the output file into a 2D list of strings
	 */
	protected void parseFile() {
		BufferedReader outReader = null;
		try {
			outReader = new BufferedReader(new InputStreamReader(new DataInputStream(getFile().getContents(true))));
			
			String outLine;
			ArrayList<OutputItem> group = new ArrayList<OutputItem>();
			while ((outLine = outReader.readLine()) != null) {

				// Empty line or single space at beginning signifies a new "group"
				if (outLine.isEmpty() || leadingSpaceRegEx.matcher(outLine).matches())  {
					if (!group.isEmpty())
						list.add(group);
					group = new ArrayList<OutputItem>();
					if (outLine.isEmpty())
						continue;
				}
				
				// Create object and add to list
				outLine = outLine.trim();
				OutputItem item = new OutputItem(outLine);
				if (!item.hasLanguage() && group.size()>0 && group.get(group.size()-1).hasLanguage()) {
					// let language to last known, if applicable
					item.setLanguage(group.get(group.size()-1).getLanguage());
				}
				group.add(item);
			}
			if (!group.isEmpty())
				list.add(group);
		} catch (IOException e) {
			log.error("Error reading treebank output file.", e);
		} catch (CoreException e) {
			log.error("Error reading treebank output file.", e);
		} finally {
			try {
				outReader.close();
			} catch (Exception _) {	}
		}
	}
	
	public List<OutputItem> getGroup(int i) {
		return list.get(i);
	}
	

}
