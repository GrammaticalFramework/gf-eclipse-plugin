/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
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

// TODO: Auto-generated Javadoc
/**
 * The Class GFNewProjectWizard.
 */
public class GFNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	/**
	 * The page.
	 */
	private GFNewProjectWizardPage page;

	/**
	 * The Constant PAGE_NAME.
	 */
	private static final String PAGE_NAME = "GF Project Wizard"; //$NON-NLS-1$
	
	/**
	 * The Constant PAGE_DESCRIPTION.
	 */
	private static final String PAGE_DESCRIPTION = "This wizard creates a new GF Project and loads the GF Perspective"; //$NON-NLS-1$
	
	/**
	 * The Constant WIZARD_NAME.
	 */
	private static final String WIZARD_NAME = "New GF Project"; //$NON-NLS-1$

	/**
	 * Instantiates a new gF new project wizard.
	 */
	public GFNewProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new GFNewProjectWizardPage(PAGE_NAME);
		page.setTitle(PAGE_NAME);
		page.setDescription(PAGE_DESCRIPTION);
		addPage(page);
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
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
	 * The _configuration element.
	 */
	private IConfigurationElement _configurationElement;

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}

}
