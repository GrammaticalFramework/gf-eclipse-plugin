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
	
	private OutputItem out;
	
	private OutputItem gold;
	
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
	public OutputItem getOut() {
		return out;
	}

	/**
	 * Get the gold
	 * @return
	 */
	public OutputItem getGold() {
		return gold;
	}

	/**
	 * Has this item passed?
	 * @return
	 */
	public boolean isPass() {
		return pass;
	}
	
	public TreebankResultItem(OutputItem out, OutputItem gold) {
		this(null, out, gold);
	}
	
	public TreebankResultItem(SyntaxTree tree, OutputItem out, OutputItem gold) {
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
		pass = out.getMeat().equals(gold.getMeat());
	}

	@Override
	public String toString() {
		if (isPass()) {
			return out.getMeat();
		} else {
			return gold.getMeat() + "\n" + out.getMeat();
		}
	}

}
