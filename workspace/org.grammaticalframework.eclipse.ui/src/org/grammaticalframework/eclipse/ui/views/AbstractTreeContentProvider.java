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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

abstract class AbstractTreeContentProvider implements ITreeContentProvider {

	public Object getParent(Object element) {
		return ((ITreeNode) element).getParent();
	}

	public boolean hasChildren(Object element) {
		return true;
//		return ((ITreeNode) element).hasChildren();
	}

	public Object[] getElements(Object inputElement) {
		if (!(inputElement instanceof IContainer))
			return null;
		IContainer container = (IContainer)inputElement;
		try {
			List<ITreeNode> children = new ArrayList<ITreeNode>();
			IResource[] members = container.members();
			for (int i = 0; i < members.length; i++) {
				IResource child = members[i];
				if (child instanceof IFolder) {
					FolderNode f = new FolderNode((IFolder)child);
					children.add(f);
				} else if (child instanceof IFile) {
					FileNode f = new FileNode((IFile)child);
					children.add(f);
				}
			}
			return children.toArray();
		} catch (CoreException e) {
			return null;
		}
	}
	
    public Object[] getChildren(Object parentElement) {
		if (!(parentElement instanceof ITreeNode))
			return null;
		ITreeNode parentNode = (ITreeNode)parentElement;
		List<ITreeNode> children = new ArrayList<ITreeNode>();
		if (parentNode.hasChildren()) {
			for (ITreeNode child : parentNode.getChildren()) {
				children.add(child);
			}
		}
		return children.toArray();
    }

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}