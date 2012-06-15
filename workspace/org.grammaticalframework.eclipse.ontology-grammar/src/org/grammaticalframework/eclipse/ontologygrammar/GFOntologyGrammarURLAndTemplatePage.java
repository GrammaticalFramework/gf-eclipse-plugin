package org.grammaticalframework.eclipse.ontologygrammar;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.ontotext.molto.repositoryHelper.GFTemplate;
import com.ontotext.molto.repositoryHelper.RepositoryUtils;
import com.ontotext.molto.repositoryHelper.RepositoryUtilsConnectionException;
import com.ontotext.molto.repositoryHelper.TemplateFileReader;

/**
 * This is the first page of the GFOntologyGrammarWizard, 
 * for selection of a SPARQL endpoint URL and a templates file for the grammar
 * 
 * @see GFOntologyGrammarWizard
 * @author Maria Mateva, Ontotext AD
 */
public class GFOntologyGrammarURLAndTemplatePage extends GFOntologyGrammarClipboardPage {
	
	/**
	 * URL/HTTP address boxes	
	 */
	private Text urlPath;
	private Text usernameBox;
	private Text passwordBox;
	private Text templatePathField;
	
	/**
	 * Buttons for preliminary validation
	 */
	private Button validateTemplateButton;
	private Button validateURLButton;
	
	/**
	 * Labels to hold eventual errors on validation
	 */
	private Label urlValidationLabel;
	private Label templateValidationLabel;
	
	/**
	 * The template file resource string
	 */
	private String templateFile;
	
	private boolean templateOK;
	private boolean sparqlEndpointOK;
	private GFOntologyGrammarChooseTemplatePage templatesPage;
	
	public static String getPageName() {
		return "Welcome!";
	}
	
	public static String getPageDescription() {
		return "Select a SPARQL endpoint URL and a grammar templates file";
	}
	
	protected GFOntologyGrammarURLAndTemplatePage() {
		super(getPageName(), getPageDescription());
		templateOK = false;
		sparqlEndpointOK = false;
		templatesPage = new GFOntologyGrammarChooseTemplatePage();
	}
	
