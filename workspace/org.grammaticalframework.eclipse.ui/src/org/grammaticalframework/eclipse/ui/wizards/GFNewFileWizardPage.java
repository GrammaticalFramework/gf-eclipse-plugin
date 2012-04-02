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
 * Wizard for creating a new GF module
 * 
 * @author John J. Camilleri
 * 
 */
public class GFNewFileWizardPage extends AbstractNewFileWizardPage {
	
	/**
	 * Fields
	 */
	private Text field_Path;
	private Text field_ModuleName;
	private Combo field_ModuleType;
	private Text field_Of;
	private Text field_Extends,field_Opens, field_Instantiates, field_With;
	private Label label_Of, label_Instantiates, label_With;
	
	/**
	 * GF module types (friendly names)
	 */
	private String[] moduleTypeOptions = new String[] {
			"Abstract",		// 0
			"Concrete",		// 1
			"Resource",		// 2
			"Interface",	// 3
			"Instance",		// 4
			"Functor",		// 5
			"Functor Instantiation", // 6
	};
	
	/**
	 * GF module (keywords)
	 */
	private String[] moduleTypeKeywords = new String[] {
    	    "abstract",		// 0
    	    "concrete",		// 1
    	    "resource",		// 2
    	    "interface",	// 3
    	    "instance",		// 4
    	    "incomplete concrete",		// 5
    	    "concrete", // 6
    };

	/**
	 * The page name
	 */
	public static String getPageName() {
		return "New GF module";
	}
	
