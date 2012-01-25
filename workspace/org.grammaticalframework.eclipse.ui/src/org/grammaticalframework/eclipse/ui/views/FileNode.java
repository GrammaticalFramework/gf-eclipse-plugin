package org.grammaticalframework.eclipse.ui.views;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView.ITreeNode;

class FileNode extends TreeNode {
	private IFile fFile;

	public FileNode(ITreeNode parent, IFile file) {
		super(parent);
		this.fFile = file;
	}

	public String getName() {
		return this.fFile.getName();
	}
	public IFile getFile() {
		return this.fFile;
	}

	protected void createChildren(List<ITreeNode> children) {
		// empty
	}

	public boolean hasChildren() {
		return false;
	}
}