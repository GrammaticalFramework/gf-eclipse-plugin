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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.util.OnChangeEvictingCache;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.builder.GFLibraryHelper;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Global scope provider is responsible for defining what is visible from outside the current resource, for any given reference.
 * 
 */
public class GFTagBasedGlobalScopeProvider extends AbstractGlobalScopeProvider {
	
	/**
	 * The logger
	 */
	private static final Logger log = Logger.getLogger(GFTagBasedGlobalScopeProvider.class);
	
	/**
	 * URI converter
	 */
	@Inject
	private ExtensibleURIConverterImpl uriConverter; 
	
	/**
	 * Cache instance, automatically invalidated when file changes
	 */
	@Inject
	private OnChangeEvictingCache cache;
	
	/**
	 * 
	 */
	@Inject
	private Provider<LoadOnDemandResourceDescriptions> loadOnDemandDescriptions;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider#getScope(org.eclipse.emf.ecore.resource.Resource, boolean, org.eclipse.emf.ecore.EClass, com.google.common.base.Predicate)
	 */
	@Override
	protected IScope getScope(final Resource resource, final boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		return cache.get(GFTagBasedGlobalScopeProvider.class.getName(), resource, new Provider<IScope>(){
			public IScope get() {
				Map<URI, Collection<TagEntry>> uriTagMap;
				try {
//					uriTagMap = getURITagMap(resource); // cached
					uriTagMap = parseTagsFile(resource); // not cached
				} catch (GFTagsFileException e) {
					return IScope.NULLSCOPE;
				}
				
				// Build scope out of tag map
				try {
					GFTagBasedScope gfScope = null;
					IResourceDescriptions resourceDescriptions = getResourceDescriptions(resource, uriTagMap.keySet());
					for (Map.Entry<URI, Collection<TagEntry>> entry : uriTagMap.entrySet()) {
						
						// Get module name from URI
						String lastSegment = entry.getKey().lastSegment();
						int dotIx = lastSegment.lastIndexOf('.');
						String moduleName = (dotIx > 0)	? lastSegment.substring(0, dotIx) : lastSegment;
						
						// Append new scope for the current module/uri
						gfScope = new GFTagBasedScope(gfScope, moduleName, ignoreCase);
						gfScope.addTags(resourceDescriptions, entry.getValue());
					}
					
					return (gfScope == null) ? IScope.NULLSCOPE : gfScope;
				} catch (NullPointerException _) {
					return IScope.NULLSCOPE;
				}				
			}
		});
		
	}
	
