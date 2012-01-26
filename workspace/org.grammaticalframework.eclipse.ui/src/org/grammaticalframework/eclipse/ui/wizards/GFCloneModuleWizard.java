package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class GFCloneModuleWizard extends Wizard implements INewWizard {

	/**
	 * The selection.
	 */
	private ISelection selection;

	/**
	 * The page.
	 */
	private GFCloneModuleWizardPage page;
	
	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new GFCloneModuleWizardPage(selection);
		addPage(page);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

}
