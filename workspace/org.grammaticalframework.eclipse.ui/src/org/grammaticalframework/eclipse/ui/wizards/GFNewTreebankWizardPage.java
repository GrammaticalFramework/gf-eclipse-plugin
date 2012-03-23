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

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.grammaticalframework.eclipse.treebank.GFTreebankHelper;

/**
 * Wizard page for creating a new CFG
 */
public class GFNewTreebankWizardPage extends AbstractNewFileWizardPage {
	
	/**
	 * The Constant PAGE_NAME.
	 */
	private static final String PAGE_NAME = "Create Treebank";
	
	/**
	 * The Constant PAGE_DESCRIPTION.
	 */
	private static final String PAGE_DESCRIPTION = "Create a treebank file using GF's 'generate_random' function.";
	
	/**
	 * Default generate command
	 */
	private static final String DEFAULT_GENERATE_COMMAND = "gr -number=10";

	/**
	 * Fields
	 */
	private Text field_TreebankName;
	private Combo field_LaunchConfig;
	private Text field_GenerateCommand;

	private ILaunchConfiguration[] launchConfigurations;
	
	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFNewTreebankWizardPage(ISelection selection) {
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
		
		// If no launch configs, diplay message and that's it
		launchConfigurations = GFWizardHelper.getGFLaunchConfigs();
		if (launchConfigurations.length==0) {
			FontData fontData = parent.getFont().getFontData()[0];
			Font fontItalic = new Font(container.getDisplay(), new FontData(fontData.getName(), fontData.getHeight(), SWT.ITALIC));
			Label l = new Label(container, SWT.NULL);
			l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
			l.setFont(fontItalic);
			l.setText("No GF launch configurations were found.\n" +
					"Please create one from 'Run Configurations' and re-open this wizard. ");
			initialize(container);
			return;
		}
		
		// Treebank file name
		new Label(container, SWT.NULL).setText("File &name:");
		field_TreebankName = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_TreebankName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_TreebankName.addModifyListener(listener);
		field_TreebankName.setFocus();
		new Label(container, SWT.LEFT).setText(".trees");
		
		// Launch config
		new Label(container, SWT.TOP).setText("&Launch configuration:");
		field_LaunchConfig = new Combo(container, SWT.BORDER | SWT.READ_ONLY);
		field_LaunchConfig.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		for (int i = 0; i < launchConfigurations.length; i++) {
			field_LaunchConfig.add(launchConfigurations[i].getName());
		}
		if (launchConfigurations.length==1) {
			// If there's only one, select it!
			field_LaunchConfig.select(0);
		}
		field_LaunchConfig.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		// Generate command
		new Label(container, SWT.NULL).setText("Generate &command:");
		field_GenerateCommand = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_GenerateCommand.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		field_GenerateCommand.setText(DEFAULT_GENERATE_COMMAND);
		field_GenerateCommand.addModifyListener(listener);

		initialize(container);
	}
	
	/**
	 * Gets the treebank file name.
	 *
	 * @return the treebank name
	 */
	protected String getField_TreebankName() {
		return field_TreebankName.getText() + GFTreebankHelper.getTreebankExtension(true);
	}
	
	/**
	 * Gets the selected launch config
	 *
	 * @return the launch config, or null if none is expected again
	 */
	protected ILaunchConfiguration getField_LaunchConfig() {
		int ix = field_LaunchConfig.getSelectionIndex();
		return ix > -1 ? launchConfigurations[ix] : null;
	}
	
	/**
	 * Gets the generate command
	 *
	 * @return the generate command
	 */
	protected String getField_GenerateCommand() {
		return field_GenerateCommand.getText();
	}

	/**
	 * Dialog changed.
	 */
	protected void dialogChanged() {
		
		// Module name
		if (getField_TreebankName().trim().isEmpty()) {
			updateStatus("A file name must be specified.");
			return;
		}
		
		// Launch config
		if (getField_LaunchConfig()==null) {
			updateStatus("Please select a launch configuration.");
			return;
		}
		
		// Command
		if (getField_GenerateCommand().trim().isEmpty()) {
			updateStatus("Please enter a generate command, e.g. \""+DEFAULT_GENERATE_COMMAND+"\"");
			return;
		}

		clearStatus();
	}

}