/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor.preferences;

import java.io.File;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.grammaticalframework.eclipse.GFPreferences;
import org.grammaticalframework.eclipse.ui.GFUiModule;
import org.grammaticalframework.eclipse.ui.internal.GFActivator;

/**
 * The Class GFPreferenceInitializer.
 */
public class GFPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFPreferenceInitializer.class);
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		
		IPreferenceStore store = GFActivator.getInstance().getPreferenceStore();
		
		// Set defaults from environment variables
		try {
//			store.setDefault(GFPreferences.GF_BIN_PATH, System.getenv("HOME") + "/.cabal/bin/gf");
			String gfpath = null;
			File file = null;
			String path = System.getenv("PATH");
			
			// Unix-type
			for (String s : path.split(":")) {
				file = new File(s+"/"+"gf");
				if (file.exists()) {
					gfpath = file.getAbsolutePath();
					break;
				}
			}
			// Windows
			if (gfpath == null)
				for (String s : path.split(";")) {
					file = new File(s+"/"+"gf.exe");
					if (file.exists()) {
						gfpath = file.getAbsolutePath();
						break;
					}
				}
			if (gfpath!=null) {
				store.setDefault(GFPreferences.GF_BIN_PATH, gfpath);
			}
		} catch (Exception e) {
			log.warn("Cannot determine path to GF runtime", e);
		}
		
//		try {
//			store.setDefault(GFPreferences.GF_LIB_PATH, System.getenv("GF_LIB_PATH"));
//		} catch (SecurityException _) {	}
		
		store.setDefault(GFPreferences.LOG_LEVEL, "INFO");
		
		// Listener for changing logging  level as needed
		store.addPropertyChangeListener(new IPropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent event) {
				if (event.getProperty().equals(GFPreferences.LOG_LEVEL)) {
					Level level = Level.toLevel(event.getNewValue().toString(), Level.INFO);
					GFUiModule.setConsoleLogLevel(level);
				}
			}
		});
	}

}
