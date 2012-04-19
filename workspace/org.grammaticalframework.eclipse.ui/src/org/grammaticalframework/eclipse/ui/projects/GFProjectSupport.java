/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.projects;

import java.net.URI;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.grammaticalframework.eclipse.ui.natures.GFProjectNature;
import org.grammaticalframework.eclipse.builder.GFBuilder;

/**
 * Based on: http://cvalcarcel.wordpress.com/2009/07/26/writing-an-eclipse-plug-in-part-4-create-a-custom-project-in-eclipse-new-project-wizard-the-behavior/
 * 
 * @author John J. Camilleri
 */
public class GFProjectSupport {
	
    /**
     * For this marvelous project we need to:
     * - create the project
     * - add the project natures
     * - create the folder structure.
     *
     * @param projectName the project name
     * @param location the location
     * @return the i project
     */
    public static IProject createProject(String projectName, URI location) {
        Assert.isNotNull(projectName);
        Assert.isTrue(projectName.trim().length() > 0);

        IProject project = createBaseProject(projectName, location);
        try {
        	addNature(project);
        	addBuilder(project);
            turnOnAutoBuild();
            String[] paths = { /*GFBuilder.BUILD_FOLDER, GFBuilder.EXTERNAL_FOLDER*/ }; // "parent/child1-1/child2"
            addToProjectStructure(project, paths);

            // Maybe this is rude?
            //turnOnAutoBuild();
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
        }

        return project;
    }

	/**
	 * Just do the basics: create a basic project.
	 *
	 * @param projectName the project name
	 * @param location the location
	 * @return the i project
	 */
    private static IProject createBaseProject(String projectName, URI location) {
        // it is acceptable to use the ResourcesPlugin class
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        if (!newProject.exists()) {
            URI projectLocation = location;
            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }

            desc.setLocationURI(projectLocation);
            try {
                newProject.create(desc, null);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }

        return newProject;
    }

    /**
     * Creates the folder.
     *
     * @param folder the folder
     * @throws CoreException the core exception
     */
    private static void createFolder(IFolder folder) throws CoreException {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }

    /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     *
     * @param newProject the new project
     * @param paths the paths
     * @throws CoreException the core exception
     */
    private static void addToProjectStructure(IProject newProject, String[] paths) throws CoreException {
        for (String path : paths) {
            IFolder etcFolders = newProject.getFolder(path);
            createFolder(etcFolders);
        }
    }
    
    /**
     * Adds by Xtext and GF natures to the project
     *
     * @param project the project
     * @throws CoreException the core exception
     */
    private static void addNature(IProject project) throws CoreException {
    	
		// Refer: http://www.eclipse.org/forums/index.php/m/547428/
		IProjectDescription description = project.getDescription();
//		description.setNatureIds(new String[] { XtextProjectHelper.NATURE_ID, GFProjectNature.NATURE_ID });
		description.setNatureIds(new String[] { GFProjectNature.NATURE_ID });
		project.setDescription(description, null);

//		// or...
//		IResource resource = editor.getResource();
//		toggleNature.toggleNature(resource.getProject());

//		This code will safely preserve any other natures
//    	if (!project.hasNature(GFProjectNature.NATURE_ID)) {
//    		IProjectDescription description = project.getDescription();
//    		String[] prevNatures = description.getNatureIds();
//    		String[] newNatures = new String[prevNatures.length + 1];
//    		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
//    		newNatures[prevNatures.length] = GFProjectNature.NATURE_ID;
//    		description.setNatureIds(newNatures);
//    		
//    		IProgressMonitor monitor = null;
//    		project.setDescription(description, monitor);
//    	}
    }

    /**
     * Refer: http://wiki.eclipse.org/FAQ_How_do_I_add_a_builder_to_a_given_project%3F
     *
     * @param project the project
     */
	public static void addBuilder(IProject project) {
		try {
			IProjectDescription desc = project.getDescription();
			ICommand[] commands = desc.getBuildSpec();
			// check it's not already there
			for (int i = 0; i < commands.length; ++i)
				if (commands[i].getBuilderName().equals(GFBuilder.BUILDER_ID))
					return;
			// add builder to project
			ICommand command = desc.newCommand();
			command.setBuilderName(GFBuilder.BUILDER_ID);
			ICommand[] nc = new ICommand[commands.length + 1];
			// Add it before other builders.
			System.arraycopy(commands, 0, nc, 1, commands.length);
			nc[0] = command;
			desc.setBuildSpec(nc);
			project.setDescription(desc, null);
		} catch (CoreException e) {
		}
	}
    
	/**
	 * Remove the GF Builder from the project.
	 * @param project
	 */
	public static void removeBuilder(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			ICommand[] commands = description.getBuildSpec();
			for (int i = 0; i < commands.length; i++) {
				if (commands[i].getBuilderName().equals(GFBuilder.BUILDER_ID)) {
					ICommand[] newCommands = new ICommand[commands.length - 1];
					System.arraycopy(commands, 0, newCommands, 0, i);
					System.arraycopy(commands, i + 1, newCommands, i, commands.length - i - 1);
					description.setBuildSpec(newCommands);
					project.setDescription(description, null);
					return;
				}
			}
		} catch (CoreException e) {
		}
	}	
    
    
    /**
     * Ref: http://www.eclipse.org/articles/Article-Builders/builders.html
     *
     * @throws CoreException the core exception
     */
    private static void turnOnAutoBuild() throws CoreException {
	   IWorkspace workspace = ResourcesPlugin.getWorkspace();
	   IWorkspaceDescription description = workspace.getDescription();
	   if (!description.isAutoBuilding()) {
	      description.setAutoBuilding(true);
	      workspace.setDescription(description);
	   }
   }

    
}
