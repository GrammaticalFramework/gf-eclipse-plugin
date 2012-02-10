/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.documentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

/**
 * Custom documentation provider, provides:
 * 1. Type information
 * 2. In-source comments/gfDoc
 * @author John J. Camilleri
 *
 */
public class GFDocumentationProvider implements IEObjectDocumentationProvider {
//public class GFDocumentationProvider extends MultiLineCommentDocumentationProvider {

	@Override
	public String getDocumentation(EObject o) {
		// TODO
		return "hello<br/>how are you?";
	}

}
