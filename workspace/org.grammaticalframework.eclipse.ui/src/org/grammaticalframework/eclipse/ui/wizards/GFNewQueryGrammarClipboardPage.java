package org.grammaticalframework.eclipse.ui.wizards;

import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

/**
 * An abstract class to unite the functionality of the pages that use a clipboard
 * 
 * @see GFNewQueryGrammarClipBoard
 * @author Maria Mateva, Ontotext AD
 * 
 */
public abstract class GFNewQueryGrammarClipboardPage extends AbstractNewFileWizardPage implements Listener {
	
	/**
	 * A list widget of templates
	 */
	protected List listOfSelectedTemplates;
	
	/** 
	 * Current template labels
	 */
	protected Label currentTemplates;
	
	/**
	 * The index of the next page in the wizard.
	 */
	protected int indexOfNextPage;

	
	public GFNewQueryGrammarClipboardPage(String name, String description, ISelection selection) {
		super(name, description, selection);   
	}

	protected GFNewQueryGrammarClipBoard getClipboard() {
		return ((GFNewQueryGrammarWizard) this.getWizard()).getClipboard();
	}
	
	public int getIndexOfNextPage() {
		return indexOfNextPage;
	}

	public void setIndexOfNextPage(int indexOfNextPage) {
		this.indexOfNextPage = indexOfNextPage;
	}
	
	/**
	 * Add a next page to the wizard. 
	 * The wizard is designed to take the last added page as next.
	 * 
	 * @see GFNewQueryGrammarWizard 
	 * @param page
	 */
	protected void addNextPage(IWizardPage page) {
		GFNewQueryGrammarWizard thisWizard = ((GFNewQueryGrammarWizard) this.getWizard());
		thisWizard.addPage(page);
		// the last added page is added as next
		setIndexOfNextPage(thisWizard.getPageCount() - 1);
	}

	/**
	 * {inherit:doc}
	 */
	public void handleEvent(Event event) { }

	/**
	 * {inherit:doc}
	 */
	public void createControl(Composite parent) { }
	
	/**
	 * {inherit:doc}
	 */
	@Override
	protected void dialogChanged() { }
	
	/**
	 * Creates a list of all added current templates.
	 * 
	 * @param container - the Composite to which the Label is added
	 * @param horizontalCellsSpan - the horizontal span size of the label(number of cells)
	 * @return - the label
	 */
	protected Label createCurrentTemplatesLabel(Composite container, int horizontalCellsSpan) {
		Label label = new Label(container, SWT.NULL);
		label.setText("Currently Selected Patterns");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, horizontalCellsSpan, 1));
		return label;
	}
	
	/**
	 * Adds all selected templates to a Label
	 * TODO switch to another control
	 * @param parent
	 * @param label
	 * @param horizontalCellsSpan
	 * @return
	 */
	protected Label populateWithSelectedTemplates(Composite parent, Label label, int horizontalCellsSpan) {
		java.util.List<String> currentlyChosen = getClipboard().getSelectedQueries();	
		return addLabelsOfAList(parent, label, horizontalCellsSpan, currentlyChosen);
	}	
	
	/**
	 * Adds a list of strings as separate immutable labels to a parent Composite unit
	 * 
	 * @param container - the parent, a Composite
	 * @param horizontalCellsSpan - the number of horizontal cells that this each label covers
	 * @param things - the list of things that have different labels
	 */
	protected Label addLabelsOfAList(Composite container, Label templateLabel, int horizontalCellsSpan, java.util.List<String> things) {
		Iterator<String> iter = things.iterator();
		templateLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, horizontalCellsSpan, 1));
		StringBuilder text = new StringBuilder("");
		while(iter.hasNext()) {
			text.append(iter.next());
			text.append("\n");
		}
		templateLabel.setText(text.toString());
		return templateLabel;
	}
	
	/**
	 * Adds a list of strings to a List widget.
	 * Each string is a separate entity and can be selected.
	 * 
	 * @param selectables - the strings
	 * @param listWidget - the List widget
	 */
	protected static void addSelectablesToListWidget(java.util.List<String> selectables, List listWidget) {
		if (selectables != null) {
			Iterator<String> iter = selectables.iterator();
			while (iter.hasNext()) {
				listWidget.add(iter.next());
			}
		}
	}
	
	/**
	 * Enable the Finish button of the Wizard
	 */
	protected void enableFinishButton() {
		((GFNewQueryGrammarWizard)this.getWizard()).setFinished();
	}
 
}
