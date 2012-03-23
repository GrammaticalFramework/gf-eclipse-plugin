/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.grammaticalframework.eclipse.launch.IGFLaunchConfigConstants;

/**
 * Wizard for creating a new treebank file
 * 
 * @author John J. Camilleri
 * 
 */
public class GFNewTreebankWizard extends AbstractNewFileWizard {
	
	/**
	 * Wizard ID
	 */
	public static String ID = "org.grammaticalframework.eclipse.ui.wizards.GFNewTreebankWizard";

	/**
	 * The page.
	 */
	private GFNewTreebankWizardPage page;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		page = new GFNewTreebankWizardPage(selection);
		addPage(page);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean performFinish() {
		try {
			ILaunchConfiguration config = page.getField_LaunchConfig();
			final ILaunchConfigurationWorkingCopy configCopy = config.copy("Copy of "+config.getName());
			configCopy.setAttribute(IGFLaunchConfigConstants.MAKE_TREEBANK, true);
			configCopy.setAttribute(IGFLaunchConfigConstants.MAKE_TREEBANK_NAME, page.getField_TreebankName());
			configCopy.setAttribute(IGFLaunchConfigConstants.MAKE_TREEBANK_COMMAND, page.getField_GenerateCommand());
			DebugUITools.launch(configCopy, ILaunchManager.RUN_MODE);
			return true;
		} catch (CoreException e) {
			log.error(e);
			return false;
		}
	}

}