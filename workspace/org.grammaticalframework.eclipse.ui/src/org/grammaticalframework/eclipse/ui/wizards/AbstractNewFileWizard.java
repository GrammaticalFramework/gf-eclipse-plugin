/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * Abstract  class which provides some common methods for file-creation wizards
 * 
 * @author John J. Camilleri
 *
 */
public abstract class AbstractNewFileWizard extends Wizard implements INewWizard {

	/**
	 * Logger
	 */
	protected static final Logger log = Logger.getLogger(AbstractNewFileWizard.class);

	/**
	 * The current selection.
	 */
	protected ISelection selection;

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
	
	/**
	 * Perform finish with a runnable operation
	 * @param op
	 * @return
	 */
	protected boolean performFinish(IRunnableWithProgress op) {
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
	 * Find {@link IContainer} with the given name
	 * @param containerName
	 * @return
	 * @throws CoreException
	 */
	private IContainer getContainerFromName(String containerName) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		return (IContainer) resource;
	}
	
	/**
	 * Find the container, create the file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 *
	 * @param containerName the container name
	 * @param fileName the file name
	 * @param fileContents the file contents
	 * @param monitor the monitor
	 * @throws CoreException the core exception
	 */
	protected void createFile(String containerName, String fileName, String fileContents, IProgressMonitor monitor)
			throws CoreException {
		IContainer container = getContainerFromName(containerName);
		createFile(container, fileName, fileContents, true, monitor);
	}
	
	/**
	 * Find the container, create the file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 *
	 * @param containerName the container name
	 * @param fileName the file name
	 * @param fileContents the file contents
	 * @param monitor the monitor
	 * @throws CoreException the core exception
	 */
	protected void createPlainFile(String containerName, String fileName, String fileContents, IProgressMonitor monitor)
			throws CoreException {
		IContainer container = getContainerFromName(containerName);
		createFile(container, fileName, fileContents, false, monitor);
	}

	/**
	 * Create the file if missing or just replace its contents, and open the editor on the newly created file.
	 *
	 * @param container the container
	 * @param fileName the file name
	 * @param fileContents the file contents
	 * @param isGF is this s GF file?
	 * @param monitor the monitor
	 * @throws CoreException the core exception
	 */
	protected void createFile(IContainer container, String fileName, String fileContents, final Boolean isGF, IProgressMonitor monitor)
			throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
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
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart editor;
				try {
					// open file
					editor = IDE.openEditor(page, file, true);
					
					// format it
//					if (isGF) {
//						XtextEditor xed = (XtextEditor)editor;
//						SourceViewer sv = (SourceViewer)xed.getInternalSourceViewer();
//						sv.doOperation(ISourceViewer.FORMAT);
//					}
					
					// save it
					editor.doSave(null);
				} catch (PartInitException e) {
					log.warn("Couldn't open file for editing", e);
				} catch (ClassCastException e) {
					log.warn("Error auto-formatting new module", e);
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * Throw core exception.
	 *
	 * @param message the message
	 * @throws CoreException the core exception
	 */
	protected void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.grammaticalframework.eclipse.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}	
}
