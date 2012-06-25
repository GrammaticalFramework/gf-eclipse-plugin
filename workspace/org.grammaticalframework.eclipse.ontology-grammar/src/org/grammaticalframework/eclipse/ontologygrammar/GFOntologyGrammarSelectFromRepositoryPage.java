package org.grammaticalframework.eclipse.ontologygrammar;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

import static com.ontotext.molto.repositoryHelper.GFQueryGrammarConstants.*;

import com.ontotext.molto.repositoryHelper.GFFilledTemplate;
import com.ontotext.molto.repositoryHelper.GFTemplate;
import com.ontotext.molto.repositoryHelper.RepositoryUtilsConnectionException;

/**
 * This is the third page of the GFOntologyGrammarWizard, 
 * used for selection of a class or instance to fill in the template.
 * 
 * @see GFOntologyGrammarWizard
 * @author Maria Mateva, Ontotext AD
 * 
 */
public class GFOntologyGrammarSelectFromRepositoryPage extends GFOntologyGrammarClipboardPage {
	private static final int SCREEN_WIDTH = 1024;
	private static final int SCREEN_HEIGTH = 600;
	
	/**
	 * The current GFTemplate that is being populated 
	 */
	private GFTemplate template;
	
	/**
	 * binding_type <-> labels(e.g.class name)  mapping
	 * It will hold the last selected
	 */
	private Map<String, String> currentTemplateLabels;
	
	/**
	 * binding_type <-> URIs(e.g. instance URI) mapping
	 * It will hold the last selected
	 */
	private Map<String, String> currentTemplateURIs;
	
	/**
	 *  UI controls 
	 */
	private Composite container;
	private List classesList;
	private List instancesList;
	private List predicateList;
	private Text currentTemplateBox;
	private Label instancesLabel;
	private Button [] continueRadios;
	private Composite selectedTemplatesComposite;
	
	/**
	 * At least one template was added 
	 */
	private boolean currentTemplateWasAdded;
	
	/**
	 * A next page was enabled
	 * (Either filling more templates
	 * or exporting the grammar was selected).
	 */
	private boolean nextPageEnabled;
	
	public static String getPageName() {
		return "Select bindings for the template";
	}
	
	public static String getPageDescription() {
		return "Select bindings for the template. " +
				"It can be a class or an instance of a class.";
	}
	
	protected GFOntologyGrammarSelectFromRepositoryPage(GFTemplate template) {
		super(getPageName(), getPageDescription());
		this.currentTemplateWasAdded = false;
		this.nextPageEnabled = false;
		this.template = template;
		this.currentTemplateLabels = new HashMap<String, String>();
		this.currentTemplateURIs = new HashMap<String, String>();
	}
	
	public GFTemplate getTemplate() {
		return template;
	}

	public void setTemplate(GFTemplate template) {
		this.template = template;
		resetEditBox();
	}

