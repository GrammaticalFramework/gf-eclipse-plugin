package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the last page of the GFQueryGrammarWizard, 
 * used for saving the new query grammar into a file
 * 
 * @see GFQueryGrammarFromSemanticRepositoryWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarSaveToFilePage extends GFQueryGrammarClipboardPage {
	
	public static String getPageName() {
		return "Save the new query grammar";
	}
	
	public static String getPageDescription() {
		return "Save the new query grammar to a file ";
	}
	
	protected GFNewQueryGrammarSaveToFilePage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
	
		Label saveToLabel = new Label(container, SWT.NULL);
		saveToLabel.setText("&Save to");
				
		
		initialize(container);
		System.out.println("SAVE to PAGE!");
		
	}

	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}
	


}
