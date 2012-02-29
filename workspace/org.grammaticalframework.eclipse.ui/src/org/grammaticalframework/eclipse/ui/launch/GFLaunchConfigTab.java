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
import org.grammaticalframework.eclipse.ui.views.TreebankManagerHelper;
import org.grammaticalframework.eclipse.ui.wizards.GFWizardHelper;

/**
 * GF Launch Config Tab
 */
public class GFLaunchConfigTab extends AbstractLaunchConfigurationTab {

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
	
	private Combo combo_TreebankFile;
	public String getTreebankFile() {
		return combo_TreebankFile.getText();
	}

	private Text text_GoldStandardFile;
	public String getGoldStandardFile() {
		return text_GoldStandardFile.getText();
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
		
		// Little notice
		Label l = new Label(comp, SWT.NULL);
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		l.setFont(fontItalic);
		l.setText("Note: The GF runtime path can be set in the Eclipse Preferences dialog. ");
		
		// Working Directory
		new Label(comp, SWT.NULL).setText("&Working directory:");
		text_WorkingDirectory = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_WorkingDirectory.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_WorkingDirectory.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Filenames
		new Label(comp, SWT.NULL).setText("&Source filenames:");
		text_Filenames = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_Filenames.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_Filenames.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		new Label(comp, SWT.NULL);
		l = new Label(comp, SWT.NULL);
		l.setFont(fontItalic);
		l.setText("The names of the files to compile, separated by spaces ");
		
		
		// Compiler options
		new Label(comp, SWT.NULL).setText("&Compiler options:");
		text_Options = new Text(comp, SWT.BORDER | SWT.SINGLE);
		text_Options.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		text_Options.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Batch/Interactive mode
//		Group runModeGroup = new Group(comp, SWT.BORDER);
//		runModeGroup.setText("Run mode");
//		runModeGroup.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
//		runModeGroup.setLayout(new GridLayout(2, false));
		
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
		
		// Treebank files
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
		
		// Gold standard file
		new Label(treebankModeGroup, SWT.NULL).setText("&Gold standard file:");
		text_GoldStandardFile = new Text(treebankModeGroup, SWT.BORDER | SWT.READ_ONLY);
		text_GoldStandardFile.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
	}

	/**
	 * Dialog changed.
	 */
	private void dialogChanged() {
		setDirty(true);
		
		// Check filenames
		if (getFilenames().length() == 0) {
			updateStatus("A least one source filename must be specified.");
		}
		else {
			updateStatus(null);
		}
		
		// Check treebank stuff
		if (isTreebankMode() && combo_TreebankFile.getSelectionIndex() > -1) {
			IFile treebankFile = treebankFiles.get(combo_TreebankFile.getSelectionIndex());
			IFile goldStandardFile = TreebankManagerHelper.getGoldStandardFile(treebankFile);
			if (goldStandardFile != null) {
				text_GoldStandardFile.setText(goldStandardFile.getName());
				text_GoldStandardFile.setEnabled(true);
				updateStatus(null);
			} else {
				text_GoldStandardFile.setText("");
				text_GoldStandardFile.setEnabled(false);
				updateStatus("No corresponding gold standard file found for "+treebankFile.getName());
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
		setErrorMessage(message);
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
		
		String defaultOptions = ""; //"--force-recomp";
		
		try {
			text_WorkingDirectory.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, defaultWorkingDir)
			);
			text_Filenames.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.FILENAMES, "")
			);
			text_Options.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, defaultOptions)
			);
			boolean intMode = configuration.getAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
			button_InteractiveMode.setSelection(intMode);
			button_BatchMode.setSelection(!intMode);
			button_TreebankMode.setSelection(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false)
			);
			combo_TreebankFile.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, "")
			);
			text_GoldStandardFile.setText(
					configuration.getAttribute(IGFLaunchConfigConstants.GOLD_STANDARD_FILENAME, "")
			);
		} catch (CoreException e) {
			text_WorkingDirectory.setText(null);
			text_Options.setText("--force-recomp");
			button_InteractiveMode.setSelection(false);
			text_Filenames.setText(null);
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
		configuration.setAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, getTreebankFile());
		configuration.setAttribute(IGFLaunchConfigConstants.GOLD_STANDARD_FILENAME, getGoldStandardFile());
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
