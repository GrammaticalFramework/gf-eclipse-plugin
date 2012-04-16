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

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.grammaticalframework.eclipse.ui.wizards.GFWizardHelper.GFModuleContentAdapter;
import org.grammaticalframework.eclipse.ui.wizards.GFWizardHelper.GFModuleContentProposalProvider;

/**
 * Abstract WizardPage which all our other wizard pages extend
 */
public abstract class AbstractNewFileWizardPage extends WizardPage {

	/**
	 * Current selection
	 */
	private ISelection selection;

	/**
	 * Gets the current selection object
	 *
	 * @return the selection
	 */
	public ISelection getSelection() {
		return selection;
	}

	/**
	 * Sets the selection.
	 *
	 * @param selection the new selection
	 */
	private void setSelection(ISelection selection) {
		this.selection = selection;
	}

	/**
	 * Creates a new wizard page with the given name, and with no title or image.
	 * 
	 * @param pageName the page name
	 */
	protected AbstractNewFileWizardPage(String pageName) {
		super(pageName);
	}

	/**
	 * Instantiates a new abstract new file wizard page.
	 *
	 * @param pageName the page name
	 * @param title the title
	 * @param titleImage the title image
	 */
	public AbstractNewFileWizardPage(String pageName, String title, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}
	
	/**
	 * Instantiates a new abstract new file wizard page.
	 *
	 * @param name the name
	 * @param description the description
	 * @param selection the selection
	 */
	public AbstractNewFileWizardPage(String name, String description, ISelection selection) {
		super(name);
		setTitle(name);
		setDescription(description);
		setSelection(selection);
	}
	
	/**
	 * Instantiates a new abstract new file wizard page with no selection.
	 *
	 * @param pageName
	 * @param pageDescription
	 */
	public AbstractNewFileWizardPage(String pageName, String pageDescription) {
		this(pageName, pageDescription, (ISelection)null);
	}

	/**
	 * General purpose listener which just calls {@link #dialogChanged()}
	 */
	protected ModifyListener defaultModifyListener = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			dialogChanged();
		}
	};
	
	/**
	 * General purpose listener which just calls {@link #dialogChanged()}
	 */
	protected SelectionListener defaultSelectionListener = new SelectionListener() {
		public void widgetSelected(SelectionEvent e) {
			dialogChanged();
		}
		public void widgetDefaultSelected(SelectionEvent e) {
			widgetSelected(e);
		}
	};
	
	/**
	 * Initialize, by setting control and setting page to incomplete.
	 * Overriders of this method should call <code>super.initialize(container)</code> at the <em>end</em> of the method.
	 *
	 * @param container the container
	 */
	protected void initialize(Control container) {
		setPageComplete(false);
		setControl(container);
	}
	
	/**
	 * Gets the first element of the selection, or <code>null</code>.
	 *
	 * @return object or <code>null</code>
	 */
	protected Object getFirstSelection() {
		ISelection selection = getSelection();
		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
//			if (ssel.size() > 1)
//				return;
			return ssel.getFirstElement();
		} else { 
			return null;
		}
	}
	
	/**
	 * Dialog changed; perform all validations, calling {@link #updateStatus(String)} or {@link #clearStatus()} as necessary.
	 */
	abstract protected void dialogChanged();

	/**
	 * Update error status.
	 *
	 * @param message the message
	 */
	protected void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	/**
	 * Clear error status.
	 *
	 */
	protected void clearStatus() {
		updateStatus(null);
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 *
	 * @param field the field
	 */
	protected void handleBrowse(Text field) {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				field.setText(((Path) result[0]).toString());
			}
		}
	}
	
	/**
	 * Proposal provider for auto-suggest
	 */
	private GFModuleContentProposalProvider proposalProvider = new GFModuleContentProposalProvider(GFWizardHelper.getModuleList(true));
	
	/**
	 * Content adapter for auto-suggest
	 */
	private TextContentAdapter contentAdapter = new GFModuleContentAdapter();
	
	/**
	 * Enable augo-suggest on a given field
	 * Ref: http://www.vogella.de/articles/EclipseRCP/article.html#fieldassist
	 *
	 * @param field the field
	 */
	protected void enableAutoSuggest(Text field) {
//		KeyStroke keystroke = null;
//		try {
//			keystroke = KeyStroke.getInstance("Ctrl+Space");
//		} catch (ParseException _) {
//		}		
//		new ContentProposalAdapter(field, contentAdapter, proposalProvider, keystroke, null);
		new ContentProposalAdapter(field, contentAdapter, proposalProvider, null, null); // always activate!

		// Create the decoration for the text UI component
		final ControlDecoration deco = new ControlDecoration(field, SWT.TOP | SWT.LEFT);
		Image image = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL).getImage();
		deco.setImage(image);
//		deco.setDescriptionText("Use Ctrl+Space to see possible values");
		deco.setDescriptionText("Auto-suggest enabled");
	}
	
	/**
	 * Regular expression which describes a valid module name
	 */
	protected static String REGEX_MODULE_NAME = "[a-zA-Z_][a-zA-Z0-9_']*";
	
	/**
	 * Determine if a string is a valid module name (excluding file extension).
	 * Uses {@link #REGEX_MODULE_NAME}.
	 * @param s
	 * @return true if valid, false otherwise
	 */
	protected boolean isValidModuleName(String s) {
		return s.matches(REGEX_MODULE_NAME);
	}
	
	protected void makeItalic(Label label) {
		FontData fontData = label.getFont().getFontData()[0];
		Font fontItalic = new Font(label.getDisplay(), new FontData(fontData.getName(), fontData.getHeight(), SWT.ITALIC));
		label.setFont(fontItalic);
	}
}
