package org.grammaticalframework.eclipse.ontologygrammar;

import java.io.File;
import java.util.List;

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

import com.ontotext.molto.repositoryHelper.GFFilledTemplate;
import com.ontotext.molto.repositoryHelper.GFGenerator;
import com.ontotext.molto.repositoryHelper.RepositoryUtilsConnectionException;

/**
 * This is the last page of the GFOntologyGrammarWizard, 
 * used for saving the new query grammar into a file
 * 
 * @see GFOntologyGrammarWizard
 * @author Maria Mateva, Ontotext AD
 * 
 */
public class GFOntologyGrammarSaveToFilePage extends GFOntologyGrammarClipboardPage {
//	private static final int SCREEN_WIDTH = 1024;
//	private static final int SCREEN_HEIGTH = 600;
	
	/**
	 * Save file path text box
	 */
	private Text saveToField;
	/**
	 * "Save" button
	 */
	private Button saveButton;
	/**
	 * A notification label
	 */
	private Label grammarStored;
	
	/**
	 * A folder where the files will be stored.
	 */
	private File destinationFolder;
	

	private GFGenerator grammarGenerator;
	
	private String grammarName;
	
	public static String getPageName() {
		return "Save the new ontology grammar";
	}
	
	public static String getPageDescription() {
		return "Save the new ontology grammar to a file ";
	}
	
	protected GFOntologyGrammarSaveToFilePage() {
		super(getPageName(), getPageDescription());
		grammarName = "EngGrammar.gf";
	}
	
	/**
	 * {inherit:doc}
	 */
	@Override
	public void createControl(Composite parent) {
		// setting up the generator
		grammarGenerator = new GFGenerator(((GFOntologyGrammarWizard) getWizard()).getRepository());
		
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
		
		saveToField = new Text(container, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
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
		
		saveButton = new Button(container, SWT.PUSH);
		saveButton.setText("Export Grammar");
		saveButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 4, 1));
		saveButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				saveTheGrammar(destinationFolder, grammarName);
				((GFOntologyGrammarWizard)getWizard()).performFinish();
			}
		});
		saveButton.setEnabled(false);
		
		grammarStored = new Label(container, SWT.NULL);
		grammarStored.setText("The grammars was exported.");	
		grammarStored.setVisible(false);
		grammarStored.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 4, 1));
				
		initialize(container);		
	}


	@Override
	protected void dialogChanged() { }
	
	/**
	 * File browser activated
	 */
	private void handleBrowse() {
		Shell shell = getShell();
		FileDialog dialog = new FileDialog(shell,  SWT.SAVE);
		dialog.setFilterNames(new String[] {"GF Grammars", "All Files (*.*)"});
		dialog.setFilterExtensions(new String[] {"*.gf", "*.*"});                        
		dialog.setFilterPath("");
		dialog.setText("Choose destination");
		dialog.setFileName(grammarName);
		String file = dialog.open();
		if (file != null && file.length() > 0) {
			saveToField.setText(file);
			destinationFolder = new File(dialog.getFilterPath());
			// making sure the user didn't add an extra .gf
			grammarName = dialog.getFileName().replaceAll(".gf", "");
		
			saveButton.setEnabled(true);
		}
	}
	
	/**
	 * Save the file
	 */
	private void saveTheGrammar(File folder, String filename) {
		try {
			addAllFilledTemplatesToGrammar();
		} catch (RepositoryUtilsConnectionException e) {
			e.printStackTrace();
		}
		
		String concreteGrammarName = "Concrete" + filename;
		String abstractGrammarName = "Abstract" + filename;
		String sparqlGrammarName = filename + "SPARQL";
		grammarGenerator.writeAbstractGrammarToFile(folder, abstractGrammarName);
		grammarGenerator.writeConcreteGrammarToFile(folder, concreteGrammarName, abstractGrammarName);
		grammarGenerator.writeConcreteSparqlGrammarToFile(folder, sparqlGrammarName, abstractGrammarName);
		
		grammarStored.setVisible(true);
		//this.setPageComplete(true);
		((GFOntologyGrammarWizard)getWizard()).setFinished();
		((GFOntologyGrammarWizard)getWizard()).getContainer().updateButtons();
		//((GFOntologyGrammarWizard)getWizard()).setFinished();
		
	}
	
	/**
	 * Adds all filled templates to a grammar generator
	 */
	private void addAllFilledTemplatesToGrammar() throws RepositoryUtilsConnectionException {
		List<GFFilledTemplate> filledTemplates = getClipboard().getFilledTemplates();
		for (GFFilledTemplate template : filledTemplates) {
			grammarGenerator.addFilledTemplate(template);
		}
	}

}
