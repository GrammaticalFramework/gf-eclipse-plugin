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

import org.eclipse.swt.graphics.Image;

interface ITreeNode {
	public Image getImage();

	public String getName();

	public List<ITreeNode> getChildren();

	public boolean hasChildren();

	public ITreeNode getParent();
}