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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

/**
 * Provider which filters files in a project by extension name
 * @author John J. Camilleri
 *
 */
class ExtensionTypeTreeContentProvider extends AbstractTreeContentProvider {
	
	Set<String> extensions;
	
	@Inject
	GFImages images;
	
	/**
	 * Set a single extension type
	 * @param extension The extension name, without a leading period
	 */
	public void setExtension(String extension) {
		this.extensions = Collections.singleton(extension);
	}
	
	/**
	 * Set a set of extensions
	 * @param extension Array of extension names, without leading periods
	 */
	public void setExtensions(String[] extensions) {
		this.extensions = new HashSet<String>(Arrays.asList(extensions));
	}
	
	public Object[] getChildren(Object parentElement) {

		// TODO Should this be moved into TreeNode#createChildren() ?
		if (parentElement instanceof IProject) {
			List<ITreeNode> children = new ArrayList<ITreeNode>();
			IProject project = (IProject)parentElement;
			try {
				IResource[] childFiles = project.members();
				for (int i = 0; i < childFiles.length; i++) {
					IResource childFile = childFiles[i];
					if (childFile instanceof IFolder) {
						// TODO Recurse into subfolders?
					}
					else if (childFile instanceof IFile) {
						String ext = ((IFile)childFile).getFileExtension(); 
						if (extensions.contains(ext)) {
							FileNode f = new FileNode(null, (IFile) childFile);
							f.setImage(images.getImage("treebank-item.png"));
							children.add(f);
						}
					}
				}
			} catch (CoreException e) {
				//GFLibraryTreeView.log.warn("Couldn't get contents of: "+getName(), e);
			}
			return children.toArray();
			
		} else {
			return null;
		}
	}

}