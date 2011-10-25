package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (gf).
 */

public class GFNewFileWizardPage extends WizardPage {
	
	private static final String PAGE_NAME = "GF Module";
	private static final String PAGE_DESCRIPTION = "This wizard creates a new GF module source file (*.gf)"; //$NON-NLS-1$

	private Text containerText;
	private Text modNameText;
	private Button modIncompleteButton;
	private Button modTypeAbstractRadio, modTypeResourceRadio, modTypeInterfaceRadio, modTypeConcreteRadio, modTypeInstanceRadio;
	private Text modConcreteOfText, modInstanceOfText;
	private Text modExtendsText,modOpensText, modFunctorText, modInstantiatesText;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public GFNewFileWizardPage(ISelection selection) {
		super(PAGE_NAME);
		setTitle(PAGE_NAME);
		setDescription(PAGE_DESCRIPTION);
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		// Container
		new Label(container, SWT.NULL).setText("&Save to:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		containerText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		// Module name
		new Label(container, SWT.NULL).setText("&Module name:");
		modNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modNameText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		modNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		new Label(container, SWT.NULL); // Skip cell!
		
		// Incomplete?
		modIncompleteButton = new Button(container, SWT.CHECK);
		modIncompleteButton.setText("&Incomplete");
	    modIncompleteButton.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false, 3, 1));
		
		// Type
	    modTypeAbstractRadio = new Button(container, SWT.RADIO);
	    modTypeAbstractRadio.setText("abstract");
	    modTypeAbstractRadio.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false, 3, 1));
	    
	    modTypeResourceRadio = new Button(container, SWT.RADIO);
	    modTypeResourceRadio.setText("resource");
	    modTypeResourceRadio.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false, 3, 1));
	    
	    modTypeInterfaceRadio = new Button(container, SWT.RADIO);
	    modTypeInterfaceRadio.setText("interface");
	    modTypeInterfaceRadio.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false, 3, 1));
	    
	    modTypeConcreteRadio = new Button(container, SWT.RADIO);
	    modTypeConcreteRadio.setText("concrete of");
	    modTypeConcreteRadio.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
			}
		});
		modConcreteOfText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modConcreteOfText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		modConcreteOfText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				deselectRadios();
				modTypeConcreteRadio.setSelection(true);
				dialogChanged();
			}
		});
		new Label(container, SWT.NULL); // Skip cell!
	    
	    modTypeInstanceRadio = new Button(container, SWT.RADIO);
	    modTypeInstanceRadio.setText("instance of");
	    modTypeInstanceRadio.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
			}
		});
		modInstanceOfText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modInstanceOfText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		modInstanceOfText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				deselectRadios();
				modTypeInstanceRadio.setSelection(true);
				dialogChanged();
			}
		});
		new Label(container, SWT.NULL); // Skip cell
		
		// Extends
		new Label(container, SWT.NULL).setText("&Extends:");
		modExtendsText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modExtendsText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		modExtendsText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Functor Instantiations
		new Label(container, SWT.NULL).setText("&Functor:");
		modFunctorText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modFunctorText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		modFunctorText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		new Label(container, SWT.NULL); // Skip cell
		
		new Label(container, SWT.NULL).setText("&With:");
		modInstantiatesText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modInstantiatesText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		modInstantiatesText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		// Opens
		new Label(container, SWT.NULL).setText("&Opens:");
		modOpensText = new Text(container, SWT.BORDER | SWT.SINGLE);
		modOpensText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		modOpensText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// ...		

		initialize();
		setControl(container);
	}

	protected void deselectRadios() {
		modTypeAbstractRadio.setSelection(false);
		modTypeResourceRadio.setSelection(false);
		modTypeInterfaceRadio.setSelection(false);
		modTypeConcreteRadio.setSelection(false);
		modTypeInstanceRadio.setSelection(false);
	}

	protected String getModInstanceOf() {
		return modInstanceOfText.getText();
	}
	
	protected String getModConcreteOf() {
		return modConcreteOfText.getText();
	}

	protected Boolean getModIsIncomplete() {
		return modIncompleteButton.getSelection();
	}
	
	protected String getModuleType() {
		if (modTypeAbstractRadio.getSelection()) return "abstract";
		if (modTypeResourceRadio.getSelection()) return "resource";
		if (modTypeInterfaceRadio.getSelection()) return "interface";
		if (modTypeConcreteRadio.getSelection()) return "concrete";
		if (modTypeInstanceRadio.getSelection()) return "instance";
		return null;
	}

	protected String getModuleExtends() {
		return modExtendsText.getText();
	}
	
	protected String getModuleFunctor() {
		return modFunctorText.getText();
	}
	
	protected String getModuleInstantiates() {
		return modInstantiatesText.getText();
	}
	
	protected String getModuleOpens() {
		return modOpensText.getText();
	}
	
	protected String getModuleName() {
		return modNameText.getText();
	}

	protected String getContainerName() {
		return containerText.getText();
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
		modNameText.setText("untitled");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}
	
	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		
		String regexModName = "[a-zA-Z_][a-zA-Z0-9_']*";
		String regexFunctor = "[a-zA-Z_][a-zA-Z0-9_']*\\s*(\\s*-?\\s*\\[.*?\\])?";
		String regexExtends = "[a-zA-Z_][a-zA-Z0-9_']*\\s*(\\s*-?\\s*\\[.*?\\])?(\\s*,\\s*[a-zA-Z_][a-zA-Z0-9_']*\\s*(-?\\s*\\[.*?\\])?\\s*)*";
		String regexOpens = "([a-zA-Z_][a-zA-Z0-9_']*|\\(\\s*[a-zA-Z_][a-zA-Z0-9_']*\\s*(=\\s*[a-zA-Z_][a-zA-Z0-9_']*\\s*)?\\))\\s*(\\s*,\\s*([a-zA-Z_][a-zA-Z0-9_']*|\\(\\s*[a-zA-Z_][a-zA-Z0-9_']*\\s*(=\\s*[a-zA-Z_][a-zA-Z0-9_']*\\s*)?\\))\\s*)*";
		
		// Container / location
		if (getContainerName().length() == 0) {
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
		String moduleName = getModuleName();
		if (moduleName.length() == 0) {
			updateStatus("Module name must be specified");
			return;
		}
		if (!moduleName.matches(regexModName)) {
			updateStatus("Module name is invalid");
			return;
		}

		// Concrete / Instance of
		if (modTypeConcreteRadio.getSelection() && getModConcreteOf().isEmpty()) {
			updateStatus("Concrete of ... must be specified");
			return;
		}
		if (modTypeInstanceRadio.getSelection() && getModInstanceOf().isEmpty()) {
			updateStatus("Instance of ... must be specified");
			return;
		}
		
		
		// Extends, Functor, Instantiates, Opens
		if (!getModuleExtends().isEmpty() && !getModuleExtends().matches(regexExtends)) {
			updateStatus("Extends field is invalid");
			return;
		}
		if (!getModuleInstantiates().isEmpty() && !getModuleInstantiates().matches(regexOpens)) {
			updateStatus("Instantiates field is invalid");
			return;
		}
		if (!getModuleOpens().isEmpty() && !getModuleOpens().matches(regexOpens)) {
			updateStatus("Opens field is invalid");
			return;
		}
		if (!getModuleFunctor().isEmpty() && !getModuleFunctor().matches(regexFunctor)) {
			updateStatus("Functor field is invalid");
			return;
		}

		updateStatus(null);
		
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

}