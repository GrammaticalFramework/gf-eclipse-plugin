package org.grammaticalframework.eclipse.launch;

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;

public class EchoProcessFactory implements IProcessFactory {

	public static final String ID = "org.grammaticalframework.eclipse.launch.EchoProcessFactoryID";

	@Override
	public IProcess newProcess(ILaunch launch, Process process, String label, Map attributes) {
		// TODO Auto-generated method stub
		return null;
	}

}
