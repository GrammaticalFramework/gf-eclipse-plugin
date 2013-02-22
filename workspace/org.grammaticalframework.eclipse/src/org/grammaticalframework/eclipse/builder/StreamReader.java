package org.grammaticalframework.eclipse.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Consume process output stream in a separate thread
 * 
 * @see http://www.javaworld.com/javaworld/jw-12-2000/jw-1229-traps.html?page=4
 */
public class StreamReader extends Thread {
	InputStream is;
	String type;
	ArrayList<String> lines = new ArrayList<String>();

	public StreamReader(InputStream is, String type) {
		this.is = is;
		this.type = type;
	}

	@Override
	public void run() {
		try {
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public List<String> getLines() {
		return lines;
	}
	
	public String getContents() {
		StringBuilder sb = new StringBuilder();
		for (String l : lines) {
			sb.append(l).append("\n");
		}
		return sb.toString();
	}
}