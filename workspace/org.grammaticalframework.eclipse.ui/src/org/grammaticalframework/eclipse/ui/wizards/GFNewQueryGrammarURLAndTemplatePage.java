package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the first page of the GFQueryGrammarFromSemanticRepositoryWizard, 
 * for selection of a SPARQL endpoint URL and a templates file for the grammar
 * 
 * @see GFQueryGrammarFromSemanticRepositoryWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarURLAndTemplatePage extends AbstractNewFileWizardPage {
	
	public static String getPageName() {
		return "Welcome!";
	}
	
	public static String getPageDescription() {
		return "Select a SPARQL endpoint URL and a grammar templates file. ";
	}
	
	protected GFNewQueryGrammarURLAndTemplatePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
		// Open URL 
		Label urlLabel = new Label(container, SWT.NULL);
		urlLabel.setText("&URL to:");
		
		Label templateLabel = new Label(container, SWT.NULL);
		templateLabel.setText("&Templates file:");
				
		initialize(container);
		System.out.println("INITIAL PAGE!");

	}

	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}

}
