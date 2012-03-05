/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.views;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.part.ViewPart;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.launch.GFTreebankLaunchShortcut;

import com.google.inject.Inject;

public class GFTreebankManagerView extends ViewPart {
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.grammaticalframework.eclipse.ui.views.GFTreebankManagerView";
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFTreebankManagerView.class);
	
	@Inject
	private GFImages images;
	
	// Actions
	private Action runAction;
	private Action makeGoldStandardAction;

	private Action compareAction;
	
	// Widgets
	private Label statusLabel;
	private Label passedLabel;
	private Label failedLabel;
	private TreeViewer fileViewer;
	private TableViewer outputViewer;
	
	// Getters & setters for widgets
	public String getStatusText() {
		return statusLabel.getText();
	}

	public void setStatusText(String statusLabel) {
		this.statusLabel.setText(statusLabel);
	}

	public String getPassedText() {
		return passedLabel.getText();
	}

	public void setPassedText(String passedLabel) {
		this.passedLabel.setText(passedLabel);
	}

	public String getFailedText() {
		return failedLabel.getText();
	}

	public void setFailedText(String failedLabel) {
		this.failedLabel.setText(failedLabel);
	}

	public TreeViewer getFileViewer() {
		return fileViewer;
	}

	public void setFileViewer(TreeViewer fileViewer) {
		this.fileViewer = fileViewer;
	}

	public TableViewer getOutputViewer() {
		return outputViewer;
	}

	public void setOutputViewer(TableViewer outputViewer) {
		this.outputViewer = outputViewer;
	}

	private IPartListener2 listener;
	
	private IProject currentProject;

	/**
	 * Create the layout and put all the widgets in their places
	 */
	public void createPartControl(Composite parent) {
		// Overall layout
		GridLayout layout = new GridLayout(1, true);
		parent.setLayout(layout);
		
		// Top bar with buttons & stats
		Composite bar = new Composite(parent, SWT.NONE);
		bar.setLayout(new FillLayout(SWT.HORIZONTAL));

		new Label(bar, SWT.RIGHT).setText("Status: ");
		statusLabel = new Label(bar, SWT.LEFT);
		statusLabel.setText("Idle");
		
		new Label(bar, SWT.RIGHT).setText("Passed: ");
		passedLabel = new Label(bar, SWT.LEFT);
		passedLabel.setText("-");
		
		new Label(bar, SWT.RIGHT).setText("Failed: ");
		failedLabel = new Label(bar, SWT.LEFT);
		failedLabel.setText("-");
		
		// Bottom section with tableviews
        SashForm sash = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);
        sash.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        configureFilesViewer(sash);
        configureOutputViewer(sash);
        sash.setWeights(new int[]{1,2});

		// Actions and menus
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		addEditorListener();
    }
	
	/**
	 * Setup the treebank file viewer
	 * @param parent
	 */
	private void configureFilesViewer(Composite parent) {
        WorkbenchContentProvider contentProvider = new WorkbenchContentProvider();
        ViewerFilter filter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IProject) {
					return ((IProject)element).equals(currentProject);
				}
//				if (element instanceof IFolder) {
//					return true;
//				}
				if (element instanceof IFile) {
					return GFTreebankManagerHelper.isTreebankFile((IFile)element);
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
					if (GFTreebankManagerHelper.hasGoldStandardFile((IFile)element))
						return images.forTreebankItemWithGoldStandard();
					else
						return images.forTreebankItem();
				}
				else return null;
			}
			@Override
			public String getText(Object element) {
				return ((IResource)element).getName();
			}
		};
		
        fileViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
        fileViewer.setContentProvider(contentProvider);
        fileViewer.setFilters(new ViewerFilter[]{filter});
        fileViewer.setAutoExpandLevel(TreeViewer.ALL_LEVELS);
        fileViewer.setLabelProvider(labelProvider);
