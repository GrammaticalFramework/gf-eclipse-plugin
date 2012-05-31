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
	private GFNewQueryGrammarURLAndTemplatePage page;
	
	@Override
	public boolean performFinish() {
		System.out.println("FINISH");
		return false;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		System.out.println("Wizard initialized!");
	}
	
	@Override
	public void addPages() {
		page = new GFNewQueryGrammarURLAndTemplatePage();
		addPage(page);
	}

}
