package org.grammaticalframework.eclipse.linking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.impl.AbstractCleaningLinker;
import org.eclipse.xtext.linking.lazy.LazyLinker;

public class GFLinker extends LazyLinker {

	/**
	 * Clear any dynamic EObjects which were creating in 
	 * {@link GFLinkingService#getLinkedObjects(EObject, EReference, INode)}
	 */
	@Override
	protected void beforeModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
	}

}
