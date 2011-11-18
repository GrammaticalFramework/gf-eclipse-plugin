/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.naming;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Tuples;
import org.grammaticalframework.eclipse.gF.*;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

// TODO: Auto-generated Javadoc
/**
 * Qualified name provider for GF
 * This class is very stupid, it just prepends the module name.
 * The logic determining what gets exported into ResourceDescriptions is in GFResourceDescriptionStrategy
 * 
 * @author John J. Camilleri
 *
 */
public class GFQualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {
	
	/**
	 * The converter.
	 */
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	/**
	 * Gets the converter.
	 *
	 * @return the converter
	 */
	protected IQualifiedNameConverter getConverter() {
		return converter;
	}
	
	/**
	 * The cache.
	 */
	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	/**
	 * The name resolver.
	 */
	private Function<EObject, String> nameResolver = SimpleAttributeResolver.newResolver(String.class, "name");

	/**
	 * Gets the resolver.
	 *
	 * @return the resolver
	 */
	protected Function<EObject, String> getResolver() {
		return nameResolver;
	}

	/**
	 * The qualified name.
	 */
	private PolymorphicDispatcher<QualifiedName> qualifiedName = new PolymorphicDispatcher<QualifiedName>("qualifiedName",1,1,Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<QualifiedName>get())
	{
		@Override
		protected QualifiedName handleNoSuchMethod(Object... params) { 
			return null;
		}
	}; 
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.naming.IQualifiedNameProvider#getFullyQualifiedName(org.eclipse.emf.ecore.EObject)
	 */
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>(){

			public QualifiedName get() {
				EObject temp = obj;
				QualifiedName qualifiedNameFromDispatcher = qualifiedName.invoke(temp);
				if (qualifiedNameFromDispatcher!=null)
					return qualifiedNameFromDispatcher;
				String name = getResolver().apply(temp);
				if (Strings.isEmpty(name))
					return null;
				QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(name);
				while (temp.eContainer() != null) {
					temp = temp.eContainer();
					QualifiedName parentsQualifiedName = getFullyQualifiedName(temp);
					if (parentsQualifiedName != null)
						return parentsQualifiedName.append(qualifiedNameFromConverter);
				}
				return qualifiedNameFromConverter;
			}
		});
	}
	
	/**
	 * Qualified name.
	 *
	 * @param id the id
	 * @return the qualified name
	 */
	public QualifiedName qualifiedName(Ident id) {
		if (!shouldBeExported(id))
			return null;
		// Get module name
		EObject temp = id;
		while (!(temp  instanceof ModDef) && temp.eContainer() != null) {
			temp = temp.eContainer();
		}
		String qualifiedName = ((ModDef)temp).getType().getName().getS() + "." + id.getS();
//		String qualifiedName = id.getS();
		return getConverter().toQualifiedName( qualifiedName );
	}
	
	/**
	 * Should be exported.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	public static boolean shouldBeExported(Ident id) {
		EObject parent = id.eContainer();
		EObject grandParent = parent.eContainer();
		EObject greatGrandParent = grandParent.eContainer();
		
		// Always include the raw module name, including this one!
		if (parent instanceof ModType || parent instanceof Open || parent instanceof Included) {
			return true;
		}
		
		if (grandParent instanceof Def) {
			// don't export the Def's defined WITHIN an overload
			if (greatGrandParent instanceof Def && ((Def) greatGrandParent).isOverload())
				return false;
			else
				return true;
		}
		
		// General case for top level judgements
		return (
			parent instanceof CatDef || 
			parent instanceof FunDef || 
			parent instanceof DataDef || parent instanceof DataConstr ||
			parent instanceof ParDef || parent instanceof ParConstr ||
			grandParent instanceof PrintDef);
	}
	
	
}
