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

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page for creating a new GF Project
 * 
 * @author John J. Camilleri
 * 
 */
public class GFNewProjectWizardPage extends AbstractNewFileWizardPage {

	/**
	 * The project name text field.
	 */
	private Text projectNameText;
	
	/**
	 * List of folders available for import.
	 */
	private List importFolderList;

	/**
	 * Gets the project name, either from text field or folder list
	 *
	 * @return the project name
	 */
	public String getProjectName() {
		if (importFolderList != null && importFolderList.getSelectionIndex() > -1) {
			return importFolderList.getSelection()[0];
//			return importFolderList.getItem(importFolderList.getSelectionIndex());
		}
		else {
			return projectNameText.getText().trim();
		}
	}

	/**
	 * The page name
	 */
	public static String getPageName() {
		return "New GF project";
	}
	
	/**
	 * The page description
	 */
	public static String getPageDescription() {
		return "This wizard creates a new GF project and loads the GF perspective.";
	}
	
	/**
	 * Instantiates a new gF new project wizard page.
	 *
	 * @param pageName the page name
	 */
	protected GFNewProjectWizardPage() {
		super(getPageName(), getPageDescription());
	}
	
	/**
	 * {@inheritDoc}	
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 10;
		
		// Project name
		new Label(container, SWT.NULL).setText("&New project name:");
		projectNameText = new Text(container, SWT.BORDER);
		projectNameText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		projectNameText.addModifyListener(defaultModifyListener);
		projectNameText.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
			}
			public void focusGained(FocusEvent e) {
				importFolderList.deselectAll();
				if (getProjectName().isEmpty()) {
					clearStatus();
					setMessage(null, IMessageProvider.INFORMATION);
					setPageComplete(false);
				} else {
					dialogChanged();
				}
			}
		});
		
		// Existing folders (if there are any)
		String[] items = GFWizardHelper.getWorkspaceFolders();
		if (items.length > 0) {
			Label l = new Label(container, SWT.CENTER);
			l.setText("OR");
			l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));

			new Label(container, SWT.NULL).setText("&Convert folder to GF project:");
			importFolderList = new List(container, SWT.BORDER | SWT.SINGLE);
			importFolderList.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
			importFolderList.addSelectionListener(new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					projectNameText.setText("");
					dialogChanged();
				}
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});
			importFolderList.setItems(items);
		}
		
		initialize(container);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void dialogChanged() {
		
		// Check we have a name
		if (getProjectName().isEmpty()) {
			updateStatus("Enter a project name.");
			return;
		}
		
		// Check format of name
		if (getProjectName().contains(java.io.File.separator)) {
			updateStatus("Invalid project name.");
			return;
		}
		
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();
		
		// Check to see if project name already exists in filesystem
		File file = new File(workspace.getRawLocation() + java.io.File.separator + getProjectName());
		if (file != null && file.exists()) {
//			String message = String.format("A folder named \"%1$s\" already exists. A GF project called \"%1$s\" will be created in this location using your existing files.", getProjectName());
			String message = String.format("A GF project called \"%1$s\" will be created using your existing files.", getProjectName());
			setMessage(message, IMessageProvider.INFORMATION);
		} else {
			setMessage(null, IMessageProvider.INFORMATION);
		}
		
		// Check to see if project name is already in workspace
		IResource container = workspace.findMember(new Path(getProjectName()));
		if (container != null && container.exists()) {
			String message = String.format("A project named \"%s\" already exists.", getProjectName());
			updateStatus(message);
			return;
		}
		
		clearStatus();
	}
	
}
