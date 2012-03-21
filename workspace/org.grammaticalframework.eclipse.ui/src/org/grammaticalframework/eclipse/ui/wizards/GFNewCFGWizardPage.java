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
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page for creating a new CFG
 */
public class GFNewCFGWizardPage extends AbstractNewFileWizardPage {
	
	/**
	 * The Constant PAGE_NAME.
	 */
	private static final String PAGE_NAME = "Context-free grammar";
	
	/**
	 * The Constant PAGE_DESCRIPTION.
	 */
	private static final String PAGE_DESCRIPTION = "This wizard creates a new context-free grammar file (*.cf or *.ebnf)";

	/**
	 * Fields
	 */
	private Text field_Path;
	private Text field_ModuleName;
	private Combo field_ModuleType;
	
	private String[] moduleTypeOptions = new String[] {
			"BNF",		// 0
			"Extended BNF",		// 1
	};

	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFNewCFGWizardPage(ISelection selection) {
		super(PAGE_NAME, PAGE_DESCRIPTION, selection);
	}

	/**
	 * Creates the control.
	 *
	 * @param parent the parent
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		// Save to
		new Label(container, SWT.NULL).setText("&Save to:");
		field_Path = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Path.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_Path.addModifyListener(listener);
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse(field_Path);
			}
		});
		
		// Module type
		new Label(container, SWT.NULL).setText("Grammar &format:");
	    field_ModuleType = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		field_ModuleType.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
	    field_ModuleType.setItems(moduleTypeOptions);
	    field_ModuleType.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		field_ModuleType.select(0);
		
		// Module name
		new Label(container, SWT.NULL).setText("Module &name:");
		field_ModuleName = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_ModuleName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_ModuleName.addModifyListener(listener);
		field_ModuleName.setFocus();

		initialize(container);
	}
	
	/**
	 * Gets the module name.
	 *
	 * @return the module name
	 */
	protected String getField_ModuleName() {
		return field_ModuleName.getText();
	}

	/**
	 * Gets the container name.
	 *
	 * @return the container name
	 */
	protected String getField_Path() {
		return field_Path.getText();
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	@Override
	protected void initialize(Control control) {
		Object obj = getFirstSelection();
		if (obj != null && obj instanceof IResource) {
			IContainer container;
			if (obj instanceof IContainer)
				container = (IContainer) obj;
			else
				container = ((IResource) obj).getParent();
			field_Path.setText(container.getFullPath().toString());
		}
		super.initialize(control);
	}

	
	/**
	 * Dialog changed.
	 */
	protected void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getField_Path()));
		
		String regexModName = "[a-zA-Z_][a-zA-Z0-9_']*";
		
		// Container / location
		if (getField_Path().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null || (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}

		// Module name
		if (getField_ModuleName().length() == 0) {
			updateStatus("Module name must be specified");
			return;
		}
		if (!getField_ModuleName().matches(regexModName)) {
			updateStatus("Module name is invalid (don't include extension)");
			return;
		}
		String eventualFilename = getField_ModuleName() + ".gf";
		IResource fileExists = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getField_Path() + File.separator + eventualFilename));
		if (fileExists!=null) {
			updateStatus(String.format("Module \"%s\" already exists at that location", eventualFilename));
			return;
		}

		clearStatus();
	}

}