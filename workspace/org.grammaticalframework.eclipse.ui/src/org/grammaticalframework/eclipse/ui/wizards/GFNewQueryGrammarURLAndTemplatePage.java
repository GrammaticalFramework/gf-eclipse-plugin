package org.grammaticalframework.eclipse.ui.wizards;


import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This is the first page of the GFQueryGrammaWizard, 
 * for selection of a SPARQL endpoint URL and a templates file for the grammar
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarURLAndTemplatePage extends GFQueryGrammarClipboardPage {
	
	/*
	 * URL/HTTP address boxes	
	 */
	private Text urlPath;
	private Text templatePath;
	
	/*
	 * Buttons for preliminary validation
	 */
	private Button validateTemplateButton;
	private Button validateURLButton;
	
	/*
	 * Labels to hold eventual errors on validation
	 */
	private Label urlValidationLabel;
	private Label templateValidationLabel;
	
	public static String getPageName() {
		return "Welcome!";
	}
	
	public static String getPageDescription() {
		return "Select a SPARQL endpoint URL and a grammar templates file";
	}
	
	protected GFNewQueryGrammarURLAndTemplatePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	/**
	 * Initial setup of controls
	 */
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		// Open SPARQL endpoint URL 
		Label urlLabel = new Label(container, SWT.NULL);
		urlLabel.setText("&URL to:");
		urlLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		urlPath = new Text(container, SWT.BORDER | SWT.SINGLE);
		urlPath.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		urlPath.addModifyListener(defaultModifyListener);
	
		validateURLButton = new Button(container, SWT.PUSH);
		validateURLButton.setText("Validate SPARQL endpoint");
		validateURLButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));
		validateURLButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				validateURLField();
			}
		});
		
		urlValidationLabel = new Label(container, SWT.NULL);
		urlValidationLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		urlValidationLabel.setVisible(false);
		
		// Open template path
		Label templateLabel = new Label(container, SWT.NULL);
		templateLabel.setText("&Templates file:");
		templateLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		templatePath = new Text(container, SWT.BORDER | SWT.SINGLE);
		templatePath.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		templatePath.addModifyListener (defaultModifyListener);
		Button browseButton = new Button(container, SWT.PUSH);
		browseButton.setText("Browse...");
		browseButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		browseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		validateTemplateButton = new Button(container, SWT.PUSH);
		validateTemplateButton.setText("Validate Template");
		validateTemplateButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));
		validateTemplateButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				validateTemplate();
			}
		});
		
		templateValidationLabel = new Label(container, SWT.NULL);
		templateValidationLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		templateValidationLabel.setVisible(false);
		
		initialize(container);
		System.out.println("INITIAL PAGE!");
	}
	
	/**
	 * File browser activated
	 */
	private void handleBrowse() {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.open();
		FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		dialog.setFilterNames(new String[] { "Templates", "All Files (*.*)" });
		dialog.setFilterExtensions(new String[] { "*.xml", "*.*" }); // wild cards                        
		dialog.setFilterPath("");
		dialog.setFileName("template.xml");
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void dialogChanged() {
		System.out.println("Dialog changed");
		setPageComplete(validateURLField() && validateTemplate());
	}
	
	
	/**
	 * Validates if the SPARQL endpoint is accessible and can be queried
	 * 
	 * @return true if valid, false if not
	 */
	public boolean validateURLField() {
		System.out.println("Validate URL!");
		return true;
	}
	
	
	/**
	 * Validates if the template is filled in and the file contains valid query templates.
	 * 
	 * @return true if valid, false if not
	 */
	public boolean validateTemplate() {
		System.out.println("Validate Template!");
		return true;
	}
	
	/*
	 * Display that SPARQL endpoint or template was not valid
	 */
	private void displayFieldNotValid(Label label, String message) {
		label.setText(message);
		//label.set(Color.RED);
		label.setVisible(true);
	}

}
