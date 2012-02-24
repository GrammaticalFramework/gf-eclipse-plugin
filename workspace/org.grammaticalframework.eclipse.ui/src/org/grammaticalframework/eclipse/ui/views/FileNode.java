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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.graphics.Image;

class FileNode extends TreeNode {
	
	private Image image;
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
		// a file has no children
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	public Image getImage() {
		return image;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
}