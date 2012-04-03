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

import org.eclipse.core.resources.IFile;

/**
 * Represents a gold standard file, for comparison against an output file. 
 * @author John J. Camilleri
 *
 */
public class GoldFile extends OutputFile {

	public GoldFile(IFile outFile) {
		super(outFile);
	}

}
