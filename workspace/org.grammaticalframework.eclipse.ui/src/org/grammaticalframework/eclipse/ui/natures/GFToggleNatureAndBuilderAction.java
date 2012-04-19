/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.natures;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This code copied from the Eclipse extension wizard "Project Builder and Nature".
 */
public class GFToggleNatureAndBuilderAction implements IObjectActionDelegate {

	/**
	 * The selected item
	 */
	private ISelection selection;

	/**
	 * Run the action, toggles the nature & builder for each valid project in the selection.
	 */
	@SuppressWarnings("rawtypes")
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			Iterator it = ((IStructuredSelection) selection).iterator();
			while (it.hasNext()) {
				Object element = it.next();
				if (element instanceof IProject) {
					toggleNature((IProject) element);
				} else if (element instanceof IAdaptable) {
					IProject project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
					toggleNature(project);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * Toggles sample nature on a project.
	 *
	 * @param project to have sample nature added or removed
	 */
	private void toggleNature(IProject project) {
		if (hasNature(project)) {
			removeNature(project);
		} else {
			addNature(project);
		}
	}
	
	/**
	 * Determines if the specified project has the GF nature or not
	 * @param project
	 * @return
	 */
	private boolean hasNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
	
			for (int i = 0; i < natures.length; ++i) {
				if (GFProjectNature.NATURE_ID.equals(natures[i])) {
					return true;
				}
			}
		} catch (CoreException e) {
		}
		
		return false;
	}
	
	/**
	 * Adds the GF Nature to the project.
	 * This method DOES NOT CHECK whether the nature is already added to the project.
	 * @param project
	 */
	private void addNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = GFProjectNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
			return;
		} catch (CoreException e) {
		}
	}
	
	/**
	 * Remove the GF Nature from the project.
	 * @param project
	 */
	private void removeNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			for (int i = 0; i < natures.length; ++i) {
				if (GFProjectNature.NATURE_ID.equals(natures[i])) {
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					return;
				}
			}
		} catch (CoreException e) {
		}
	}

}
