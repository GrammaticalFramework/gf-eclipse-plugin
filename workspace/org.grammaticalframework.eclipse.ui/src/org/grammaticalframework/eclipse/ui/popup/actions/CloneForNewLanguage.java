package org.grammaticalframework.eclipse.ui.popup.actions;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;

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
//		MessageDialog.openInformation(
//			shell,
//			"org.grammaticalframework.eclipse.ui",
//			"Clone for new language was executed.");
//		new GFCloneModuleWizard().init(workbench, selection);
		IWizardDescriptor descriptor = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard("org.grammaticalframework.eclipse.ui.wizards.GFCloneModuleWizard");
		if (descriptor != null) {
			IWizard wizard;
			try {
				wizard = descriptor.createWizard();
				WizardDialog wd = new WizardDialog(shell, wizard);
				wd.setTitle(wizard.getWindowTitle());
				wd.open();
			} catch (CoreException e) {
				log.warn("Unable to open Clone wizard", e);
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
