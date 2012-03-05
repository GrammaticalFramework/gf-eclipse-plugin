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
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.grammaticalframework.eclipse.GFPreferences;


/**
 * Launch Configuration Delegate
 */
public class GFLaunchConfigurationDelegate extends LaunchConfigurationDelegate {
	
	private String opt_GFPath;
	private String opt_Files;
	private String opt_WorkingDir;
	private String opt_Options;
	private boolean opt_InteractiveMode;
	private boolean opt_BatchMode;
	private boolean opt_TreebankMode;
	private String opt_TreebankFile;
	private String opt_GoldStandardFile;
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFLaunchConfigurationDelegate.class);

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 * 
	 * http://code.google.com/p/goclipse/source/browse/trunk/goclipse-n/src/com/googlecode/goclipse/debug/LaunchConfigurationDelegate.java?r=64
	 */
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		// Load arguments
		try {
			loadOptions(configuration);
		} catch (IllegalArgumentException e) {
			log.error("Cannot start launch: "+e.getMessage());
		}

		// Build process command
		ArrayList<String> command = new ArrayList<String>();
		command.add(opt_GFPath);
		if (opt_BatchMode && !opt_TreebankMode)
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
		    		
		    // Execute
			ProcessBuilder b = new ProcessBuilder(command);
			b.directory(new File(opt_WorkingDir));
			b.redirectErrorStream(true);
			Process process = b.start();
			
			// Hook up the streams
			DebugPlugin.newProcess(launch, process, "gf");
//			IProcess iProcess = DebugPlugin.newProcess(launch, process, "gf");
//			iProcess.getStreamsProxy().getOutputStreamMonitor().addListener(new IStreamListener() {
//				public void streamAppended(String text, IStreamMonitor monitor) {
////					log.debug(text);
//					GFConsoleDelegate.write(text);
//				}
//			});

			// Do treebank stuff
			if (opt_BatchMode && opt_TreebankMode) {
				runTreebankAndCompare(process);
				try {
					String dir = configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, "");
					IResource container = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(new Path(dir));
					container.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
				} catch (NullPointerException _) {
					log.warn("Couldn't refresh project after running treebank");
				}
			}

			process.waitFor();
		} catch (IOException e) {
			log.error("Error running launch.", e);
		} catch (InterruptedException e) {
			log.error("Launch interrupted.", e);
		} finally {
			monitor.done();
		}
		
	}
	
	private void runTreebankAndCompare(Process process) {
		String outFileName = opt_TreebankFile + ".out";
		String treebankCommand = String.format("rf -lines -tree -file=%s | l -table | wf -file=%s", opt_TreebankFile, outFileName);
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(process.getOutputStream())), true);
		writer.println(treebankCommand);
		writer.println("quit");
		
//		DebugPlugin.getDefault().
//		PlatformUI.getWorkbench();
		
		// TODO: Write to Treebank View
//		HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().showView(viewId);
//		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(arg0);
//		Display.getDefault().asyncExec(new Runnable() {
//			public void run() {
//				// Your code goes here
//			}
//		});
	}
	
	/**
	 * Load required options from launch configuration and perform some basic validation.
	 * The launch could still fail for different reasons!
	 * 
	 * @param configuration
	 * @throws IllegalArgumentException If any argument validation fails
	 * @throws CoreException If there is some error with retrieving the arguments
	 */
	private void loadOptions(ILaunchConfiguration configuration) throws IllegalArgumentException, CoreException {
		opt_GFPath = GFPreferences.getRuntimePath();
		if (opt_GFPath == null || opt_GFPath.trim().isEmpty()) {
			throw new IllegalArgumentException("GF path not specified");
		}
		
		opt_WorkingDir = configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, (String)null);

		opt_Files = configuration.getAttribute(IGFLaunchConfigConstants.FILENAMES, (String)null);
		if (opt_Files == null || opt_Files.trim().isEmpty()) {
			throw new IllegalArgumentException("No filenames specified");
		}
		
		opt_Options = configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, (String)null);
		
		opt_InteractiveMode = configuration.getAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
		
		opt_BatchMode = configuration.getAttribute(IGFLaunchConfigConstants.BATCH_MODE, !opt_InteractiveMode);
		
		opt_TreebankMode = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false);
		opt_TreebankFile = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, (String)null);
		opt_GoldStandardFile = configuration.getAttribute(IGFLaunchConfigConstants.GOLD_STANDARD_FILENAME, (String)null);
		if (opt_TreebankMode) {
			if (opt_TreebankFile == null || opt_TreebankFile.trim().isEmpty())  {
				throw new IllegalArgumentException("No treebank file specified");
			}
			if (opt_GoldStandardFile == null || opt_GoldStandardFile.trim().isEmpty())  {
				throw new IllegalArgumentException("No gold standard file specified");
			}
		}
	}

}
