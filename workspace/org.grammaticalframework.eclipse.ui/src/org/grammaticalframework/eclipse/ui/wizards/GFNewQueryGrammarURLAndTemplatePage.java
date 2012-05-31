package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the first page, for selection of a SPARQL endpoint URL 
 * of the GF query grammar from semantic repository wizard
 * 
 * @author Maria Mateva
 */
public class GFNewQueryGrammarURLAndTemplatePage extends AbstractNewFileWizardPage {
	
	public static String getPageName() {
		return "Select a SPARQL endpoint URL";
	}
	
	public static String getPageDescription() {
		return "Select a SPARQL endpoint URL... ";
	}
	
	protected GFNewQueryGrammarURLAndTemplatePage() {
		super(getPageName());
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
		templateLabel.setText("&Template");
				
		initialize(container);
		System.out.println("Hi, baby, hi!");

	}

	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}

}
