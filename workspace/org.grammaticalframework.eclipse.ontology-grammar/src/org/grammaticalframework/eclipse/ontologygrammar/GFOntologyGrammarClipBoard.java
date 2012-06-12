package org.grammaticalframework.eclipse.ontologygrammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ontotext.molto.repositoryHelper.GFTemplate;

/**
 * A class to represent currently selected grammar entries 
 * 
 * @author Maria Mateva, Ontotext AD
 */
public class GFOntologyGrammarClipBoard {
	
	private List<GFTemplate> loadedTemplates;
	private List<String> selectedTemplates;
	private Map<String, GFTemplate> loadedTemplatesMap;
	private List<String> classNames;
	
	public GFOntologyGrammarClipBoard () {
		loadedTemplates = new ArrayList<GFTemplate>();
		selectedTemplates = new ArrayList<String>();	
		loadedTemplatesMap = new HashMap<String, GFTemplate>();
		classNames = new ArrayList<String>();
	}
	
	public void addTemplates(List<GFTemplate> templates) {
		if (templates != null) {
			loadedTemplates.addAll(templates);
			for (GFTemplate template : templates) {
				if (template != null && template.getTextPattern() != null) {
					loadedTemplatesMap.put(template.getTextPattern(), template);
				}
			}
			System.out.println(templates.size() + " templates were added");
		}
	}
	
	/* QUERIES */
	public void addQuery(String query) {
		if (query != null) {
			selectedTemplates.add(query);
		}
	}
	
	public List<String> getSelectedQueries() {
		return selectedTemplates;
	}

	/* 	TEMPLATES */
	public List<GFTemplate> getLoadedTemplates() {
		return loadedTemplates;
	}
	/**
	 * @return the GFTemplate instance that corresponds to the given text pattern String
	 */
	public GFTemplate getTemplateByTextPattern(String textPattern) {
		return loadedTemplatesMap.get(textPattern);
	}
	
	public void clearTemplates() {
		loadedTemplates = new ArrayList<GFTemplate>();
	}
	
	public List<String> getTemplatesAsStrings() {
		List<String> templates = new ArrayList<String>(loadedTemplates.size());
		for (GFTemplate template: loadedTemplates) {
			templates.add(template.getTextPattern());
		}
		return templates;		
	}
	
	public StringBuilder templatesToString() {
		StringBuilder sb = new StringBuilder();
		for (GFTemplate template : loadedTemplates) {
			sb.append(template.getTextPattern());
			sb.append("\n");
		}
		return sb;
	}
	
	/* CLASSES */
	public List<String> getClassNames() {
		return classNames;
	}

	public void setClassNames(List<String> classNames) {
		this.classNames = classNames;
	}


}
