package org.grammaticalframework.eclipse.ui.editor;

import java.net.URISyntaxException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorDescriptor;
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
	private String GF_XTEXT_EDITOR_ID;
	
	@Inject(optional = true)
	private IWorkbench workbench;
	
	protected IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	@Override
	public IEditorPart open(URI uri, EReference crossReference, int indexInList, boolean select) {
		// If platform URL, just use the parent
		if (uri.isPlatformResource())
			return super.open(uri, crossReference, indexInList, select);
		
		// TODO If file is external, then open it read-only and do not allow validation!
		
		
		log.error("Error opening editor for '" + uri + "'");
		return null;
		
//		// Otherwise we're trying to open an external library
//		IEditorPart editor = null;
//        try {
//        	java.net.URI netURI = new java.net.URI(uri.toString());
//    		IEditorRegistry reg = workbench.getEditorRegistry();
//    		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
//    		
//    		// Open external editor ("notepad")
////        	editor = IDE.openEditor(activePage, netURI, reg.SYSTEM_EXTERNAL_EDITOR_ID, true);
//    		
//        	// Open Xtext editor - will throw an CompoundXtextEditorCallback when file is external
////			Path path = new Path(uri.toFileString());
////			IFile file = getWorkspaceRoot().getFile(path);
////			IStorage storage = file;
//			IEditorInput editorInput = new XtextReadonlyEditorInput(linkedFile);
//			editor = IDE.openEditor(activePage, editorInput, GF_XTEXT_EDITOR_ID);
//			selectAndReveal(editor, uri, crossReference, indexInList, select);
//
//			// If we failed, open basic text editor
////			if (editor == null) {
////				IEditorDescriptor txtEditorPart = reg.getDefaultEditor("fake.txt");
////	        	editor = IDE.openEditor(activePage, netURI, txtEditorPart.getId(), true);
////			}
//
//		} catch (URISyntaxException e) {
//			log.error("Error converting URI '" + uri + "'", e);
//		} catch (PartInitException e) {
////		} catch (Exception e) {
//			log.error("Error opening editor for '" + uri + "'", e);
//		}
//		return editor; // may be null

	}
	
}
