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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.grammaticalframework.eclipse.GFException;

/**
 * 
 */
public class GFCloneModuleWizard extends AbstractNewFileWizard {

	/**
	 * The page.
	 */
	private GFCloneModuleWizardPage page;

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new GFCloneModuleWizardPage(selection);
		addPage(page);
	}

	public boolean performFinish() {
		IFile sourceFile = page.getField_CloneFrom();
		String languageCode = page.getField_NewLanguageCode();

		final IContainer container = sourceFile.getParent();
		final String fileName;
		final String fileContents;
		try {
			String[] clone = cloneFile(sourceFile, languageCode);
			fileName = clone[0];
			fileContents = clone[1];
		} catch (GFException e) {
			page.updateStatus("Cannot clone "+sourceFile.getName());
			return false;
		}
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					createFile(container, fileName, fileContents, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		return performFinish(op);
	}
	
	private String[] cloneFile(IFile sourceFile, String newLanguage) throws GFException {
		try {
			String srcLanguage = null;
			String newModuleName = null;
			String newFileName = null;
			
			// Get renaming info from file (and determine if we can actually handle it)
			BufferedReader bin = new BufferedReader(new InputStreamReader(sourceFile.getContents()));
			String line;
			while ((line = bin.readLine())!=null) {
				Matcher matcher = Pattern.compile("\\s*(concrete|instance)\\s+(\\S+)\\s+of\\s+(\\S+).*").matcher(line);
				if (matcher.matches()) {
					String baseName = matcher.group(3);
					srcLanguage = matcher.group(2).substring(baseName.length());
					newModuleName = baseName + newLanguage;
					newFileName = newModuleName + ".gf";
					break;
				}
			}
			if (newFileName==null)
				throw new GFException("Cannot clone file "+sourceFile.getName());
			
			// Do the renaming to get the new file contents
			StringBuilder sb = new StringBuilder();
			bin = new BufferedReader(new InputStreamReader(sourceFile.getContents()));
			while ((line = bin.readLine())!=null) {
				sb.append( line.replaceAll("(\\S+)"+srcLanguage, "$1"+newLanguage).replaceAll("\".+?\"", "\"\"") );
				sb.append( "\n" );
			}
			
			// return
			return new String[]{newFileName, sb.toString()};
		} catch (IOException e) {
			throw new GFException(e);
		} catch (CoreException e) {
			throw new GFException(e);
		}
	}

}
