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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map from tag file paths to a collection of all the tags each contains
 * 
 * @author John J. Camilleri
 *
 */
public class TagMap {

	private Hashtable<String, Collection<TagEntry>> map;

	public TagMap() {
		super();
		map = new Hashtable<String, Collection<TagEntry>>();
	}
	
	/**
	 * Add a tag to this map, creating keys as necessary
	 * @param tag
	 */
	public void addTag(TagEntry tag) {
		if (!map.containsKey(tag.getFile())) {
			map.put(tag.getFile(), new ArrayList<TagEntry>());
		}
		map.get(tag.getFile()).add(tag);
	}
	
	public Set<Entry<String, Collection<TagEntry>>> entrySet() {
		return map.entrySet();
	}

	public int size() {
		return map.size();
	}
	
	
}
