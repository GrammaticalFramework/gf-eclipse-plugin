package org.grammaticalframework.eclipse.scoping;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.grammaticalframework.eclipse.gF.Ident;

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
	 * The name of the module this scope represents
	 */
	private final String moduleName;
	
	/**
	 * The object descriptions.
	 */
	private final ArrayList<IEObjectDescription> descriptions;
	
	/**
	 * Blank constructor
	 * 
	 * @param parent
	 * @param ignoreCase
	 */
	protected GFTagBasedScope(IScope parent, String moduleName, boolean ignoreCase) {
		super(parent==null ? IScope.NULLSCOPE : parent, ignoreCase);
		this.moduleName = moduleName;
		descriptions = new ArrayList<IEObjectDescription>();
	}
	
	/**
	 * Constructs a new scope with the given descriptions
	 * 
	 * @param parent
	 * @param ignoreCase
	 */
	protected GFTagBasedScope(IScope parent, IResourceDescription resourceDescription, boolean ignoreCase) {
		super(parent==null ? IScope.NULLSCOPE : parent, ignoreCase);
		moduleName = resourceDescription.getURI().lastSegment().substring(0, resourceDescription.getURI().lastSegment().lastIndexOf('.'));
		descriptions = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription desc : resourceDescription.getExportedObjects()) {
//			this.descriptions.add(desc);
			
			// Strip off qualified bit of name
			QualifiedName newName = desc.getQualifiedName().skipFirst(1);
			descriptions.add(EObjectDescription.create(newName, desc.getEObjectOrProxy()));
		}
	}
	
	public void addTag(Resource context, TagEntry tag) {
		QualifiedName fullyQualifiedName = converter.toQualifiedName(tag.ident);
		QualifiedName unQualifiedName = fullyQualifiedName.skipFirst(1);
		
		EObject eObject = libAgent.findEObjectInFile(context, tag.file, unQualifiedName.toString());
		if (eObject == null)
			return;
		
		Map<String, String> userData = tag.getProperties();
		IEObjectDescription eObjectDescription = new EObjectDescription(unQualifiedName, eObject, userData);
		descriptions.add(eObjectDescription);
	}
	
	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		return descriptions;
	}

	protected int localElementCount() {
		return descriptions.size();
	}

	protected String getModuleName() {
		return moduleName;
	}

}
