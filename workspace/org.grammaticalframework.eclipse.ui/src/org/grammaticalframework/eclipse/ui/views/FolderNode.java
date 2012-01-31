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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView.ITreeNode;

class FolderNode extends TreeNode {
	private IFolder fFolder; /* actual data object */

	public FolderNode(IFolder folder) {
		this(null, folder);
	}

	public FolderNode(ITreeNode parent, IFolder folder) {
		super(parent);
		fFolder = folder;
	}

	public String getName() {
		return fFolder.getName();
	}

	@Override
	protected void createChildren(List<ITreeNode> children) {
		try {
			IResource[] childFiles = fFolder.members();
			for (int i = 0; i < childFiles.length; i++) {
				IResource childFile = childFiles[i];
				if (childFile instanceof IFolder)
					children.add(new FolderNode(this, (IFolder) childFile));
				else if (childFile instanceof IFile)
					children.add(new FileNode(this, (IFile) childFile));
			}
		} catch (CoreException e) {
			//GFLibraryTreeView.log.warn("Couldn't get contents of: "+getName(), e);
		}

	}
}