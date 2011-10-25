package org.grammaticalframework.eclipse.launch;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.grammaticalframework.eclipse.GFPreferences;


public class GFLaunchConfigurationDelegate extends LaunchConfigurationDelegate {
	
	public static void setConsole(PrintStream ps) {
		System.setOut(ps);
		System.setErr(ps);
	}
	
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// Look here for some hints:
		// http://code.google.com/p/goclipse/source/browse/trunk/goclipse-n/src/com/googlecode/goclipse/debug/LaunchConfigurationDelegate.java?r=64
		
		IPreferencesService prefs = Platform.getPreferencesService();
		String gfPath = prefs.getString(GFPreferences.QUALIFIER, GFPreferences.GF_BIN_PATH, (String)null, null);
		String wdir = configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, (String)null);
		String options = configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, (String)null);
		String files = configuration.getAttribute(IGFLaunchConfigConstants.FILENAMES, (String)null);
		if (gfPath == null || gfPath.trim().isEmpty()) {
			System.out.println("Cannot start launch: GF path not specified.");
			return;
		}
		if (files == null || files.trim().isEmpty()) {
			System.out.println("Cannot start launch: No filenames specified.");
			return;
		}
		ArrayList<String> command = new ArrayList<String>();
		command.add(gfPath);
		command.add("--batch");
		command.addAll( Arrays.asList(options.split("\\s")) );
		command.addAll( Arrays.asList(files.split("\\s")) );
		
		try {
		    SimpleDateFormat df = new SimpleDateFormat();
			StringBuilder sb = new StringBuilder();
	    	sb.append("[");
	    	sb.append(df.format(new Date()));
	    	sb.append("] Running:");
		    for (String s : command) {
		    	sb.append(" ");
		    	sb.append(s);
		    }
		    sb.append("\n");
		    System.out.println(sb);
		    		
			ProcessBuilder b = new ProcessBuilder(command);
			b.directory(new File(wdir));
			b.redirectErrorStream(true);
			Process process = b.start();
		    
			BufferedReader processOutput = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String ls_str;
			while ((ls_str = processOutput.readLine()) != null) {
				System.out.println(ls_str);
			}
			
			processOutput.close();
			process.waitFor();
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Interrupted: " + e.getMessage());
		} finally {
			System.out.println("-----");
			monitor.done();
		}
		
	}

}
