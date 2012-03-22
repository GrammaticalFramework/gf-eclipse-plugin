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
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.grammaticalframework.eclipse.launch.IGFLaunchConfigConstants;

/**
 * Shortcut from a treebank file, finds and runs an existing launch config which
 * uses the current treebank file, or opens a new Launch Config Dialog with
 * pre-populated options for a one-time launch.
 * 
 * @author John J. Camilleri
 *
 */
public class GFTreebankLaunchShortcut implements ILaunchShortcut {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTreebankLaunchShortcut.class);
	
	private boolean makeGoldStandard = false;

	public boolean isMakeGoldStandard() {
		return makeGoldStandard;
	}

	public void setMakeGoldStandard() {
		this.makeGoldStandard = true;
	}	

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
	 * @param treebankFile Treebank file
	 * @param mode
	 */
    protected void launch(IFile treebankFile, String mode) {
        try {
        	ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
        	ILaunchConfigurationType configType = launchManager.getLaunchConfigurationType(IGFLaunchConfigConstants.GF_LAUNCH_CONFIG_TYPE_ID);
            
            // Try to find a matching config and launch it
            ILaunchConfiguration[] configs = launchManager.getLaunchConfigurations(configType);
            for (int i = 0; i < configs.length; i++) {
            	if (configs[i].getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false)
            			&& treebankFile.getName().equals( configs[i].getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, "") )) {
//            		ILaunchConfiguration config = configs[i];
            		ILaunchConfigurationWorkingCopy config = configs[i].copy("Copy of "+configs[i].getName());
            		
            		// Make gold?
           			config.setAttribute(IGFLaunchConfigConstants.MAKE_GOLD_STANDARD, isMakeGoldStandard());
            		
            		log.info(String.format("Running launch \"%s\" for treebank file \"%s\"", config.getName(), treebankFile.getName()));
            		DebugUITools.launch(config, mode);
					return;
				}
			}
            
            // If we're come this far, no matching launch config exists, so we open up the LCD
    		log.info(String.format("Running on-the-fly launch for treebank file \"%s\"", treebankFile.getName()));
            ILaunchConfiguration config = createLaunchConfiguration(treebankFile, configType);
            Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
            DebugUITools.openLaunchConfigurationDialog(shell, config, IDebugUIConstants.ID_RUN_LAUNCH_GROUP, null);
            
        } catch (CoreException e) {
            log.warn("Error running launch", e);
        }
    }
    
    /**
     * Create a partial launch configuration based on the given treebank file. The resulting config
     * is intended to be opened with the Launch Config Dialog (LCD).
     *  
     * @param treebankFile
     * @param configType
     * @return
     * @throws CoreException
     */
    protected ILaunchConfiguration createLaunchConfiguration(IFile treebankFile, ILaunchConfigurationType configType) throws CoreException {
//		IFile goldStandardFile = GFTreebankHelper.getGoldStandardFile(treebankFile);
		ILaunchConfigurationWorkingCopy config;
		config = configType.newInstance(null, "GF Treebank Test");
		config.setAttribute(IGFLaunchConfigConstants.WORKING_DIR, treebankFile.getParent().getLocation().toOSString());
//		config.setAttribute(IGFLaunchConfigConstants.FILENAMES, "");
//		config.setAttribute(IGFLaunchConfigConstants.OPTIONS, "");
		config.setAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
		config.setAttribute(IGFLaunchConfigConstants.BATCH_MODE, true);
		config.setAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, true);
		config.setAttribute(IGFLaunchConfigConstants.TREEBANK_COMMAND, IGFLaunchConfigConstants.DEFAULT_TREEBANK_COMMAND);
		config.setAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, treebankFile.getName());
		config.setAttribute(IGFLaunchConfigConstants.MAKE_GOLD_STANDARD, isMakeGoldStandard());
		return config;
    }


}
