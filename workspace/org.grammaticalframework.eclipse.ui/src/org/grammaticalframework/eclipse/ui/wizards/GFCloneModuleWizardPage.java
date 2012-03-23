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

import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page for cloning an existing module
 * 
 * @author John J. Camilleri
 *
 */
public class GFCloneModuleWizardPage extends AbstractNewFileWizardPage {

	/**
	 * Fields
	 */
	private Combo field_CloneFrom;
	private Text field_SourceLanguageCode;
	private Combo field_NewLanguage;
	private Text field_NewLanguageCode;
	private Button field_BlankStrings;
	
	private List<IFile> files;
	private String[] languages;
	
	/**
	 * The page name
	 */
	public static String getPageName() {
		return "Clone GF module";
	}
	
	/**
	 * The page description
	 */
	public static String getPageDescription() {
		return "This wizard clones an existing GF module for a new language.";
	}
	
	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFCloneModuleWizardPage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}

	/**
	 * {@inheritDoc}	
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 5;
		
		// Format the source files
		files = GFWizardHelper.getFileList(false); // local files, with extensions
		String[] fileNameList = new String[files.size()];
		for (int i = 0; i < files.size(); i++) {
			fileNameList[i] = files.get(i).getName();
		}

		// Source
		new Label(container, SWT.NULL).setText("Clone &from:");
		field_CloneFrom = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		field_CloneFrom.setLayoutData(new GridData(SWT.NONE, SWT.TOP, true, false, 1, 1));
		field_CloneFrom.setItems(fileNameList);
		field_CloneFrom.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				setSourceLanguageCode();
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		field_CloneFrom.select(0);
		
		// Source language code
		new Label(container, SWT.NULL).setText("Detected &source language code:");
		field_SourceLanguageCode = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_SourceLanguageCode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1));
		((GridData)field_SourceLanguageCode.getLayoutData()).widthHint = 35;
		field_SourceLanguageCode.addModifyListener(defaultModifyListener);		
		
		// Format the languages
		ArrayList<String> list = new ArrayList<String>(GFWizardHelper.ISOLanguageCodes.length);
		list.add("Choose a language or enter code directly below");
		for (String[] i : GFWizardHelper.ISOLanguageCodes) {
			list.add(String.format("%s (%s)", i[0], i[1]));
			if (i.length > 2) {
				list.add(String.format("%s (%s)", i[0], i[2]));
			}
		}
		languages = list.toArray(new String[]{});
		
		// New language dropdown
		new Label(container, SWT.NULL).setText("Select &New language:");
		field_NewLanguage = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		field_NewLanguage.setLayoutData(new GridData(SWT.NONE, SWT.TOP, true, false, 1, 1));
		field_NewLanguage.setItems(languages);
		field_NewLanguage.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				if (field_NewLanguage.getSelectionIndex()==0) {
					field_NewLanguageCode.setText("");
				} else {
					String str = field_NewLanguage.getText();
					int len = str.length();
					String code = Character.toString( str.charAt(len-4) ).toUpperCase() + str.substring(len-3, len-1) ;
					field_NewLanguageCode.setText(code);
				}
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		field_NewLanguage.select(0);

		// New language code
		new Label(container, SWT.NULL).setText("New language &code:");
		field_NewLanguageCode = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_NewLanguageCode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1));
		((GridData)field_NewLanguageCode.getLayoutData()).widthHint = 35;
		field_NewLanguageCode.addModifyListener(defaultModifyListener);
		
		// Blank out empty strings?
		new Label(container, SWT.NULL);
		field_BlankStrings = new Button(container, SWT.CHECK);
		field_BlankStrings.setText("Replace string literals with empty string");

		initialize(container);
	}
	
	/**
	 * Gets the source module.
	 *
	 * @return source module
	 */
	protected IFile getField_CloneFrom() {
		return files.get(field_CloneFrom.getSelectionIndex());
	}
	
	/**
	 * Sets the source language code from the "From" field
	 *
	 */
	protected void setSourceLanguageCode() {
		String srcFilename = getField_CloneFrom().getName();
		int ix = srcFilename.indexOf('.');
		if (srcFilename.length() > 3 && ix > -1) {
			String srcCode = srcFilename.substring(ix-3, ix);
			field_SourceLanguageCode.setText(srcCode);
		}
	}
	
	/**
	 * Gets the source language code
	 *
	 * @return source language code
	 */
	protected String getField_SourceLanguageCode() {
		return field_SourceLanguageCode.getText();
	}
	
	/**
	 * Gets the new language code
	 *
	 * @return new language code
	 */
	protected String getField_NewLanguageCode() {
		return field_NewLanguageCode.getText();
	}
	
	/**
	 * Gets the new language code
	 *
	 * @return new language code
	 */
	protected boolean getField_BlankStrings() {
		return field_BlankStrings.getSelection();
	}
	
	
	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	@Override
	protected void initialize(Control control) {
		Object obj = getFirstSelection();
		if (obj != null && obj instanceof IFile) {
			IFile file = (IFile) obj;
//			String moduleName = (file.getFileExtension()!=null) ? (file.getName().substring(0, file.getName().length()-file.getFileExtension().length()-1)) : file.getName();
			String[] items = field_CloneFrom.getItems();
			// Note: this is folder-structure blind.. just looks purely at names
			for (int i = 0; i < items.length; i++) {
				if (items[i].equals(file.getName())) {
					field_CloneFrom.select(i);
					setSourceLanguageCode();
					break;
				}
			}
		}
		super.initialize(control);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void dialogChanged() {
		if (getField_SourceLanguageCode().length()==0) {
			updateStatus("You must specify a source language code");
			return;
		}
		if (getField_NewLanguageCode().length()==0) {
			updateStatus("You must specify a new language code");
			return;
		}
		if (!getField_NewLanguageCode().matches("[a-zA-Z0-9_]+")) {
			updateStatus("Invalid language code");
			return;
		}
		
		clearStatus();
	}

}
