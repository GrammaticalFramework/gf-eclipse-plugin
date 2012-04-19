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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.grammaticalframework.eclipse.ui.projects.GFProjectSupport;

/**
 * The Class GFProjectNature.
 */
public class GFProjectNature implements IProjectNature {

	private IProject project;
	
	/**
	 * The GF nature ID
	 */
	public static final String NATURE_ID = "org.grammaticalframework.eclipse.ui.natures.projectNatureID"; //$NON-NLS-1$

	/**
	 * Adds the GF builder to the project
	 */
	public void configure() throws CoreException {
		GFProjectSupport.addBuilder(project);
	}

	/**
	 * Remove GF builder from project
	 */
	public void deconfigure() throws CoreException {
		GFProjectSupport.removeBuilder(project);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return this.project;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

}
