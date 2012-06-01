package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This is the third page of the GFQueryGrammarWizard, 
 * used for selection of a class or instance to fill in the template.
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarSelectFromRepositoryPage extends GFQueryGrammarClipboardPage {
	public static String getPageName() {
		return "Select a binding for a template";
	}
	
	public static String getPageDescription() {
		return "Select  a binding for a template.\n " +
				"That can be a class or an instance of a class.";
	}
	
	protected GFNewQueryGrammarSelectFromRepositoryPage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
		Label classesLabel = new Label(container, SWT.NULL);
		classesLabel.setText("&Classes");
				
		Label instancesLabel = new Label(container, SWT.NULL);
		instancesLabel.setText("&Instances of classes");
		
		initialize(container);
		System.out.println("REPO PAGE!");

	}
	
	
	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}

}
