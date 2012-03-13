package org.grammaticalframework.eclipse.scoping;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.builder.GFBuilderHelper;
import org.grammaticalframework.eclipse.gF.SourceModule;
import org.grammaticalframework.eclipse.gF.TopDef;

public class GFScopingHelper {
	
	/**
	 * Climb the EMF tree and return the EObject's SourceModule object
	 * @param eObj
	 * @return SourceModule or null
	 */
	public static SourceModule getSourceModule(EObject eObj) {
		EObject temp = eObj;
		try {
			while (!(temp  instanceof SourceModule)) {
				temp = temp.eContainer();
			}
			return ((SourceModule)temp);
		}
		catch (NullPointerException _) {
			return null;
		}
	}

	/**
	 * Climb the EMF tree and return the EObject's TopDef object
	 * @param eObj
	 * @return TopDef or null
	 */
	public static TopDef getTopDef(EObject eObj) {
		EObject temp = eObj;
		try {
			while (!(temp  instanceof TopDef)) {
				temp = temp.eContainer();
			}
			return ((TopDef)temp);
		}
		catch (NullPointerException _) {
			return null;
		}
	}

	/**
	 * Put together path to compiled tags file in the build folder.
	 *
	 * @param context the context
	 * @return the header path
	 */
	public static URI getTagsFile(Resource context) {
		URI uri = GFBuilderHelper.getTagsFileURIRelative(context.getURI().lastSegment());
		return uri.resolve(context.getURI());
	}
	
	/**
	 * The the external folder for a tag file URI. The type of URI expected is:
	 * <code>platform:/resource/Foods/.gfbuild/FoodsEng.gf-tags</code>
	 * @param uri
	 * @return
	 * @throws CoreException
	 */
	public static IFolder getExternalFolder(URI uri) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource res = null;
		if (uri.isPlatform()) {
			res = root.findMember(uri.toPlatformString(true));
		} else if (uri.isFile()) {
			String workspaceStem = ResourcesPlugin.getWorkspace().getRoot().getRawLocationURI().toString() + java.io.File.separator;
			URI projectURI = uri.deresolve(URI.createURI(workspaceStem));
			res = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(projectURI.toFileString()));
		} else {
			// ... 
		}
		
		IProject project = res.getProject();
		
		if (!project.isOpen()) {
//			log.info("Opening closed project '" + project.getName() + "'");
		    project.open(null);
		}

		// Create the folder if it doesn't exist
		IFolder extFolder = project.getFolder(GFBuilder.EXTERNAL_FOLDER);
		if (!extFolder.exists()) {
			extFolder.create(true, true, null);
		}
		
		return extFolder;		
	}
}
