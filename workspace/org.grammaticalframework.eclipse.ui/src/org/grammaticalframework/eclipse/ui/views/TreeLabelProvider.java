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