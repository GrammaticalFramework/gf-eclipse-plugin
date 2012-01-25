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

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// TODO: Auto-generated Javadoc
/**
 * The Class GFNewProjectWizardPage.
 */
public class GFNewProjectWizardPage extends WizardPage {

	/**
	 * The project name text.
	 */
	private Text projectNameText;

	/**
	 * Gets the project name.
	 *
	 * @return the project name
	 */
	public String getProjectName() {
		return projectNameText.getText();
	}

	/**
	 * Instantiates a new gF new project wizard page.
	 *
	 * @param pageName the page name
	 */
	protected GFNewProjectWizardPage(String pageName) {
		super(pageName);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		// Project name
		new Label(container, SWT.NULL).setText("&Project name:");
		projectNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectNameText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		projectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		setControl(container);
	}

	/**
	 * Dialog changed.
	 */
	private void dialogChanged() {
		
		// Check format of name
		if (getProjectName().contains(java.io.File.separator)) {
			updateStatus("Invalid project name.");
			return;
		}
		
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
		
		// Check to see if project name already exists in filesystem
		File file = new File(workspace.getRawLocation() + java.io.File.separator + getProjectName());
		if (file != null && file.exists()) {
			String message = String.format(" A folder named \"%1$s\" already exists. A GF project called \"%1$s\" will be created in this location using your existing files.", getProjectName());
			setMessage(message, INFORMATION);
		} else {
			setMessage(null, INFORMATION);
		}
		
		// Check to see if project name is already in workspace
		IResource container = workspace.findMember(new Path(getProjectName()));
		if (container != null && container.exists()) {
			String message = String.format("A project named \"%s\" already exists.", getProjectName());
			updateStatus(message);
			return;
		}
		
		updateStatus(null);
	}

	/**
	 * Update status.
	 *
	 * @param message the message
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
}
