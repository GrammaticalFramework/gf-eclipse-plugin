package org.grammaticalframework.eclipse.ui.views;

import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView.ITreeNode;

class TreeContentProvider implements ITreeContentProvider {
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFolder) {
			ITreeNode t = new FolderNode((IFolder)parentElement);
			return t.getChildren().toArray();
		} else {
			return null;
		}
	}

	public Object getParent(Object element) {
		return ((ITreeNode) element).getParent();
	}

	public boolean hasChildren(Object element) {
		return ((ITreeNode) element).hasChildren();
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}