package org.grammaticalframework.eclipse.ui.wizards;

import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

/**
 * An abstract class to unite the functionality of the pages that use a clipboard
 * 
 * @see GFQueryGrammarClipBoard
 * @author Maria Mateva
 *
 */
public abstract class GFQueryGrammarClipboardPage extends AbstractNewFileWizardPage implements Listener {
	
	/**
	 * A list widget of templates
	 */
	protected List listOfSelectedTemplates;
	protected Label currentTemplates;
	
	protected GFQueryGrammarClipboardPage(String name, String description, ISelection selection) {
		super(name, description, selection);   
	}

	protected GFQueryGrammarClipBoard getClipboard() {
		return ((GFNewQueryGrammarWizard) this.getWizard()).getClipboard();
	}
	
	protected void setNextPage(AbstractNewFileWizardPage page) {
		((GFNewQueryGrammarWizard) this.getWizard()).addPage(page);
	}

	@Override
	public void handleEvent(Event arg0) {
	}

	@Override
	public void createControl(Composite arg0) {
	}

	@Override
	protected void dialogChanged() {	
	}
	
	protected Label createCurrentTemplatesLabel(Composite container, int horizontalCellsSpan) {
		Label label = new Label(container, SWT.NULL);
		label.setText("&Currently Selected Templates");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, horizontalCellsSpan, 1));
		return label;
	}
	
	protected void populateWithSelectedTemplates(Composite parent) {
		java.util.List<String> currentlyChosen = getClipboard().getSelectedTemplates();
		
		// TODO remove the below hardcodes
		currentlyChosen.add("FUN");
		currentlyChosen.add("PUN");
		currentlyChosen.add("NUN");
		
		Iterator<String> iter = currentlyChosen.iterator();
		int templCounter = 0;
		while(iter.hasNext()) {
			Label templateLabel = new Label(parent, SWT.NULL);
			templateLabel.setText(iter.next());
			templCounter += 1;
			if (templCounter > 10) {
				break;
			}
		}
	}	

}