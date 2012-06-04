package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;

import org.eclipse.emf.ecore.impl.ESuperAdapter.Holder;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This is the third page of the GFQueryGrammarWizard, 
 * used for selection of a class or instance to fill in the template.
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarSelectFromRepositoryPage extends GFNewQueryGrammarClipboardPage {
	public static final int SCREEN_WIDTH = 1024;
	public static final int SCREEN_HEIGTH = 600;
	
	private List classesList;
	private List instancesList;
	private Text editCurrentTemplateBox;
	private Button [] continueRadios;
	
	private int indexOfTheNextPage;
	private boolean currentTemplateWasAdded;
	private boolean nextPageAdded;
	
	public static String getPageName() {
		return "Select a binding for a template";
	}
	
	public static String getPageDescription() {
		return "Select  a binding for a template.\n " +
				"That can be a class or an instance of a class.";
	}
	
	protected GFNewQueryGrammarSelectFromRepositoryPage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
		currentTemplateWasAdded = false;
		nextPageAdded = false;
	}
	
	@Override
	public void createControl(Composite parent) {
		// get the index of the next page
		indexOfTheNextPage = this.getWizard().getPageCount();
		((GFNewQueryGrammarWizard) this.getWizard()).addPage(new GFNewQueryGrammarSaveToFilePage(null));
		
		// Force the shell size
		Point size = getShell().computeSize(SCREEN_WIDTH, SCREEN_HEIGTH);
		getShell().setSize(size);
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 6;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 10;
		
		Label classesLabel = new Label(container, SWT.NULL);
		classesLabel.setText("&Classes");
		classesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
				
		Label instancesLabel = new Label(container, SWT.NULL);
		instancesLabel.setText("&Instances of classes");
		instancesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
		
		// adding classes
		classesList = new List(container, SWT.BORDER | SWT.READ_ONLY );
		classesList.addListener(SWT.Selection, this);
		classesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 10));
		populateExistingClasses();
		
		// adding instances
		instancesList = new List(container, SWT.BORDER | SWT.READ_ONLY );
		instancesList.addListener(SWT.Selection, this);
		instancesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 10));		
		populateCorrespondingInstances();
		
		// edit box for the current template
		Label editCurrentLabel = new Label(container, SWT.NULL);
		editCurrentLabel.setText("&Edit currently selected");
		editCurrentLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 6, 1));
		editCurrentTemplateBox = new Text(container, SWT.BORDER | SWT.SINGLE);
		editCurrentTemplateBox.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 5, 2));
		Button addButton = new Button(container, SWT.PUSH);
		addButton.setText("Add this template!");
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 2));
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				addCurrentlySelectedTemplate();
				currentTemplateWasAdded = true;
				System.out.println("Add!");
			}
		});
		
		// current templates
		createCurrentTemplatesLabel(container, 6);
		populateWithSelectedTemplates(container, 6);	
		
		// how to continue combo
		Label continueLabel = new Label(container, SWT.NULL);
		continueLabel.setText("&How would you like to proceed?");
		continueLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 6, 1));
		continueRadios = new Button[2];
		continueRadios[0] = new Button(container, SWT.RADIO);
		continueRadios[0].setText("Select more templates");
		continueRadios[0].setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));	
		continueRadios[0].addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				addTheNextPage(true);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		continueRadios[1] = new Button(container, SWT.RADIO);
		continueRadios[1].setText("Continue");
		continueRadios[1].setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 3, 1));	
		continueRadios[1].addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				 addTheNextPage(false);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		
		initialize(container);
	}
	
	private void populateExistingClasses() {
		
		java.util.List<String> classes = new ArrayList<String>();
		// TODO add 
		classes.add("Class 1");
		classes.add("Class 2");
		classes.add("Class 3");
		addSelectablesToListWidget(classes, classesList);
	}
	
	private void populateCorrespondingInstances() {
		java.util.List<String> instances = new ArrayList<String>();
		instances.add("instance 1");
		instances.add("instance 2");
		instances.add("instance 3");
		addSelectablesToListWidget(instances, instancesList);
	}
	
	private void addCurrentlySelectedTemplate() {
		System.out.println("Add currently Selected template");
	}
	
	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
		if (currentTemplateWasAdded && nextPageAdded) {
			setPageComplete(true);
		}
		
	}
	
	// dirrty
	/**
	 * Adds the correct next page to the Wizard
	 * 
	 * @param hasNextTemplate if "true", adds a GFNewQueryGrammarChooseTemplatePage, else adds a 
	 */
	private void addTheNextPage(boolean hasNextTemplate) {
		if (hasNextTemplate) {
			this.getWizard().getPages()[indexOfTheNextPage] = new GFNewQueryGrammarChooseTemplatePage(null);
		} else {
			this.getWizard().getPages()[indexOfTheNextPage] = new GFNewQueryGrammarChooseTemplatePage(null);
		}
		nextPageAdded = true;
	}
}
