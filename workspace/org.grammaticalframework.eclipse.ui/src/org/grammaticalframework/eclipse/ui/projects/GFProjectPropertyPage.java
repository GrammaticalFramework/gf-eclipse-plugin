package org.grammaticalframework.eclipse.ui.projects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.builder.GFBuilderHelper;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

public class GFProjectPropertyPage extends PropertyPage {

	private static final String INCLUDE_TEXT = "Build only selected top-level modules" ;
	private static final String EXCLUDE_TEXT = "Don't build selected files" ;

	private IProject project;

	private CheckboxTreeViewer fileViewer;

	@Inject
	private GFImages images;
	private Button expandButton;
	private Button selectAllButton;
	private Button deselectAllButton;
	
	private Button includeButton;
	private Button excludeButton;

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
		project = (IProject)getElement();

		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;

//		new Label(container, SWT.NULL).setText(FILES_TITLE);
		
		includeButton = new Button(container, SWT.RADIO);
		includeButton.setText(INCLUDE_TEXT);
		excludeButton = new Button(container, SWT.RADIO);
		excludeButton.setText(EXCLUDE_TEXT);
		if (GFBuilderHelper.getBuildFileInclusiveMode(project)) {
			includeButton.setSelection(true);
		} else {
			excludeButton.setSelection(true);
		}
		
		configureFilesViewer(container);

		return container;
	}

	/**
	 * Setup the input file viewer
	 * @param parent
	 */
	private void configureFilesViewer(Composite parent) {
        final WorkbenchContentProvider contentProvider = new WorkbenchContentProvider();
        ViewerFilter filter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
//				if (element instanceof IProject) {
//					return true;//((IProject)element).equals(currentProject);
//				}
				if (element instanceof IFolder) {
					IFolder folder = (IFolder) element;
					if (folder.getName().equals(GFBuilder.BUILD_FOLDER) || folder.getName().equals(GFBuilder.EXTERNAL_FOLDER))
						return false;
					else {
						// Only select if it contains GF files (recurse)
						try {
							IResource[] members = folder.members();
							for (int i = 0; i < members.length; i++) {
								if (select(viewer, folder, members[i]))
									return true;
							}
						} catch (CoreException e) {	}
						return false;
					}
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
		SelectionListener selectionListener = new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				if (e.item.getData() instanceof IFolder) {
					try {
						IResource[] kids = ((IFolder)e.item.getData()).members();
						for (int i = 0; i < kids.length; i++) {
							if (kids[i] instanceof IFile)
								fileViewer.setChecked(kids[i], true);
						}
					} catch (CoreException e1) { }
				}
			}
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		};
		
		Composite c = new Composite(parent, SWT.NULL);
		c.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		c.setLayout(new GridLayout(1, false));
		
        fileViewer = new CheckboxTreeViewer(c, SWT.MULTI | SWT.FULL_SELECTION | SWT.BORDER );
        fileViewer.setContentProvider(contentProvider);
        fileViewer.setFilters(new ViewerFilter[]{filter});
        fileViewer.setLabelProvider(labelProvider);
        fileViewer.getTree().addSelectionListener(selectionListener);
        fileViewer.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
//        fileViewer.setUseHashlookup(true);
        fileViewer.setInput(this.getElement());
        
        // Set persisted options
        IFile[] sel = GFBuilderHelper.getBuildFiles(project);
        fileViewer.setCheckedElements(sel);
        
        // Side buttons
		Composite right = new Composite(c, SWT.NULL);
		right.setLayout(new FillLayout(SWT.HORIZONTAL));
        
        expandButton = new Button(right, SWT.TOGGLE);
        expandButton.setImage(images.forExpandAll());
        expandButton.setText("Expand");
        expandButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				if (expandButton.getSelection()) {
					fileViewer.expandAll();
			        expandButton.setImage(images.forCollapseAll());
			        expandButton.setText("Collapse");
				} else {
					fileViewer.collapseAll();
			        expandButton.setImage(images.forExpandAll());
			        expandButton.setText("Expand");
				}
			}
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
        
        selectAllButton = new Button(right, SWT.PUSH);
        selectAllButton.setText("Select all");
        selectAllButton.addSelectionListener(new SelectionListener() {
			@SuppressWarnings("deprecation")
			public void widgetSelected(SelectionEvent e) {
				fileViewer.expandAll();
				fileViewer.setAllChecked(true); // f you, that's why
//				TreeItem[] treeItems = fileViewer.getTree().getItems();
//				for (int i = 0; i < treeItems.length; i++) {
//					fileViewer.setSubtreeChecked(treeItems[i], true);
//				}
			}
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
        
        deselectAllButton = new Button(right, SWT.PUSH);
        deselectAllButton.setText("Deselect all");
        deselectAllButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				fileViewer.expandAll();
				fileViewer.setCheckedElements(new Object[0]);
			}
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	// Uncheck elements (but only saved if we click OK)
	protected void performDefaults() {
		super.performDefaults();
		fileViewer.setCheckedElements(new Object[0]);
	}
	
	@SuppressWarnings("unused")
	private void invokeBuild() {
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {
					project.build(IncrementalProjectBuilder.FULL_BUILD, null);
				} catch (CoreException e) {
				}
			}
		});
	}
	
	public void performApply() {
		GFBuilderHelper.setBuildFiles(project, fileViewer.getCheckedElements());
		GFBuilderHelper.setBuildFileInclusiveMode(project, includeButton.getSelection());
	}

	public boolean performOk() {
		performApply();
//		invokeBuild();
		return true;
	}

}