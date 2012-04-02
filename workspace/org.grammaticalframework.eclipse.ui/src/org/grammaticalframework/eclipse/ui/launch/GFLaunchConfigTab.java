/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.launch;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.grammaticalframework.eclipse.launch.IGFLaunchConfigConstants;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.wizards.GFWizardHelper;

/**
 * GF Launch Config Tab
 */
public class GFLaunchConfigTab extends AbstractLaunchConfigurationTab {
	
	/**
	 * @see ILaunchConfigurationTab#isValid(ILaunchConfiguration)
	 */
	public boolean isValid(ILaunchConfiguration launchConfig) {
		return valid;
	}
	private boolean valid;

	// UI widgets
	private Text text_WorkingDirectory;
	public String getWorkingDirectory() {
		return text_WorkingDirectory.getText().trim();
	}
	
	private Text text_Filenames;
	public String getFilenames() {
		return text_Filenames.getText().trim();
	}

	private Text text_Options;
	public String getOptions() {
		return text_Options.getText().trim();
	}
	
	private Text text_BatchCommands;
	public String getBatchCommands() {
		return text_BatchCommands.getText().trim();
	}

	private Button button_InteractiveMode;
	public Boolean isInteractiveMode() {
		return button_InteractiveMode.getSelection();
	}
	
	private Button button_BatchMode;
	public Boolean isBatchMode() {
		return button_BatchMode.getSelection();
	}
	
	private Button button_TreebankMode;
	public Boolean isTreebankMode() {
		return button_TreebankMode.getSelection();
	}
	
	private Button button_TreebankLinMode;
	public Boolean isTreebankLinearizeMode() {
		return button_TreebankLinMode.getSelection();
	}
	
	private Button button_TreebankParseMode;
	public Boolean isTreebankParseMode() {
		return button_TreebankParseMode.getSelection();
	}
	
	private Text text_TreebankCommandFlags;
	public String getTreebankCommand() {
		return text_TreebankCommandFlags.getText().trim();
	}

	private Combo combo_TreebankFile;
	public String getTreebankFile() {
		return combo_TreebankFile.getText().trim();
	}

	/**
	 * List of treebank files in workspace
	 */
	private List<IFile> treebankFiles;

