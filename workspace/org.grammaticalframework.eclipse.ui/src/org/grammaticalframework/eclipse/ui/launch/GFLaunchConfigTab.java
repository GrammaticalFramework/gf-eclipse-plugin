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
import org.eclipse.debug.ui.ILaunchConfigurationTab;
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
		return text_WorkingDirectory.getText();
	}
	
	private Text text_Filenames;
	public String getFilenames() {
		return text_Filenames.getText();
	}

	private Text text_Options;
	public String getOptions() {
		return text_Options.getText();
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
	
	private Text text_TreebankCommand;
	public String getTreebankCommand() {
		return text_TreebankCommand.getText();
	}

	private Combo combo_TreebankFile;
	public String getTreebankFile() {
		return combo_TreebankFile.getText();
	}

	/**
	 * List of treebank files in workspace
	 */
	private List<IFile> treebankFiles;

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
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
		ModifyListener listener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
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
		text_WorkingDirectory.addModifyListener(listener);
		
		// Filenames
		new Label(comp, SWT.NULL).setText("&Source filenames:");
		text_Filenames = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_Filenames.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_Filenames.addModifyListener(listener);
		new Label(comp, SWT.NULL);
		l = new Label(comp, SWT.NULL);
		l.setFont(fontItalic);
		l.setText("The names of the files to compile, separated by spaces ");
		
		
		// Compiler options
		new Label(comp, SWT.NULL).setText("&Compiler options:");
		text_Options = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_Options.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_Options.addModifyListener(listener);
		
		// Batch/Interactive mode
		button_InteractiveMode = new Button(comp, SWT.RADIO);
		button_InteractiveMode.setText("&Interactive mode (GF shell)");
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
		button_BatchMode.setText("&Batch mode:");
		button_BatchMode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		button_BatchMode.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
			}
		});
		
		Group treebankModeGroup = new Group(comp, SWT.BORDER);
		treebankModeGroup.setText("Treebank testing");
		treebankModeGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		treebankModeGroup.setLayout(new GridLayout(2, false));

		button_TreebankMode = new Button(treebankModeGroup, SWT.CHECK);
		button_TreebankMode.setText("&Run treebank test");
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
		button_TreebankMode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		
		// Treebank command
		new Label(treebankModeGroup, SWT.NULL).setText("&Command:");
		text_TreebankCommand = new Text(treebankModeGroup, SWT.BORDER);
		text_TreebankCommand.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_TreebankCommand.addModifyListener(listener);
		
		// Treebank file
		new Label(treebankModeGroup, SWT.NULL).setText("&Treebank file:");
		combo_TreebankFile = new Combo(treebankModeGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo_TreebankFile.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
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
		if (getFilenames().trim().isEmpty()) {
			updateStatus("A least one source filename must be specified.");
		}
		
		// Check treebank stuff
		else if (isTreebankMode()) {
			if (combo_TreebankFile.getSelectionIndex() < 0) {
				updateStatus("You must select a treebank file.");
			} else if (text_TreebankCommand.getText().trim().isEmpty()) {
				updateStatus("You must enter a treebank command, e.g. \"l -table\"");
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

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setContainer(null);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
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
			boolean intMode = configuration.getAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
			button_InteractiveMode.setSelection(intMode);
			button_BatchMode.setSelection(!intMode);
			button_TreebankMode.setSelection(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false)
			);
			text_TreebankCommand.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_COMMAND, IGFLaunchConfigConstants.DEFAULT_TREEBANK_COMMAND)
			);
			combo_TreebankFile.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, "")
			);
		} catch (CoreException e) {
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(IGFLaunchConfigConstants.WORKING_DIR, getWorkingDirectory());
		configuration.setAttribute(IGFLaunchConfigConstants.FILENAMES, getFilenames());
		configuration.setAttribute(IGFLaunchConfigConstants.OPTIONS, getOptions());
		configuration.setAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, isInteractiveMode());
		configuration.setAttribute(IGFLaunchConfigConstants.BATCH_MODE, isBatchMode());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, isTreebankMode());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_COMMAND, getTreebankCommand());
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, getTreebankFile());
		setDirty(false);
	}

	/**
	 * Name of the launch config tab
	 */
	public String getName() {
		return "GF"; 
	}

	/**
	 * Image for the launch config tab
	 */
	@Override
	public Image getImage() {
		return GFImages.getImageWithoutHelper("gf-logo.png");
	}
}
