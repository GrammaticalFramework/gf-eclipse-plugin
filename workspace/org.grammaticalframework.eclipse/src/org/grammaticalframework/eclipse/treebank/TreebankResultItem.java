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
 * A single result from a gold standard comparison.
 * @author John J. Camilleri
 *
 */
public class TreebankResultItem {
	
	private SyntaxTree tree;
	
	private String out;
	
	private String gold;
	
	private boolean pass;

	/**
	 * Get the abstract syntax tree
	 * @return
	 */
	public SyntaxTree getTree() {
		return tree;
	}

	/**
	 * Get the output
	 * @return
	 */
	public String getOut() {
		return out;
	}

	/**
	 * Get the gold
	 * @return
	 */
	public String getGold() {
		return gold;
	}

	/**
	 * Has this item passed?
	 * @return
	 */
	public boolean isPass() {
		return pass;
	}
	
	public TreebankResultItem(SyntaxTree tree, String out, String gold) {
		super();
		this.tree = tree;
		this.out = out;
		this.gold = gold;
		calculateScore();
	}

	/**
	 * Perform comparison and give our item a score/pass
	 */
	private void calculateScore() {
		pass = out.equals(gold);
	}

	@Override
	public String toString() {
		if (isPass()) {
			return out;
		} else {
			return gold + "\n" + out;
		}
	}

}
