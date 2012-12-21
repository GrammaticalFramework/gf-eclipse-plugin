package org.grammaticalframework.eclipse.ui.projects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.builder.GFBuilderHelper;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

public class GFProjectPropertyPage extends PropertyPage {

	private static final String FILES_TITLE = "Select top-level modules for compilation:";

	private CheckboxTreeViewer fileViewer;

	@Inject
	private GFImages images;
	private Button expandButton;

	/**
	 * Constructor for GFProjectPropertyPage
	 */
	public GFProjectPropertyPage() {
		super();
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;

		new Label(container, SWT.NULL).setText(FILES_TITLE);
		configureFilesViewer(container);

		return container;
	}

	/**
	 * Setup the input file viewer
	 * @param parent
	 */
	private void configureFilesViewer(Composite parent) {
        WorkbenchContentProvider contentProvider = new WorkbenchContentProvider();
        ViewerFilter filter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IProject) {
					return true;//((IProject)element).equals(currentProject);
				}
				if (element instanceof IFolder) {
					IFolder folder = (IFolder) element;
					if (folder.getName().equals(GFBuilder.BUILD_FOLDER) || folder.getName().equals(GFBuilder.EXTERNAL_FOLDER))
						return false;
					else
						return true;
				}
				if (element instanceof IFile) {
					String ext = ((IFile)element).getFileExtension();
					return (ext != null && ext.equalsIgnoreCase("gf"));
				}
				return false;
			}
		};
		LabelProvider labelProvider = new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (element instanceof IProject) {
					return images.forProject();
				} else if (element instanceof IFolder) {
					return images.forFolder();
				} else if (element instanceof IFile) {
					return images.forSourceFile();
				}
				else return null;
			}
			@Override
			public String getText(Object element) {
				return ((IResource)element).getName();
			}
		};
		
		Composite c = new Composite(parent, SWT.NULL);
		c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout();
		c.setLayout(layout);
		layout.numColumns = 2;
		
        fileViewer = new CheckboxTreeViewer(c, SWT.MULTI | SWT.FULL_SELECTION | SWT.BORDER );
        fileViewer.setContentProvider(contentProvider);
        fileViewer.setFilters(new ViewerFilter[]{filter});
        fileViewer.setLabelProvider(labelProvider);
        fileViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        fileViewer.setInput(this.getElement());
        
        // Set persisted options
        IFile[] sel = GFBuilderHelper.getBuildFiles((IProject)getElement());
        fileViewer.setCheckedElements(sel);
        
        expandButton = new Button(c, SWT.PUSH);
        expandButton.setImage(images.forExpandAll());
        expandButton.setToolTipText("Expand all");
        expandButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
        expandButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				fileViewer.expandAll();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	// Uncheck elements (but only saved if we click OK)
	protected void performDefaults() {
		super.performDefaults();
		fileViewer.setCheckedElements(new Object[0]);
	}

	public boolean performOk() {
		GFBuilderHelper.setBuildFiles((IProject)getElement(), fileViewer.getCheckedElements());
		return true;
	}

}