	/**
	 * The page description
	 */
	public static String getPageDescription() {
		return "This wizard creates a new GF module source file (*.gf).";
	}
	
	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFNewFileWizardPage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}

	/**
	 * {@inheritDoc}	
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
		// Save to
		new Label(container, SWT.NULL).setText("&Save to:");
		field_Path = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Path.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		field_Path.addModifyListener(defaultModifyListener);
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse(field_Path);
			}
		});
		
		// Module type
		new Label(container, SWT.NULL).setText("Module &type:");
	    field_ModuleType = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		field_ModuleType.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
	    field_ModuleType.setItems(moduleTypeOptions);
	    field_ModuleType.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				field_Instantiates.setEnabled(false);
				field_With.setEnabled(false);
				field_Of.setEnabled(false);
				label_Instantiates.setEnabled(false);
				label_With.setEnabled(false);
				label_Of.setEnabled(false);
				switch (field_ModuleType.getSelectionIndex()) {
				case 6:
					field_Instantiates.setEnabled(true);
					field_With.setEnabled(true);
					label_Instantiates.setEnabled(true);
					label_With.setEnabled(true);
				case 1:
				case 4:
				case 5:
					field_Of.setEnabled(true);
					label_Of.setEnabled(true);
					break;
				}
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
		field_ModuleName.addModifyListener(defaultModifyListener);
		field_ModuleName.setFocus();

	    // "of" for instance/concrete
		label_Of = new Label(container, SWT.NULL);
		label_Of.setText("of");
		label_Of.setEnabled(false);
	    field_Of = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Of.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		field_Of.addModifyListener(defaultModifyListener);
	    field_Of.setEnabled(false);
	    enableAutoSuggest(field_Of);
		
		// Functor Instantiations
		label_Instantiates = new Label(container, SWT.NULL);
		label_Instantiates.setText("&Instantiates:");
		label_Instantiates.setEnabled(false);
		field_Instantiates = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Instantiates.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_Instantiates.addModifyListener(defaultModifyListener);
		field_Instantiates.setEnabled(false);
	    enableAutoSuggest(field_Instantiates);
		label_With = new Label(container, SWT.NULL);
		label_With.setText("with");
		label_With.setEnabled(false);
		field_With = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_With.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_With.addModifyListener(defaultModifyListener);
		field_With.setEnabled(false);
		
		// Opens & Extends are available to all!
		new Label(container, SWT.NULL).setText("&Opens:");
		field_Opens = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Opens.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		field_Opens.addModifyListener(defaultModifyListener);
		enableAutoSuggest(field_Opens);
		new Label(container, SWT.NULL).setText("&Extends:");
		field_Extends = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Extends.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		field_Extends.addModifyListener(defaultModifyListener);
		enableAutoSuggest(field_Extends);
		
		initialize(container);
	}
	
	/**
	 * Gets the module type.
	 *
	 * @return the module type
	 */
	protected String getField_ModuleKeywords() {
		try {
			return moduleTypeKeywords[field_ModuleType.getSelectionIndex()];
		}
		catch (IndexOutOfBoundsException _) {
			return "";
		}
	}
	
	/**
	 * Gets the mod of.
	 *
	 * @return the mod of
	 */
	protected String getField_Of() {
		return field_Of.getText().trim();
	}

	/**
	 * Gets the module extends.
	 *
	 * @return the module extends
	 */
	protected String getField_Extends() {
		return field_Extends.getText().trim();
	}
	
	/**
	 * Gets the module functor.
	 *
	 * @return the module functor
	 */
	protected String getField_Instantiates() {
		return field_Instantiates.getText().trim();
	}
	
	/**
	 * Gets the module instantiates.
	 *
	 * @return the module instantiates
	 */
	protected String getField_With() {
		return field_With.getText().trim();
	}
	
	/**
	 * Gets the module opens.
	 *
	 * @return the module opens
	 */
	protected String getField_Opens() {
		return field_Opens.getText().trim();
	}
	
	/**
	 * Gets the module name.
	 *
	 * @return the module name
	 */
	protected String getField_ModuleName() {
		return field_ModuleName.getText().trim();
	}

	/**
	 * Gets the container name.
	 *
	 * @return the container name
	 */
	protected String getField_Path() {
		return field_Path.getText().trim();
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
	 * {@inheritDoc}
	 */
	protected void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getField_Path()));
		
		String regexFunctor = REGEX_MODULE_NAME + "\\s*(\\s*-?\\s*\\[.*?\\])?";
		String regexExtends = String.format("%1$s\\s*(\\s*-?\\s*\\[.*?\\])?(\\s*,\\s*%1$s\\s*(-?\\s*\\[.*?\\])?\\s*)*", REGEX_MODULE_NAME);
		String regexOpens = String.format("(%1$s|\\(\\s*%1$s\\s*(=\\s*%1$s\\s*)?\\))\\s*(\\s*,\\s*(%1$s|\\(\\s*%1$s\\s*(=\\s*%1$s\\s*)?\\))\\s*)*", REGEX_MODULE_NAME);
		
		// Container / location
		if (getField_Path().isEmpty()) {
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
		if (getField_ModuleName().isEmpty()) {
			updateStatus("Module name must be specified");
			return;
		}
		if (!isValidModuleName(getField_ModuleName())) {
			updateStatus("Module name is invalid (don't include extension)");
			return;
		}
		String eventualFilename = getField_ModuleName() + ".gf";
		IResource fileExists = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getField_Path() + File.separator + eventualFilename));
		if (fileExists!=null) {
			updateStatus(String.format("Module \"%s\" already exists at that location", eventualFilename));
			return;
		}

		// Concrete / Instance of
		if (field_ModuleType.getText().equals("concrete of") && getField_Of().isEmpty()) {
			updateStatus("Concrete of ... must be specified");
			return;
		}
		if (field_ModuleType.getText().equals("instance of") && getField_Of().isEmpty()) {
			updateStatus("Instance of ... must be specified");
			return;
		}
		
		// Extends, Functor, Instantiates, Opens
		if (!getField_Extends().isEmpty() && !getField_Extends().matches(regexExtends)) {
			updateStatus("Extends field is invalid");
			return;
		}
		if (!getField_With().isEmpty() && !getField_With().matches(regexOpens)) {
			updateStatus("Instantiates field is invalid");
			return;
		}
		if (!getField_Opens().isEmpty() && !getField_Opens().matches(regexOpens)) {
			updateStatus("Opens field is invalid");
			return;
		}
		if (!getField_Instantiates().isEmpty() && !getField_Instantiates().matches(regexFunctor)) {
			updateStatus("Functor field is invalid");
			return;
		}

		clearStatus();
	}

}