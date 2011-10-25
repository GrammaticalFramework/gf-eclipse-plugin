package org.grammaticalframework.eclipse.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class GFNewProjectWizardPage extends WizardPage {

	private Text projectNameText;

	public String getProjectName() {
		return projectNameText.getText();
	}

	protected GFNewProjectWizardPage(String pageName) {
		super(pageName);
	}
	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		// Project name
		new Label(container, SWT.NULL).setText("&Project name:");
		projectNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectNameText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		projectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		setControl(container);
	}

	private void dialogChanged() {
		
//		if (false) {
//			updateStatus("Error");
//			return;
//		}

		updateStatus(null);
		
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
}
