package org.grammaticalframework.eclipse.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.Inst;
import org.grammaticalframework.eclipse.gF.Label;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.impl.GFFactoryImpl;

public class GFLinkingService extends DefaultLinkingService {
	
	/**
	 * URI to dummy resource, which is populated with EObjects to satisfy projections
	 */
	public static URI DUMMY_RESOURCE_URI = URI.createURI("dummy.projectionsatisfier");

	/**
	 * Delegate to the parent method, but if not links are found and the context is determined
	 * to be a projection label, then create an EObject to trivially satisfy the linking.
	 * 
	 * Also see {@link GFLinker#beforeModelLinked(EObject, IDiagnosticConsumer)}
	 */
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {

		// If are dealing with a projection label, then trivially satisfy
		if (isProjection(context, node)) {
			// create the item
			Ident newIdent = GFFactoryImpl.eINSTANCE.createIdent();
			newIdent.setS(node.getText());
			
			// add to resource
//			Resource r = context.eResource().getResourceSet().createResource(DUMMY_RESOURCE_URI);
//			r.getContents().add(newIdent);
			
			// link to it
			return Collections.singletonList((EObject)newIdent);
		}
		
		else {
			// Delegate to parent
			List<EObject> list = super.getLinkedObjects(context, ref, node);
			return list;
		}
	}
	
	/**
	 * Determine whether the context/node is a variable projection.
	 * @param context
	 * @param node
	 * @return
	 */
	private boolean isProjection(EObject context, INode node) {
		
		if (!(context instanceof Label)) {
			return false;
		}
		
		// Get the previous sibling before the period
		INode prevNode = node.getParent().getPreviousSibling().getPreviousSibling();
		for (INode abstractNode : prevNode.getAsTreeIterable()) {
			if (abstractNode instanceof ILeafNode && abstractNode.getGrammarElement() instanceof CrossReference) {
				
				// If previous node is something other than an expression (eg another label), 
				// then this is definitely a projection (qualified names can only have two segments)
				if (!(abstractNode.getSemanticElement() instanceof Exp)) {
					return true;
				}

				// See if previous ident is a link to a module/alias
				Ident prevIdent = ((Exp)abstractNode.getSemanticElement()).getRef();
				if (prevIdent == null) return true; // Treat as a projection
				List<EObject> prevLinks = super.getLinkedObjects(prevIdent, GFPackage.Literals.EXP__REF, abstractNode);
				for (EObject eobj : prevLinks) {
					EObject parent = eobj.eContainer();
					if (parent instanceof ModType || parent instanceof Open || parent instanceof Included || parent instanceof Inst) {
						return false;
					}
				}
			}
		}
		
		// I guess it is a projection, then
		return true;
	}

}
