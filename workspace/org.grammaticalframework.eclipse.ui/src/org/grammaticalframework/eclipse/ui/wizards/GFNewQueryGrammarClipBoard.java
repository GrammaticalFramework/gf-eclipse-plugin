package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.ontotext.molto.repositoryHelper.GFTemplate;

/**
 * A class to represent currently selected grammar entries 
 * 
 * @author Maria Mateva
 */
public class GFNewQueryGrammarClipBoard {
	
	private List<GFTemplate> loadedTemplates;
	private List<String> selectedTemplates;
	
	public GFNewQueryGrammarClipBoard () {
		loadedTemplates = new LinkedList<GFTemplate>();
		selectedTemplates = new ArrayList<String>();		
	}
	
	public void addTemplates(List<GFTemplate> templates) {
		if (templates != null) {
			loadedTemplates.addAll(templates);
			System.out.println(templates.size() + "templates added");
		}
	}
	
	public void addQuery(String query) {
		if (query != null) {
			selectedTemplates.add(query);
		}
	}

	public List<GFTemplate> getLoadedTemplates() {
		return loadedTemplates;
	}

	public List<String> getSelectedQueries() {
		return selectedTemplates;
	}
	
	public StringBuilder templatesToString() {
		StringBuilder sb = new StringBuilder();
		for (GFTemplate template : loadedTemplates) {
			sb.append(template.getTextPattern());
			sb.append("\n");
		}
		return sb;
	}

}
