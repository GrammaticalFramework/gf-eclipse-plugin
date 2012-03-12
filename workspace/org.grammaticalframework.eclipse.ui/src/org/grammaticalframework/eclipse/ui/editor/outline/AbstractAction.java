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
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;

/**
 * Abstract action for contributing to the outline view
 */
public abstract class AbstractAction extends Action implements IOutlineContribution {

	/**
	 * The action (points to ourself)
	 */
	private Action action;
	
	/**
	 * Configure the action (label, icons etc.)
	 *
	 * @param action the action
	 */
	protected abstract void configureAction(Action action);

	/**
	 * Gets the action.
	 *
	 * @return the action
	 */
	protected Action getAction() {
		if (action == null) {
			action = this;
			configureAction(action);
		}
		return action;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public abstract void run();

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer#initialize(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess)
	 */
	public void initialize(IPreferenceStoreAccess access) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution#register(org.eclipse.xtext.ui.editor.outline.impl.OutlinePage)
	 */
	public void register(OutlinePage outlinePage) {
		IToolBarManager toolBarManager = outlinePage.getSite().getActionBars().getToolBarManager();
		toolBarManager.add(getAction());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution#deregister(org.eclipse.xtext.ui.editor.outline.impl.OutlinePage)
	 */
	public void deregister(OutlinePage outlinePage) {
	}

}