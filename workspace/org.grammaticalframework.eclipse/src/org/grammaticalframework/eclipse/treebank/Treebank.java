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
import org.eclipse.core.resources.IFile;

/**
 * A collection of abstract syntax trees
 */
public class Treebank extends AbstractCollectionFile<SyntaxTree> {
	
	public Treebank(IFile treebankFile) {
		super(treebankFile);
	}
	
	/**
	 * Parse the treebank file into a collection of AbstractSyntaxTrees
	 */
	protected void parseFile() {
		BufferedReader treeReader = null;
		try {
			treeReader = new BufferedReader(new InputStreamReader(new DataInputStream(getFile().getContents(true))));
			
			String treeLine;
			while ((treeLine = treeReader.readLine()) != null) {
				// Skip empty lines & comments
				treeLine = treeLine.replaceFirst("--.*", "").trim();
				if (treeLine.isEmpty())  {
					continue;
				}
				
				// Create object and add to list
				SyntaxTree tree = new SyntaxTree(treeLine);
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
	
	
}
