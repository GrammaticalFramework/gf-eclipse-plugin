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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

class FolderNode extends TreeNode {
	private IContainer container;

	public FolderNode(IContainer folder) {
		this(null, folder);
	}

	public FolderNode(ITreeNode parent, IContainer container) {
		super(parent);
		this.container = container;
	}

	public String getName() {
		return container.getName();
	}
	
	public IContainer getContainer() {
		return container;
	}

	protected void createChildren(List<ITreeNode> children) {
		try {
			IResource[] members = container.members();
			for (int i = 0; i < members.length; i++) {
				IResource childFile = members[i];
				if (childFile instanceof IFolder)
					children.add(new FolderNode(this, (IFolder) childFile));
				else if (childFile instanceof IFile)
					children.add(new FileNode(this, (IFile) childFile));
			}
		} catch (CoreException e) {
		}
	}

	public Image getImage() {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.grammaticalframework.eclipse.ui", "icons/folder-open.png").createImage();		
	}
}