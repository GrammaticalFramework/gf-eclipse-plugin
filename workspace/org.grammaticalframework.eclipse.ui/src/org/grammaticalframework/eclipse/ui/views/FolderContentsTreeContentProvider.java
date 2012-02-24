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

import org.eclipse.core.resources.IFolder;

/**
 * Provider which returns a folder's contents
 * @author John J. Camilleri
 *
 */
class FolderContentsTreeContentProvider extends AbstractTreeContentProvider {
	
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFolder) {
			ITreeNode t = new FolderNode((IFolder)parentElement);
			return t.getChildren().toArray();
		} else {
			return null;
		}
	}

}