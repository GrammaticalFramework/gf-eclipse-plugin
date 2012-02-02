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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.grammaticalframework.eclipse.GFPreferences;


/**
 * Launch Configuration Delegate
 */
public class GFLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFLaunchConfigurationDelegate.class);

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// Look here for some hints:
		// http://code.google.com/p/goclipse/source/browse/trunk/goclipse-n/src/com/googlecode/goclipse/debug/LaunchConfigurationDelegate.java?r=64
		String opt_GFPath = GFPreferences.getRuntimePath();
		String opt_WorkingDir = configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, (String)null);
		String opt_Options = configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, (String)null);
		Boolean opt_Interactive = configuration.getAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
		String opt_Files = configuration.getAttribute(IGFLaunchConfigConstants.FILENAMES, (String)null);
		if (opt_GFPath == null || opt_GFPath.trim().isEmpty()) {
			log.error("Cannot start launch: GF path not specified.");
			return;
		}
		if (opt_Files == null || opt_Files.trim().isEmpty()) {
			log.error("Cannot start launch: No filenames specified.");
			return;
		}
		ArrayList<String> command = new ArrayList<String>();
		command.add(opt_GFPath);
		if (!opt_Interactive)
			command.add("--batch");
		if (!opt_Options.trim().isEmpty()) {
			command.addAll( Arrays.asList(opt_Options.split("\\s")) );
		}
		command.addAll( Arrays.asList(opt_Files.split("\\s")) );
		
		try {
			StringBuilder sb = new StringBuilder();
	    	sb.append("Running:");
		    for (String s : command) {
		    	sb.append(" ");
		    	sb.append(s);
		    }
		    log.info(sb.toString());
		    		
			ProcessBuilder b = new ProcessBuilder(command);
			b.directory(new File(opt_WorkingDir));
			b.redirectErrorStream(true);
			Process process = b.start();
			
			// Hook up the streams
			IProcess iProcess = DebugPlugin.newProcess(launch, process, "gf");
			iProcess.getStreamsProxy().getOutputStreamMonitor().addListener(new IStreamListener() {
				public void streamAppended(String text, IStreamMonitor monitor) {
//					log.debug(text);
					GFConsoleDelegate.write(text);
				}
			});
			
			process.waitFor();
		} catch (IOException e) {
			log.error("Error running launch.", e);
		} catch (InterruptedException e) {
			log.error("Launch interrupted.", e);
		} finally {
			monitor.done();
		}
		
	}

}
