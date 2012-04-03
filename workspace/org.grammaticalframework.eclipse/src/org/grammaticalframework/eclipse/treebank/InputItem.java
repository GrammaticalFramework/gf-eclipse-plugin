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
 * Represents a single input item (e.g. abstract syntax tree in GF)
 * 
 * @author John J. Camilleri
 *
 */
public class InputItem {
	
	/**
	 * The string.
	 */
	private String string;

	/**
	 * Sets the string.
	 *
	 * @param string the new string
	 */
	public void setString(String string) {
		this.string = string;
	}

	/**
	 * Instantiates a new input item.
	 *
	 * @param string the string
	 */
	public InputItem(String string) {
		super();
		this.string = clean(string);
	}
	
	/**
	 * Clean.
	 *
	 * @param string the string
	 * @return the string
	 */
	private String clean(String string) {
		return string.trim();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return string;
	}

}
