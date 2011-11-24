package org.grammaticalframework.eclipse.ui.editor.validation;

import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback;
import org.grammaticalframework.eclipse.builder.GFLibraryHelper;

/**
 * This class exists purely to handle the NullPointerException in
 * org.eclipse.xtext.ui.editor.validation.AddMarkersOperation.execute(AddMarkersOperation.java:84)
 * when opening a linked resource. 
 * 
 * @author John J. Camilleri
 *
 */
public class GFValidatingEditorCallback extends ValidatingEditorCallback {

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		if (!GFLibraryHelper.isLinkedResource(editor.getResource())) {
			super.afterCreatePartControl(editor);
		}
	}
}
