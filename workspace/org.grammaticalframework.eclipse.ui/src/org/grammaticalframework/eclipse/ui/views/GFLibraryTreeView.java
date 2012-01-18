package org.grammaticalframework.eclipse.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import com.google.inject.Inject;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class GFLibraryTreeView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView";
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFLibraryTreeView.class);

	private TreeViewer viewer;
//	private DrillDownAdapter drillDownAdapter;
//	private Action action1;
//	private Action action2;
	private Action doubleClickAction;

	interface ITreeNode {
		public String getName();

		public List<ITreeNode> getChildren();

		public boolean hasChildren();

		public ITreeNode getParent();
	}

	abstract class TreeNode implements ITreeNode {
		protected ITreeNode fParent;
		protected List<ITreeNode> fChildren;
		protected String number;

		public TreeNode(ITreeNode parent) {
			fParent = parent;
		}

		public boolean hasChildren() {
			return true;
		}

		public ITreeNode getParent() {
			return fParent;
		}

		public List<ITreeNode> getChildren() {
			if (fChildren != null)
				return fChildren;

			fChildren = new ArrayList<ITreeNode>();
			createChildren(fChildren);

			return fChildren;
		}

		/* subclasses should override this method and add the child nodes */
		protected abstract void createChildren(List<ITreeNode> children);
	}

	class FolderNode extends TreeNode {
		private IFolder fFolder; /* actual data object */

		public FolderNode(IFolder folder) {
			this(null, folder);
		}

		public FolderNode(ITreeNode parent, IFolder folder) {
			super(parent);
			fFolder = folder;
		}

		public String getName() {
			return fFolder.getName();
		}

		@Override
		protected void createChildren(List<ITreeNode> children) {
			try {
				IResource[] childFiles = fFolder.members();
				for (int i = 0; i < childFiles.length; i++) {
					IResource childFile = childFiles[i];
					if (childFile instanceof IFolder)
						children.add(new FolderNode(this, (IFolder) childFile));
					else if (childFile instanceof IFile)
						children.add(new FileNode(this, (IFile) childFile));
				}
			} catch (CoreException e) {
				log.warn("Couldn't get contents of "+getName());
			}

		}
	}

	class FileNode extends TreeNode {
		private IFile fFile;

		public FileNode(ITreeNode parent, IFile file) {
			super(parent);
			this.fFile = file;
		}

		public String getName() {
			return this.fFile.getName();
		}
		public IFile getFile() {
			return this.fFile;
		}

		protected void createChildren(List<ITreeNode> children) {
			// empty
		}

		public boolean hasChildren() {
			return false;
		}
	}

	class TreeContentProvider implements ITreeContentProvider {
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof IFolder) {
				ITreeNode t = new FolderNode((IFolder)parentElement);
				return t.getChildren().toArray();
			} else {
				return null;
			}
		}

		public Object getParent(Object element) {
			return ((ITreeNode) element).getParent();
		}

		public boolean hasChildren(Object element) {
			return ((ITreeNode) element).hasChildren();
		}

		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	class TreeLabelProvider extends LabelProvider {

		@Inject
		private IImageHelper imageHelper;

		@Override
		// TODO This never seems to work :(
		public Image getImage(Object element) {
			if (imageHelper != null)
				return imageHelper.getImage("library-reference.gif");
			else
				return super.getImage(element);
		}

		@Override
		public String getText(Object element) {
			return ((ITreeNode)element).getName();
		}
		
	}

	class TreeSorter extends ViewerComparator {
//		private final ListFiles view;
//		private final ViewerComparator elementsorter = new JavaElementComparator();
//
//		private int sortcolumn;
//		private boolean reversesort;
//
//		public TreeSorter(ListFiles view) {
//			this.view = view;
//		}
//
//		void addColumn(final TreeColumn column, final int columnidx) {
//			column.addSelectionListener(new SelectionListener() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					toggleSortColumn(columnidx);
//					setSortColumnAndDirection(column,
//							isReverseSort() ? SWT.DOWN : SWT.UP);
//					view.refreshViewer();
//				}
//
//				@Override
//				public void widgetDefaultSelected(SelectionEvent e) {
//				}
//			});
//		}
//
//		void setSortColumnAndDirection(TreeColumn sortColumn, int direction) {
//			sortColumn.getParent().setSortColumn(sortColumn);
//			sortColumn.getParent().setSortDirection(direction);
//		}
//
//		public int getSortColumn() {
//			return sortcolumn;
//		}
//
//		public boolean isReverseSort() {
//			return reversesort;
//		}
//
//		public void toggleSortColumn(int column) {
//			if (sortcolumn == column) {
//				reversesort = !reversesort;
//			} else {
//				reversesort = false;
//				sortcolumn = column;
//			}
//		}
//
//		@Override
//		public int compare(Viewer viewer, Object e1, Object e2) {
//			ITreeNode node1 = (ITreeNode) e1;
//			ITreeNode node2 = (ITreeNode) e2;
//
//			int res = 0;
//
//			switch (getSortColumn()) {
//			case ListFiles.COLUMN_ELEMENT:
//				res = node1.getName().compareTo(node2.getName());
//				break;
//			case ListFiles.COLUMN_NUMBER:
//				res = (int) (node1.getChildren().size() - node2.getChildren()
//						.size());
//				break;
//			}
//
//			if (res == 0)
//				res = elementsorter.compare(viewer, e1, e2);
//			else
//				res = isReverseSort() ? -res : res;
//
//			return res;
//		}
	}
	
	// ----------------------------------------------------------------
	
	private IPartListener2 listener;

	/**
	 * The constructor.
	 */
	public GFLibraryTreeView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