//		treeFilesViewer.setSorter(new NameSorter());
//		treeFilesViewer.setComparator(sorter);
        fileViewer.setInput(null); // our listener below will take care of this
	}
	
	/**
	 * Setup the output viewer
	 * @param parent
	 */
	private void configureOutputViewer(Composite parent) {
        outputViewer = new TableViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
//        outputViewer.setLabelProvider(new LabelProvider() {
//			@Override
//			public Image getImage(Object element) {
//				if (((String)element).contains("\n"))
//					return images.forTreebankFail();
//				else
//					return images.forTreebankPass();
//			}
//        });
        TableViewerColumn col = new TableViewerColumn(outputViewer, SWT.BORDER);
        col.getColumn().setWidth(200);
        col.getColumn().setText("Output");
        col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (((String)element).contains("\n"))
					return images.forTreebankFail();
				else
					return images.forTreebankPass();
			}
        });
        
        // one column: icon shows result; tree, lin and gold are on separate lines as same entry.
	}
	
	/**
	 * Add listnere to the fiel editor so that we can swap project depending on the currently
	 * active file.
	 */
	private void addEditorListener() {
		listener = new IPartListener2() {
			public void partActivated(IWorkbenchPartReference partRef) {
				try {
					IEditorPart editor = partRef.getPage().getActiveEditor();
					IEditorInput input = editor.getEditorInput();
					if (input instanceof IFileEditorInput) {
						IFile file = ((IFileEditorInput) input).getFile();
						currentProject = file.getProject();
						fileViewer.setInput(currentProject.getParent());
					}
				} catch (NullPointerException e) {
					fileViewer.setInput(null);
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
	
	/**
	 * Remove said listener
	 */
	private void removeEditorListener() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(listener);
	}
	
	/**
	 * Get the currently selected file from the tree files viewer
	 * @return the selected file, or <code>null</code> if nothing is selected (or some other error occurs).
	 */
	private IFile getSelectedFile() {
		IStructuredSelection selection = (IStructuredSelection)fileViewer.getSelection();
		if (selection.isEmpty()) {
			return null;
		}
		try {
			return (IFile)selection.getFirstElement();
		} catch (Exception _) {
			return null;
		}
	}
	
	/**
	 * Get the currently selected file from the tree files viewer, only if it is a treebank file
	 * @return the selected file, or <code>null</code> if nothing is selected (or some other error occurs).
	 */
	private IFile getSelectedTreebankFile() {
		IFile file = getSelectedFile();
		return (file != null && GFTreebankManagerHelper.isTreebankFile(file)) ? file : null;
	}
	
	/**
	 * Create all the actions with their run() methods
	 */
	private void makeActions() {
		// Run a single treebank
		runAction = new Action() {
			private IFile treebankFile;
			private IFile goldStandardFile;
			@Override
			public void run() {
				// See what's selected in our viewer and validate
				if ((treebankFile = getSelectedTreebankFile()) == null)
					return;
				goldStandardFile = GFTreebankManagerHelper.getGoldStandardFile(treebankFile);
				if (goldStandardFile == null) {
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					String title = "Error running treebank";
					String message = String.format("Found no corresponding gold standard for %s", treebankFile.getName());
					MessageDialog.openInformation(shell, title, message);
					log.info(message);
					return;
				}
				// Launch
				GFTreebankLaunchShortcut launchShortcut = new GFTreebankLaunchShortcut();
				launchShortcut.launch(fileViewer.getSelection(), ILaunchManager.RUN_MODE);
			}
		};
		runAction.setText("Run treebank");
		
		// Create a gold standard file from a treebank
		makeGoldStandardAction = new Action() {
			@Override
			public void run() {
				// TODO
				statusLabel.setText("Making gold standard");
			}
		};
		makeGoldStandardAction.setText("Make gold standard");
//		makeGoldStandardAction.setImageDescriptor(ImageDescriptor.createFromImage(images.getImage("treebank-new.png")));
		
		// Compare output with gold standard 
		compareAction = new Action() {
			@Override
			public void run() {
				IFile treebankFile = getSelectedTreebankFile();
				if (treebankFile == null)
					return;
				IFile outputFile = GFTreebankManagerHelper.getOutputFile(treebankFile);
				IFile goldStandardFile = GFTreebankManagerHelper.getGoldStandardFile(treebankFile);
				GFTreebankManagerHelper.compareOutputWithGoldStandard(outputFile, goldStandardFile, GFTreebankManagerView.this);
			}
		};
		compareAction.setText("Compare output with gold standard");
	}	

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GFTreebankManagerView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(fileViewer.getControl());
		fileViewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, treeFilesViewer);
	}

	private void hookDoubleClickAction() {
		fileViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				runAction.run();
			}
		});
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
	}

	private void fillContextMenu(IMenuManager manager) {
		IFile treebankFile = getSelectedTreebankFile();
		if (treebankFile == null)
			return;
		if (GFTreebankManagerHelper.hasGoldStandardFile(treebankFile)) {
			manager.add(runAction);
			if (GFTreebankManagerHelper.hasOutputFile(treebankFile)) {
				manager.add(compareAction);
			}
		} else {
			manager.add(makeGoldStandardAction);
		}
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
//		manager.add(action2);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
	}
	
	public void setFocus() {
		fileViewer.getControl().setFocus();
	}

	@Override
	public void dispose() {
		super.dispose();
		removeEditorListener();
	}

}
