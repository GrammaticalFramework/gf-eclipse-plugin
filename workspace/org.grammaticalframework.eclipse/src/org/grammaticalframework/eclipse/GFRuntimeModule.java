/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse;

import org.grammaticalframework.eclipse.documentation.GFDocumentationProvider;
import org.grammaticalframework.eclipse.linking.GFLinkingService;
import org.grammaticalframework.eclipse.naming.GFQualifiedNameProvider;
import org.grammaticalframework.eclipse.resource.GFResourceDescriptionStrategy;
import org.grammaticalframework.eclipse.scoping.GFScopeProvider;
import org.grammaticalframework.eclipse.scoping.GFTagBasedGlobalScopeProvider;
import org.grammaticalframework.eclipse.validation.GFResourceValidator;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class GFRuntimeModule extends org.grammaticalframework.eclipse.AbstractGFRuntimeModule {

	// Ref: http://www.eclipse.org/forums/index.php/t/217911/
	
	public Class<? extends org.eclipse.xtext.validation.IResourceValidator> bindIResourceValidator() {
		return GFResourceValidator.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return GFQualifiedNameProvider.class;
	}
	
	
	public Class<? extends org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return GFResourceDescriptionStrategy.class;
	}

	
	@Override
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return GFScopeProvider.class;
	}
	@Override
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
//		return GFGlobalScopeProvider.class;
		return GFTagBasedGlobalScopeProvider.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.linking.ILinkingService> bindILinkingService() {
		return GFLinkingService.class;
	}

	public Class<? extends org.eclipse.xtext.documentation.IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return GFDocumentationProvider.class;
	}

}
