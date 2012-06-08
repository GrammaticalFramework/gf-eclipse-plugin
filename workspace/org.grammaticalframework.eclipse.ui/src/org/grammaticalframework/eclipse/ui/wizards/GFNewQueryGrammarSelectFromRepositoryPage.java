package org.grammaticalframework.eclipse.ui.wizards;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.viewers.ISelection;
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

import com.ontotext.molto.repositoryHelper.GFQueryGrammarConstants;
import com.ontotext.molto.repositoryHelper.GFTemplate;
import com.ontotext.molto.repositoryHelper.RepositoryUtilsConnectionException;

/**
 * This is the third page of the GFQueryGrammarWizard, 
 * used for selection of a class or instance to fill in the template.
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva, Ontotext AD
 * 
 */
public class GFNewQueryGrammarSelectFromRepositoryPage extends GFNewQueryGrammarClipboardPage {
	public static final int SCREEN_WIDTH = 1024;
	public static final int SCREEN_HEIGTH = 600;
	
	private GFTemplate template;
	
	private Composite container;
	private List classesList;
	private List instancesList;
	private List predicateList;
	private Text editCurrentTemplateBox;
	private Button [] continueRadios;
	private Label chosenTemplates;

	private boolean currentTemplateWasAdded;
	private boolean nextPageAdded;
	
	public static String getPageName() {
		return "Select a binding for a template";
	}
	
	public static String getPageDescription() {
		return "Select  a binding for a template.\n " +
				"That can be a class or an instance of a class.";
	}
	
	protected GFNewQueryGrammarSelectFromRepositoryPage(ISelection selection, GFTemplate template) {
		super(getPageName(), getPageDescription(), selection);
		this.currentTemplateWasAdded = false;
		this.nextPageAdded = false;
		this.template = template;
	}
	
	public GFTemplate getTemplate() {
		return template;
	}

	public void setTemplate(GFTemplate template) {
		this.template = template;
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
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 10;
		
		Label classesLabel = new Label(container, SWT.NULL);
		classesLabel.setText("Classes");
		classesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
				
		Label instancesLabel = new Label(container, SWT.NULL);
		instancesLabel.setText("Instances of classes");
		instancesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
		
		// predicate label
//		Label predicatesLabel = new Label(container, SWT.NULL);
//		predicatesLabel.setText("Predicates");
//		predicatesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 2, 1));
		
		// adding classes
		classesList = new List(container, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL );
		classesList.addListener(SWT.Selection, this);
		classesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 3, 10));
		classesList.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String classNameWhole = classesList.getSelection()[0];
				String [] classNameParts = classNameWhole.split("\\|\\|");
				String classNameUri = classNameParts[0].trim();
				String classNameLabel = classNameParts[1].trim();
				editCurrentTemplateBox.setText(
						substituteBindingWith(GFQueryGrammarConstants.CLASS_NAME_BR, classNameUri));
				populateCorrespondingInstances(classNameUri);
				// populateCorrespondingPredicates(classNameUri);
			}
		});
		populateExistingClasses();
		
		// adding instances
		instancesList = new List(container, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL );
		instancesList.addListener(SWT.Selection, this);
		instancesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 3, 10));		
		instancesList.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				editCurrentTemplateBox.setText(
					substituteBindingWith(GFQueryGrammarConstants.CLASS_INSTANCE_BR, 
							instancesList.getSelection()[0]));
			}
		});
		
		// edit box for the current template
		Label editCurrentLabel = new Label(container, SWT.NULL);
		editCurrentLabel.setText("&Edit currently selected");
		editCurrentLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 6, 1));
		editCurrentTemplateBox = new Text(container, SWT.BORDER | SWT.SINGLE);
		editCurrentTemplateBox.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 4, 2));
		editCurrentTemplateBox.setText(template.getTextPattern());
		
		Button addButton = new Button(container, SWT.PUSH);
		addButton.setText("Add this template!");
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 2));
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				addCurrentlySelectedTemplate();
				currentTemplateWasAdded = true;
			}
		});
		
		Button resetTemplButton = new Button(container, SWT.PUSH);
		resetTemplButton.setText("Reset template");
		resetTemplButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 2));
		resetTemplButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				 resetEditBox();
			}
		});
		
		// current templates
		createCurrentTemplatesLabel(container, 6);
		chosenTemplates  = new Label(container, SWT.NULL);
		populateWithSelectedTemplates(container, chosenTemplates, 6);	
		
		// "how to continue" radio buttons
		Label continueLabel = new Label(container, SWT.NULL);
		continueLabel.setText("How would you like to proceed?");
		continueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 6, 1));
		
		continueRadios = new Button[2];
		continueRadios[0] = new Button(container, SWT.RADIO);
		continueRadios[0].setText("Select more templates");
		continueRadios[0].setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));	
		continueRadios[0].addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent arg0) {
				addTheNextPage(true);
			}
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		continueRadios[0].setEnabled(false);
		continueRadios[1] = new Button(container, SWT.RADIO);
		continueRadios[1].setText("Export Grammar");
		continueRadios[1].setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));	
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
		if (currentTemplateWasAdded && nextPageAdded) {
			setPageComplete(true);
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
		try {
			java.util.List<String> instances 
				= ((GFNewQueryGrammarWizard) getWizard()).getRepository().getAllInstances(className);
			addSelectablesToListWidget(instances, instancesList);
		} catch (RepositoryUtilsConnectionException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Future method
	 * @param className
	 */
	@SuppressWarnings("unused")
	private void populateCorrespondingPredicates(String className) {
		try {
			java.util.List<String> preicates 
				= ((GFNewQueryGrammarWizard) getWizard()).getRepository().getAllPredicates(className);
			addSelectablesToListWidget(preicates, predicateList);
		} catch (RepositoryUtilsConnectionException ex) {
			ex.printStackTrace();
		}
	}
	
	private void addCurrentlySelectedTemplate() {
		String query = editCurrentTemplateBox.getText();
		if (!query.contains(GFQueryGrammarConstants.CLASS_NAME) &&
			!query.contains(GFQueryGrammarConstants.CLASS_INSTANCE)) {
			continueRadios[0].setEnabled(true);
			continueRadios[1].setEnabled(true);
	
			getClipboard().addQuery(query);
			refreshTemplateBox();
			resetEditBox();
		}
	}
	
	
	/**
	 * Adds the correct next page to the Wizard
	 * 
	 * @param hasNextTemplate if "true", adds a GFNewQueryGrammarChooseTemplatePage, else adds a 
	 */
	private void addTheNextPage(boolean hasNextTemplate) {
		GFNewQueryGrammarChooseTemplatePage templatePage = new GFNewQueryGrammarChooseTemplatePage(null);
		GFNewQueryGrammarSaveToFilePage saveToPage = new GFNewQueryGrammarSaveToFilePage(null);
		if (hasNextTemplate) {
			setNextPage(templatePage);
		} else {
			setNextPage(saveToPage);
		}
		nextPageAdded = true;
		setPageComplete(currentTemplateWasAdded);
	}
	
	/**
	 * Clean up the current 
	 */
	private void resetEditBox() {
		editCurrentTemplateBox.setText(template.getTextPattern());
	}
	
	/**
	 * Refresh the selected templates label
	 */
	public void refreshTemplateBox() {
		populateWithSelectedTemplates(container, chosenTemplates, 6);	
		chosenTemplates.update();
		container.update();
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
		return matcher.replaceAll(substitute);
	}
}
