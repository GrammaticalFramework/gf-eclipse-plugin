package org.grammaticalframework.eclipse.ui.editor.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;
import org.grammaticalframework.eclipse.GFPreferences;

public class GFLanguageRootPreferencePage extends LanguageRootPreferencePage {
	
	private static final String PAGE_DESCRIPTION = "Settings for GF development."; //$NON-NLS-1$
	
	// The "namespace" is org.grammaticalframework.eclipse.GF
	// John: Moved to org.grammaticalframework.eclipse.GFPreferences
//	public static final String GF_BIN_PATH = "runtimePath"; 
//	public static final String GF_LIB_PATH = "libraryPath"; 
//	public static final String SHOW_DEBUG = "showDebugMessages"; 

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(GFPreferences.GF_BIN_PATH, "&Runtime path:", getFieldEditorParent()));
		addField(new StringFieldEditor(GFPreferences.GF_LIB_PATH, "&Library path:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(GFPreferences.SHOW_DEBUG, "&Show debug messages", getFieldEditorParent()));
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setDescription(PAGE_DESCRIPTION);

		try {
			// Set default from environment variables
			getPreferenceStore().setDefault(GFPreferences.GF_BIN_PATH, System.getenv("HOME") + "/.cabal/bin/gf");
			getPreferenceStore().setDefault(GFPreferences.GF_LIB_PATH, System.getenv("GF_LIB_PATH"));
			getPreferenceStore().setDefault(GFPreferences.SHOW_DEBUG, true);
		} catch (Exception _) {	}
	}
	
}
