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
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.impl.GFFactoryImpl;

import com.google.common.base.Predicate;
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
	private static final Logger log = Logger.getLogger(GFTagBasedScope.class);

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
//	protected GFTagBasedScope(IScope parent, IResourceDescription resourceDescription, boolean ignoreCase) {
//		super(parent==null ? IScope.NULLSCOPE : parent, ignoreCase);
//		moduleName = resourceDescription.getURI().lastSegment().substring(0, resourceDescription.getURI().lastSegment().lastIndexOf('.'));
//		descriptions = new ArrayList<IEObjectDescription>();
//		for (IEObjectDescription desc : resourceDescription.getExportedObjects()) {
////			QualifiedName newName = getUnQualifiedName(desc.getQualifiedName()); // Strip off qualified bit of name (maybe)
////			descriptions.add(EObjectDescription.create(newName, desc.getEObjectOrProxy()));
//			descriptions.add(desc);
//		}
//	}
	
	/**
	 * Create a dummy Ident EObject in the resource URI, which can be trivially satisfied
	 * @param name
	 * @param uri
	 * @return
	 */
	private Ident createDummyIdentInResource(String name, URI uri) {
		Ident newIdent = GFFactoryImpl.eINSTANCE.createIdent();
		newIdent.setS(name);
		Resource r = new ResourceSetImpl().createResource(uri);
		r.getContents().add(newIdent);
		return newIdent;
	}
	
	/**
	 * Add the collection of tags to the scope. The resource descriptions are used for looking up the corresponding EObjects
	 * 
	 * @param resourceDescriptions
	 * @param tags
	 */
	public void addTags(IResourceDescriptions resourceDescriptions, URI uri, Collection<TagEntry> tags, Predicate<IEObjectDescription> filter) {
		ArrayList<TagEntry> notFound = new ArrayList<TagEntry>();
		for (TagEntry tag : tags) {
			try {
				QualifiedName trueQualifiedName = converter.toQualifiedName(tag.getTrueQualifiedName()); // qualified with ultimate module of definition
				Map<String, String> userData = tag.getProperties();
				EObject eObj;
				
				if (GFScopingHelper.isDummyURI(uri)) {
					// User does not have source, just create a dummy EObject
					eObj = createDummyIdentInResource(tag.getIdent(), uri);
				} else {
					// Try to find by using trueQualifiedName
					IResourceDescription resourceDesc = resourceDescriptions.getResourceDescription(uri);
					if (resourceDesc == null) continue;
					Iterable<IEObjectDescription> matchingEObjects1 = resourceDesc.getExportedObjects(GFPackage.Literals.IDENT, trueQualifiedName, false);
					Iterator<IEObjectDescription> iter1 = matchingEObjects1.iterator();
					if (iter1.hasNext()) {
						// TODO This just always chooses first occurance... is that bad?
						eObj = iter1.next().getEObjectOrProxy();
					} else {
						// Cannot find EObject in source even though it's in tags
						// Always trust the tags file, but this should be noted.
						eObj = createDummyIdentInResource(tag.getIdent(), uri);
						notFound.add(tag);
					}
				}
				
				// Duplicate the object description, so that we can edit the qualified name and add the user data
				QualifiedName fullyQualifiedName = converter.toQualifiedName(tag.getQualifiedName());
				IEObjectDescription eObjDesc = new EObjectDescription(fullyQualifiedName, eObj, userData);
				if (filter==null || filter.apply(eObjDesc)) {
					descriptions.add(eObjDesc);
				}

				/*
				 * Do it again for the alias, or if no alias then for the UNQUALIFIED name
				 * Technically we can do without the else block, since TagEntry#getAliasQualifiedName() will
				 * just return an unqualified name if no alias exists. But that makes for very unreadable code.
				 */
				if (tag.hasAlias() && !tag.getAlias().equals(tag.getQualifier())) {
					QualifiedName aliasQualifiedName = converter.toQualifiedName(tag.getAliasQualifiedName());
					eObjDesc = new EObjectDescription(aliasQualifiedName, eObj, userData);
					if (filter==null || filter.apply(eObjDesc)) {
						descriptions.add(eObjDesc);
					}
				} else {
					QualifiedName unQualifiedName = getUnQualifiedName(trueQualifiedName);
					eObjDesc = new EObjectDescription(unQualifiedName, eObj, userData);
					if (filter==null || filter.apply(eObjDesc)) {
						descriptions.add(eObjDesc);
					}
				}
				
			} catch (IllegalStateException _) {
				// Sometimes happens when you save during a build/validation, etc. 
			}
		}
			
		// TODO: This should not happen at the scale at which it does
		// I only commented out the warning because it was so annoying
//		if (notFound.size() > 0) {
//			StringBuilder sb = new StringBuilder(notFound.size()*8);
//			for (TagEntry t : notFound) sb.append(t.getTrueQualifiedName()).append(", ");
//			log.debug(String.format("No EObject found for %s items: %s", notFound.size(), sb.toString()));
//		}
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
