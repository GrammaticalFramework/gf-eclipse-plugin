
package org.grammaticalframework.eclipse;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GFStandaloneSetup extends GFStandaloneSetupGenerated{

	public static void doSetup() {
		new GFStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

