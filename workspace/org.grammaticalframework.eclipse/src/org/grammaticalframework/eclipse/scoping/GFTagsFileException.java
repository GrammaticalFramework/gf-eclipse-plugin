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
