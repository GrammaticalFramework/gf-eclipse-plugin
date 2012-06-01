package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

/**
 * An abstract class to unite the functionality of the pages that use a clipboard
 * 
 * @see GFQueryGrammarClipBoard
 * @author Maria Mateva
 *
 */
public abstract class GFQueryGrammarClipboardPage extends AbstractNewFileWizardPage implements Listener {

	
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
	
}
