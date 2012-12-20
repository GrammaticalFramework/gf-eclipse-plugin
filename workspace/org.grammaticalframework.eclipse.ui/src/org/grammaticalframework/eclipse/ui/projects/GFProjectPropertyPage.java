package org.grammaticalframework.eclipse.ui.projects;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.treebank.GFTestHelper;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

public class GFProjectPropertyPage extends PropertyPage {

	private static final String FILES_TITLE = "Select top-level modules:";
	private static final String FILES_PROPERTY = "FILES";

	private TreeViewer fileViewer;

	@Inject
	private GFImages images;

	/**
	 * Constructor for GFProjectPropertyPage
	 */
	public GFProjectPropertyPage() {
		super();
	}

//	private void addSeparator(Composite parent) {
//		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
//		GridData gridData = new GridData();
//		gridData.horizontalAlignment = GridData.FILL;
//		gridData.grabExcessHorizontalSpace = true;
//		separator.setLayoutData(gridData);
//	}

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
		
        fileViewer = new TreeViewer(parent, SWT.MULTI | SWT.CHECK | SWT.NO_SCROLL);
        fileViewer.setContentProvider(contentProvider);
        fileViewer.setFilters(new ViewerFilter[]{filter});
        fileViewer.setAutoExpandLevel(TreeViewer.ALL_LEVELS);
        fileViewer.setLabelProvider(labelProvider);
//        fileViewer.getTree().setLayoutData(new GridData(200,200));
        
        // Set input
        fileViewer.setInput(this.getElement());
	}

	public String getFiles() {
		try {
			String s =
				((IResource) getElement()).getPersistentProperty(
					new QualifiedName("", FILES_PROPERTY));
			return s;
		} catch (CoreException e) {
			return "";
		}
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
		
		Composite sc1 = new Composite(container, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		sc1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		configureFilesViewer(sc1);
//		configureFilesViewer(container);

		return container;
	}

	protected void performDefaults() {
		super.performDefaults();
	}
	
	public boolean performOk() {
		// store the value in the owner text field
//		try {
//			((IResource) getElement()).setPersistentProperty(
//				new QualifiedName("", FILES_PROPERTY),
//				filesText.getText());
//		} catch (CoreException e) {
//			return false;
//		}
		return true;
	}

}