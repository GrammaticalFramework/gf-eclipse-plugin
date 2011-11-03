/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.grammaticalframework.eclipse.GFPreferences;

// TODO: Auto-generated Javadoc
/**
 * The Class GFPreferenceHelper.
 */
public class GFPreferenceHelper {

	/**
	 * Gets the string.
	 *
	 * @param prefKey the pref key
	 * @return the string
	 */
	public static String getString(String prefKey) {
		return getString(prefKey, (String)null);
	}
	
	/**
	 * Gets the string.
	 *
	 * @param prefKey the pref key
	 * @param defaultValue the default value
	 * @return the string
	 */
	public static String getString(String prefKey, String defaultValue) {
		IPreferencesService prefs = Platform.getPreferencesService();
		IScopeContext[] contexts = new IScopeContext[] { ConfigurationScope.INSTANCE }; 
		return prefs.getString(GFPreferences.QUALIFIER, prefKey, defaultValue, contexts);
	}
	
	/**
	 * Gets the boolean.
	 *
	 * @param prefKey the pref key
	 * @param defaultValue the default value
	 * @return the boolean
	 */
	public static Boolean getBoolean(String prefKey, Boolean defaultValue) {
		IPreferencesService prefs = Platform.getPreferencesService();
		IScopeContext[] contexts = new IScopeContext[] { ConfigurationScope.INSTANCE }; 
		return prefs.getBoolean(GFPreferences.QUALIFIER, prefKey, defaultValue, contexts);
	}
	
}
