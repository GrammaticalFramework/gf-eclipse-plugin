package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.ontotext.molto.repositoryHelper.RepositoryUtils;

/**
 * A Wizard to assist a user to create a sparql query grammar 
 * from natural language template patterns.
 * 
 * @author Maria Mateva, Ontotext AD
 */
public class GFNewQueryGrammarWizard extends AbstractNewFileWizard implements INewWizard {
	/**
	 * Wizard ID
	 */
	public static String ID = "org.grammaticalframework.eclipse.ui.wizards.GFNewQueryGrammarFromSemanticRepositoryWizard";
	
	/**
	 * Denotes that the wizard is in a finished state.
	 * (The "Finish" button is enabled.)
	 */
	private boolean canFinish;
	
	/**
	 * Clipboard that will hold the chosen so far templates
	 */
	private GFNewQueryGrammarClipBoard clipboard;
	
	/**
	 * A repository that will be used for all the queries.
	 */
	private RepositoryUtils repository;
	
	/**
	 * The first page of the wizard.
	 */
	private GFNewQueryGrammarURLAndTemplatePage introPage;
	
	@Override
	public boolean performFinish() {
		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.setWindowTitle("New Query Grammar from Semantic Repository");
		clipboard = new GFNewQueryGrammarClipBoard();
		canFinish = false;
		repository = null;
	}
	
	public RepositoryUtils getRepository() {
		return repository;
	}

	public void setRepository(RepositoryUtils repository) {
		this.repository = repository;
	}

	/**
	 * Adding the first page
	 */

	@Override
	public void addPages() {
		GFNewQueryGrammarURLAndTemplatePage introPage = new GFNewQueryGrammarURLAndTemplatePage(selection);
		addPage(introPage);
	}
	
	public GFNewQueryGrammarClipBoard getClipboard() {
		return this.clipboard;
	}
	
	public boolean canFinish() {
		return canFinish;
	}
	
	public void setFinished() {
		canFinish = true;
	}
	
	public WizardPage getFirstWizardPage() {
		return introPage;
	}
}
