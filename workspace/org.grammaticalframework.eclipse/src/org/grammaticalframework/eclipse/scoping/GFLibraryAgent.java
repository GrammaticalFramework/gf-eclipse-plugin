package org.grammaticalframework.eclipse.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.grammaticalframework.eclipse.builder.GFBuilder;

/**
 * For resolving GF library modules and their exported definitions
 * 
 * @author John J. Camilleri
 *
 */
public class GFLibraryAgent {
	
	/**
	 * Put together path to local gf source file
	 * 
	 * @param context
	 * @param moduleName
	 * @return
	 */
	private String getLocalSourcePath(Resource context, String moduleName) {
		URI uri = context.getURI();
		return uri.trimSegments(1) + moduleName + ".gf";
	}
	
	/**
	 * Put together path to compiled gfh header in the build folder
	 * 
	 * @param context
	 * @param moduleName
	 * @return
	 */
	private String getHeaderPath(Resource context, String moduleName) {
		StringBuilder sb = new StringBuilder();
		URI uri = context.getURI();
		if (GFBuilder.USE_INDIVIDUAL_FOLDERS) {
			if (uri.lastSegment().endsWith(".gfh")) {
				uri = uri.trimSegments(1);
				sb.append(".." + java.io.File.separator);
				sb.append(".." + java.io.File.separator);
			}
			sb.append(GFBuilder.BUILD_FOLDER
					+ java.io.File.separator
					+ uri.lastSegment()
					+ java.io.File.separator
					+ moduleName + ".gfh");
		} else {
			sb.append(GFBuilder.BUILD_FOLDER
					+ java.io.File.separator
					+ moduleName + ".gfh");
		}
		return sb.toString();
	}
	
	/**
	 * Check if a module exists
	 * 
	 * @param context
	 * @param moduleName
	 * @return
	 */
	public URI getModuleURI(Resource context, String moduleName) {
		// First try a local file
		URI uri = URI.createURI( getLocalSourcePath(context, moduleName) );
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
	
	
	public Resource getModuleResource(Resource context, String moduleName) {
		URI uri = getModuleURI(context, moduleName);
		try {
			return EcoreUtil2.getResource(context, uri.toString() );
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * Check if a module exists
	 * 
	 * @param context
	 * @param moduleName
	 * @return
	 */
	public boolean moduleExists(Resource context, String moduleName) {
		return (getModuleURI(context, moduleName) != null);
	}
	
}