	@Override
	public void createControl(Composite parent) {
		// Force the shell size
		Point size = getShell().computeSize(SCREEN_WIDTH, SCREEN_HEIGTH);
		getShell().setSize(size);
		
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 6;
		// layout.makeColumnsEqualWidth = true; WTF behaviour under Linux
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		
		Label classesLabel = new Label(container, SWT.NULL);
		classesLabel.setText("Classes");
		classesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
				
		instancesLabel = new Label(container, SWT.NULL);
		instancesLabel.setText("Instances of classes");
		instancesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
		
		// predicate label
//		Label predicatesLabel = new Label(container, SWT.NULL);
//		predicatesLabel.setText("Predicates");
//		predicatesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		
		// adding classes
		classesList = new List(container, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
		classesList.addListener(SWT.Selection, this);
		GridData gd1 = new GridData(SWT.LEFT, SWT.FILL, false, true, 3, 10);
		gd1.minimumWidth = 500;
		gd1.widthHint = 500;
		classesList.setLayoutData(gd1);
		classesList.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				classNameSelected(CLASS_NAME_BR);
			}
		});
		populateExistingClasses();
		
		// adding instances
		instancesList = new List(container, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
		instancesList.addListener(SWT.Selection, this);
		GridData gd2 = new GridData(SWT.LEFT, SWT.FILL, false, true, 3, 10);
		gd2.minimumWidth = 500;
		gd2.widthHint = 500;
		instancesList.setLayoutData(gd2);		
		instancesList.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				instenceSelected(CLASS_INSTANCE_BR);
			}
		});
		
		// edit box for the current template
		Label editCurrentLabel = new Label(container, SWT.NULL);
		editCurrentLabel.setText("Currently selected:");
		editCurrentLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 6, 1));
		currentTemplateBox = new Text(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		currentTemplateBox.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 4, 2));
		currentTemplateBox.setText(template.getTextPattern());
		
		Button addButton = new Button(container, SWT.PUSH);
		addButton.setText("Add this template");
		addButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2));
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				addCurrentlySelectedTemplate();
				currentTemplateWasAdded = true;
			}
		});
		
		Button resetTemplButton = new Button(container, SWT.PUSH);
		resetTemplButton.setText("Reset template");
		resetTemplButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2));
		resetTemplButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				 resetEditBox();
			}
		});
		
		// current templates
		createCurrentTemplatesLabel(container, 6);
		selectedTemplatesComposite = new Composite(container, SWT.NULL);
		selectedTemplatesComposite.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, true, false, 6, 1));
		GridLayout newLayout = new GridLayout();
		newLayout.numColumns = 1;
		selectedTemplatesComposite.setLayout(newLayout);
		createSelectedTemplatesList(selectedTemplatesComposite, 1);	
		
		// "how to continue" radio buttons
		Label continueLabel = new Label(container, SWT.NULL);
		continueLabel.setText("How would you like to proceed?");
		continueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, true, false, 6, 1));
		
		continueRadios = new Button[2];
		continueRadios[0] = new Button(container, SWT.RADIO);
		continueRadios[0].setText("Select more templates");
		continueRadios[0].setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 3, 1));	
		continueRadios[0].addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent arg0) {
				addTheNextPage(true);
			}
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		continueRadios[0].setEnabled(false);
		continueRadios[1] = new Button(container, SWT.RADIO);
		continueRadios[1].setText("Export grammar");
		continueRadios[1].setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 3, 1));	
		continueRadios[1].addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent arg0) {
				 addTheNextPage(false);
			}
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		continueRadios[1].setEnabled(false);
		
		initialize(container);
	}
	
	@Override
	protected void dialogChanged() {
		if (currentTemplateWasAdded && nextPageEnabled) {
			setPageComplete(true);
		}		
	}
	
	/**
	 * A class name was selected
	 */
	private void classNameSelected(String classNameRepr) {
		// prepare to add new filled template
		String classNameWhole = classesList.getSelection()[0];
		String [] classNameParts = classNameWhole.split("\\|\\|");
		String classNameUri = classNameParts[0].trim();
		if (template.getTextPattern().contains(classNameRepr)) {
			String classNameLabel = classNameParts[1].trim();
			currentTemplateLabels.put(classNameRepr, classNameLabel);
			currentTemplateURIs.put(classNameRepr, classNameUri);
			// reset the template box
			currentTemplateBox.setText(
				substituteBindingWith(classNameRepr, classNameLabel));
		}
		
		populateCorrespondingInstances(classNameUri);
		// populateCorrespondingPredicates(classNameUri);
	}
	
	/**
	 * A class instance was selected
	 */
	private void instenceSelected(String classInstanceRepr) {
		// prepare to add new filled template
		if (template.getTextPattern().contains(classInstanceRepr)) {
			String instanceNameWhole = instancesList.getSelection()[0];
			String [] instanceNameParts = instanceNameWhole.split("\\|\\|");
			String instanceNameUri = instanceNameParts[0].trim();
			String instanceNameLabel = instanceNameParts[1].trim();
			currentTemplateLabels.put(classInstanceRepr, instanceNameLabel);
			currentTemplateURIs.put(classInstanceRepr, instanceNameUri);
			// reset the template box
			currentTemplateBox.setText(
				substituteBindingWith(classInstanceRepr, instanceNameLabel));
		}
	}
	
	/**
	 * Populate all class names(always)
	 */
	private void populateExistingClasses() {
		java.util.List<String> classes = getClipboard().getClassNames();
		addSelectablesToListWidget(classes, classesList);
	}
	
	/**
	 * Populate the instances corresponding to a selected class name
	 * @param className
	 */
	private void populateCorrespondingInstances(String className) {
		displayFieldValidOrNot(instancesLabel, "Instances of classes: LOADING...", true);
		try {
			instancesList.removeAll();
			instancesList.add("LOADING...");
			java.util.List<String> instances 
				= ((GFOntologyGrammarWizard) getWizard()).getRepository().getAllInstances(className);
			addSelectablesToListWidget(instances, instancesList);
		} catch (RepositoryUtilsConnectionException ex) {
			ex.printStackTrace();
		}
		displayFieldValidOrNot(instancesLabel, "Instances of classes", true);
	}
	
	/**
	 * Future method
	 * @param className
	 */
	@SuppressWarnings("unused")
	private void populateCorrespondingPredicates(String className) {
		try {
			java.util.List<String> preicates 
				= ((GFOntologyGrammarWizard) getWizard()).getRepository().getAllPredicates(className);
			addSelectablesToListWidget(preicates, predicateList);
		} catch (RepositoryUtilsConnectionException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Substitute the binding name with the selected value
	 * in the chosen template
	 * @param binding - the binding string
	 * @param substitute - text with which to substitute the binding name 
	 * @return
	 */
	private String substituteBindingWith(String binding, String substitute) {
		String templateString = new String(template.getTextPattern());
		Pattern pattern = Pattern.compile(binding, Pattern.LITERAL); 
		Matcher matcher = pattern.matcher(templateString);
		return matcher.replaceAll("\"" + substitute + "\"");
	}
	
	/**
	 * Adding a currently selected template to the clipboard of the wizard
	 */
	private void addCurrentlySelectedTemplate() {
		String query = currentTemplateBox.getText();
		if (!query.contains(CLASS_NAME) &&
			!query.contains(CLASS_INSTANCE)) {
			
			// add the query to the clipboard
			getClipboard().addFilledTemplateDisplay(query);
			GFFilledTemplate filled = new GFFilledTemplate(template, currentTemplateLabels, currentTemplateURIs);
			getClipboard().addFilledTemplate(filled);
			
			// refresh the list of queries
			continueRadios[0].setEnabled(true);
			continueRadios[1].setEnabled(true);
			selectedTemplatesComposite.getChildren()[0].dispose();
			createSelectedTemplatesList(selectedTemplatesComposite, 6);
			selectedTemplatesComposite.layout();
			container.layout();
			
			// reset 
			currentTemplateLabels = new HashMap<String, String>();
			currentTemplateURIs =  new HashMap<String, String>();			
			resetEditBox();
		}
	}
	
	/**
	 * Clean up the current 
	 */
	private void resetEditBox() {
		if (currentTemplateBox != null) {
			currentTemplateBox.setText(template.getTextPattern());
		}
	}
	
	/**
	 * Adds the correct next page to the Wizard
	 * 
	 * @param hasNextTemplate if "true", adds a GFNewQueryGrammarChooseTemplatePage, else adds a 
	 */
	private void addTheNextPage(boolean hasNextTemplate) {
		GFOntologyGrammarChooseTemplatePage templatePage = new GFOntologyGrammarChooseTemplatePage();
		GFOntologyGrammarSaveToFilePage saveToPage = new GFOntologyGrammarSaveToFilePage();
		if (hasNextTemplate) {
			addNextPage(templatePage);
		} else {
			addNextPage(saveToPage);
		}
		nextPageEnabled = true;
		setPageComplete(currentTemplateWasAdded);
	}
	

}
