package org.grammaticalframework.eclipse.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView.ITreeNode;

abstract class TreeNode implements ITreeNode {
	protected ITreeNode fParent;
	protected List<ITreeNode> fChildren;
	protected String number;

	public TreeNode(ITreeNode parent) {
		fParent = parent;
	}

	public boolean hasChildren() {
		return true;
	}

	public ITreeNode getParent() {
		return fParent;
	}

	public List<ITreeNode> getChildren() {
		if (fChildren != null)
			return fChildren;

		fChildren = new ArrayList<ITreeNode>();
		createChildren(fChildren);

		return fChildren;
	}

	/* subclasses should override this method and add the child nodes */
	protected abstract void createChildren(List<ITreeNode> children);
}