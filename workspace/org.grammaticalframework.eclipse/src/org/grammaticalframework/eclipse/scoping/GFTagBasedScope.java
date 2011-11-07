package org.grammaticalframework.eclipse.scoping;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.inject.Inject;

public class GFTagBasedScope extends AbstractScope {

	/**
	 * Qualified name converter
	 */
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

	/**
	 * The library agent.
	 */
	@Inject
	private GFLibraryAgent libAgent = new GFLibraryAgent();
	

	/**
	 * The descriptions.
	 */
	private final ArrayList<IEObjectDescription> descriptions;
	
	/**
	 * Blank constructor
	 * 
	 * @param parent
	 * @param ignoreCase
	 */
	protected GFTagBasedScope(IScope parent, boolean ignoreCase) {
		super(parent, ignoreCase);
		this.descriptions = new ArrayList<IEObjectDescription>();
	}
	
	/**
	 * Constructs a new scope with the given descriptions
	 * 
	 * @param parent
	 * @param ignoreCase
	 */
	protected GFTagBasedScope(IScope parent, Iterable<IEObjectDescription> descriptions, boolean ignoreCase) {
		super(parent, ignoreCase);
		if (descriptions == null) {
			throw new IllegalArgumentException("Descriptions may not be null");
		}
		this.descriptions = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription desc : descriptions) {
//			this.descriptions.add(desc);
			
			// Strip off qualified bit of name
			QualifiedName newName = desc.getQualifiedName().skipFirst(1);
			this.descriptions.add(EObjectDescription.create(newName, desc.getEObjectOrProxy()));
		}
	}
	
//	public void addTag(Resource context, TagEntry tag) {
//		QualifiedName fullyQualifiedName = converter.toQualifiedName(tag.ident);
//		QualifiedName unQualifiedName = fullyQualifiedName.skipFirst(1);
//		
//		EObject eObject = libAgent.findEObjectInFile(context, tag.file, unQualifiedName.toString());
//		
//		Map<String, String> userData = tag.getProperties();
//		IEObjectDescription eObjectDescription = new EObjectDescription(unQualifiedName, eObject, userData);
//		descriptions.add(eObjectDescription);
//	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return descriptions;
	}

}
