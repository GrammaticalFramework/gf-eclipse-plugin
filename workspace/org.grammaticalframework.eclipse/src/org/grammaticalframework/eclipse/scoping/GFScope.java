/**
 * 
 */
package org.grammaticalframework.eclipse.scoping;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author John J. Camilleri
 *
 */
public class GFScope extends AbstractScope {

	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	private final Iterable<IEObjectDescription> descriptions;
	
/*
	public static IScope createScope(IScope outer, ISelectable selectable, EClass type, boolean ignoreCase) {
		return createScope(outer, selectable, null, type, ignoreCase);
	}
	
	public static IScope createScope(IScope outer, ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		if (selectable == null || selectable.isEmpty())
			return outer;
		return new GFScope(outer, selectable, ignoreCase);
	}
*/
	
//	public GFScope(Iterable<IEObjectDescription> descriptions, boolean ignoreCase) {
//		this(IScope.NULLSCOPE, descriptions, ignoreCase);
//	}
//	public GFScope(IScope parent, Iterable<IEObjectDescription> descriptions, boolean ignoreCase) {
//		super(parent, ignoreCase);
//		if (descriptions == null)
//			throw new IllegalArgumentException("descriptions may not be null");
//		this.descriptions = descriptions;
//	}
	public GFScope(IScope parent, Iterable<IEObjectDescription> descriptions, Predicate<IEObjectDescription> filter, boolean ignoreCase, boolean ignoreModuleName) {
		super(parent, ignoreCase);
		if (descriptions == null) {
			throw new IllegalArgumentException("descriptions may not be null");
		}
		if (ignoreModuleName) {
			descriptions = Iterables.transform(descriptions, new Function<IEObjectDescription, IEObjectDescription>() {
				public IEObjectDescription apply(IEObjectDescription from) {
					QualifiedName newName = from.getQualifiedName().skipFirst(1);
					return EObjectDescription.create(newName, from.getEObjectOrProxy());
				}
			});
//		} else {
//			this.descriptions = descriptions;
		}
		
		if (filter != null)
			this.descriptions = Iterables.filter(descriptions, filter);
		else
			this.descriptions = descriptions;
	}
	
	// Overwrite qualified module names with an alias
	public GFScope(IScope parent, Iterable<IEObjectDescription> descriptions, Predicate<IEObjectDescription> filter, boolean ignoreCase, final String moduleAlias) {
		super(parent, ignoreCase);
		if (descriptions == null) {
			throw new IllegalArgumentException("descriptions may not be null");
		}
		
		// TODO I suspect the filtering here is useless, since OPEN statements never set a filter.. am I wrong?
		Iterable<IEObjectDescription> filteredDescriptions =
			(filter != null)
				? Iterables.filter(descriptions, filter)
				: descriptions;
				
		this.descriptions = Iterables.transform(filteredDescriptions, new Function<IEObjectDescription, IEObjectDescription>() {
			public IEObjectDescription apply(IEObjectDescription from) {
				QualifiedName newName = converter.toQualifiedName(moduleAlias + "." + from.getQualifiedName().getLastSegment());
				return EObjectDescription.create(newName, from.getEObjectOrProxy());
			}
		});
	}
	
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return descriptions;
	}
	
}
