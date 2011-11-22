package org.grammaticalframework.eclipse.ui.editor;

import java.net.URISyntaxException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class GFURIEditorOpener extends LanguageSpecificURIEditorOpener {

	/**
	 * The logger
	 */
	private static final Logger log = Logger.getLogger(GFURIEditorOpener.class);
	
	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String editorID;
	
	@Inject(optional = true)
	private IWorkbench workbench;	

	protected IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	public IEditorPart open(URI uri, EReference crossReference, int indexInList, boolean select) {
		// If platform URL, jsut use the parent
		if (uri.isPlatformResource())
			return super.open(uri, crossReference, indexInList, select);
		
		//TODO
		
		// Otherwise we're trying to open an external library
        try {
        	java.net.URI netURI = new java.net.URI(uri.toString());
//    		Path path = new Path(uri.toFileString());
//    		IFile file = getWorkspaceRoot().getFile(path);
    		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
        	IEditorPart editor = IDE.openEditor(activePage, netURI, IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID, true);
        	return editor;
		} catch (URISyntaxException e) {
			log.error("Error converting URI '" + uri + "'", e);
		} catch (PartInitException e) {
			log.error("Error opening editor for '" + uri + "'", e);
		}
		return null;
/*		
		
		uri = uri.trimFragment();
		try {
			Path path = new Path(uri.toFileString());
			IFile file = getWorkspaceRoot().getFile(path);
			IStorage storage = file;
			IEditorInput editorInput = new XtextReadonlyEditorInput(storage);
			IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
			IEditorPart editor = IDE.openEditor(activePage, editorInput, IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
			selectAndReveal(editor, uri, crossReference, indexInList, select);
			return EditorUtils.getXtextEditor(editor);
//		} catch (NullPointerException e) {
//			log.error("Error while opening editor part for EMF URI '" + uri + "'", e.getCause());
//		} catch (WrappedException e) {
//			log.error("Error while opening editor part for EMF URI '" + uri + "'", e.getCause());
//		} catch (PartInitException partInitException) {
//			log.error("Error while opening editor part for EMF URI '" + uri + "'", partInitException);
		} catch (Exception e) {
			log.error("Error opening editor for '" + uri + "'", e);
		}
		return null;
*/
	}
}
