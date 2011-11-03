package org.grammaticalframework.eclipse.ui.launch;

import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

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
 * TODO: Implement launch shortcuts. For some reason the shortcut won't show up in the menu...
 *
 */
public class GFLaunchShortcut implements ILaunchShortcut {

	// We have to resolve the entity to launch from the editor
	public void launch(IEditorPart editor, String mode) {
		IEditorInput input = editor.getEditorInput();
		input.getName();

	}

	// The selection contains the candidate entities to launch
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			StringBuffer buffer = new StringBuffer();
			for (Object s : ((IStructuredSelection) selection).toList()) {
				buffer.append(s.toString() + " ");
			}
		}

	}
	/*
	// Do the actual work
    protected void launch(IType type, String mode) {
        try {
            ILaunchConfiguration config = findLaunchConfiguration(type, mode);
            if (config != null) {
            	config.launch(mode, null);
            }
        } catch (CoreException e) {
            // Handle exceptions
        }
    }
*/
}
