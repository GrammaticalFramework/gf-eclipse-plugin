/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.views;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.grammaticalframework.eclipse.treebank.TestResultItem;

/**
 * Comparator for sorting the entries in the Test Manager output viewer.
 * Refer to <a href="http://www.vogella.de/articles/EclipseJFaceTableAdvanced/article.html#sortcolumns">http://www.vogella.de/articles/EclipseJFaceTableAdvanced/article.html#sortcolumns</a>
 * 
 * @author John J. Camilleri
 *
 */
public class TestResultViewerComparator extends ViewerComparator {
	
	private int propertyIndex;
	
	private static final int DESCENDING = 1;
	
	private int direction = DESCENDING;

	public TestResultViewerComparator() {
		this.propertyIndex = 0;
		direction = DESCENDING;
	}

	public int getDirection() {
		return direction == 1 ? SWT.DOWN : SWT.UP;
	}

	public void setColumn(int column) {
		if (column == this.propertyIndex) {
			// Same column as last sort; toggle the direction
			direction = 1 - direction;
		} else {
			// New column; do an ascending sort
			this.propertyIndex = column;
			direction = DESCENDING;
		}
	}
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		TestResultItem item1 = (TestResultItem)e1;
		TestResultItem item2 = (TestResultItem)e2;
		int rc = 0;
		try {
			// Sort by...
			switch (propertyIndex) {
			case 0:
				// Result
				rc = item1.isPass().compareTo(item2.isPass());
				if (rc==0) {
					// If both same status, compare by text of out
					rc = item1.getOut().getMeat().compareTo(item2.getOut().getMeat());
				}
				break;
			case 1:
				// Language
				rc = item1.getOut().getLanguage().compareTo(item2.getOut().getLanguage());
				break;
			case 2:
				// Parameters
					rc = item1.getOut().getParameters().compareTo(item2.getOut().getParameters());
				break;
			case 3:
				// Input
				rc = item1.getIn().toString().compareTo(item2.getIn().toString());
				break;
			default:
				rc = 0;
			}
		} catch (NullPointerException _) {
			rc = 0;
		}
		// If descending order, flip the direction
		if (direction == DESCENDING) {
			rc = -rc;
		}
		return rc;
	}

	
}
