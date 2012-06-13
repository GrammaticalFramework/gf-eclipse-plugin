package org.grammaticalframework.eclipse.ontologygrammar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This is the last page of the GFQueryGrammarWizard, 
 * used for saving the new query grammar into a file
 * 
 * @see GFQueryGrammarFromSemanticRepositoryWizard
 * @author Maria Mateva, Ontotext AD
 * 
 */
public class GFOntologyGrammarSaveToFilePage extends GFOntologyGrammarClipboardPage {
	private static final int SCREEN_WIDTH = 1024;
	private static final int SCREEN_HEIGTH = 600;
	
	
	private Text saveToField;
	
	public static String getPageName() {
		return "Save the new query grammar";
	}
	
	public static String getPageDescription() {
		return "Save the new query grammar to a file ";
	}
	
	protected GFOntologyGrammarSaveToFilePage() {
		super(getPageName(), getPageDescription());
	}
	
	@Override
	public void createControl(Composite parent) {
		Point size = getShell().computeSize(SCREEN_WIDTH, SCREEN_HEIGTH);
		getShell().setSize(size);
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 4;
		layout.verticalSpacing = 5;
		
		createCurrentTemplatesLabel(container, 4);
		createSelectedTemplatesList(container, 4);
		
		Label saveToLabel = new Label(container, SWT.NULL);
		saveToLabel.setText("Save to");	
		saveToLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		saveToField = new Text(container, SWT.BORDER | SWT.SINGLE);
		saveToField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		saveToField.addModifyListener (defaultModifyListener);
		Button browseButton = new Button(container, SWT.PUSH);
		browseButton.setText("Browse...");
		browseButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		browseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		initialize(container);		
	}
		

	@Override
	protected void dialogChanged() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * File browser activated
	 */
	private void handleBrowse() {
		Shell shell = getShell();
		FileDialog dialog = new FileDialog(shell,  SWT.SAVE);
		dialog.setFilterNames(new String[] {"Templates", "All Files (*.*)"});
		dialog.setFilterExtensions(new String[] {"*.txt", "*.*"});                        
		dialog.setFilterPath("");
		dialog.setText("Save Grammar to");
		dialog.setFileName("grammar.gf");
		String file = dialog.open();
		if (file != null) {
			saveToField.setText(file);
			System.out.println(file);	
		}
	}

}
