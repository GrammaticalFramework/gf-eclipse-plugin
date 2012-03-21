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

import java.util.ArrayList;
import java.util.List;

/**
 * A set of treebank comparison results.
 * 
 * @author John J. Camilleri
 *
 */
public class TreebankResults {
	
	private int numPassed, numFailed, numErrors;
	
	private List<TreebankResultItem> resultItems;
	
	/**
	 * Create an empty result set.
	 */
	public TreebankResults() {
		super();
		numPassed = numFailed = numErrors = 0;
		resultItems = new ArrayList<TreebankResultItem>();
	}

	/**
	 * Get list of result items
	 * @return
	 */
	public List<TreebankResultItem> getItems() {
		return resultItems;
	}

	/**
	 * Get number of passed items
	 * @return
	 */
	public int getPassed() {
		return numPassed;
	}

	/**
	 * Get number of failed items
	 * @return
	 */
	public int getFailed() {
		return numFailed;
	}

	/**
	 * Get total number of items processed
	 * @return
	 */
	public int getTotal() {
		return numPassed + numFailed;
	}

	/**
	 * Get number of errors
	 * @return
	 */
	public int getErrors() {
		return numErrors;
	}

	/**
	 * Add result item to collection
	 * @param item
	 */
	public void addItem(TreebankResultItem item) {
		this.resultItems.add(item);
		if (item.isPass()) numPassed++;
		else numFailed++;
	}
	
	/**
	 * Increment error count
	 */
	public void addError() {
		numErrors++;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d,%d/%d)", TreebankResults.class.getName(), getPassed(), getFailed(), getTotal());
	}

}
