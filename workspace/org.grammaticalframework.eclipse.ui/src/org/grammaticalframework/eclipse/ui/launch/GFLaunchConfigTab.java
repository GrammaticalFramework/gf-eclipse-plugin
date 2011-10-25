package org.grammaticalframework.eclipse.ui.launch;

import java.io.File;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.grammaticalframework.eclipse.launch.IGFLaunchConfigConstants;

public class GFLaunchConfigTab extends AbstractLaunchConfigurationTab {

	// Local/shared UI widgets
//	private Text fGFPath;
//	public String getfGFPath() {
//		return fGFPath.getText();
//	}
	private Text fWorkingDirectory;
	public String getfWorkingDirectory() {
		return fWorkingDirectory.getText();
	}
	private Text fOptions;
	public String getfOptions() {
		return fOptions.getText();
	}
	private Text fFilenames;
	public String getfArguments() {
		return fFilenames.getText();
	}

	public void createControl(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), getHelpContextId());
		comp.setLayout(new GridLayout(2, false));
		comp.setFont(parent.getFont());
		
		FontData fontData = parent.getFont().getFontData()[0];
		Font fontItalic = new Font(comp.getDisplay(), new FontData(fontData.getName(), fontData.getHeight(), SWT.ITALIC));
		
		// GF Path
//		new Label(comp, SWT.NULL).setText("&Path to GF executable:");
//		fGFPath = new Text(comp, SWT.BORDER | SWT.SINGLE);
//		fGFPath.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
//		fGFPath.addModifyListener(new ModifyListener() {
//			public void modifyText(ModifyEvent e) {
//				dialogChanged();
//			}
//		});
//		new Label(comp, SWT.NULL);
		Label l = new Label(comp, SWT.NULL);
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		l.setFont(fontItalic);
		l.setText("Note: The GF runtime path can be set in the Eclipse Preferences dialog. ");
		
		// Working Directory
		new Label(comp, SWT.NULL).setText("&Working directory:");
		fWorkingDirectory = new Text(comp, SWT.BORDER | SWT.SINGLE);
		fWorkingDirectory.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		fWorkingDirectory.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Options
		new Label(comp, SWT.NULL).setText("&Compiler options:");
		fOptions = new Text(comp, SWT.BORDER | SWT.SINGLE);
		fOptions.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		fOptions.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		new Label(comp, SWT.NULL);
		l = new Label(comp, SWT.NULL);
		l.setFont(fontItalic);
		l.setText("--batch is always implicitly specified ");
		
		// Filenames
		new Label(comp, SWT.NULL).setText("&Source filenames:");
		fFilenames = new Text(comp, SWT.BORDER | SWT.SINGLE);
		fFilenames.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		fFilenames.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		new Label(comp, SWT.NULL);
		l = new Label(comp, SWT.NULL);
		l.setFont(fontItalic);
		l.setText("The names of the files to compile, separated by spaces ");
	}

	private void dialogChanged() {
		setDirty(true);
//		if (getfGFPath().length() == 0) {
//			updateStatus("Full path to GF binary must be specified.");
//		}
//		else if (getfArguments().length() == 0) {
		if (getfArguments().length() == 0) {
			updateStatus("A least one source filename must be specified.");
		}
		else {
			updateStatus(null);
		}
		updateLaunchConfigurationDialog();
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setContainer(null);
	}

	public void initializeFrom(ILaunchConfiguration configuration) {

//		String defaultGFPath;
//		try {
//			defaultGFPath = System.getenv("HOME") + "/.cabal/bin/gf";
//		} catch (Exception _) {
//			 defaultGFPath = "";
//		}
		String defaultOptions = "--force-recomp";
		
		// Determine default working directory
		String defaultWorkingDir;
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			File workspaceDirectory = workspace.getRoot().getLocation().toFile();
			IProject[] projects = workspace.getRoot().getProjects();
			defaultWorkingDir = workspaceDirectory.getPath() + projects[0].getFullPath();
		} catch (Exception _) {
			defaultWorkingDir = "";
		}
		
		try {
//			fGFPath.setText(configuration.getAttribute(IGFLaunchConfigConstants.GF_PATH, defaultGFPath));
			fWorkingDirectory.setText(configuration.getAttribute(IGFLaunchConfigConstants.WORKING_DIR, defaultWorkingDir));
			fOptions.setText(configuration.getAttribute(IGFLaunchConfigConstants.OPTIONS, defaultOptions));
			fFilenames.setText(configuration.getAttribute(IGFLaunchConfigConstants.FILENAMES, ""));
		} catch (CoreException e) {
//			fGFPath.setText(null);
			fWorkingDirectory.setText(null);
			fOptions.setText("--force-recomp");
			fFilenames.setText(null);
		}

	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
//		configuration.setAttribute(IGFLaunchConfigConstants.GF_PATH, getfGFPath());
		configuration.setAttribute(IGFLaunchConfigConstants.WORKING_DIR, getfWorkingDirectory());
		configuration.setAttribute(IGFLaunchConfigConstants.OPTIONS, getfOptions());
		configuration.setAttribute(IGFLaunchConfigConstants.FILENAMES, getfArguments());
		setDirty(false);
	}

	public String getName() {
		return "Main"; 
	}

//	@Inject
//	private GFImages images;
	
//	@Override
//	public Image getImage() {
//		GFImages images = new GFImages();
//		return images.logo();
//	}
}