	/**
	 * Initial setup of controls
	 */
	@Override
	public void createControl(Composite parent) {
		Point size = getShell().computeSize(SCREEN_WIDTH, SCREEN_HEIGTH);
		getShell().setSize(size);
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		// Open SPARQL endpoint URL 
		Label urlLabel = new Label(container, SWT.NULL);
		urlLabel.setText("Repository URL:");
		urlLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		urlPath = new Text(container, SWT.BORDER | SWT.SINGLE);
		urlPath.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		urlPath.addModifyListener(defaultModifyListener);
		urlPath.setText("http://localhost:8080/repositories/molto-repository");
		
		Label userNameLabel = new Label(container, SWT.NULL);
		userNameLabel.setText("Username:");
		userNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		usernameBox = new Text(container, SWT.BORDER | SWT.SINGLE);
		usernameBox.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		usernameBox.addModifyListener(defaultModifyListener);
		usernameBox.setText("onto");
		
		Label passwordLabel = new Label(container, SWT.NULL);
		passwordLabel.setText("Password:");
		passwordLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		passwordBox = new Text(container, SWT.BORDER | SWT.PASSWORD);
		passwordBox.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		passwordBox.addModifyListener(defaultModifyListener);
		
		validateURLButton = new Button(container, SWT.PUSH);
		validateURLButton.setText("Connect");
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
		templateLabel.setText("Templates file:");
		templateLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		templatePathField = new Text(container, SWT.BORDER | SWT.SINGLE);
		templatePathField.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		templatePathField.addModifyListener(defaultModifyListener);
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
				validateAndLoadTemplate();
			}
		});
		
		templateValidationLabel = new Label(container, SWT.NULL);
		templateValidationLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		templateValidationLabel.setVisible(false);
		
		initialize(container);
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void dialogChanged() {
		if (passwordBox != null && usernameBox != null 
				&& urlPath != null && templatePathField != null) {
			// making sure these components were already created				
			setPageComplete(templateOK && sparqlEndpointOK);
		}
	}
	
	/**
	 * File browser activated
	 */
	private void handleBrowse() {
		Shell shell = getShell();
		FileDialog dialog = new FileDialog(shell,  SWT.OPEN | SWT.MULTI);
		dialog.setFilterNames(new String[] {"Templates", "All Files (*.*)"});
		dialog.setFilterExtensions(new String[] {"*.xml", "*.*"});                      
		dialog.setFilterPath("");
		dialog.setText("Template file selection");
		dialog.setFileName("template.xml");
		templateFile = dialog.open();
		if (templateFile != null) {
			templatePathField.setText(templateFile);
			validateAndLoadTemplate();
		}
	}
	
	/**
	 * Validates if the SPARQL endpoint is accessible and can be queried
	 * 
	 * @return true if valid, false if not
	 */
	private boolean validateURLField() {
		String url = urlPath.getText();
		String password = passwordBox.getText();
		String username = usernameBox.getText();
		if (url.length() < 5 || password.length() == 0 || username.length() == 0) {
			sparqlEndpointOK = false;
			displayFieldValidOrNot(urlValidationLabel, GFOntologyGrammarMsg.FIELD_INCOMPLETE, false);
		}
		RepositoryUtils repository;
		String validation = "";
		sparqlEndpointOK = false;
		try {
			repository = new RepositoryUtils(url, username, password);
			((GFOntologyGrammarWizard) getWizard()).setRepository(repository);
			// test the connection
			List<String> classnames = repository.getAllClassesAndNames();
			if (classnames != null) { 
				getClipboard().setClassNames(classnames);
				sparqlEndpointOK = true;
			} else {
				sparqlEndpointOK = false;
			}
		
		} catch (RepositoryUtilsConnectionException ex) {
			if (ex.getMessage() == null) {
				validation = GFOntologyGrammarMsg.REPO_UNREACHABLE;
			} else {
				validation = ex.getMessage();
			}
			 sparqlEndpointOK = false;
		} finally {
			displayFieldValidOrNot(urlValidationLabel, validation, sparqlEndpointOK);
		}
		if (sparqlEndpointOK) {
			validation = GFOntologyGrammarMsg.REPO_VALID;
		}
		setPageComplete(templateOK && sparqlEndpointOK);
		displayFieldValidOrNot(urlValidationLabel, validation, sparqlEndpointOK);
		return sparqlEndpointOK;
	}
	
	/**
	 * Validates if the template is filled in and the file contains valid query templates.
	 * 
	 * @return true if valid, false if not
	 */
	private boolean validateAndLoadTemplate() {
		if (templateFile != null) {
			TemplateFileReader templateReader = new TemplateFileReader(templateFile);
			templateReader.load();
			List<GFTemplate> templateValuesList = templateReader.getTemplateList();
			if (templateValuesList.size() > 0) { 
				getClipboard().clearTemplates();
				getClipboard().addTemplates(templateValuesList);
				addNextPage(templatesPage);
				templatesPage.refreshTemplates();
				displayFieldValidOrNot(templateValidationLabel, GFOntologyGrammarMsg.TEMPLATE_OK, true);
				templateOK = true;
				setPageComplete(templateOK && sparqlEndpointOK);
				return true;
			} else {
				displayFieldValidOrNot(templateValidationLabel, GFOntologyGrammarMsg.TEMPLATE_EMPTY, false);
				templateOK = false;
				return false;
			}
		} else {
			templateOK = false;
			return false;
		}
	}
	
	
	/**
	 * Display if the SPARQL endpoint or template was not valid
	 */
	private void displayFieldValidOrNot(Label label, String message, boolean valid) {
		label.setText(message);
		label.setVisible(true);
	}
	
}
