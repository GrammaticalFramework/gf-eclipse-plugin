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
	private String ident, type, qualifier, alias, file, args;
	private Integer lineFrom, lineTo;
	private Boolean isIndirect;
	
	/**
	 * Instantiates a new tag entry.
	 *
	 * @param elements The elements as extracted from the tags file, by String.split()
	 */
	public TagEntry(String line) {
		String[] elements = line.split("\t", -1);
		this.ident = elements[0];
		this.type = elements[1];
		this.isIndirect = this.type.equals("indir");
		if (this.isIndirect) {
			parseFileAndLineNumbers(elements[4]);
			this.qualifier = elements[2];
			this.alias = elements[3];
		} else {
			parseFileAndLineNumbers(elements[2]);
			this.args = elements[3];
		}
	}
	
	/**
	 * Parse the file path and line numbers (could be single (9) or range (9-18))
	 * @param s
	 */
	private void parseFileAndLineNumbers(String s) {
		int ix = s.lastIndexOf(':');
		this.file = (ix > 0) ? s.substring(0, ix) : s;
		String lineStr = s.substring(ix+1);
		int rangeIx = lineStr.indexOf('-');
		try {
			if (rangeIx > 0) {
				this.lineFrom = Integer.valueOf(lineStr.substring(0, rangeIx));
				this.lineTo = Integer.valueOf(lineStr.substring(rangeIx+1));
			} else {
				this.lineFrom = this.lineTo = Integer.valueOf(lineStr);
			}
		} catch (NumberFormatException e) {
			this.lineFrom = this.lineTo = null;
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
		userData.put("lineNo", lineFrom != null ? lineFrom.toString() : ""); // TODO Include range?
		userData.put("args", args);
		return userData;
	}
	
	public String getIdent() {
		return ident;
	}
	public String getType() {
		return type;
	}
	public String getFile() {
		return file;
	}
	public String getAlias() {
		return alias;
	}
	public String getQualifier() {
		return qualifier;
	}
	public Integer getLineNumber() {
		return lineFrom;
	}
	public Integer getLineFrom() {
		return lineFrom;
	}
	public Integer getLineTo() {
		return lineTo;
	}
	public Boolean getIsInDirect() {
		return isIndirect;
	}

	/**
	 * Returns tag in tab-delimited format (suitable for writing back to a tags file)
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(ident + "\t" + type + "\t");
		if (isIndirect) {
			sb.append(qualifier + "\t" + alias + "\t");
		}
		sb.append(file);
		if (lineFrom != null) {
			sb.append(":" + lineFrom);
			if (lineTo != null && !lineTo.equals(lineFrom)) {
				sb.append("-" + lineTo);
			}
		}
		sb.append("\t" + args);
		return sb.toString();
	}
	
	
}
