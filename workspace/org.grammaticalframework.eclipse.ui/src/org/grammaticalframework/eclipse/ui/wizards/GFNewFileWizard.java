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
 * 
 */
public class GFNewFileWizard extends AbstractNewFileWizard {

	/**
	 * The page.
	 */
	private GFNewFileWizardPage page;

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new GFNewFileWizardPage(selection);
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
		final String fileName = page.getField_ModuleName() + ".gf";
		final String fileContents = generateFileContents();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					createFile(containerName, fileName, fileContents, monitor);
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
	 * 
	 * @return the string
	 */
	private String generateFileContents() {
		StringBuilder sb = new StringBuilder("-- Auto-generated template\n");
		sb.append(page.getField_ModuleKeywords());
		sb.append(" ");
		sb.append(page.getField_ModuleName());
		if (!page.getField_Of().isEmpty()) {
			sb.append(" of ");
			sb.append(page.getField_Of());
		}
		sb.append(" = ");
		if (!page.getField_Extends().isEmpty()) {
			sb.append(page.getField_Extends());
			sb.append(" ** ");
		}
		if (!page.getField_Instantiates().isEmpty()) {
			sb.append(page.getField_Instantiates());
			sb.append(" with\n\t");
			sb.append(page.getField_With());
			if (!page.getField_Opens().isEmpty()) {
				sb.append(" **");
			}
			sb.append("\n\t");
		}
		if (!page.getField_Opens().isEmpty()) {
			sb.append(" open ");
			sb.append(page.getField_Opens());
			sb.append(" in ");
		}
		sb.append("{\n\n");
		// if (page.getField_ModuleKeywords().equals("abstract")) {
		// sb.append("\tcat\n\n\tfun\n");
		// }
		// if (page.getField_ModuleKeywords().equals("concrete")) {
		// sb.append("\tlincat\n\n\tlin\n");
		// }
		sb.append("\n};\n");

		return sb.toString();
	}

}