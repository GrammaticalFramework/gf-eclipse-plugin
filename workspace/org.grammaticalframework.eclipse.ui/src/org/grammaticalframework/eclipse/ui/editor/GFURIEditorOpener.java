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
import org.grammaticalframework.eclipse.builder.GFBuilder;

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
		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
		
		if (uri.isPlatformResource()) {
			if (uri.segment(uri.segmentCount()-2).equals(GFBuilder.EXTERNAL_FOLDER)) {

				// If in external folder, then it's a link to an external library
				Path path = new Path(uri.toPlatformString(true));
				IFile file = getWorkspaceRoot().getFile(path);
				IEditorInput editorInput = new XtextReadonlyEditorInput(file);
				IEditorPart editor;
				try {
					editor = IDE.openEditor(activePage, editorInput, GF_XTEXT_EDITOR_ID);
					selectAndReveal(editor, uri, crossReference, indexInList, select);
					return editor;
				} catch (PartInitException e) {
					log.error("Error opening editor for '" + uri + "': ", e); 
				}
				
			} else {
				
				// If not in the external folder, then open normally
				return super.open(uri, crossReference, indexInList, select);
			}
			
		} else {
			// It's some other external file.
			log.info("Opening as plain text: " + uri);
			
    		// Open external editor ("notepad")
			try {
	        	java.net.URI netURI = new java.net.URI(uri.toString());
				return IDE.openEditor(activePage, netURI, IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID, true);
			} catch (URISyntaxException e) {
				log.error("Error converting URI '" + uri + "': ", e); 
			} catch (PartInitException e) {
				log.error("Error opening editor for '" + uri + "': ", e); 
			}
		}
		return null;
	}
	
}
