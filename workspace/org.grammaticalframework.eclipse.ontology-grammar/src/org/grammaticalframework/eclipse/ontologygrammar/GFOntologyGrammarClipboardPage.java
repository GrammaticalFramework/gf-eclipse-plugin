package org.grammaticalframework.eclipse.ontologygrammar;

import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * An abstract class to unite the functionality of the pages that use a clipboard
 * 
 * @see GFOntologyGrammarClipBoard
 * @author Maria Mateva, Ontotext AD
 * 
 */
public abstract class GFOntologyGrammarClipboardPage extends WizardPage implements Listener {
	
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
	

	public GFOntologyGrammarClipboardPage(String name, String description) {
		super(name, description, null);   
	}

	protected GFOntologyGrammarClipBoard getClipboard() {
		return ((GFOntologyGrammarWizard) this.getWizard()).getClipboard();
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
	 * @see GFOntologyGrammarWizard 
	 * @param page
	 */
	protected void addNextPage(IWizardPage page) {
		GFOntologyGrammarWizard thisWizard = ((GFOntologyGrammarWizard) this.getWizard());
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
	 * General purpose listener which just calls {@link #dialogChanged()}
	 */
	protected ModifyListener defaultModifyListener = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			dialogChanged();
		}
	};
	
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
		label.setText("Currently Selected Patterns:");
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
	protected Text populateWithSelectedTemplates(Composite parent, Text text, int horizontalCellsSpan) {
		java.util.List<String> currentlyChosen = getClipboard().getSelectedQueries();	
		return addLabelsOfAList(parent, text, horizontalCellsSpan, currentlyChosen);
	}	
	
	/**
	 * Adds a list of strings as separate immutable labels to a parent Composite unit
	 * 
	 * @param container - the parent, a Composite
	 * @param horizontalCellsSpan - the number of horizontal cells that this each label covers
	 * @param things - the list of things that have different labels
	 */
	protected Text addLabelsOfAList(Composite container, Text textBox, int horizontalCellsSpan, java.util.List<String> things) {
		Iterator<String> iter = things.iterator();
		textBox.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, horizontalCellsSpan, 1));
		StringBuilder text = new StringBuilder("");
		while(iter.hasNext()) {
			text.append(iter.next());
			text.append("\n");
		}
		textBox.setText(text.toString());
		return textBox;
	}
	
	protected void refrestText(Composite parent, Text textBox, int horizontal) {
		textBox.dispose();
		textBox = new Text(parent, SWT.NULL);
		populateWithSelectedTemplates(parent, textBox, horizontal);
		parent.layout();
		
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
		((GFOntologyGrammarWizard)this.getWizard()).setFinished();
	}
	
	/**
	 * Initialize, by setting control and setting page to incomplete.
	 * Overriders of this method should call <code>super.initialize(container)</code> at the <em>end</em> of the method.
	 *
	 * @param container the container
	 */
	protected void initialize(Control container) {
		setPageComplete(false);
		setControl(container);
	}
	
	// TODO set the image
	//protected static ImageDescriptor image;
	protected static void setImage(Display display){
		ImageRegistry registry = new ImageRegistry(display);
		registry.put("folder", ImageDescriptor.createFromFile(GFOntologyGrammarClipboardPage.class, "icons/sample.gif"));
	}
 
}
