/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
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
import org.grammaticalframework.eclipse.gF.CatDef;
import org.grammaticalframework.eclipse.gF.DataDef;
import org.grammaticalframework.eclipse.gF.DefDef;
import org.grammaticalframework.eclipse.gF.FunDef;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.OperDef;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParamDef;
import org.grammaticalframework.eclipse.gF.SourceModule;
import org.grammaticalframework.eclipse.scoping.GFScopingHelper;

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
		SourceModule mod = GFScopingHelper.getSourceModule(id);
		String qualifiedName = mod.getType().getName().getS() + "." + id.getS();
//		String qualifiedName = id.getS();
		return getConverter().toQualifiedName( qualifiedName );
	}
	
	/**
	 * Should the given Ident be exported to the top-level of this module?
	 *
	 * @param ident The Ident object
	 * @return true, if this Ident should be exported
	 */
	public static boolean shouldBeExported(Ident ident) {
		EObject parent = ident.eContainer();
		EObject grandParent = parent.eContainer();
//		EObject greatGrandParent = grandParent.eContainer();
		
		boolean ans = (
			// Always include "raw" module names, including this one!
			parent instanceof ModType // name of module or abstract 
			|| parent instanceof Open // name/alias of a module we're opening
			|| (parent instanceof Included && (
					grandParent instanceof ModType // interface name 
					|| grandParent instanceof ModBody // functor name 
					|| ((Included)parent).getName().equals(ident) // don't export include/exclude idents 
			))
			// General case for top level judgements
			|| parent instanceof CatDef // cat
			|| parent instanceof FunDef // fun
			|| parent instanceof DefDef // def
			|| parent instanceof DataDef // data
			|| parent instanceof ParamDef || parent instanceof ParConstr // param
//			|| (grandParent instanceof OperDef && greatGrandParent instanceof TopDef) // oper (outer)
			|| (grandParent instanceof OperDef) // oper (outer AND inner)
//			|| grandParent instanceof TermDef
		);
		return ans;
	}
	
	
}
