package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the second page of the GFQueryGrammarFromSemanticRepositoryWizard, 
 * for selection of a template for the grammar
 * 
 * @see GFQueryGrammarFromSemanticRepositoryWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarChooseTemplatePage extends AbstractNewFileWizardPage {
	
	public static String getPageName() {
		return "Select a template";
	}
	
	public static String getPageDescription() {
		return "Select a template... ";
	}
	
	protected GFNewQueryGrammarChooseTemplatePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
		
		Label templateLabel = new Label(container, SWT.NULL);
		templateLabel.setText("&Template");
				
		initialize(container);
		System.out.println("TEMPLATE PAGE!");

	}

	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}

}
