/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.validation;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;
import org.grammaticalframework.eclipse.builder.GFLibraryHelper;

public class GFResourceValidator extends ResourceValidatorImpl {

	@Override
	public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator mon) {
		
		// Never validate anything in the external folder
		if (GFLibraryHelper.isLinkedResource(resource)) {
			return null;
		}

		// Move along
		return super.validate(resource, mode, mon);
	}

}
