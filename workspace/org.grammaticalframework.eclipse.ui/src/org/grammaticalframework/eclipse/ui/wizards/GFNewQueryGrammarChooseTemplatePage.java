package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

/**
 * This is the second page of the GFQueryGrammarWizard, 
 * for selection of a template for the grammar
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarChooseTemplatePage extends GFQueryGrammarClipboardPage {
	
	private List listOfTemplates;
	
	public static String getPageName() {
		return "Select a template";
	}
	
	public static String getPageDescription() {
		return "Select a template for the grammar ";
	}
	
	protected GFNewQueryGrammarChooseTemplatePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 5;
		
		Label templateLabel = new Label(container, SWT.NULL);
		templateLabel.setText("&Available templates:");
				
		listOfTemplates = new List(container, SWT.BORDER | SWT.READ_ONLY );
		listOfTemplates.addListener(SWT.Selection, this);
		addTemplatesToList();
		
		createCurrentTemplatesLabel(container, 1);
		populateWithSelectedTemplates(container);			
		
		initialize(container);
		System.out.println("TEMPLATE PAGE!");

	}

	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}

	@Override
	public void handleEvent(Event arg0) {
		// TODO Auto-generated method stub
		System.out.println(listOfTemplates.getSelection().toString());
		System.out.println(this.getSelection());
		GFNewQueryGrammarSelectFromRepositoryPage repositoryPage = new GFNewQueryGrammarSelectFromRepositoryPage(null);
		setNextPage(repositoryPage);
		
		setPageComplete(true);
	}
	


	protected void addTemplatesToList() {
		// TODO add the templates from the templates.xml file
		listOfTemplates.add("TEMLATE 1");
		listOfTemplates.add("TEMLATE 2");
		listOfTemplates.add("TEMLATE 3");
		listOfTemplates.add("TEMLATE 4");
		listOfTemplates.add("TEMLATE 5");
	}
	
	private void addCurrentlyChosen(Composite parent) {
		
	}

}
