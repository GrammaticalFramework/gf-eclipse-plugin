package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;

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
public class GFNewQueryGrammarChooseTemplatePage extends GFNewQueryGrammarClipboardPage {
	
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
		// TODO improve
		java.util.List<String> templ = new ArrayList<String>();
		templ.add("TEMPL");
		templ.add("TEMPL 1q31321");
		addSelectablesToListWidget(templ, listOfTemplates);
		
		createCurrentTemplatesLabel(container, 1);
		populateWithSelectedTemplates(container, 1);			
		
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
	
	private void addCurrentlyChosen(Composite parent) {
		
	}

}