	/**
	 * For a given resource, find its tags file and get a list of the all the files mentioned
	 * there, and return them as a list of unique URIs
	 * 
	 * @param resource
	 * @return
	 * @throws GFTagsFileException 
	 */
	private Hashtable<URI, Collection<TagEntry>> parseTagsFile(final Resource resource) throws GFTagsFileException {
		
		// Find the corresponding tags file & parse it (1st pass)
		URI tagFileURI = GFLibraryHelper.getTagsFile(resource);
		Predicate<TagEntry> includePredicate = new Predicate<TagEntry>() {
			// Ignore references to self, ie local scope
			public boolean apply(TagEntry tag) {
				return !tag.getFile().endsWith(resource.getURI().lastSegment());
			}
		};
		Hashtable<URI, Collection<TagEntry>> uriTagMap = parseSingleTagsFile(tagFileURI, includePredicate, null);
		
		// Iterate again to replace references to indir tags files with proper references (2nd pass)
		Hashtable<URI, Collection<TagEntry>> resolvedUriTagMap = new Hashtable<URI, Collection<TagEntry>>(uriTagMap.size());
//		Iterator<URI> uriIter = uriTagMap.keySet().iterator();
		Iterator<Entry<URI, Collection<TagEntry>>> uriIter = uriTagMap.entrySet().iterator();
		
		while(uriIter.hasNext()) {
			Entry<URI, Collection<TagEntry>> iterEntry = uriIter.next();
			URI uri = iterEntry.getKey();
			Collection<TagEntry> tagList = iterEntry.getValue();
			
			// Just remove invalid URIs
			if (!EcoreUtil2.isValidUri(resource, uri)) {
				uriIter.remove();
				log.debug("Removed invalid URI: " + uri);
			}
			// Resolve refs to other tags files and replace, but making sure to keep original qualifier & alias
			else if (uri.fileExtension().equals("gf-tags")) {
				
				// Iterate over all tags, to capture all the different qualifiers
				HashSet<String> qualifiers = new HashSet<String>();
				for (TagEntry tag : tagList) {
					qualifiers.add(tag.getQualifier());
					qualifiers.add(tag.getAlias()); // this also allows for empty aliases! i.e. when inheriting
				}
				
				Predicate<TagEntry> includePredicate2 = new Predicate<TagEntry>() {
					// Only include tags FROM the respective tags file (opposite of above)
					public boolean apply(TagEntry tag) {
						return !tag.getFile().endsWith(".gf-tags") && !tag.getType().equals("overload-type") ;
					}
				};
				Hashtable<URI, Collection<TagEntry>> newUriTagMap = parseSingleTagsFile(uri, includePredicate2, qualifiers);
				
				// Make sure to add all new refs withouth overwriting (I suspect this level of checking is no longer needed)
				for (Map.Entry<URI, Collection<TagEntry>> entry : newUriTagMap.entrySet()) {
					if (!resolvedUriTagMap.containsKey(entry.getKey()))
						resolvedUriTagMap.put(entry.getKey(), entry.getValue());
					else
						resolvedUriTagMap.get(entry.getKey()).addAll(entry.getValue());
				}
				
				// Remove original
				uriIter.remove();
			}
		}
		
		// Combine them & return
		uriTagMap.putAll(resolvedUriTagMap);
		return uriTagMap;
	}
	
	/**
	 * Parse the specified tags file, returning collections of {@link TagEntry}'s grouped by {@link URI}. 
	 * These URIs may point to other tags files, not necessarily to the original source.
	 * 
	 * @param tagFileURI The tag file to parse (using low-level file streams)
	 * @param includePredicate Predicate applied to tag returns a boolean, determining whether to include the tag or not
	 * @param customFunction Custom function for transforming each tag as required
	 * @return collections of tags grouped by URI
	 * @throws GFTagsFileException 
	 */
	private Hashtable<URI, Collection<TagEntry>> parseSingleTagsFile(URI tagFileURI, Predicate<TagEntry> includePredicate, Set<String> qualifiers)
			throws GFTagsFileException {
		
		Hashtable<String, Collection<TagEntry>> strTagMap = new Hashtable<String, Collection<TagEntry>>();
		try {
			InputStream is = uriConverter.createInputStream(tagFileURI);
			BufferedReader reader = new BufferedReader( new InputStreamReader(is) );
			String line;
			while ((line = reader.readLine()) != null) {
				TagEntry tag;
				try {
					tag = new TagEntry(line);
				} catch (GFTagsFileException e) {
					log.warn(e); // Would happen if the tags file is malformed somehow
					continue;
				}
				// Determine whether to include the tag
				if (includePredicate != null && !includePredicate.apply(tag))
					continue;
				
				// Add tag to map...
				if (qualifiers != null) {
					// Add with multiple qualifiers, as needed
					for (String q : qualifiers) {
						TagEntry tag2 = new TagEntry(line);
						tag2.setQualifier(q);
//						tag2.setAlias(""); // this is just a precaution
						addTagToTagMap(tag2, strTagMap);
					}
				} else {
					// Add tag with its "true" qualifier
					addTagToTagMap(tag, strTagMap);
				}
			}
			// Clean up
			reader.close();
			is.close();
		} catch (IOException _) {
			// Problem reading the actual file (not just a particular line)
			GFTagsFileException e = new GFTagsFileException(tagFileURI);
			log.debug(e.getMessage());
			throw e;
		}
		
		// Convert from String keys to URI keys (this is an optimisation thing)
		Hashtable<URI, Collection<TagEntry>> uriTagMap = new Hashtable<URI, Collection<TagEntry>>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String rootPath = root.getLocation().toString();
		for (Entry<String, Collection<TagEntry>> entry : strTagMap.entrySet()) {
			URI importURI;
			String uriAsStr = entry.getKey();
			
			if (uriAsStr.endsWith(".gf")) {
				if (uriAsStr.contains(rootPath)) {
					// If the URI is pointing within the workspace, convert it to a platform URI
					String trimmedURI = uriAsStr.substring(rootPath.length());
					root.getFile(new Path(uriAsStr));
					importURI = URI.createPlatformResourceURI(trimmedURI, true);
				} else {
					// Create a link to the file in the project, and use that URI
					importURI = registerExternalFile(uriAsStr, tagFileURI);
				}
			} else {
				// Just use a dumb old file:// URI
				importURI = URI.createFileURI(uriAsStr);
			}
			uriTagMap.put(importURI, entry.getValue());
		}
		return uriTagMap;
	}
	
