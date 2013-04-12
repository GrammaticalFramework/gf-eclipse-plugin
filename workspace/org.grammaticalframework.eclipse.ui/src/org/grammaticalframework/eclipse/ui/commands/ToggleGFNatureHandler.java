package org.grammaticalframework.eclipse.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.grammaticalframework.eclipse.ui.natures.GFProjectNature;

public class ToggleGFNatureHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null && selection instanceof IStructuredSelection) {
			Iterator<?> it = ((IStructuredSelection) selection).iterator();
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
		return null;
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
