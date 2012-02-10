package org.grammaticalframework.eclipse.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class GFEObjectHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected String getFirstLine(EObject o) {
//		return o.eClass().getName()+ " <b>"+getLabel(o)+"</b>"; // copied from super
		return "<b>"+getLabel(o)+"</b>";
	}	
}
