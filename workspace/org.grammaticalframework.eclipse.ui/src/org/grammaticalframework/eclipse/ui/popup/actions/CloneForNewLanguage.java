/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.popup.actions;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.grammaticalframework.eclipse.ui.wizards.GFCloneModuleWizard;

public class CloneForNewLanguage implements IObjectActionDelegate {

	private Shell shell;
	private IWorkbench workbench;
	private ISelection selection;
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(CloneForNewLanguage.class);
	
	/**
	 * Constructor
	 */
	public CloneForNewLanguage() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		workbench = targetPart.getSite().getWorkbenchWindow().getWorkbench();
		selection = targetPart.getSite().getSelectionProvider().getSelection();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IWizardDescriptor descriptor = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("org.grammaticalframework.eclipse.ui.wizards.GFCloneModuleWizard");
		if (descriptor != null) {
			IWizard wizard;
			try {
				wizard = descriptor.createWizard();
				((GFCloneModuleWizard)wizard).init(workbench, (IStructuredSelection) selection);
				WizardDialog wd = new WizardDialog(shell, wizard);
				wd.setTitle(wizard.getWindowTitle());
				wd.open();
			} catch (CoreException e) {
				log.error("Unable to open Clone Module wizard", e);
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
