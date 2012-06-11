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

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.grammaticalframework.eclipse.ui.projects.GFProjectSupport;

/**
 * Wizard for creating a new GF Project
 * 
 * @author John J. Camilleri
 * 
 */
public class GFNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	/**
	 * Wizard ID
	 */
	public static String ID = "org.grammaticalframework.eclipse.ui.wizards.GFNewProjectWizard";

	/**
	 * The page.
	 */
	private GFNewProjectWizardPage page;

	/**
	 * {@inheritDoc}
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		page = new GFNewProjectWizardPage();
		addPage(page);
	}


	/**
	 * {@inheritDoc}
	 */
	public boolean performFinish() {
	    String name = page.getProjectName();
	    URI location = null;
//	    if (!page.useDefaults()) {
//	        location = page.getLocationURI();
//	    } // else location == null

	    GFProjectSupport.createProject(name, location);
	    
	    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
	    
	    return true;
	}

	/**
	 * The configuration element.
	 */
	private IConfigurationElement _configurationElement;

	/**
	 * {@inheritDoc}
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}
	
}
