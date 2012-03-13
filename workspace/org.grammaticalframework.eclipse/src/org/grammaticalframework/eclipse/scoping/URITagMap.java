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

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;

/**
 * Map from tag file URIs to a collection of all the tags each contains
 * 
 * @author John J. Camilleri
 *
 */
public class URITagMap {
	
	private Hashtable<URI, Collection<TagEntry>> map;

	public URITagMap() {
		super();
		map = new Hashtable<URI, Collection<TagEntry>>();
	}
	
	public URITagMap(int size) {
		super();
		map = new Hashtable<URI, Collection<TagEntry>>(size);
	}
	
	public void put(URI key, Collection<TagEntry> value) {
		map.put(key, value);
	}
	
	public void putAll(Hashtable<URI, Collection<TagEntry>> values) {
		map.putAll(values);
	}
	
	public void putAll(URITagMap values) {
		map.putAll(values.getMap());
	}
	
	public Hashtable<URI, Collection<TagEntry>> getMap() {
		return map;
	}
	
	public Set<Entry<URI, Collection<TagEntry>>> entrySet() {
		return map.entrySet();
	}
	
	public Set<URI> keySet() {
		return map.keySet();
	}
	
	public Collection<TagEntry> get(URI key) {
		return map.get(key);
	}
	
	public int size() {
		return map.size();
	}
	
	public boolean containsKey(URI key) {
		return map.containsKey(key);
	}
	
	@Override
	public String toString() {
		return map.toString();
	}
}
