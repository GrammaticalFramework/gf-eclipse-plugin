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

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.eclipse.xtext.util.OnChangeEvictingCache;
import org.eclipse.xtext.util.Tuples;
import org.grammaticalframework.eclipse.gF.Arg;
import org.grammaticalframework.eclipse.gF.DefDef;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.LinDef;
import org.grammaticalframework.eclipse.gF.ListBind;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListPatt;
import org.grammaticalframework.eclipse.gF.OperDef;
import org.grammaticalframework.eclipse.gF.TopDef;
import org.grammaticalframework.eclipse.naming.GFQualifiedNameProvider;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Custom GF scoping
 * Look at the current resource and return all the un-qualified names.
 * Then delegate to global resource provider.
 * 
 * @author John J. Camilleri
 */
public class GFScopeProvider extends SimpleLocalScopeProvider {
	
	/**
	 * Logger
	 */
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger(GFScopeProvider.class);
	
	/**
	 * Cache instance, automatically invalidated when file changes
	 */
	@Inject
	private OnChangeEvictingCache cache;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider#getScope(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
	 */
	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		
		// Get local scope
		ISelectable localResourceContent = getLocalScope(context.eResource(), context, reference);
		
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
	 * For a given reference, get the top-level local descriptions from the cache,
	 * and combine with judgement-level arguments and bindings (not cached).
	 * 
	 * @param resource
	 * @param context
	 * @param reference
	 * @return
	 */
	private ISelectable getLocalScope(final Resource resource, final EObject context, final EReference reference) {
		
		// Top-level, with no context (cached)
		ISelectable localResourceContent = cache.get(Tuples.pair(GFScopeProvider.class.getName(), reference), context.eResource(), new Provider<ISelectable>() {
			public ISelectable get() {
				return getAllDescriptions(context.eResource());
			}
		});
		
		// Include refs local to the judgement, i.e. args and bindings (not cached)
		Iterable<IEObjectDescription> judgementLevelRefs = getJudgementLevelDescriptions(context, reference);
		
		// Join together and return
		ArrayList<IEObjectDescription> joinedList = new ArrayList<IEObjectDescription>(100);
		for (IEObjectDescription ieod : localResourceContent.getExportedObjects())
			joinedList.add(ieod);
		for (IEObjectDescription ieod : judgementLevelRefs)
			joinedList.add(ieod);
		return new MultimapBasedSelectable(joinedList);
	}
	
	/**
	 * Return all "top-level" descriptions for the given resource.
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
		Iterable<IEObjectDescription> allDescriptions = Scopes.scopedElementsFor(allContents, new Function<EObject, QualifiedName>() {
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
	 * Get judgment-level descriptions for a given context/reference.
	 *
	 * @param context the context
	 * @param reference the reference
	 * @return the all descriptions
	 */
	protected Iterable<IEObjectDescription> getJudgementLevelDescriptions(final EObject context, final EReference reference) {
		
		// Attempt to find the TopDef OR OperDefInnerDef for context
		EObject temp = context;
		while (temp.eContainer() != null && !(temp.eContainer() instanceof TopDef) && !(temp.eContainer() instanceof OperDef)) {
			temp = temp.eContainer();
		}
		if (temp.eContainer() == null) {
			return new ArrayList<IEObjectDescription>(0);
		}
		final EObject contextJudgement = temp;
		
		// Get all contents within the judgement and convert to iterable
		TreeIterator<EObject> contents = contextJudgement.eAllContents();
		ArrayList<EObject> iterable = new ArrayList<EObject>(100);
		while (contents.hasNext()) {
			iterable.add(contents.next());
		}
		
		// Filter
		Iterable<IEObjectDescription> descriptions = Scopes.scopedElementsFor(iterable,
				new Function<EObject, QualifiedName>() {
					public QualifiedName apply(EObject from) {
						EObject parent = from.eContainer();
						EObject grandparent = parent.eContainer();
						EObject greatgrandparent = grandparent.eContainer();
						if (from instanceof Ident) {
							Ident ident = ((Ident)from);
							
							// Explicitly avoid record fields
							if (greatgrandparent instanceof Exp && ((Exp)greatgrandparent).isRecord()) {
								return null;
							}
							
							// Local variables
							if (grandparent instanceof ListPatt && greatgrandparent instanceof DefDef) {
								return getConverter().toQualifiedName(ident.getS());
							}
							if (parent instanceof Arg && (grandparent instanceof OperDef || grandparent instanceof LinDef )) {
								return getConverter().toQualifiedName(ident.getS());
							}
							
							// Bindings (code very similar to that above)
							if (grandparent instanceof ListBind) {
								return getConverter().toQualifiedName(ident.getS());
							}
							
							// Stuff in "let" clauses
							if (grandparent instanceof ListLocDef) {
								return getConverter().toQualifiedName(ident.getS());
							}
						}
						
						// We don't want it
						return null;
					}
				});
		return descriptions;
	}
	
}
