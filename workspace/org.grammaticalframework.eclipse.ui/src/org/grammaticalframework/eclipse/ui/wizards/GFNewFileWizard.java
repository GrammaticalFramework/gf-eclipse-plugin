/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

// TODO: Auto-generated Javadoc
/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "gf". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class GFNewFileWizard extends Wizard implements INewWizard {
	
	/**
	 * The page.
	 */
	private GFNewFileWizardPage page;
	
	/**
	 * The selection.
	 */
	private ISelection selection;

	/**
	 * Constructor for GFNewFileWizard.
	 */
	public GFNewFileWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new GFNewFileWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 *
	 * @return true, if successful
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getModuleName() + ".gf";
		final String fileContents = generateFileContents();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, fileContents, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 *
	 * @param containerName the container name
	 * @param fileName the file name
	 * @param fileContents the file contents
	 * @param monitor the monitor
	 * @throws CoreException the core exception
	 */

	private void doFinish(
		String containerName,
		String fileName,
		String fileContents,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = new ByteArrayInputStream(fileContents.getBytes());
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 *
	 * @return the string
	 */
	
	private String generateFileContents() {
		// TODO: Template needs to be more sophisticated
		StringBuilder sb = new StringBuilder("-- Auto-generated template\n");
		if (page.getModIsIncomplete()) {
			sb.append("incomplete ");
		}
		sb.append(page.getModuleType());
		sb.append(" ");
		sb.append(page.getModuleName());
		if (!page.getModOf().isEmpty()) {
			sb.append(" of ");
			sb.append(page.getModOf());
		}
		sb.append(" = ");
		if (!page.getModuleExtends().isEmpty()) {
			sb.append(page.getModuleExtends());
			sb.append(" ** ");
		}
		if (!page.getModuleFunctor().isEmpty()) {
			sb.append(page.getModuleFunctor());
			sb.append(" with\n\t");
			sb.append(page.getModuleInstantiates());
			if (!page.getModuleOpens().isEmpty()) {
				sb.append(" **");
			}
			sb.append("\n\t");
		}
		if (!page.getModuleOpens().isEmpty()) {
			sb.append(" open ");
			sb.append(page.getModuleOpens());
			sb.append(" in ");
		}
		sb.append("{\n\n\t-- add own code here\n\n};\n");
		return sb.toString();
	}

	/**
	 * Throw core exception.
	 *
	 * @param message the message
	 * @throws CoreException the core exception
	 */
	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.grammaticalframework.eclipse.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 *
	 * @param workbench the workbench
	 * @param selection the selection
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}