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
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.IStreamListener;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamMonitor;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.grammaticalframework.eclipse.GFPreferences;
import org.grammaticalframework.eclipse.treebank.GFTreebankHelper;


/**
 * Launch Configuration Delegate
 */
public class GFLaunchConfigurationDelegate extends LaunchConfigurationDelegate {
	
	private String opt_GFPath;
	private String opt_Files;
	private String opt_WorkingDir;
	private String opt_Options;
	private String opt_Commands;
	private boolean opt_InteractiveMode;
	private boolean opt_BatchMode;
	private boolean opt_TreebankMode;
	private String opt_TreebankCommandFlags;
	private String opt_TreebankFile;
	private boolean opt_MakeGoldStandard;
	private boolean opt_MakeTreebank;
	private String opt_MakeTreebankName;
	private String opt_MakeTreebankCommand;
	private boolean opt_TreebankTypeLinearize;
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFLaunchConfigurationDelegate.class);

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
		
		opt_Options = configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, "");
		opt_Commands = configuration.getAttribute(IGFLaunchConfigConstants.COMMANDS, "");
		
		opt_InteractiveMode = configuration.getAttribute(IGFLaunchConfigConstants.INTERACTIVE_MODE, false);
		
		opt_BatchMode = configuration.getAttribute(IGFLaunchConfigConstants.BATCH_MODE, !opt_InteractiveMode);
		
		opt_TreebankMode = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_MODE, false);
		opt_TreebankTypeLinearize = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_TYPE_LINEARIZE, true);
		opt_TreebankCommandFlags = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_COMMAND_FLAGS, IGFLaunchConfigConstants.DEFAULT_TREEBANK_COMMAND);
		opt_TreebankFile = configuration.getAttribute(IGFLaunchConfigConstants.TREEBANK_FILENAME, (String)null);
		if (opt_TreebankMode) {
			if (opt_TreebankFile == null || opt_TreebankFile.trim().isEmpty())  {
				throw new IllegalArgumentException("No treebank file specified");
			}
			
			opt_MakeGoldStandard = configuration.getAttribute(IGFLaunchConfigConstants.MAKE_GOLD_STANDARD, false);
		}
		
		opt_MakeTreebank = configuration.getAttribute(IGFLaunchConfigConstants.MAKE_TREEBANK, false);
		opt_MakeTreebankName = configuration.getAttribute(IGFLaunchConfigConstants.MAKE_TREEBANK_NAME, (String)null);
		opt_MakeTreebankCommand = configuration.getAttribute(IGFLaunchConfigConstants.MAKE_TREEBANK_COMMAND, (String)null);
	}

	/**
	 * {@inheritDoc}
	 * @see http://code.google.com/p/goclipse/source/browse/trunk/goclipse-n/src/com/googlecode/goclipse/debug/LaunchConfigurationDelegate.java?r=64
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
//		command.add("-q"); // Force quiet mode
//		if (opt_BatchMode && !opt_TreebankMode)
//			command.add("--batch");
		if (!opt_Options.isEmpty()) {
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
		    		
		    // Create process & execute
			ProcessBuilder b = new ProcessBuilder(command);
			b.directory(new File(opt_WorkingDir));
			b.redirectErrorStream(true);
			Process process = b.start();
//			Process process = DebugPlugin.exec(command.toArray(new String[command.size()]), new File(opt_WorkingDir));
			IProcess iProcess = DebugPlugin.newProcess(launch, process, "gf");
			setupWriter(process);
			setupWriter(iProcess);
			
			// Run any batch commands
			if (!opt_Commands.isEmpty()) {
				runCommands(writer);
			}
			
			// If nothing else, then exit
			if (opt_BatchMode && !opt_TreebankMode) {
				gfQuit();
			}
			// Do treebank stuff
			else if (opt_MakeTreebank) {
				makeTreebank(writer);
				gfQuit();
			}
			else if (opt_BatchMode && opt_TreebankMode) {
				runTreebank(writer);
				gfQuit();
			}
			// Else we are interactive; it's up to the user to exit gf!
			
			// End
			process.waitFor();
			
			// Refresh project to include new files
			try {
				String dir = configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, "");
				IResource container = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(new Path(dir));
				container.getProject().refreshLocal(IProject.DEPTH_INFINITE, monitor);
			} catch (NullPointerException _) {
				log.warn("Couldn't refresh project after running launch");
			}
			
		} catch (IOException e) {
			log.error("Error running launch.", e);
		} catch (InterruptedException e) {
			log.error("Launch interrupted.", e);
		} finally {
			monitor.done();
		}
		
	}
	
	private PrintWriter writer;
	private IStreamsProxy proxy;
	
	/**
	 * Set up the local writer
	 * @param process
	 */
	private void setupWriter(Process process) {
		writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(process.getOutputStream())), true);
	}
	
	/**
	 * Set up the local stream proxy
	 * @param process
	 */
	private void setupWriter(IProcess iProcess) {
		proxy = iProcess.getStreamsProxy();
		proxy.getOutputStreamMonitor().addListener(new IStreamListener() {
			public void streamAppended(String text, IStreamMonitor monitor) {
			}
		});
	}
	
	/**
	 * Write a command to the active process
	 * @param s
	 * @throws IOException
	 */
	private void gfCommand(String s) throws IOException {
//		writer.println(s);
		proxy.write(s + "\n");
	}
	
	/**
	 * Split the commands into lines and execute each one
	 * @param writer
	 * @throws IOException 
	 */
	private void runCommands(PrintWriter writer) throws IOException {
		String lines[] = opt_Commands.split("\\r?\\n|\\r");
		for (int i = 0; i < lines.length; i++) {
			if (!lines[i].trim().isEmpty())
				gfCommand(lines[i]);
		}
	}
	
	/**
	 * Create a treebank file, typically from a <code>gr</code> command.
	 * @param writer
	 * @throws IOException 
	 */
	private void makeTreebank(PrintWriter writer) throws IOException {
		String makeTreebankCommand = String.format("%s | wf -file=%s", opt_MakeTreebankCommand, opt_MakeTreebankName);
		gfCommand(makeTreebankCommand);
	}
	
	/**
	 * Run a linearise or parse treebank and write output to file
	 * @param writer
	 * @throws IOException 
	 */
	private void runTreebank(PrintWriter writer) throws IOException {
		String outExtension = opt_MakeGoldStandard ? GFTreebankHelper.getGoldStandardExtension(true) : GFTreebankHelper.getOutputExtension(true);
		String outFileName = opt_TreebankFile + outExtension;
		String treebankCommand;
		if (opt_TreebankTypeLinearize) {
			// Linearize
			treebankCommand = String.format("rf -lines -tree -file=%s | l %s | wf -file=%s", opt_TreebankFile, opt_TreebankCommandFlags, outFileName);
		} else {
			// Parse
			treebankCommand = String.format("rf -lines -file=%s | p %s | wf -file=%s", opt_TreebankFile, opt_TreebankCommandFlags, outFileName);
		}
		gfCommand(treebankCommand);
	}
	
	/**
	 * Quit the running GF process
	 * @throws IOException
	 */
	private void gfQuit() throws IOException {
		gfCommand("quit");
	}

}
