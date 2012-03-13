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
	 * User data keys
	 */
	public static String USER_DATA_KEY_IDENT = "ident";
	public static String USER_DATA_KEY_TYPE = "type";
	public static String USER_DATA_KEY_MODULENAME = "modulename";
	public static String USER_DATA_KEY_QUALIFIER = "qualifier";
	public static String USER_DATA_KEY_ALIAS = "alias";
	public static String USER_DATA_KEY_FILE = "file";
//	public static String USER_DATA_KEY_LINENO = "linenumber";
	public static String USER_DATA_KEY_ARGS = "args";
	
	/**
	 * Record fields
	 */
	private String ident, type, qualifier, alias, file, args;
	private String moduleName;
	private Integer lineFrom, lineTo;
	private Boolean isIndirect;
	
	/**
	 * Instantiates a new tag entry.
	 *
	 * @param elements The elements as extracted from the tags file, by String.split()
	 */
	public TagEntry(String line) throws GFTagsFileException {
		try {
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
				this.qualifier = this.moduleName;
				this.args = elements[3];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new GFTagsFileException("Malformed tag line: "+line);
		}
	}
	
	/**
	 * Parse the file path and line numbers (could be single (9) or range (9-18))
	 * @param s
	 */
	private void parseFileAndLineNumbers(String s) {
		int ix = s.lastIndexOf(':');
		this.file = (ix > 0) ? s.substring(0, ix) : s;
		
		try {
			int ixModName1 = this.file.lastIndexOf(java.io.File.separatorChar);
			int ixModName2 = this.file.lastIndexOf('.');
			this.moduleName = this.file.substring(ixModName1+1, ixModName2);
		} catch (Exception _) {
			this.moduleName = "";
		}
		
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
		userData.put(USER_DATA_KEY_IDENT, ident);
		userData.put(USER_DATA_KEY_TYPE, type);
		userData.put(USER_DATA_KEY_QUALIFIER, qualifier);
		userData.put(USER_DATA_KEY_ALIAS, alias);
		userData.put(USER_DATA_KEY_MODULENAME, moduleName);
		userData.put(USER_DATA_KEY_FILE, file);
//		userData.put(USER_DATA_KEY_LINENO, lineFrom != null ? lineFrom.toString() : "");
		userData.put(USER_DATA_KEY_ARGS, args);
		return userData;
	}
	
	public String getIdent() {
		return ident;
	}
	public String getType() {
		return type;
	}
	
	/**
	 * Get the tag's qualifier. Note this is not necessarily the same as the module in which the ident is actually defined;
	 * for that see getModuleName();
	 * @return qualifier
	 */
	public String getQualifier() {
		return qualifier;
	}
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	/**
	 * Get the tag's true module name, determined by the name of the file where it appears. Note this is not necessarily the same as the qualifier.
	 * @return qualifier
	 */
	public String getModuleName() {
		return moduleName;
	}
	
	/**
	 * Get the tag's alias, (applies when using the <code>open (Alias = Module)</code> syntax).
	 * @return alias
	 */
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFile() {
		return file;
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
	public Boolean getIsIndirect() {
		return isIndirect;
	}

	/**
	 * Return the qualified name as determined by the dependancy graph.
	 *  
	 * @return qualified name
	 */
	public String getQualifiedName() {
		return qualifier.isEmpty() ? ident : qualifier + "." + ident;
	}
	
	/**
	 * Return the "true" qualified name, where the qualifier is the name of
	 * the module in which that function is actually defined.
	 * 
	 * @return "true" qualified name
	 */
	public String getTrueQualifiedName() {
		return this.moduleName + "." + this.ident;
	}

	/**
	 * String representation of tag
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(moduleName + "." + ident);
		sb.append(" (Q:" + qualifier);
		if (alias != null && !alias.isEmpty())
			sb.append(", A:" + alias);
		sb.append(")");
		return sb.toString();
	}
	
}
