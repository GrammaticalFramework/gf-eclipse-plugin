package org.grammaticalframework.eclipse.ui.wizards;


import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

import com.ontotext.molto.repositoryHelper.GFTemplate;

/**
 * This is the second page of the GFQueryGrammarWizard, 
 * for selection of a template for the grammar
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva, Ontotext AD
 */
public class GFNewQueryGrammarChooseTemplatePage extends GFNewQueryGrammarClipboardPage {
	
	private List listOfTemplates;
	private Composite container;
	/**
	 * A template chosen on this iteration of the wizard
	 */
	private GFTemplate chosenTemplate;
	
	private GFNewQueryGrammarSelectFromRepositoryPage repositoryPage;
	
	public static String getPageName() {
		return "Select a pattern";
	}
	
	public static String getPageDescription() {
		return "Select a pattern for the grammar ";
	}
	
	protected GFNewQueryGrammarChooseTemplatePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 5;
		
		Label templateLabel = new Label(container, SWT.NULL);
		templateLabel.setText("Available pattern:");
		
		listOfTemplates = new List(container, SWT.BORDER | SWT.READ_ONLY | SWT.SINGLE);
		listOfTemplates.addListener(SWT.Selection, this);
		
		//listOfTemplates.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		addSelectablesToListWidget(getClipboard().getTemplatesAsStrings(), listOfTemplates);
		createCurrentTemplatesLabel(container, 1);
		Label label = new Label(container, SWT.NULL);
		populateWithSelectedTemplates(container, label, 1);		    
		
		initialize(container);
	}

	@Override
	protected void dialogChanged() {
		if (repositoryPage != null) {
			repositoryPage.setTemplate(chosenTemplate);	
		}
		
	}

	@Override
	public void handleEvent(Event arg0) {
		String [] selected = listOfTemplates.getSelection();
		System.out.println("Selected: " + selected[0]);
		if (getNextPage() == null) {
			chosenTemplate = getClipboard().getTemplateByTextPattern(selected[0]);
			repositoryPage = new GFNewQueryGrammarSelectFromRepositoryPage(null, chosenTemplate);
			repositoryPage.setPreviousPage(getWizard().getStartingPage());		
			setNextPage(repositoryPage);
			setPageComplete(true);
		}		
	}
	
	/**
	 * Adds the last templates.
	 */
	public void refreshTemplates() {
		if (listOfSelectedTemplates != null) {
			listOfTemplates.removeAll();
			addSelectablesToListWidget(getClipboard().getTemplatesAsStrings(), listOfTemplates);
		}
	}

	public void pageChanged(PageChangedEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
