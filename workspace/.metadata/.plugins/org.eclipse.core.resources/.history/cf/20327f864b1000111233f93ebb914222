/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.scoping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TagFileHelper {
	
//	/**
//	 * The library agent.
//	 */
//	@Inject
//	private GFLibraryAgent libAgent = new GFLibraryAgent();
	
	/**
	 * For a given file, read and parse its tag file
	 * @param fileName
	 */
	public Iterable<TagEntry> getAllTags(String sourceFilePath, String tagFilePath) {
		return getTags(sourceFilePath, tagFilePath, false);
	}
	public Iterable<TagEntry> getOwnTags(String sourceFilePath, String tagFilePath) {
		return getTags(sourceFilePath, tagFilePath, true);
	}
	
	public Iterable<TagEntry> getTags(String sourceFilePath, String tagFilePath, boolean ownOnly) {
		ArrayList<TagEntry> tags = new ArrayList<TagEntry>(); 
		try {
			File tagFile = new File(tagFilePath);
			BufferedReader reader = new BufferedReader( new FileReader(tagFile) );
			String line;
			// Add everything into our arrays
			while ((line = reader.readLine()) != null) {
				TagEntry tag = new TagEntry(line);
				if (!ownOnly || tag.getFile().equals(sourceFilePath)) {
					tags.add(tag);
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
//			log.warn("Couldn't find tags file for " + moduleName);
//			return IScope.NULLSCOPE;
		} catch (IOException e) {
//			log.warn("Problem loading tags file for " + moduleName);
//			return IScope.NULLSCOPE;
		}
		return tags;
	}
	

}
