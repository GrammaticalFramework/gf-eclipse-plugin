package org.grammaticalframework.eclipse.ui.commands;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.grammaticalframework.eclipse.ui.wizards.GFCloneModuleWizard;

public class CloneHandler extends AbstractHandler implements IHandler {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(CloneHandler.class);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
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
		return null;
	}

}
