package org.grammaticalframework.eclipse.ui.views;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;

public class RunTreebankAction extends Action {
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(RunTreebankAction.class);
	
	private Viewer viewer;
	private IFile treebankFile;
	private IFile goldStandardFile;
	
	public RunTreebankAction(Viewer viewer) {
		super();
		this.viewer = viewer;
	}

	public void run() {
		
		// See what's selected in our viewer and validate
		IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		try {
			treebankFile = (IFile)selection.getFirstElement();
		} catch (ClassCastException _) {
			log.warn("Can only run action on file.");
			return;
		}
		goldStandardFile = GFTreebankManagerHelper.getGoldStandardFile(treebankFile);
		if (goldStandardFile == null) {
			log.warn("Found no corresponding gold standard for "+treebankFile.getName());
			return;
		}
		
		// TODO: delegate to: GFTreebankLaunchShortcut#launch()
		
	}

}
