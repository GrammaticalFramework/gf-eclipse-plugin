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

import org.eclipse.emf.common.util.URI;
import org.grammaticalframework.eclipse.GFException;

public class GFTagsFileException extends GFException {

	/**
	 * Auto-generated.
	 */
	private static final long serialVersionUID = -3342468398784303063L;

	public GFTagsFileException(URI tagFileURI) {
		super("Couldn't find tags file " + tagFileURI);
	}
	
	public GFTagsFileException(String message) {
		super(message);
	}

}
