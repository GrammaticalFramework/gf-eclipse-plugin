package org.grammaticalframework.eclipse.ui.editor.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.grammaticalframework.eclipse.GFPreferences;

public class GFPreferenceHelper {

	public static String getString(String prefKey) {
		return getString(prefKey, (String)null);
	}
	public static String getString(String prefKey, String defaultValue) {
		IPreferencesService prefs = Platform.getPreferencesService();
		IScopeContext[] contexts = new IScopeContext[] { ConfigurationScope.INSTANCE }; 
		return prefs.getString(GFPreferences.QUALIFIER, prefKey, defaultValue, contexts);
	}
	
	public static Boolean getBoolean(String prefKey, Boolean defaultValue) {
		IPreferencesService prefs = Platform.getPreferencesService();
		IScopeContext[] contexts = new IScopeContext[] { ConfigurationScope.INSTANCE }; 
		return prefs.getBoolean(GFPreferences.QUALIFIER, prefKey, defaultValue, contexts);
	}
	
}
