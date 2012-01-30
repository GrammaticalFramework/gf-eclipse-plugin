/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.launch;

/**
 * Launch Config preferences
 */
public interface IGFLaunchConfigConstants {

	/**
	 * Working directory for running GF
	 */
	public static final String WORKING_DIR = "org.grammaticalframework.eclipse.launch.config.WORKING_DIR";
	
	/**
	 * Command line flags
	 */
	public static final String OPTIONS = "org.grammaticalframework.eclipse.launch.config.OPTIONS";
	
	/**
	 * Run in interactive mode (or --batch if not)
	 */
	public static final String INTERACTIVE_MODE = "org.grammaticalframework.eclipse.launch.config.INTERACTIVE_MODE";
	
	/**
	 * Files to pass to the compiler
	 */
	public static final String FILENAMES = "org.grammaticalframework.eclipse.launch.config.FILENAMES";

}
