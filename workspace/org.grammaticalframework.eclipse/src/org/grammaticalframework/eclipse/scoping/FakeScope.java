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

import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.scoping.IScope;
import org.grammaticalframework.eclipse.gF.GFFactory;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.impl.IdentImpl;

import com.google.inject.Inject;

/**
 * A fake implementation which will satisfay ANY scoping request.
 * This is returned when the tags file is non-existant and we don't want to show every single cross-referencing error.
 * 
 * TODO This doesn't work properly yet - the solution itself is a bad idea really. For now we are just keeping old tags files.
 * 
 */
@SuppressWarnings("unused")
public class FakeScope implements IScope {
	
	private IEObjectDescription ieod;

//	private IQualifiedNameConverter con = new IQualifiedNameConverter.DefaultImpl();
	
	public FakeScope(ResourceDescriptionsProvider provider, Resource resource, EClass type) {
//		String name = ((Ident)object).getS();
//		return new EObjectDescription(con.toQualifiedName(name), object, null);
		
//		IdentImpl eObject = (IdentImpl) GFFactory.eINSTANCE.createIdent();
//		ieod = new EObjectDescription(name, eObject, null);

		IResourceDescriptions ird = provider.getResourceDescriptions(resource);
		for (IEObjectDescription i : ird.getExportedObjectsByType(type)) {
			ieod = i;
			break;
		}
	}

	public FakeScope(EObject context, EReference reference) {
		
	}

	public IEObjectDescription getSingleElement(QualifiedName name) {
		return ieod;
	}

	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		return Collections.singleton(getSingleElement(name));
	}

	public IEObjectDescription getSingleElement(EObject object) {
		return ieod;
	}

	public Iterable<IEObjectDescription> getElements(EObject object) {
		return Collections.singleton(getSingleElement(object));
	}

	public Iterable<IEObjectDescription> getAllElements() {
		return Collections.singleton(ieod);
	}
	
	@Override
	public String toString() {
		return "FAKE_SCOPE";
	}

}
