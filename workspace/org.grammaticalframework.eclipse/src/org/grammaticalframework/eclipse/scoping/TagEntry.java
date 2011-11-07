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

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a single "tag" entry in the GF-produced tags file, e.g.:
 * <pre>
 * {@code
 * AAdj	param-value	/.../ResEng.gf:75	Degree -> Case -> AForm
 * }
 * </pre>
 */
public class TagEntry {
	
	/**
	 * Record fields
	 */
	public String ident, type, file, args;
	public Integer lineNo;
	
	/**
	 * Instantiates a new tag entry.
	 *
	 * @param elements The elements as extracted from the tags file, by String.split()
	 */
	public TagEntry(String line) {
		String[] elements = line.split("\t");
		switch (elements.length) {
		case 4:
			this.args = elements[3];
		case 3:
			int ix = elements[2].lastIndexOf(':');
			this.file = ix > 0 ? elements[2].substring(0, ix) : elements[2];
			try {
				this.lineNo = Integer.valueOf(elements[2].substring(ix+1));
			} catch (NumberFormatException e) {
				this.lineNo = null;
			}
			this.type = elements[1];
			this.ident = elements[0];
		}
	}
	
	/**
	 * Gets the fields as a Map<String, String> for use in an IEObjectDescription
	 *
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		HashMap<String, String> userData = new HashMap<String, String>();
		userData.put("ident", ident);
		userData.put("type", type);
		userData.put("file", file);
		userData.put("lineNo", lineNo != null ? lineNo.toString() : "");
		userData.put("args", args);
		return userData;
	}
}
