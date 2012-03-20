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
import java.util.ArrayList;
import org.eclipse.core.resources.IFile;

/**
 * A collection of abstract syntax trees
 */
public class Treebank {
	
	private IFile treebankFile;
	
	private ArrayList<AbstractSyntaxTree> list;

	public Treebank(IFile treebankFile) {
		super();
		this.list = new ArrayList<AbstractSyntaxTree>();
		this.treebankFile = treebankFile;
		parseTreebankFile();
	}
	
	/**
	 * Parse the treebank file into a collection of AbstractSyntaxTrees
	 */
	private void parseTreebankFile() {
		BufferedReader treeReader = null;
		try {
			treeReader = new BufferedReader(new InputStreamReader(new DataInputStream(treebankFile.getContents(true))));
			
			String treeLine;
			while ((treeLine = treeReader.readLine()) != null) {
				// Skip empty lines & comments
				treeLine = treeLine.replaceFirst("--.*", "").trim();
				if (treeLine.isEmpty())  {
					continue;
				}
				
				// Create object and add to list
				AbstractSyntaxTree tree = new AbstractSyntaxTree(treeLine);
				list.add(tree);
			}
		} catch (Exception e) {
//			log.error("Error running comparison",  e);
		} finally {
			try {
				treeReader.close();
			} catch (Exception _) {	}
		}
	}

	/**
	 * Get iterator over the trees
	 * @return
	 */
	public Iterable<AbstractSyntaxTree> getIterable() {
		return list;
	}
	
}
