package org.grammaticalframework.eclipse.ui.natures;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

// TODO: The GF nature should actually do something...
// TODO: How to place in menu for right-click on project > configure > add GF nature?
public class GFProjectNature implements IProjectNature {
	
	public static final String NATURE_ID = "org.grammaticalframework.eclipse.ui.natures.projectNatureID"; //$NON-NLS-1$

	public void configure() throws CoreException {

	}

	public void deconfigure() throws CoreException {

	}

	public IProject getProject() {
		return null;
	}

	public void setProject(IProject project) {

	}

}
