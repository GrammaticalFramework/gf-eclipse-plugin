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

public class GFNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	private GFNewProjectWizardPage page;

	private static final String PAGE_NAME = "GF Project Wizard"; //$NON-NLS-1$
	private static final String PAGE_DESCRIPTION = "This wizard creates a new GF Project and loads the GF Perspective"; //$NON-NLS-1$
	private static final String WIZARD_NAME = "New GF Project"; //$NON-NLS-1$

	public GFNewProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

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


	
	private IConfigurationElement _configurationElement;

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		_configurationElement = config;
	}

}
