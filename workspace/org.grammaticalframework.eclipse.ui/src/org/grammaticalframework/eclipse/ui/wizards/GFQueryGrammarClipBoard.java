package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to represent currently selected grammar entries 
 * 
 * @author Maria Mateva
 */
public class GFQueryGrammarClipBoard {
	
	private List<String> selectedTemplates;
	private List<String> selectedQueries;
	
	public GFQueryGrammarClipBoard () {
		selectedTemplates = new ArrayList<String>();
		selectedQueries = new ArrayList<String>();		
	}
	
	public void addQuery(String query) {
		if (query != null) {
			selectedQueries.add(query);
		}
	}
	
	public void addTemplate(String template) {
		if (template != null) {
			selectedTemplates.add(template);
		}
	}

	public List<String> getSelectedTemplates() {
		return selectedTemplates;
	}

	public List<String> getSelectedQueries() {
		return selectedQueries;
	}
	
	public StringBuilder templatesToString() {
		StringBuilder sb = new StringBuilder();
		for (String template : selectedTemplates) {
			sb.append(template);
			sb.append("\n");
		}
		return sb;
	}
	
	public StringBuilder queryToString() {
		StringBuilder sb = new StringBuilder();
		for (String query : selectedTemplates) {
			sb.append(query);
			sb.append("\n");
		}
		return sb;
	}

}
