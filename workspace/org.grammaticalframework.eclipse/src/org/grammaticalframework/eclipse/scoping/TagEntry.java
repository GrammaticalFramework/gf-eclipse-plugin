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

import org.eclipse.xtext.resource.IEObjectDescription;

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
	 * The unqualified indentifier
	 */
	private String ident;
	
	/**
	 * Judgement type, e.g. param, oper.
	 */
	private String type;
	
	/**
	 * Full qualifier of name; i.e. the name of CLOSEST module where the identifier was inherited from.
	 */
	private String qualifier;
	
	/**
	 * Aliased name for qualifier, e.g. P in (P = ParadigmsEng) 
	 */
	private String alias;
	
	/**
	 * Module where this identifier is ultimately defined.
	 */
	private String moduleName;

	/**
	 * Filesystem path to definition; could be another tags file OR the ultimate source file.
	 */
	private String file;
	
	/**
	 * Oper arguments, where applicable
	 */
	private String args;
	
	
	private Integer lineFrom, lineTo;
	
	/**
	 * Is this tag pointing to another tags file? (indirect = yes)
	 */
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
				this.args = "";
			} else {
				parseFileAndLineNumbers(elements[2]);
				this.qualifier = this.moduleName;
				this.alias = "";
				this.args = cleanTypeSignature(elements[3]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new GFTagsFileException("Malformed tag line: "+line);
		}
	}
	
	/**
	 * Construct TagEntry instance from information in an eObjectDescription
	 * @param eObjDesc
	 * @throws GFTagsFileException
	 */
	public TagEntry(IEObjectDescription eObjDesc) throws GFTagsFileException {
		this.alias = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_ALIAS);
		this.args = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_ARGS);
		this.file = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_FILE);
		this.ident = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_IDENT);
//		this.isIndirect = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_);
//		this.lineFrom = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_);
//		this.lineTo = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_);
		this.moduleName = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_MODULENAME);
		this.qualifier = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_QUALIFIER);
		this.type = eObjDesc.getUserData(TagEntry.USER_DATA_KEY_TYPE);
		
		if (this.ident == null)
			throw new GFTagsFileException("Cannot reconstruct TagEntry from IEObjectDescription");
	}
	
	/**
	 * Parse the file path and line numbers (could be single (9) or range (9-18))
	 * @param s
	 */
	private void parseFileAndLineNumbers(String s) {
		int ix = s.lastIndexOf(':');
		this.file = (ix > 0) ? s.substring(0, ix) : s;
		
		int ixModName1 = this.file.lastIndexOf(java.io.File.separatorChar);
		int ixModName2 = this.file.lastIndexOf('.');
		if (ixModName2 == -1)
			this.moduleName = "";
		else
			this.moduleName = this.file.substring(ixModName1 + 1, ixModName2);
		
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
	 * Clean up a type signature by removing lock fields
	 * @param s
	 * @return
	 */
	private String cleanTypeSignature(String s) {
		return s.replaceAll("(; )?lock_\\S+ : \\{\\}(; )?", "");
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
	public boolean hasAlias() {
		return !this.alias.isEmpty();
	}
	
	public String getArgs() {
		return this.args;
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
	 * Return the named qualified with the alias.
	 *  
	 * @return alias-qualified name
	 */
	public String getAliasQualifiedName() {
		return alias.isEmpty() ? ident : alias + "." + ident;
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
		if (!qualifier.isEmpty())
			sb.append(" (Q:" + qualifier);
		if (!alias.isEmpty())
			sb.append(", A:" + alias);
		sb.append(")");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((args == null) ? 0 : args.hashCode());
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result + ((ident == null) ? 0 : ident.hashCode());
		result = prime * result + ((lineFrom == null) ? 0 : lineFrom.hashCode());
		result = prime * result + ((lineTo == null) ? 0 : lineTo.hashCode());
		result = prime * result + ((moduleName == null) ? 0 : moduleName.hashCode());
		result = prime * result + ((qualifier == null) ? 0 : qualifier.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TagEntry other = (TagEntry) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (args == null) {
			if (other.args != null)
				return false;
		} else if (!args.equals(other.args))
			return false;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (ident == null) {
			if (other.ident != null)
				return false;
		} else if (!ident.equals(other.ident))
			return false;
		if (lineFrom == null) {
			if (other.lineFrom != null)
				return false;
		} else if (!lineFrom.equals(other.lineFrom))
			return false;
		if (lineTo == null) {
			if (other.lineTo != null)
				return false;
		} else if (!lineTo.equals(other.lineTo))
			return false;
		if (moduleName == null) {
			if (other.moduleName != null)
				return false;
		} else if (!moduleName.equals(other.moduleName))
			return false;
		if (qualifier == null) {
			if (other.qualifier != null)
				return false;
		} else if (!qualifier.equals(other.qualifier))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
}
