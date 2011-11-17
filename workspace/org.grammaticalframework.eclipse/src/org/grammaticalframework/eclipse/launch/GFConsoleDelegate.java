package org.grammaticalframework.eclipse.launch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * For allowing the UI plugin to provide its console streams to the non-UI plugin
 * 
 * CURRENTLY NOT IN USE! *
 */
public class GFConsoleDelegate {
	
	@SuppressWarnings("unused")
	private static InputStream inputStreamFromConsole;

	private static BufferedWriter consoleWriter;
	
	public static void init(InputStream inputFromConsole, OutputStream outputToConsole) {
		inputStreamFromConsole = inputFromConsole;
		consoleWriter = new BufferedWriter(new OutputStreamWriter(outputToConsole));
	}
	
	public static void write(String s) {
		try {
			consoleWriter.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
