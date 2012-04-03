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

import java.util.Map;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.IProcessFactory;
import org.eclipse.debug.core.model.IProcess;

/**
 * Factory for spawning a process where the input is piped into the output.
 * @author John J. Camilleri
 *
 */
public class EchoProcessFactory implements IProcessFactory {

	public static final String ID = "org.grammaticalframework.eclipse.launch.EchoProcessFactoryID";

	@SuppressWarnings("rawtypes")
	@Override
	public IProcess newProcess(ILaunch launch, Process process, String label, Map attributes) {
		// TODO Auto-generated method stub
		return null;
	}

}
