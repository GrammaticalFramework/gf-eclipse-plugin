/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;

/**
 * For resolving GF library modules and their exported definitions.
 *
 * @author John J. Camilleri
 */
public class GFLibraryHelper {
	
	/**
	 * Put together path to local gf source file.
	 *
	 * @param context the context
	 * @param moduleName the module name
	 * @return the local source path
	 */
	private static String getLocalSourcePath(Resource context, String moduleName) {
		URI uri = context.getURI();
		return uri.trimSegments(1) + java.io.File.separator + moduleName + ".gf";
	}
	
	/**
	 * Put together path to compiled tags file in the build folder.
	 *
	 * @param context the context
	 * @param moduleName the module name
	 * @return the header path
	 */
	public static URI getTagsFile(Resource context, String moduleName) {
		String sb = GFBuilder.getTagsFile(context.getURI().lastSegment());
		URI uri = URI.createURI(sb);
		return uri.resolve(context.getURI());
	}
	
	/**
	 * Put together path to compiled gfh header in the build folder.
	 *
	 * @param context the context
	 * @param moduleName the module name
	 * @return the header path
	 */
	private static String getHeaderPath(Resource context, String moduleName) {
		StringBuilder sb = new StringBuilder();
		
		// Are we "outside" the gfbuild folder?
		if (!context.getURI().trimSegments(1).lastSegment().equals(GFBuilder.BUILD_FOLDER)) {
			sb.append(GFBuilder.BUILD_FOLDER + java.io.File.separator);
		}
		sb.append(moduleName + ".gfh");
		return sb.toString();
	}
	
	/**
	 * Check if a module exists.
	 *
	 * @param context the context
	 * @param moduleName the module name
	 * @return the module uri
	 */
	public static URI getModuleURI(Resource context, String moduleName) {
		URI uri;
		
		// First try a local file
		uri = URI.createURI( getLocalSourcePath(context, moduleName) );
		if (!EcoreUtil2.isValidUri(context, uri)) {
			// Else try a compiled file
			uri = URI.createURI( getHeaderPath(context, moduleName) );
		}
		
		// Return as absolute URL
		if (EcoreUtil2.isValidUri(context, uri)) {
			return uri.resolve(context.getURI());
		} else {
			return null;
		}
	}
	
	
	/**
	 * Gets the module resource.
	 *
	 * @param context the context
	 * @param moduleName the module name
	 * @return the module resource
	 */
	public static Resource getModuleResource(Resource context, String moduleName) {
		URI uri = getModuleURI(context, moduleName);
		try {
			return EcoreUtil2.getResource(context, uri.toString() );
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @param resource
	 * @return
	 */
	public static Boolean isLinkedResource(IResource resource) {
		URI uri = URI.createURI(resource.getFullPath().toString());
		return isLinkedResource(uri);
	}
	public static Boolean isLinkedResource(Resource resource) {
		return isLinkedResource(resource.getURI()); 
	}
	public static Boolean isLinkedResource(URI uri) {
		return uri.segment(uri.segmentCount()-2).equals(GFBuilder.EXTERNAL_FOLDER);
	}

	
//	/**
//	 * Check if a module exists.
//	 *
//	 * @param context the context
//	 * @param moduleName the module name
//	 * @return true, if successful
//	 */
//	public boolean moduleExists(Resource context, String moduleName) {
//		return (getModuleURI(context, moduleName) != null);
//	}
	

}
