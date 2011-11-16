package org.grammaticalframework.eclipse.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.grammaticalframework.eclipse.gF.GFPackage;
import com.google.inject.Inject;

public class GFTagBasedScope extends AbstractScope {

	/**
	 * Qualified name converter
	 */
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

	/**
	 * The logger
	 */
	private static final Logger log = Logger.getLogger(GFTagBasedGlobalScopeProvider.class);

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
			QualifiedName newName = getUnQualifiedName(desc.getQualifiedName()); // Strip off qualified bit of name (maybe)
			descriptions.add(EObjectDescription.create(newName, desc.getEObjectOrProxy()));
		}
	}
	
	/**
	 * Add the collection of tags to the scope. The resource descriptions are used for looking up the corresponding EObjects
	 * 
	 * @param resourceDescriptions
	 * @param tags
	 */
	public void addTags(IResourceDescriptions resourceDescriptions, Collection<TagEntry> tags) {
		for (TagEntry tag : tags) {
			QualifiedName fullyQualifiedName = converter.toQualifiedName(tag.getQualifiedName());
			QualifiedName unQualifiedName = getUnQualifiedName(fullyQualifiedName);
			Map<String, String> userData = tag.getProperties();
			Iterable<IEObjectDescription> matchingEObjects = resourceDescriptions.getExportedObjects(GFPackage.Literals.IDENT, fullyQualifiedName, false);
			Iterator<IEObjectDescription> iter = matchingEObjects.iterator();
			if (iter.hasNext()) {
				// This just always chooses first occurance... is that bad?
				IEObjectDescription eObjectDescription = iter.next();
				IEObjectDescription eObjectDescription2 = new EObjectDescription(unQualifiedName, eObjectDescription.getEObjectOrProxy(), userData);
				descriptions.add(eObjectDescription2);
			} else {
				log.debug("No EObject found for " + tag.getQualifiedName());
			}
		}
	}
	

	private QualifiedName getUnQualifiedName(QualifiedName qn) {
		return qn.skipFirst(qn.getSegmentCount()-1);
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
