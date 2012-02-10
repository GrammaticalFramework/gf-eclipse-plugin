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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class GFEObjectHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected String getFirstLine(EObject o) {
//		return o.eClass().getName()+ " <b>"+getLabel(o)+"</b>"; // copied from super
		return "<b>"+getLabel(o)+"</b>";
	}	
}