	/**
	 * {@inheritDoc}
	 */
	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		
		String helpContextID;
		try {
			helpContextID = getHelpContextId(); // only available since 3.7
		} catch (NoSuchMethodError _) {
			helpContextID = null;
		}
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), helpContextID);
		
		comp.setLayout(new GridLayout(2, false));
		comp.setFont(parent.getFont());
		
		FontData fontData = parent.getFont().getFontData()[0];
		Font fontItalic = new Font(comp.getDisplay(), new FontData(fontData.getName(), fontData.getHeight(), SWT.ITALIC));
		
		// Listener
		ModifyListener modifyListener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		};
		SelectionListener selectionListener = new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
			}
		};
		
		// Little notice
		Label l = new Label(comp, SWT.NULL);
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		l.setFont(fontItalic);
		l.setText("Note: The GF runtime path can be set in the Eclipse Preferences dialog. ");
		
		// Working Directory
		new Label(comp, SWT.NULL).setText("&Working directory:");
		text_WorkingDirectory = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_WorkingDirectory.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_WorkingDirectory.addModifyListener(modifyListener);
		
		// Filenames
		new Label(comp, SWT.NULL).setText("&Source filenames:");
		text_Filenames = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_Filenames.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_Filenames.addModifyListener(modifyListener);
		new Label(comp, SWT.NULL);
		l = new Label(comp, SWT.NULL);
		l.setFont(fontItalic);
		l.setText("The names of the files to compile, separated by spaces. ");
		
		
		// Compiler options
		new Label(comp, SWT.NULL).setText("Compiler &options:");
		text_Options = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_Options.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_Options.addModifyListener(modifyListener);
		
		// Arbitrary command
		l = new Label(comp, SWT.NULL);
		l.setText("Other &commands:");
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		text_BatchCommands = new Text(comp, SWT.MULTI | SWT.V_SCROLL | SWT.WRAP | SWT.BORDER);
		text_BatchCommands.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		((GridData)text_BatchCommands.getLayoutData()).horizontalIndent = 2;
		text_BatchCommands.addModifyListener(modifyListener);
		new Label(comp, SWT.NULL);
		l = new Label(comp, SWT.NULL);
		l.setFont(fontItalic);
		l.setText("Any commands to be executed in the GF shell (one per line). ");
		
		// Batch/Interactive mode
		button_InteractiveMode = new Button(comp, SWT.RADIO);
		button_InteractiveMode.setText("&Interactive mode");
		button_InteractiveMode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));
		button_InteractiveMode.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				button_TreebankMode.setSelection(false);
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
			}
		});
		
		button_BatchMode = new Button(comp, SWT.RADIO);
		button_BatchMode.setText("&Batch mode");
		button_BatchMode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		button_BatchMode.addSelectionListener(selectionListener);
		
		// The Treebank testing box
		Group treebankModeGroup = new Group(comp, SWT.BORDER);
		treebankModeGroup.setText(" Treebank testing ");
		treebankModeGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		treebankModeGroup.setLayout(new GridLayout(3, false));

		button_TreebankMode = new Button(treebankModeGroup, SWT.CHECK);
		button_TreebankMode.setText("Run &treebank test");
		button_TreebankMode.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				if (button_TreebankMode.getSelection()) {
					button_InteractiveMode.setSelection(false);
					button_BatchMode.setSelection(true);
				}
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		button_TreebankMode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
		
		// Linearize / parse
		new Label(treebankModeGroup, SWT.NULL).setText("Type:");
		button_TreebankLinMode = new Button(treebankModeGroup, SWT.RADIO);
		button_TreebankLinMode.setText("&Linearize");
		button_TreebankLinMode.addSelectionListener(selectionListener);
		button_TreebankParseMode = new Button(treebankModeGroup, SWT.RADIO);
		button_TreebankParseMode.setText("&Parse");
		button_TreebankParseMode.addSelectionListener(selectionListener);
		
		// Command flags
		new Label(treebankModeGroup, SWT.NULL).setText("Additional &flags:");
		text_TreebankCommandFlags = new Text(treebankModeGroup, SWT.BORDER);
		text_TreebankCommandFlags.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		text_TreebankCommandFlags.addModifyListener(modifyListener);
		
		// Treebank file
		new Label(treebankModeGroup, SWT.NULL).setText("&Input file:");
		combo_TreebankFile = new Combo(treebankModeGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo_TreebankFile.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		treebankFiles = GFWizardHelper.getTreebankFileList();
		for (int i = 0; i < treebankFiles.size(); i++) {
			combo_TreebankFile.add(treebankFiles.get(i).getName());
		}
		combo_TreebankFile.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				button_InteractiveMode.setSelection(false);
				button_BatchMode.setSelection(true);
				button_TreebankMode.setSelection(true);
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
	
	}

	/**
	 * The dialog has changed, validate options.
	 */
	private void dialogChanged() {
		setDirty(true);
		clearStatus();
		
		// Check filenames
		if (getFilenames().isEmpty()) {
			updateStatus("A least one module file must be specified.");
		}
		
		// Check treebank stuff
		else if (isTreebankMode()) {
			if (!isTreebankLinearizeMode() && !isTreebankParseMode()) {
				updateStatus("You must select a test type (Linearize or Parse).");
			}
			if (combo_TreebankFile.getSelectionIndex() < 0) {
				updateStatus("You must select a test input file.");
			}
		}
		
		updateLaunchConfigurationDialog();
	}

	/**
	 * Update status.
	 *
	 * @param message the message
	 */
	private void updateStatus(String message) {
		valid = (message==null);
		setErrorMessage(message);
	}
	
	/**
	 * Clear status.
	 */
	private void clearStatus() {
		updateStatus(null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setContainer(null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void initializeFrom(ILaunchConfiguration configuration) {

		// Determine default working directory
		String defaultWorkingDir;
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			File workspaceDirectory = workspace.getRoot().getLocation().toFile();
			IProject[] projects = workspace.getRoot().getProjects();
			defaultWorkingDir = workspaceDirectory.getPath() + projects[0].getFullPath();
		} catch (Exception _) {
			defaultWorkingDir = "";
		}
		
		try {
			text_WorkingDirectory.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, defaultWorkingDir)
			);
			text_Filenames.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.FILENAMES, "")
			);
			text_Options.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, IGFLaunchConfigConstants.DEFAULT_OPTIONS)
					);
			text_BatchCommands.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.COMMANDS, "")
			);
			boolean interactiveMode = configuration.getAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
			button_InteractiveMode.setSelection(interactiveMode);
			button_BatchMode.setSelection(!interactiveMode);
			button_TreebankMode.setSelection(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false)
			);
			
			boolean treebankTypeLin = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_TYPE_LINEARIZE, true);
			button_TreebankLinMode.setSelection(treebankTypeLin);
			button_TreebankParseMode.setSelection(!treebankTypeLin);
			
			text_TreebankCommandFlags.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_COMMAND_FLAGS, "")
			);
			combo_TreebankFile.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, "")
			);
		} catch (CoreException e) {
		}

	}

	/**
	 * {@inheritDoc}
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(IGFLaunchConfigConstants.WORKING_DIR, getWorkingDirectory());
		configuration.setAttribute(IGFLaunchConfigConstants.FILENAMES, getFilenames());
		configuration.setAttribute(IGFLaunchConfigConstants.OPTIONS, getOptions());
		configuration.setAttribute(IGFLaunchConfigConstants.COMMANDS, getBatchCommands());
		configuration.setAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, isInteractiveMode());
		configuration.setAttribute(IGFLaunchConfigConstants.BATCH_MODE, isBatchMode());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, isTreebankMode());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_TYPE_LINEARIZE, isTreebankLinearizeMode());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_COMMAND_FLAGS, getTreebankCommand());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, getTreebankFile());
		setDirty(false);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return "GF"; 
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image getImage() {
		return GFImages.getImageWithoutHelper("gf-logo.png");
	}
}
