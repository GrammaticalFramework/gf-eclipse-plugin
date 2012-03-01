/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.launch;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.grammaticalframework.eclipse.launch.IGFLaunchConfigConstants;
import org.grammaticalframework.eclipse.ui.views.GFTreebankManagerHelper;
import org.grammaticalframework.eclipse.ui.views.RunTreebankAction;

/**
 * Shortcut from a treebank file, opens the Launch Config Dialog with pre-populated options.
 * 
 * @author John J. Camilleri
 *
 */
public class GFTreebankLaunchShortcut implements ILaunchShortcut {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTreebankLaunchShortcut.class);

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
	 */
	public void launch(ISelection selection, String mode) {
		try {
			IFile treebankFile = (IFile) ((IStructuredSelection)selection).getFirstElement();
			launch(treebankFile, mode);
		} catch (ClassCastException e) {
			log.warn("Couldn't process selection", e);
		} catch (NullPointerException e) {
			log.warn("Couldn't process selection", e);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart, java.lang.String)
	 */
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		IFile file = (IFile) input.getAdapter(IFile.class);
		if (file == null) {
			log.warn("Error getting file from editor");
			return;
		}
		launch(file, mode);
	}
	
	/**
	 * For the given treebank file, see if it is already mentioned in any existing configs.
	 * If so, launch that config. If not, create a new one and open the LCD.
	 * 
	 * @param file Treebank file
	 * @param mode
	 */
    protected void launch(IFile file, String mode) {
        try {
        	ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
        	ILaunchConfigurationType configType = launchManager.getLaunchConfigurationType("org.grammaticalframework.eclipse.GFLaunchConfigurationType");
            ILaunchConfiguration[] configs = launchManager.getLaunchConfigurations(configType);
            
            // Try to find a matching config and launch it
            for (int i = 0; i < configs.length; i++) {
            	if (configs[i].getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false)
            			&& file.getName().equals( configs[i].getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, "") )) {
//					configs[i].launch(mode, null);
            		DebugUITools.launch(configs[i], mode);
					return;
				}
			}
            
            // If we're come this far, no matching launch config exists, so we open up the LCD
            ILaunchConfiguration config = createLaunchConfiguration(file);
            
            
        } catch (CoreException e) {
            log.warn("Error running launch", e);
        }
    }
    
    protected ILaunchConfiguration createLaunchConfiguration(IFile treebankFile) {
    	
		IFile goldStandardFile = GFTreebankManagerHelper.getGoldStandardFile(treebankFile);
    	
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
			if (goldStandardFile != null) {
				config.setAttribute(IGFLaunchConfigConstants.GOLD_STANDARD_FILENAME, goldStandardFile.getName());
			}
		} catch (CoreException e) {
			log.error("Couldn't create treebank launch configuration", e);
			return null;
		}

		return config;
    }

}
