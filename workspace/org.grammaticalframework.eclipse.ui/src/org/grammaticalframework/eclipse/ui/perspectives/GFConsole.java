/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.perspectives;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

/**
 * The Class GFConsole
 */
public class GFConsole {
	
	/**
	 * The console instances
	 */
	private IOConsole logConsole;
//	private IOConsole launchConsole;
	
	/**
	 * Constructor: Initialise consoles
	 */
	public GFConsole() {
		ImageDescriptor image = ImageDescriptor.createFromFile(null, "icons/gf-console.png");

		logConsole = new IOConsole("GFEP Log", image);
		logConsole.activate();
		
//		launchConsole = new IOConsole("GF Launch Output", image);
//		launchConsole.activate();
		
//		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ logConsole, launchConsole });
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ logConsole });
		
//		org.grammaticalframework.eclipse.launch.GFConsoleDelegate.init(launchConsole.getInputStream(), launchConsole.newOutputStream());
	}

	/**
	 * Gets the output stream.
	 *
	 * @return the stream
	 */
	public IOConsoleOutputStream getLogOutputStream() {
		return logConsole.newOutputStream();
	}
	
}
