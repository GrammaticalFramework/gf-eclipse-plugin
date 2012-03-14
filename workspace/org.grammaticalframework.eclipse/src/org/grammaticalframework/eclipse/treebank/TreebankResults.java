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

public class TreebankResults {
	
	private int passed, failed, total;
	
	private List<Object> viewerItems;
	
	public TreebankResults() {
		super();
		passed = failed = total = 0;
		viewerItems = new ArrayList<Object>();
	}

	public List<Object> getItems() {
		return viewerItems;
	}

	public int getPassed() {
		return passed;
	}

	public int getFailed() {
		return failed;
	}

	public int getTotal() {
		return total;
	}

	public void addItem(Object item) {
		this.viewerItems.add(item);
	}
	
	public void setPassed(int passed) {
		this.passed = passed;
	}

	public void setFailed(int failed) {
		this.failed = failed;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return String.format("%s (%d,%d/%d)", TreebankResults.class.getName(), passed, failed, total);
	}

}
