package org.grammaticalframework.eclipse.ui.perspectives;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class GFConsole {
	
	private static MessageConsole console = null;
	private static MessageConsoleStream stream = null;
	
	public static MessageConsole getConsole() {
		if (console == null) {
			ImageDescriptor image = ImageDescriptor.createFromFile(null, "icons/gf-console.png");
			console = new MessageConsole("GF Compiler", image);
			console.activate();
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ console });
		}
		return console;
	} 
	
	public static MessageConsoleStream getStream() {
		if (stream == null) {
			stream = getConsole().newMessageStream();
		}
		return stream;
	}
	
	public static void clear() {
		console.clearConsole();
	}

}
