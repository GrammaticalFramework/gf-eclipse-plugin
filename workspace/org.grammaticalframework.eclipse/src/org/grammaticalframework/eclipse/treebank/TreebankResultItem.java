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

import java.util.List;

/**
 * A single group of results (i.e. sharing the same abstract syntax tree) from a gold standard comparison.
 * @author John J. Camilleri
 *
 */
public class TreebankResultItem {
	
	private SyntaxTree tree;
	
	private List<String> outGroup, goldGroup;
	
	private boolean pass;

	/**
	 * Get the abstract syntax tree
	 * @return
	 */
	public SyntaxTree getTree() {
		return tree;
	}

	/**
	 * Get the output group
	 * @return
	 */
	public List<String> getOutGroup() {
		return outGroup;
	}

	/**
	 * Get the gold group
	 * @return
	 */
	public List<String> getGoldGroup() {
		return goldGroup;
	}

	/**
	 * Has this item passed?
	 * @return
	 */
	public boolean isPass() {
		return pass;
	}
	
	public TreebankResultItem(SyntaxTree tree, List<String> out, List<String> gold) {
		super();
		this.tree = tree;
		this.outGroup = out;
		this.goldGroup = gold;
		calculateScore();
	}

	/**
	 * Perform comparison and give our item a score/pass
	 */
	private void calculateScore() {
		int j = 0;
		for (String outItem : outGroup) {
			String goldItem = goldGroup.get(j++);
			if (!outItem.equals(goldItem)) {
				pass = false;
				return;
			}
		}
		pass = true;
	}

	@Override
	public String toString() {
		// TODO: return all, not just first
		if (isPass()) {
			return outGroup.get(0);
		} else {
			return goldGroup.get(0) + "\n" + outGroup.get(0);
		}
	}

}
