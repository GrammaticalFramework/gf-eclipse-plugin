package org.grammaticalframework.eclipse.scoping;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
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
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFScopingHelper.class);
	
	/**
	 * Create dummy URI for a path
	 * @param path
	 * @return
	 */
	public static URI createDummyURI(String path) {
		URI uri = URI.createURI("dummy."+path);
		return uri;
	}
	
	/**
	 * Check if the given URI is a dummy URI
	 * @param uri
	 * @return
	 */
	public static boolean isDummyURI(URI uri) {
		return uri.path().startsWith("dummy.");
	}
	
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
	 * Get the external folder for a given file. Does <strong>not</strong> create the folder if
	 * it doesn't exist.
	 * @param file
	 * @return The external folder, or possibly <code>null</code> if it doesn't exist
	 */
	public static IFolder getExernalFolder(IFile file) {
		if (GFBuilder.USE_GLOBAL_EXTERNAL_FOLDER) {
			return file.getProject().getFolder(GFBuilder.EXTERNAL_FOLDER);
		} else {
			return file.getParent().getFolder(new Path(GFBuilder.EXTERNAL_FOLDER));
		}
	}
	
	/**
	 * The the external folder for a tag file URI. Expected types of URI are:
	 * <ul>
	 * 		<li><code>platform:/resource/Foods/.gfbuild/FoodsEng.gf-tags</code></li>
	 * 		<li><code>file:/home/john/repositories/gf-eclipse-plugin/workspace-demo/Foods/.gfbuild/FoodsEng.gf-tags</code></li>
	 * </ul>
	 * @param tagFileURI
	 * @return
	 * @throws CoreException
	 */
	public static IFolder getExternalFolder(URI tagFileURI) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource res = null;
		if (tagFileURI.isPlatform()) {
			res = root.findMember(tagFileURI.toPlatformString(true));
		} else if (tagFileURI.isFile()) {
			String workspaceStem = ResourcesPlugin.getWorkspace().getRoot().getRawLocationURI().toString() + java.io.File.separator;
			URI projectURI = tagFileURI.deresolve(URI.createURI(workspaceStem));
			res = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(projectURI.toFileString()));
		} else {
			log.error("Unexpected URI format");
		}
		
		IFolder extFolder;
		if (GFBuilder.USE_GLOBAL_EXTERNAL_FOLDER) {
			// Always in root of project
			IProject project = res.getProject();
			extFolder = project.getFolder(GFBuilder.EXTERNAL_FOLDER);
		} else {
			// In subfolder relative to file
			extFolder = res.getParent().getParent().getFolder(new Path(GFBuilder.EXTERNAL_FOLDER));
		}
		
		// Create the folder if it doesn't exist
		if (!extFolder.exists()) {
			extFolder.create(true, true, null);
		}
		
		return extFolder;
	}
}
