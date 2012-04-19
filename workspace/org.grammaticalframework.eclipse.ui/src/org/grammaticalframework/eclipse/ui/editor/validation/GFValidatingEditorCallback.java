/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor.validation;

import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback;
import org.grammaticalframework.eclipse.builder.GFLibraryHelper;

/**
 * This class exists to prevent validation on an exernal linked resource
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
