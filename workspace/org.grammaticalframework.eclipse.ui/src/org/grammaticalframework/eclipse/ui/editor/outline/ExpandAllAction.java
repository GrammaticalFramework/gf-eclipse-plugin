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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
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
	 * 
	 */
	protected List<OutlinePage> outlinePages = new ArrayList<OutlinePage>();
	
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
	 * Expand the all trees in all outline pages.
	 * Hardly ideal behaviour but I can't waste any more time on this crap.
	 */
	public void run() {
		for (OutlinePage page : this.outlinePages) {
			page.getTreeViewer().expandAll();
		}
	}
	
	/**
	 * Add OutlinePage to our internal list
	 */
	@Override
	public void register(final OutlinePage outlinePage) {
		super.register(outlinePage);
		outlinePages.add(outlinePage);
	}

	/**
	 * Remove OutlinePage from our internal list
	 */
	@Override
	public void deregister(OutlinePage outlinePage) {
		super.deregister(outlinePage);
		outlinePages.remove(outlinePage);
	}

}
