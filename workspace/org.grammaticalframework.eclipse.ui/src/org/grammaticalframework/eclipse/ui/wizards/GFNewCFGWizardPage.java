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

import java.io.File;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page for creating a new CFG
 * 
 * @author John J. Camilleri
 * 
 */
public class GFNewCFGWizardPage extends AbstractNewFileWizardPage {

	/**
	 * Fields
	 */
	private Text field_Path;
	private Text field_ModuleName;
	private Combo field_GrammarFormat;
	
	private String[] grammarFormatOptions = new String[] {
			"BNF",
			"Extended BNF",
	};

	/**
	 * The page name
	 */
	public static String getPageName() {
		return "New context-free grammar";
	}
	
	/**
	 * The page description
	 */
	public static String getPageDescription() {
		return "This wizard creates a new context-free grammar file (*.cf or *.ebnf).";
	}
		
	/**
	 * Constructor for SampleNewWizardPage.
	 *
	 * @param selection the selection
	 */
	public GFNewCFGWizardPage(ISelection selection) {
		super(getPageName(), getPageDescription(), selection);
	}

	/**
	 * {@inheritDoc}
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 5;
		
		FontData fontData = parent.getFont().getFontData()[0];
		Font fontItalic = new Font(container.getDisplay(), new FontData(fontData.getName(), fontData.getHeight(), SWT.ITALIC));
		
		// Little notice
		Label l = new Label(container, SWT.NULL);
		l.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
		l.setFont(fontItalic);
		l.setText("Note: The GF Eclipse Plugin does not feature any support for editing context-free grammars.\n" +
				"This wizard will simply create your grammar file and open in the default plain-text editor. ");
		
		// Save to
		new Label(container, SWT.NULL).setText("&Save to:");
		field_Path = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_Path.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_Path.addModifyListener(defaultModifyListener);
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse(field_Path);
			}
		});
		
		// Format (BNF or EBNF)
		new Label(container, SWT.NULL).setText("Grammar &format:");
	    field_GrammarFormat = new Combo(container, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		field_GrammarFormat.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
	    field_GrammarFormat.setItems(grammarFormatOptions);
	    field_GrammarFormat.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		field_GrammarFormat.select(0);
		
		// Module name
		new Label(container, SWT.NULL).setText("Module &name:");
		field_ModuleName = new Text(container, SWT.BORDER | SWT.SINGLE);
		field_ModuleName.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		field_ModuleName.addModifyListener(defaultModifyListener);
		field_ModuleName.setFocus();

		initialize(container);
	}
	
	/**
	 * Gets the container name.
	 *
	 * @return the container name
	 */
	protected String getField_Path() {
		return field_Path.getText().trim();
	}

	/**
	 * Gets the module name.
	 *
	 * @return the module name
	 */
	protected String getField_ModuleName() {
		return field_ModuleName.getText().trim();
	}

	/**
	 * Is the BNF option selected?
	 * @return <code>true</code> or <code>false</code>
	 */
	protected boolean isBNF() {
		return field_GrammarFormat.getSelectionIndex()==0;
	}
	
	/**
	 * Is the Extended BNF option selected?
	 * @return <code>true</code> or <code>false</code>
	 */
	protected boolean isExtendedBNF() {
		return field_GrammarFormat.getSelectionIndex()==1;
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */
	@Override
	protected void initialize(Control control) {
		Object obj = getFirstSelection();
		if (obj != null && obj instanceof IResource) {
			IContainer container;
			if (obj instanceof IContainer)
				container = (IContainer) obj;
			else
				container = ((IResource) obj).getParent();
			field_Path.setText(container.getFullPath().toString());
		}
		super.initialize(control);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getField_Path()));
		
		// Container / location
		if (getField_Path().isEmpty()) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null || (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}

		// Module name
		if (getField_ModuleName().isEmpty()) {
			updateStatus("Module name must be specified");
			return;
		}
		if (!isValidModuleName(getField_ModuleName())) {
			updateStatus("Module name is invalid (don't include extension)");
			return;
		}
		String eventualFilename = getField_ModuleName() + ".gf";
		IResource fileExists = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getField_Path() + File.separator + eventualFilename));
		if (fileExists!=null) {
			updateStatus(String.format("Module \"%s\" already exists at that location", eventualFilename));
			return;
		}

		clearStatus();
	}

}