//		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new TreeContentProvider());
		viewer.setLabelProvider(new TreeLabelProvider());
		// viewer.setSorter(new NameSorter());
		viewer.setComparator(new TreeSorter());
		viewer.setInput(null); // our listener below will take care of this

		// Create the help context id for the viewer's control
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(),
		// "org.grammaticalframework.eclipse.ui.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		// Add a listener which udpates the view each time the active editor is changed
		listener = new IPartListener2() {
			public void partActivated(IWorkbenchPartReference partRef) {
				try {
					IEditorPart editor = partRef.getPage().getActiveEditor();
					IEditorInput input = editor.getEditorInput();
					if (input instanceof IFileEditorInput) {
						IFile file = ((IFileEditorInput) input).getFile();
						IProject project = file.getProject();
						IFolder buildFolder = project.getFolder(GFBuilder.EXTERNAL_FOLDER);
						viewer.setInput(buildFolder);
					}
				} catch (NullPointerException e) {
					log.info("GFLibraryTreeView has nothing to show.");
				}
			}
			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}
			public void partClosed(IWorkbenchPartReference partRef) {
			}
			public void partDeactivated(IWorkbenchPartReference partRef) {
			}
			public void partOpened(IWorkbenchPartReference partRef) {
			}
			public void partHidden(IWorkbenchPartReference partRef) {
			}
			public void partVisible(IWorkbenchPartReference partRef) {
			}
			public void partInputChanged(IWorkbenchPartReference partRef) {
			}
		};
		getSite().getWorkbenchWindow().getPartService().addPartListener(listener);
		
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GFLibraryTreeView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(new Separator());
//		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
//		// Other plug-ins can contribute there actions here
//		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
//		action1 = new Action() {
//			public void run() {
//				showMessage("Action 1 executed");
//			}
//		};
//		action1.setText("Action 1");
//		action1.setToolTipText("Action 1 tooltip");
//		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
//				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//
//		action2 = new Action() {
//			public void run() {
//				showMessage("Action 2 executed");
//			}
//		};
//		action2.setText("Action 2");
//		action2.setToolTipText("Action 2 tooltip");
//		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
//				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection).getFirstElement();
				if (obj instanceof FileNode) {
					IFile file = ((FileNode)obj).getFile();
					IWorkbenchPage page = getSite().getWorkbenchWindow().getActivePage();
					try {
						IDE.openEditor(page, file);
					} catch (PartInitException e) {
						log.warn("Couldn't open "+file.getRawLocation().toOSString());
					}
				}
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void dispose() {
		super.dispose();
		getSite().getWorkbenchWindow().getPartService().removePartListener(listener);
	}
	
	
}