package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class GFCloneModuleWizardPage extends WizardPage {

	/**
	 * The Constant PAGE_NAME.
	 */
	private static final String PAGE_NAME = "Clone GF Module";
	
	/**
	 * The Constant PAGE_DESCRIPTION.
	 */
	private static final String PAGE_DESCRIPTION = "This wizard clones an existing GF module for a new language.";

	/**
	 * Fields
	 */
	private Combo field_CloneFrom;
	private Combo field_NewLanguage;
	
	private ISelection selection;
	
	private String[][] languageCodes = new String[][] {
			{"English", "Eng"},
			{"Italian", "Ita"},
			{"German", "Ger"},
			{"French", "Fre"},
	};

	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFCloneModuleWizardPage(ISelection selection) {
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
		layout.numColumns = 2;
		layout.verticalSpacing = 5;
		
		// General use listener
		ModifyListener listener = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		};
		
		// Source
		new Label(container, SWT.NULL).setText("Clone &from:");
		field_CloneFrom = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		field_CloneFrom.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_CloneFrom.setItems(WizardHelper.getFileList(false));
		field_CloneFrom.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		field_CloneFrom.select(0);
		
		// New language
		new Label(container, SWT.NULL).setText("New &language:");
		field_NewLanguage = new Combo(container, SWT.DROP_DOWN | SWT.BORDER);
		field_NewLanguage.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_NewLanguage.setItems(languageCodes[1]);
		field_NewLanguage.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		field_NewLanguage.select(0);
		
		//
		initialize();
		setControl(container);
	}
	
	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	private void initialize() {
		// TODO
	}

	/**
	 * Dialog changed.
	 */
	private void dialogChanged() {
		// TODO
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
