package org.grammaticalframework.eclipse.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.ImportedNamesAdapter;
import org.eclipse.xtext.nodemodel.INode;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Label;
import org.grammaticalframework.eclipse.gF.impl.GFFactoryImpl;

public class GFLinkingService extends DefaultLinkingService {

	/**
	 * Delegate to the parent method, but if not links are found and the context is determined
	 * to be a projection label, then create an EObject to trivially satisfy the linking.
	 * 
	 * Also see {@link GFLinker#beforeModelLinked(EObject, IDiagnosticConsumer)}
	 */
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {

		// Delegate to parent
		List<EObject> list = super.getLinkedObjects(context, ref, node);
		
		// If no matches, and we are dealing with a projection label, then trivially satisfy
		if (list.isEmpty() && context instanceof Label) {
//			Label label = (Label)context;
			String name = node.getText();
			
			// TODO This condition is just temporary! We need to check if previous Ident is a ref to a module
			if (name.equals("s")) {
				// create the item
				Ident newIdent = GFFactoryImpl.eINSTANCE.createIdent();
				newIdent.setS(name);
				
				// add to resource
				URI uri = URI.createURI("dummy.projectionsatisfier");
				Resource r = context.eResource().getResourceSet().createResource(uri);
				r.getContents().add(newIdent);
//				context.eResource().getContents().add(newIdent);
				
				// link to it
				list = Collections.singletonList((EObject)newIdent);
//				list.add(newIdent);
			}
		}
		
		return list;
	}

}
