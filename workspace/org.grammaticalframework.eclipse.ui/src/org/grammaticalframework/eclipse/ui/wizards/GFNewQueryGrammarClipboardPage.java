package org.grammaticalframework.eclipse.ui.wizards;

import java.util.Iterator;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.viewers.ISelection;
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
	protected Label currentTemplates;
	
	protected GFNewQueryGrammarClipboardPage(String name, String description, ISelection selection) {
		super(name, description, selection);   
	}

	protected GFNewQueryGrammarClipBoard getClipboard() {
		return ((GFNewQueryGrammarWizard) this.getWizard()).getClipboard();
	}
	
	protected void setNextPage(AbstractNewFileWizardPage page) {
		((GFNewQueryGrammarWizard) this.getWizard()).addPage(page);
	}

	
	public void handleEvent(Event event) { }

	
	public void createControl(Composite parent) { }

	@Override
	protected void dialogChanged() { }
	
	
	protected Label createCurrentTemplatesLabel(Composite container, int horizontalCellsSpan) {
		Label label = new Label(container, SWT.NULL);
		label.setText("Currently Selected Patterns");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, horizontalCellsSpan, 1));
		return label;
	}
	
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
	
	protected void enableFinishButton() {
		((GFNewQueryGrammarWizard)this.getWizard()).setFinished();
	}
 
}
