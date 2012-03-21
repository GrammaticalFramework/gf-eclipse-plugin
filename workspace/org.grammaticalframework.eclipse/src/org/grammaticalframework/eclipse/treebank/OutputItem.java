/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.treebank;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.xml.type.internal.RegEx;

/**
 * A single line from a treebank output file.
 * Tries to parse the output and separate out Language and parameter values, 
 * for when using <code>l -treebank</code> and so on.
 * 
 * @author John J. Camilleri
 *
 */
public class OutputItem {
	
	private static Pattern langRegEx = Pattern.compile("^([^\\s:]+):\\s(.+)");
	private static Pattern paramRegEx = Pattern.compile("^([^\\s:]+\\s)+:(.+)");

	public OutputItem(String line) {
		this.original = line;
		
		Matcher m1 = langRegEx.matcher(line);
		if (m1.matches()) {
			this.language = m1.group(1);
			line = m1.group(2).trim();
		}
		
		Matcher m2 = paramRegEx.matcher(line);
		if (m2.matches()) {
			// TODO: need to loop as we don't know how many groups we have!
			this.params = m2.group();
			this.meat = m2.group(2).trim();
		} else {
			this.meat = line;
		}
	}

	private String original;
	
	private String meat;
	
	private String language;
	
	private List<String> parameters;
	
}
