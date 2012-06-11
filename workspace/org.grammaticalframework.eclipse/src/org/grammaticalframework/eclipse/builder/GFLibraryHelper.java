/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * For resolving GF library modules and their exported definitions.
 *
 * @author John J. Camilleri
 */
public class GFLibraryHelper {
	
	/**
	 * Is the given resource linked?
	 * @param resource
	 * @return
	 */
	public static boolean isLinkedResource(IResource resource) {
		URI uri = URI.createURI(resource.getFullPath().toString());
		return isLinkedResource(uri);
	}
	public static boolean isLinkedResource(Resource resource) {
		return isLinkedResource(resource.getURI()); 
	}
	public static boolean isLinkedResource(URI uri) {
		return uri.segment(uri.segmentCount()-2).equals(GFBuilder.EXTERNAL_FOLDER);
	}


}
