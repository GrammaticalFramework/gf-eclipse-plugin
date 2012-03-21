/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.CoreException;

/**
 * Wizard for creating a new GF module
 */
public class GFNewCFGWizard extends AbstractNewFileWizard {

	/**
	 * The page.
	 */
	private GFNewCFGWizardPage page;

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new GFNewCFGWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 * 
	 * @return true, if successful
	 */
	public boolean performFinish() {
		final String containerName = page.getField_Path();
		final String fileName = page.getField_ModuleName() + (page.isExtendedBNF() ? ".ebnf" : ".cf");
		final String fileContents = generateFileContents(page.isExtendedBNF());
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					createPlainFile(containerName, fileName, fileContents, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		return performFinish(op);
	}

	/**
	 * We will initialize file contents with a sample text.
	 * @param isExtendedBNF 
	 * 
	 * @return the string
	 */
	private String generateFileContents(boolean isExtendedBNF) {
		StringBuilder sb = new StringBuilder("-- Auto-generated template\n\n");
		sb.append("S ::= Greeting Audience \"!\" ;\n");
		if (isExtendedBNF) {
			// *.ebnf
			sb.append("Greeting ::= \"Hello\" \"there\"? | \"Howdy\" ;\n");
			sb.append("Audience ::= \"world\" | (\"uni-\"|\"multi-\")? \"verse\" ;\n");
		} else {
			// *.cf
			sb.append("Greeting ::= \"Hello\" | \"Howdy\" ;\n");
			sb.append("Audience ::= \"world\" | \"multiverse\" ;\n");
		}
		return sb.toString();
	}

}