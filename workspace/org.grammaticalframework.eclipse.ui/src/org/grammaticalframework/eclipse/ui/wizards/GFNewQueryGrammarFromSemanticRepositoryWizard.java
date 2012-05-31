package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class GFNewQueryGrammarFromSemanticRepositoryWizard extends AbstractNewFileWizard implements INewWizard {

	/**
	 * Wizard ID
	 */
	public static String ID = "org.grammaticalframework.eclipse.ui.wizards.GFNewQueryGrammarFromSemanticRepositoryWizard";
	
	/**
	 * Initial Page for selection of the 
	 */
	private GFNewQueryGrammarURLAndTemplatePage introPage;
	private GFNewQueryGrammarChooseTemplatePage templatesPage;
	private GFNewQueryGrammarSelectFromRepositoryPage repositoryPage;
	private GFNewQueryGrammarSaveToFilePage savePage;
	
	@Override
	public boolean performFinish() {
		System.out.println("FINISH");
		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.setWindowTitle("New Query Grammar from Semantic Repository");
	}
	
	@Override
	public void addPages() {
		introPage = new GFNewQueryGrammarURLAndTemplatePage(selection);
		addPage(introPage);
		templatesPage = new GFNewQueryGrammarChooseTemplatePage(selection);
		addPage(templatesPage);
		repositoryPage = new GFNewQueryGrammarSelectFromRepositoryPage(selection);
		addPage(repositoryPage);
		savePage = new GFNewQueryGrammarSaveToFilePage(selection);
		addPage(savePage);
	}

}
