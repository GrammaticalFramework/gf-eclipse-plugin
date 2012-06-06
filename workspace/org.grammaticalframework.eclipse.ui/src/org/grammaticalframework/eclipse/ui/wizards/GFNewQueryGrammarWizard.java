package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class GFNewQueryGrammarWizard extends AbstractNewFileWizard implements INewWizard {
	/**
	 * Denotes that the wizard is in a finished state.
	 * (The "Finish" button is enabled.)
	 */
	private boolean canFinish;
	
	/**
	 * Wizard ID
	 */
	public static String ID = "org.grammaticalframework.eclipse.ui.wizards.GFNewQueryGrammarFromSemanticRepositoryWizard";
	
	/**
	 * Clipboard that will hold the chosen so far templates
	 */
	private GFNewQueryGrammarClipBoard clipboard;
	
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
	}
	
	@Override
	/**
	 * Adding the first and the second page
	 */
	public void addPages() {
		GFNewQueryGrammarURLAndTemplatePage introPage = new GFNewQueryGrammarURLAndTemplatePage(selection);
		addPage(introPage);
		GFNewQueryGrammarChooseTemplatePage templatesPage = new GFNewQueryGrammarChooseTemplatePage(selection);
		addPage(templatesPage);
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
}
