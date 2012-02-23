/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor.outline;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

/**
 * Action for expanding tree in outline view
 */
public class ExpandAllAction extends AbstractAction {
	
	/**
	 * Image helper.
	 */
	@Inject
	private GFImages images;
	
	/**
	 * The label.
	 */
	private static String label = "Expand All";
	
	/**
	 * The tree viewer.
	 */
	TreeViewer treeViewer;

	/* (non-Javadoc)
	 * @see org.grammaticalframework.eclipse.ui.editor.outline.AbstractAction#configureAction(org.eclipse.jface.action.Action)
	 */
	protected void configureAction(Action action) {
		action.setText(label);
		action.setToolTipText(label);
		action.setDescription(label);
		action.setImageDescriptor(ImageDescriptor.createFromImage(images.forExpandAll()));
		action.setDisabledImageDescriptor(ImageDescriptor.createFromImage(images.forExpandAllDisabled()));
	}

	/**
	 * Expand the tree, woohoo
	 */
	@Override
	public void run() {
		treeViewer.expandAll();
	}
	
	/**
	 * Get ahold of the treeviewer object
	 */
	@Override
	public void register(OutlinePage outlinePage) {
		super.register(outlinePage);
		treeViewer = outlinePage.getTreeViewer();
	}

	/* (non-Javadoc)
	 * @see org.grammaticalframework.eclipse.ui.editor.outline.AbstractAction#deregister(org.eclipse.xtext.ui.editor.outline.impl.OutlinePage)
	 */
	@Override
	public void deregister(OutlinePage outlinePage) {
		super.deregister(outlinePage);
		treeViewer = null;
	}	

}
