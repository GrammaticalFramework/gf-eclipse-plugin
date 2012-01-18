/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
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
	
	/**
	 * The Constant PAGE_NAME.
	 */
	private static final String PAGE_NAME = "GF Module";
	
	/**
	 * The Constant PAGE_DESCRIPTION.
	 */
	private static final String PAGE_DESCRIPTION = "This wizard creates a new GF module source file (*.gf)";

	/**
	 * Fields
	 */
	private Text field_Path;
	private Text field_ModuleName;
	private Combo field_ModuleType;
	private Text field_Of;
	private Text field_Extends,field_Opens, field_Instantiates, field_With;
	private Label label_Of, label_Instantiates, label_With;
	
	
	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFNewFileWizardPage(ISelection selection) {
		super(PAGE_NAME);
		setTitle(PAGE_NAME);
		setDescription(PAGE_DESCRIPTION);
		this.selection = selection;
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
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
		// General use listener
		ModifyListener listener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		};
		
		// Save to
		new Label(container, SWT.NULL).setText("&Save to:");
		field_Path = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Path.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		field_Path.addModifyListener(listener);
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		// Module type
		new Label(container, SWT.NULL).setText("Module &type:");
	    field_ModuleType = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
	    field_ModuleType.setItems(new String[] {
	    	    "Abstract",		// 0
	    	    "Concrete",		// 1
	    	    "Resource",		// 2
	    	    "Interface",	// 3
	    	    "Instance",		// 4
	    	    "Functor",		// 5
	    	    "Functor Instantiation", // 6
	    });
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
		new Label(container, SWT.NULL); // Skip cell!
		new Label(container, SWT.NULL); // Skip cell!
		
		// Module name
		new Label(container, SWT.NULL).setText("Module &name:");
		field_ModuleName = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_ModuleName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_ModuleName.addModifyListener(listener);

	    // "of" for instance/concrete
		label_Of = new Label(container, SWT.NULL);
		label_Of.setText("of");
		label_Of.setEnabled(false);
	    field_Of = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Of.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		field_Of.addModifyListener(listener);
	    field_Of.setEnabled(false);

	    // Get suggestions...
	    // Ref: http://www.vogella.de/articles/EclipseRCP/article.html#fieldassist
		ArrayList<String> suggestions = getFileList();
		KeyStroke keystroke = null;
		try {
			keystroke = KeyStroke.getInstance("Ctrl+Space");
		} catch (ParseException _) {
		}		
		@SuppressWarnings("unused")
		ContentProposalAdapter adapter = new ContentProposalAdapter(
				field_Of,
				new TextContentAdapter(),
				new SimpleContentProposalProvider(suggestions.toArray(new String[]{})),
				keystroke, null);

		// Create the decoration for the text UI component
		final ControlDecoration deco = new ControlDecoration(field_Of, SWT.TOP | SWT.RIGHT);
		Image image = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL)
				.getImage();
		deco.setDescriptionText("Use Ctrl+Space to see possible values");
			deco.setImage(image);
		
		// Functor Instantiations
		label_Instantiates = new Label(container, SWT.NULL);
		label_Instantiates.setText("&Instantiates:");
		label_Instantiates.setEnabled(false);
		field_Instantiates = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Instantiates.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_Instantiates.addModifyListener(listener);
		field_Instantiates.setEnabled(false);
		label_With = new Label(container, SWT.NULL);
		label_With.setText("with");
		label_With.setEnabled(false);
		field_With = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_With.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_With.addModifyListener(listener);
		field_With.setEnabled(false);
		
		// Opens & Extends are available to all!
		new Label(container, SWT.NULL).setText("&Opens:");
		field_Opens = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Opens.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		field_Opens.addModifyListener(listener);
		new Label(container, SWT.NULL).setText("&Extends:");
		field_Extends = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Extends.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		field_Extends.addModifyListener(listener);
		
		initialize();
		setControl(container);
	}
	
	/**
	 * Recursively find all files in the workspace, in a flat list to be used as suggestions.
	 *
	 * @return the file list
	 */
	private ArrayList<String> getFileList() {
		ArrayList<String> suggestions = new ArrayList<String>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		traverseFileList(root, suggestions);
		return suggestions;
	}
	
	/**
	 * Traverse file list.
	 *
	 * @param resource the resource
	 * @param suggestions the suggestions
	 */
	private void traverseFileList(IResource resource, ArrayList<String> suggestions) {
		if (resource instanceof IFile) {
			IFile file = (IFile)resource;
			try {
				if (file.getFileExtension().equalsIgnoreCase("gf")) {
					suggestions.add( resource.getName().substring(0, resource.getName().length()-3) );
				}
			} catch (NullPointerException e) {
				// there was no file extension
			}
		} else if (resource instanceof IContainer) {
			try {
				for (IResource member : ((IContainer)resource).members()) {
					traverseFileList(member, suggestions);
				}
			} catch (CoreException e) {
				// No problem
			}
		}
	}
	
	/**
	 * Gets the module type.
	 *
	 * @return the module type
	 */
	protected String getModuleType() {
		if (field_ModuleType.getText().endsWith("of"))
			return field_ModuleType.getText().substring(0, 8); // concrete & instance both 8 chars long
		else
			return field_ModuleType.getText();
	}
	
	/**
	 * Gets the mod of.
	 *
	 * @return the mod of
	 */
	protected String getModOf() {
		return field_Of.getText();
	}

	/**
	 * Gets the module extends.
	 *
	 * @return the module extends
	 */
	protected String getModuleExtends() {
		return field_Extends.getText();
	}
	
	/**
	 * Gets the module functor.
	 *
	 * @return the module functor
	 */
	protected String getModuleFunctor() {
		return field_Instantiates.getText();
	}
	
	/**
	 * Gets the module instantiates.
	 *
	 * @return the module instantiates
	 */
	protected String getModuleInstantiates() {
		return field_With.getText();
	}
	
	/**
	 * Gets the module opens.
	 *
	 * @return the module opens
	 */
	protected String getModuleOpens() {
		return field_Opens.getText();
	}
	
	/**
	 * Gets the module name.
	 *
	 * @return the module name
	 */
	protected String getModuleName() {
		return field_ModuleName.getText();
	}

	/**
	 * Gets the container name.
	 *
	 * @return the container name
	 */
	protected String getContainerName() {
		return field_Path.getText();
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
				field_Path.setText(container.getFullPath().toString());
			}
		}
		field_ModuleName.setText("");
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
				field_Path.setText(((Path) result[0]).toString());
			}
		}
	}
	
	/**
	 * Dialog changed.
	 */
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
		if (field_ModuleType.getText().equals("concrete of") && getModOf().isEmpty()) {
			updateStatus("Concrete of ... must be specified");
			return;
		}
		if (field_ModuleType.getText().equals("instance of") && getModOf().isEmpty()) {
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