	/**
	 * Given an external file path, create a link to it within the BUILD_FOLDER and return
	 * it as a platform/project URI.
	 * 
	 * @param externalFilePath
	 * @param tagFileURI 
	 * @return
	 */
	private URI registerExternalFile(String externalFilePath, URI tagFileURI) {
		
		// Get the corresponding project
		String workspaceStem = ResourcesPlugin.getWorkspace().getRoot().getRawLocationURI().toString() + java.io.File.separator;
		String projectName = tagFileURI.deresolve(URI.createURI(workspaceStem)).segment(0);
		IProject project = null;
		for (IProject p : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (p.getName().equals(projectName)) {
				project = p;
				break;
			}
		}
		if (project == null) {
			// We could find no matching project, just return same URI
			log.warn("Couldn't find corresponding project for: " + tagFileURI);
			return URI.createFileURI(externalFilePath);
		}
		
		try {
			if (!project.isOpen()) {
				log.info("Opening closed project '" + projectName + "'");
			    project.open(null);
			}

			// Create the folder if it doesn't exist
			IFolder extFolder = project.getFolder(GFBuilder.EXTERNAL_FOLDER);
			if (!extFolder.exists()) {
				extFolder.create(true, true, null);
			}
	
			IPath externalPath = new Path(externalFilePath);
			String localLink = GFBuilder.EXTERNAL_FOLDER + java.io.File.separator + externalPath.lastSegment();
			IFile link = project.getFile(localLink);
			
			// NOTE! Re-creating the link each time will trigger the builder!!
//			if (link.exists())
//				link.delete(true, null);
//			link.createLink(externalPath, IResource.NONE, null);
			
			if (!link.exists()) {
				// Create and make read-only
				link.createLink(externalPath, IResource.NONE, null);
				ResourceAttributes attributes = link.getResourceAttributes();
				attributes.setReadOnly(true);
				link.setResourceAttributes(attributes);
			}
			
			return URI.createURI(localLink);
		} catch (CoreException e) {
			log.warn("Couldn't link to external file " + externalFilePath);
		}
		return null;
	}
	
	
	/**
	 * Add a tag to a String->[TagEntry] dictionary, creating keys as necessary
	 * @param tag
	 * @param strTagMap
	 */
	private void addTagToTagMap(TagEntry tag, Hashtable<String, Collection<TagEntry>> strTagMap) {
		if (!strTagMap.containsKey(tag.getFile())) {
			strTagMap.put(tag.getFile(), new ArrayList<TagEntry>());
		}
		strTagMap.get(tag.getFile()).add(tag);
	}
	
	/**
	 * Gets the descriptions of resources listed in importUris
	 *
	 * @param resource the resource
	 * @param importUris the import uris
	 * @return the resource descriptions
	 */
	private IResourceDescriptions getResourceDescriptions(Resource resource, Collection<URI> importUris) {
		IResourceDescriptions result = getResourceDescriptions(resource);
		LoadOnDemandResourceDescriptions demandResourceDescriptions = loadOnDemandDescriptions.get();
		demandResourceDescriptions.initialize(result, importUris, resource);
		return demandResourceDescriptions;
	}
	
}
