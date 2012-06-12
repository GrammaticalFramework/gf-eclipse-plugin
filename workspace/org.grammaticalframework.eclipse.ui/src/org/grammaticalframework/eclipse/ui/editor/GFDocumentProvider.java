/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor;

import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.grammaticalframework.eclipse.builder.GFLibraryHelper;

/**
 * Custom documemnt provider, which is readonly when viewing external files
 * @author John J. Camilleri
 *
 */
public class GFDocumentProvider extends XtextDocumentProvider {
	
	private boolean isLinkedResource(Object element) {
		XtextDocument doc = (XtextDocument) getDocument(element);
		return GFLibraryHelper.isLinkedResource(doc.getResourceURI());
	}

	@Override
	public boolean isModifiable(Object element) {
		return !isLinkedResource(element);
	}

	@Override
	public boolean isReadOnly(Object element) {
		return isLinkedResource(element);
	}

}
