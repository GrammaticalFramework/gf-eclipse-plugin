/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.scoping;

import java.util.Iterator;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.ListBind;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListPatt;
import org.grammaticalframework.eclipse.gF.TopDef;
import org.grammaticalframework.eclipse.naming.GFQualifiedNameProvider;

import com.google.common.base.Function;
import com.google.inject.Inject;

/**
 * Custom GF scoping
 * Basically we look at the current resource and return all the un-qualified names
 * Then delegate to global resource provider.
 * 
 * @author John J. Camilleri
 */
public class GFScopeProvider extends SimpleLocalScopeProvider {
	
	/**
	 * System for allowing the builder to signal that a file's cache is expired
	 */
	private static org.eclipse.core.runtime.QualifiedName cachePropertyKey = new org.eclipse.core.runtime.QualifiedName("org.grammaticalframework.eclipse", "cache.dirty"); 
	public static void setCacheDirty(IResource iresource) {
		try {
			iresource.setSessionProperty(cachePropertyKey, new Boolean(true));
		} catch (CoreException e) {
			
		}
	}
	private static boolean isCacheDirty(Resource resource) {
		IResource iresource = ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getURI().toPlatformString(false));
		try {
			Boolean value = (Boolean)iresource.getSessionProperty(cachePropertyKey);
			return value.booleanValue();
		} catch (Exception _) {
			return true; // something went wrong or no cache set, assume it is dirty!
		}
	}
	private static void setCacheClean(Resource resource) {
		IResource iresource = ResourcesPlugin.getWorkspace().getRoot().findMember(resource.getURI().toPlatformString(false));
		try {
			iresource.setSessionProperty(cachePropertyKey, new Boolean(false));
		} catch (CoreException e) {
		}
	}
	
	
	/**
	 * Cache instance
	 */
	@Inject
	private IResourceScopeCache cache;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider#getScope(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
	 */
	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		
		// If builder marked cache as dirty, then clear it
		if (isCacheDirty(context.eResource())) {
			cache.clear(context.eResource());
			setCacheClean(context.eResource());
		}
		
		// Get local scope
		ISelectable localResourceContent = getAllDescriptions(context.eResource(), context, reference);
//		ISelectable localResourceContent = cache.get(Tuples.pair(SimpleLocalScopeProvider.class.getName(), reference), 
//				context.eResource(), new Provider<ISelectable>() {
//			public ISelectable get() {
//				return getAllDescriptions(context.eResource(), context, reference);
//			}
//		});
		
		// Get global scope
		IScope globalScope = getGlobalScope(context.eResource(), reference);

		// Put them together
		IScope rs = createScope(globalScope, localResourceContent, reference.getEReferenceType(), isIgnoreCase(reference));
		
		// and.. scene
		return rs;
	}	
	
	/**
	 * Qualified name converter
	 */
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	protected IQualifiedNameConverter getConverter() {
		return converter;
	}
	
	/**
	 * Return all local descriptions for a given resource.
	 *
	 * @param resource the resource
	 * @return the all descriptions
	 */
	@Override
	protected ISelectable getAllDescriptions(final Resource resource) {
		Iterable<EObject> allContents = new Iterable<EObject>(){
			public Iterator<EObject> iterator() {
				return resource.getAllContents();
			}
		}; 
		Iterable<IEObjectDescription> allDescriptions = Scopes.scopedElementsFor(allContents,
				new Function<EObject, QualifiedName>() {
			public QualifiedName apply(EObject from) {
				if (from instanceof Ident && GFQualifiedNameProvider.shouldBeExported( (Ident)from) ) {
					return getConverter().toQualifiedName( ((Ident)from).getS() );
				}
				return null;
			}
		});
		return new MultimapBasedSelectable(allDescriptions);
	}

	/**
	 * Get all descriptions of a resource, when referenced from a given context/reference
	 * What is returned in allDescriptions depends on various GF-specific criteria.
	 *
	 * @param resource the resource
	 * @param context the context
	 * @param reference the reference
	 * @return the all descriptions
	 */
	protected ISelectable getAllDescriptions(final Resource resource, final EObject context, final EReference reference) {
		
		// Get all contents as EObjects
		Iterable<EObject> allContents = new Iterable<EObject>(){
			public Iterator<EObject> iterator() {
				return resource.getAllContents();
			}
		};
		
		// Attempt to find the TopDef for context
		EObject temp = context;
		while (temp.eContainer() != null && !(temp.eContainer() instanceof TopDef)) {
			temp = temp.eContainer();
		}
		final EObject contextJudgement = (temp.eContainer() != null) ? temp : null;
		
		// Create descriptions for each, if they deserve one!
		Iterable<IEObjectDescription> allDescriptions = Scopes.scopedElementsFor(allContents,
				new Function<EObject, QualifiedName>() {
					public QualifiedName apply(EObject from) {

						// Attempt to find the top judgment for from
						EObject temp = from;
						while (temp.eContainer() != null && !(temp.eContainer() instanceof TopDef)) {
							temp = temp.eContainer();
						}
						EObject fromJudgement = (temp.eContainer() != null) ? temp : null;
						
						// Local variables
						if (from instanceof Ident && from.eContainer().eContainer() instanceof ListPatt && contextJudgement == fromJudgement) {
							return getConverter().toQualifiedName( ((Ident)from).getS() );
						}
						
						// Bindings (code very similar to that above)
						if (from instanceof Ident && from.eContainer().eContainer() instanceof ListBind && contextJudgement == fromJudgement) {
							return getConverter().toQualifiedName( ((Ident)from).getS() );
						}
						
						// Stuff in "let" clauses
						if (from instanceof Ident && from.eContainer().eContainer() instanceof ListLocDef && contextJudgement == fromJudgement) {
							return getConverter().toQualifiedName( ((Ident)from).getS() );
						}
						
						// Try not to include self in your own scope!
						if (contextJudgement == fromJudgement && fromJudgement != null) {
							return null;
						}
						
						// Top level declarations
						if (from instanceof Ident && GFQualifiedNameProvider.shouldBeExported( (Ident)from) ) {
							return getConverter().toQualifiedName( ((Ident)from).getS() );
						}
						
						// All else has failed...
						return null;
					}
				});
		return new MultimapBasedSelectable(allDescriptions);
	}

	
}
