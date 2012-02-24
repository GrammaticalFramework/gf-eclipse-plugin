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

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

class TreeLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		try {
			return ((ITreeNode)element).getImage();
		}
		catch (ClassCastException _) {
			return null;
		}
	}

	@Override
	public String getText(Object element) {
		try {
			return ((ITreeNode)element).getName();
		}
		catch (ClassCastException _) {
			return element.toString();
		}
	}
	
}