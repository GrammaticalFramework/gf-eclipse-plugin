package org.grammaticalframework.eclipse.ui.wizards;

import java.util.List;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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
 * This is the first page of the GFQueryGrammaWizard, 
 * for selection of a SPARQL endpoint URL and a templates file for the grammar
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva, Ontotext AD
 */
public class GFNewQueryGrammarURLAndTemplatePage extends GFNewQueryGrammarClipboardPage implements IPageChangedListener{
	
	/*
	 * URL/HTTP address boxes	
	 */
	private Text urlPath;
	private Text usernameBox;
	private Text passwordBox;
	private Text templatePathField;
	
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
	
	/**
	 * The template file resource string
	 */
	private String templateFile;
	
	private boolean templateOK;
	private boolean sparqlEndpointOK;
	private GFNewQueryGrammarChooseTemplatePage templatesPage;
	
	public static String getPageName() {
		return "Welcome!";
	}
	
	public static String getPageDescription() {
		return "Select a SPARQL endpoint URL and a grammar templates file";
	}
	
	protected GFNewQueryGrammarURLAndTemplatePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
		templateOK = false;
		sparqlEndpointOK = false;
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
		
		passwordBox = new Text(container, SWT.BORDER | SWT.SINGLE);
		passwordBox.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		passwordBox.addModifyListener(defaultModifyListener);
		
		validateURLButton = new Button(container, SWT.PUSH);
		validateURLButton.setText("Try connection to SPARQL endpoint");
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
				if(getNextPage() == null) {
					templatesPage = new GFNewQueryGrammarChooseTemplatePage(null);
					setNextPage(templatesPage);
				}
				templatesPage.refreshTemplates();
				displayFieldValidOrNot(templateValidationLabel, GFNewQueryGrammarMsg.TEMPLATE_OK, true);
				templateOK = true;
				setPageComplete(templateOK && sparqlEndpointOK);
				return true;
			} else {
				displayFieldValidOrNot(templateValidationLabel, GFNewQueryGrammarMsg.TEMPLATE_EMPTY, false);
				templateOK = false;
				return false;
			}
		} else {
			templateOK = false;
			return false;
		}
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
	 * Validates if the SPARQL endpoint is accessible and can be queried
	 * 
	 * @return true if valid, false if not
	 */
	private boolean validateURLField() {
		String url = urlPath.getText();

		String password = passwordBox.getText();
		String username = usernameBox.getText();
		if (url.length() < 5 || password.length() == 0 || username.length() == 0) {
			displayFieldValidOrNot(urlValidationLabel, GFNewQueryGrammarMsg.FIELD_INCOMPLETE, false);
			sparqlEndpointOK = false;
		}
		RepositoryUtils repository;
		try {
			repository = new RepositoryUtils(url, username, password);
			repository.testConnection();
			
			((GFNewQueryGrammarWizard) getWizard()).setRepository(repository);
			getClipboard().setClassNames(repository.getAllClassesAndNames());
			
			displayFieldValidOrNot(urlValidationLabel, GFNewQueryGrammarMsg.REPO_VALID, true);
			sparqlEndpointOK = true;
			setPageComplete(templateOK && sparqlEndpointOK);
			return true;
		} catch (RepositoryUtilsConnectionException ex) {
			displayFieldValidOrNot(urlValidationLabel, ex.getMessage(), false);
			sparqlEndpointOK = false;
			return false;
		} 
	}
	
	/*
	 * Display that SPARQL endpoint or template was not valid
	 */
	private void displayFieldValidOrNot(Label label, String message, boolean valid) {
		label.setText(message);
		label.setVisible(true);
	}
	
	/**
	 * Method called when the page is passed.
	 */
	public void pageChanged(PageChangedEvent arg0) {
		//templatesPage.refreshTemplates();	
	}
}
