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
import org.eclipse.xtext.ui.IImageHelper;
import org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView.ITreeNode;

import com.google.inject.Inject;

class TreeLabelProvider extends LabelProvider {

	@Inject
	private IImageHelper imageHelper;

	@Override
	// TODO This never seems to work :(
	public Image getImage(Object element) {
		if (imageHelper != null)
			return imageHelper.getImage("library-reference.gif");
		else
			return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		return ((ITreeNode)element).getName();
	}
	
}