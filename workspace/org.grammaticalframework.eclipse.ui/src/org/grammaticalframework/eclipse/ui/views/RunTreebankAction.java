package org.grammaticalframework.eclipse.ui.views;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Event;
import org.grammaticalframework.eclipse.launch.GFLaunchConfigurationDelegate;
import org.grammaticalframework.eclipse.launch.IGFLaunchConfigConstants;

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
		
		ILaunchConfigurationType gfLaunchType = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurationType("org.grammaticalframework.eclipse.GFLaunchConfigurationType");
		ILaunchConfigurationWorkingCopy config;
		try {
			config = gfLaunchType.newInstance(null, "On-the-fly GF Treebank Lanuch");
			config.setAttribute(IGFLaunchConfigConstants.WORKING_DIR, treebankFile.getParent().getLocation().toOSString());
			config.setAttribute(IGFLaunchConfigConstants.FILENAMES, "");
			config.setAttribute(IGFLaunchConfigConstants.OPTIONS, "");
			config.setAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
			config.setAttribute(IGFLaunchConfigConstants.BATCH_MODE, true);
			config.setAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, true);
			config.setAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, treebankFile.getName());
			config.setAttribute(IGFLaunchConfigConstants.GOLD_STANDARD_FILENAME, goldStandardFile.getName());

			DebugUITools.launch(config, ILaunchManager.RUN_MODE);
			
		} catch (CoreException e) {
			log.error("Couldn't run treebank action", e);
		}
		
	}

}
