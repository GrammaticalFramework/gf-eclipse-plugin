package org.grammaticalframework.eclipse.linking;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

public class GFLinker extends LazyLinker {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFLinker.class);
	
	/**
	 * Clear any dynamic EObjects which were creating in 
	 * {@link GFLinkingService#getLinkedObjects(EObject, EReference, INode)}
	 */
	@Override
	protected void beforeModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
		Resource res = model.eResource().getResourceSet().getResource(GFLinkingService.DUMMY_RESOURCE_URI, false);
		try {
			res.delete(null);
		} catch (NullPointerException e) {
			//
		} catch (IOException e) {
			log.info("Couldn't delete dummy resource " + res.getURI().toString(), e);
		}
	}

}
