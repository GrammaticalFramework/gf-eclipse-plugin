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
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.ImportedNamesAdapter;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Label;
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

		// Delegate to parent
		List<EObject> list = super.getLinkedObjects(context, ref, node);
		
		// If no matches, and we are dealing with a projection label, then trivially satisfy
		if (list.isEmpty() && context instanceof Label) {
			
			INode prevNode = node.getParent().getPreviousSibling().getPreviousSibling();
			Ident prevIdent = null;
			CrossReference prevCrossRef = null;
			boolean isQualifiedName = false;
			search: for (INode abstractNode : prevNode.getAsTreeIterable()) {
				if (abstractNode instanceof ILeafNode && abstractNode.getGrammarElement() instanceof CrossReference) {
					prevIdent = ((Exp)abstractNode.getSemanticElement()).getRef();
					prevNode = abstractNode;
					prevCrossRef = (CrossReference) abstractNode.getGrammarElement();

					// TODO we need to know if prevCrossRef references a MODULE NAME
					
					// See if previous ident is a link to a module/alias
					List<EObject> prevLinks = getLinkedObjects(prevIdent, GFPackage.Literals.EXP__REF, prevNode);
					for (EObject eobj : prevLinks) {
						if (eobj.eClass()==null) {
							isQualifiedName = true;
							break search;
						}
					}
				}				
			}
			
			// If we are dealing with projection, then satisfy it trivially
			if (!isQualifiedName) {
				// create the item
				Ident newIdent = GFFactoryImpl.eINSTANCE.createIdent();
				newIdent.setS(node.getText());
				
				// add to resource
				Resource r = context.eResource().getResourceSet().createResource(DUMMY_RESOURCE_URI);
				r.getContents().add(newIdent);
				
				// link to it
				list = Collections.singletonList((EObject)newIdent);
			}
		}
		
		return list;
	}

}
