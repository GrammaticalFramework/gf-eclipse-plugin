package org.grammaticalframework.eclipse.documentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

public class GFDocumentationProvider implements IEObjectDocumentationProvider {
//public class GFDocumentationProvider extends MultiLineCommentDocumentationProvider {

	@Override
	public String getDocumentation(EObject o) {
		// TODO
		return "hello<br/>how are you?";
	}

}
