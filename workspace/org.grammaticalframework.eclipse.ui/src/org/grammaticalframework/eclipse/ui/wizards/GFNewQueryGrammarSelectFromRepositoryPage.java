package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

/**
 * This is the third page of the GFQueryGrammarWizard, 
 * used for selection of a class or instance to fill in the template.
 * 
 * @see GFQueryGrammarWizard
 * @author Maria Mateva
 */
public class GFNewQueryGrammarSelectFromRepositoryPage extends GFQueryGrammarClipboardPage {
	private List classesList;
	private List instancesList;
	private Text editCurrentTemplateBox;
	
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
		layout.numColumns = 6;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 10;
		
		Label classesLabel = new Label(container, SWT.NULL);
		classesLabel.setText("&Classes");
		classesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
				
		Label instancesLabel = new Label(container, SWT.NULL);
		instancesLabel.setText("&Instances of classes");
		instancesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 3, 1));
		
		createCurrentTemplatesLabel(container, 6);
		populateWithSelectedTemplates(container);	
		
		initialize(container);
		System.out.println("REPO PAGE!");

	}
	
	
	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
		System.out.println("Dialog changed");
	}

}
