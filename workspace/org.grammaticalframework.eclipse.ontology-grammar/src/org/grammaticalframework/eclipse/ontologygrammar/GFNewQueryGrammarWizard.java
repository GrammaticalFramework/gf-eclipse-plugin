package org.grammaticalframework.eclipse.ontologygrammar;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.ontotext.molto.repositoryHelper.RepositoryUtils;

/**
 * A Wizard to assist a user to create a sparql query grammar 
 * from natural language template patterns.
 * Note: the pages are added dynamically one by one.
 * 
 * @author Maria Mateva, Ontotext AD
 */
public class GFNewQueryGrammarWizard extends Wizard implements INewWizard {
	/**
	 * Wizard ID
	 */
	public static String ID = "org.grammaticalframework.eclipse.ui.wizards.GFNewQueryGrammarFromSemanticRepositoryWizard";
	
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
	
	/**
	 * Denotes that the wizard is in a finished state.
	 * (The "Finish" button is enabled.)
	 */
	private boolean canFinish;
	

	public void init(IWorkbench workbench, IStructuredSelection selection) {
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
	 * Adding the inital page
	 */
	@Override
	public void addPages() {
		GFNewQueryGrammarURLAndTemplatePage introPage = new GFNewQueryGrammarURLAndTemplatePage();
		addPage(introPage);
	}
	/**
	 * A reference to the initial page of this wizard
	 */
	public IWizardPage getFirstWizardPage() {
		return introPage;
	}
	/**
	 * Getter for the clipboard
	 * @return - the clipboard used to story inter-pages templates results.
	 * @see GFNewQueryGrammarClipBoard
	 */
	public GFNewQueryGrammarClipBoard getClipboard() {
		return this.clipboard;
	}
	
	/**
	 * Returns true if the Finish button can be pressed.
	 */
	public boolean canFinish() {
		return canFinish;
	}
	
	/**
	 * Set the wizards complete; the Finish button is enabled.
	 */
	public void setFinished() {
		canFinish = true;
	}
	
	@Override
	public boolean performFinish() {
		return false;
	}
	
	/**
	 * This overriding contributes to the dynamic selection of next pages.
	 * (So that a loop for the template selection is possible.)
	 * The next pages are added dynamically(page for page) on the go,
	 * so that last one is returned here, as a next page.
	 */
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		int nextPageIndex = ((GFNewQueryGrammarClipboardPage)page).getIndexOfNextPage();
		if (nextPageIndex > -1) {
			return this.getPages()[nextPageIndex];
		}
		return null;		
	}

}
