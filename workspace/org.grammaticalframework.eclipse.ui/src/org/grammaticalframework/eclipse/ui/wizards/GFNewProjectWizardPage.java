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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Wizard page for creating a new GF Project
 * 
 * @author John J. Camilleri
 * 
 */
public class GFNewProjectWizardPage extends AbstractNewFileWizardPage {

	/**
	 * The project name field.
	 */
	private Combo projectNameField;
	
	/**
	 * Gets the project name, either from text field or folder list
	 *
	 * @return the project name
	 */
	public String getProjectName() {
		return projectNameField.getText().trim();
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
		projectNameField = new Combo(container, SWT.BORDER | SWT.SIMPLE); // not read-only!
		projectNameField.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		projectNameField.addModifyListener(defaultModifyListener);
		
		// Add existing folders (if there are any)
		String[] items = GFWizardHelper.getWorkspaceFolders();
		if (items.length > 0) {
			projectNameField.setItems(items);
			new Label(container, SWT.NULL);
			Label l = new Label(container, SWT.NULL);
			l.setText("You can turn an existing workspace folder into a GF Project \n" +
					"by selecting it from the drop-down above.");
			makeItalic(l);
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
