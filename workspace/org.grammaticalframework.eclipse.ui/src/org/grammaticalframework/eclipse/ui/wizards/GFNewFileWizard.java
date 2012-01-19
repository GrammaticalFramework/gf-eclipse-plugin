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

import org.apache.log4j.Logger;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
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
import org.eclipse.xtext.ui.editor.XtextEditor;

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
	
	private static final Logger log = Logger.getLogger(GFNewFileWizard.class);
	
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
		final String containerName = page.getField_Path();
		final String fileName = page.getField_ModuleName() + ".gf";
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
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart editor;
				try {
					// open file
					editor = IDE.openEditor(page, file, true);
					
					// format it
					XtextEditor xed = (XtextEditor)editor;
					SourceViewer sv = (SourceViewer)xed.getInternalSourceViewer();
					sv.doOperation(ISourceViewer.FORMAT);
					
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
	 * We will initialize file contents with a sample text.
	 *
	 * @return the string
	 */
	
	private String generateFileContents() {
		// TODO: Template needs to be more sophisticated
		StringBuilder sb = new StringBuilder("-- Auto-generated template\n");
		sb.append(page.getField_ModuleKeywords());
		sb.append(" ");
		sb.append(page.getField_ModuleName());
		if (!page.getField_Of().isEmpty()) {
			sb.append(" of ");
			sb.append(page.getField_Of());
		}
		sb.append(" = ");
		if (!page.getField_Extends().isEmpty()) {
			sb.append(page.getField_Extends());
			sb.append(" ** ");
		}
		if (!page.getField_Instantiates().isEmpty()) {
			sb.append(page.getField_Instantiates());
			sb.append(" with\n\t");
			sb.append(page.getField_With());
			if (!page.getField_Opens().isEmpty()) {
				sb.append(" **");
			}
			sb.append("\n\t");
		}
		if (!page.getField_Opens().isEmpty()) {
			sb.append(" open ");
			sb.append(page.getField_Opens());
			sb.append(" in ");
		}
		sb.append("{\n\n");
//		if (page.getField_ModuleKeywords().equals("abstract")) {
//			sb.append("\tcat\n\n\tfun\n");
//		}
//		if (page.getField_ModuleKeywords().equals("concrete")) {
//			sb.append("\tlincat\n\n\tlin\n");
//		}
		sb.append("\n};\n");		
		
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