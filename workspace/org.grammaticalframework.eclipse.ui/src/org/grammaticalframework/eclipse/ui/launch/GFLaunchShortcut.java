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

import java.util.List;

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
 * In most cases, a launch shortcut is maximally useful if it performs the following steps:
 * - Resolve something to launch from the specified selection or editor
 * - Check to see if there is an existing config based on the resolved entity, if there is launch it
 * - Otherwise, create a new config and populate it with default attribute values, except for those directly related to the resolved entity
 * - Launch the new config
 * 
 * Ref: http://www.eclipse.org/articles/Article-Launch-Framework/launch.html
 * 
 * @author John J. Camilleri
 * 
 */
public class GFLaunchShortcut implements ILaunchShortcut {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTreebankLaunchShortcut.class);

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
	 */
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			@SuppressWarnings("unchecked")
			List<Object> items = ((IStructuredSelection) selection).toList();
			if (items.isEmpty()) {
				return;
			}
			IFile[] files = items.toArray(new IFile[]{});
			launch(files, mode);
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
		launch(new IFile[]{file}, mode);
	}

	// Do the actual work
    protected void launch(IFile[] files, String mode) {
        try {
        	ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
        	ILaunchConfigurationType configType = launchManager.getLaunchConfigurationType(IGFLaunchConfigConstants.GF_LAUNCH_CONFIG_TYPE_ID);
	    	
            // Try to find a matching config and launch it
            ILaunchConfiguration[] configs = launchManager.getLaunchConfigurations(configType);
            for (int i = 0; i < configs.length; i++) {
            	String launchFilenames = configs[i].getAttribute(IGFLaunchConfigConstants.FILENAMES, "");
            	for (IFile file : files) {
            		if (launchFilenames.contains(file.getName())) {
                		log.info(String.format("Running launch \"%s\" for matching file \"%s\"", configs[i].getName(), file.getName()));
                		DebugUITools.launch(configs[i], mode);
    					return;
            		}
            	}
			}
	    	
	        // If we're come this far, no matching launch config exists, so we open up the LCD
	        ILaunchConfiguration config = createLaunchConfiguration(files, configType);
			log.info(String.format("Running on-the-fly launch for \"%s\"", config.getAttribute(IGFLaunchConfigConstants.FILENAMES, "current files")));
	        Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	        DebugUITools.openLaunchConfigurationDialog(shell, config, IDebugUIConstants.ID_RUN_LAUNCH_GROUP, null);    	
        } catch (CoreException e) {
            // Handle exceptions
        }
    }

    
    /**
     * Create a partial launch configuration based on the given file.
     *  
     * @param treebankFile
     * @param configType
     * @return
     * @throws CoreException
     */
    protected ILaunchConfiguration createLaunchConfiguration(IFile[] files, ILaunchConfigurationType configType) throws CoreException {
    	// glue together filenames
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < files.length; i++) {
			sb.append(files[i].getName() + " ");
		}
    	String filenames = sb.toString().trim();
    	
    	// set up launch config
		ILaunchConfigurationWorkingCopy config;
		config = configType.newInstance(null, "Compile with GF");
		config.setAttribute(IGFLaunchConfigConstants.WORKING_DIR, files[0].getParent().getLocation().toOSString());
		config.setAttribute(IGFLaunchConfigConstants.FILENAMES, filenames);
//		config.setAttribute(IGFLaunchConfigConstants.OPTIONS, "");
		config.setAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, true);
		config.setAttribute(IGFLaunchConfigConstants.BATCH_MODE, false);
		config.setAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false);
		return config;
    }    
}
