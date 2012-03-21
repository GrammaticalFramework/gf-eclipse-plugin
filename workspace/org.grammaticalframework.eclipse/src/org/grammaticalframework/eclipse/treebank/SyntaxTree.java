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

/**
 * Represents a single abstract syntax tree in GF
 * 
 * @author John J. Camilleri
 *
 */
public class SyntaxTree {
	
	private String string;

	public void setString(String string) {
		this.string = string;
	}

	public SyntaxTree(String string) {
		super();
		this.string = clean(string);
	}
	
	private String clean(String string) {
		return string.trim();
	}

	@Override
	public String toString() {
		return string;
	}

}
