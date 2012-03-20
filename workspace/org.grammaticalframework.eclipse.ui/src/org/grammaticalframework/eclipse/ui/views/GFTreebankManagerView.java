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
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.treebank.GFTreebankHelper;
import org.grammaticalframework.eclipse.treebank.TreebankResults;
import org.grammaticalframework.eclipse.treebank.TreebankResultItem;
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
	private Composite statusBar;
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

	private IPartListener2 editorListener;
	private IResourceChangeListener resourceListener;
	
	private IProject currentProject;

	/**
	 * Create the layout and put all the widgets in their places
	 */
	public void createPartControl(Composite parent) {
		// Overall layout
		parent.setLayout(new GridLayout(1, true));
        SashForm sash = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);
        sash.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        // Left
        configureFilesViewer(sash);
        
        // Right
		Composite right = new Composite(sash, SWT.NONE);
		right.setLayout(new GridLayout(1, true));
//        right.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        configureStatusBar(right);
        configureOutputViewer(right);

        sash.setWeights(new int[]{1,3});

		// Actions and menus
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		addEditorListener();
    }
	
	/**
	 * Setup the status bar
	 * @param parent
	 */
	private void configureStatusBar(Composite parent) {
		statusBar = new Composite(parent, SWT.NONE);
		statusBar.setLayout(new GridLayout(5, false));
		statusBar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

//		new Label(statusBar, SWT.RIGHT).setText("Status: ");
		statusLabel = new Label(statusBar, SWT.LEFT);
		statusLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		new Label(statusBar, SWT.RIGHT).setText("Passed: ");
		passedLabel = new Label(statusBar, SWT.LEFT);
		
		new Label(statusBar, SWT.RIGHT).setText("Failed: ");
		failedLabel = new Label(statusBar, SWT.LEFT);
		
		resetStatusBar();
	}
	
	/**
	 * Redraw the status bar. This will adjust all the widths as needed.
	 */
	public void redrawStatusBar() {
		statusBar.layout(true);
	}
	
	/**
	 * Reset all status bar labels to idle/blank
	 */
	public void resetStatusBar() {
		statusLabel.setText("Idle");
		passedLabel.setText("-");
		failedLabel.setText("-");
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
				if (element instanceof IFolder) {
					IFolder folder = (IFolder) element;
					if (folder.getName().equals(GFBuilder.BUILD_FOLDER) || folder.getName().equals(GFBuilder.EXTERNAL_FOLDER))
						return false;
					else
						return true;
				}
				if (element instanceof IFile) {
					return GFTreebankHelper.isTreebankFile((IFile)element);
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
					if (GFTreebankHelper.hasGoldStandardFile((IFile)element))
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
        outputViewer = new TableViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
        outputViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        outputViewer.getTable().setLinesVisible(true);
        TableViewerColumn col = new TableViewerColumn(outputViewer, SWT.LEFT | SWT.BORDER);
        col.getColumn().setWidth(200); // 200 is arbitrary, but col won't display without it!
        col.getColumn().setResizable(true);
        col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				TreebankResultItem item = (TreebankResultItem)element;
				return item.toString();
			}

			@Override
			public Image getImage(Object element) {
				TreebankResultItem item = (TreebankResultItem)element;
				if (item.isPass())
					return images.forTreebankPass();
				else
					return images.forTreebankFail();
			}
			
        });
	}
	
	/**
	 * Clear contents of output viewer
	 */
	private void clearOutputViewer() {
		getOutputViewer().setItemCount(0);
	}
	
	/**
	 * Add listnere to the fiel editor so that we can swap project depending on the currently
	 * active file.
	 */
	private void addEditorListener() {
		editorListener = new IPartListener2() {
			public void partActivated(IWorkbenchPartReference partRef) {
				try {
					IEditorPart editor = partRef.getPage().getActiveEditor();
					IEditorInput input = editor.getEditorInput();
					if (input instanceof IFileEditorInput) {
						IFile file = ((IFileEditorInput) input).getFile();
						if (!file.getProject().equals(currentProject)) {
							clearOutputViewer();
							resetStatusBar();
						}
						currentProject = file.getProject();
						IContainer newInput = currentProject.getParent();
						fileViewer.setInput(newInput);
					}
				} catch (NullPointerException e) {
					currentProject = null;
					fileViewer.setInput(null);
					clearOutputViewer();
					resetStatusBar();
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
		getSite().getWorkbenchWindow().getPartService().addPartListener(editorListener);

		resourceListener = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				try {
					event.getDelta().accept(new IResourceDeltaVisitor() {
						public boolean visit(IResourceDelta delta) throws CoreException {
							try {
								if (delta.getResource() instanceof IFile
										&& (delta.getKind() == IResourceDelta.ADDED || delta.getKind() == IResourceDelta.CHANGED)
										&& ((IFile)delta.getResource()).getFileExtension().equalsIgnoreCase(GFTreebankHelper.getOutputExtension(false))) {
									final IFile outputFile = (IFile) delta.getResource();
									final IFile treebankFile = GFTreebankHelper.getTreebankFileFromOutputFile(outputFile);
									final IFile goldStandardFile = GFTreebankHelper.getGoldStandardFile(treebankFile);
									Display.getDefault().syncExec(new Runnable() {
										public void run() {
											compareOutputWithGoldStandard(treebankFile, outputFile, goldStandardFile);
										}
									});
									return false; // stop looking... right?
								}
							} catch (NullPointerException e) {
								//
							}
							return true; // keep looking
						}
					});
				} catch (NullPointerException e) {
					// 
				} catch (CoreException e) {
					// 
				}
			}
		};
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceListener);
	}
	
	/**
	 * Remove said listener
	 */
	private void removeEditorListener() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(editorListener);
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceListener);
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
		return (file != null && GFTreebankHelper.isTreebankFile(file)) ? file : null;
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
				goldStandardFile = GFTreebankHelper.getGoldStandardFile(treebankFile);
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
//				statusLabel.setText("Making gold standard");
				if (getSelectedTreebankFile() == null)
					return;
				GFTreebankLaunchShortcut launchShortcut = new GFTreebankLaunchShortcut();
				launchShortcut.setMakeGoldStandard();
				launchShortcut.launch(fileViewer.getSelection(), ILaunchManager.RUN_MODE);
			}
		};
		makeGoldStandardAction.setText("Make gold standard");
//		makeGoldStandardAction.setImageDescriptor(ImageDescriptor.createFromImage(images.getImage("treebank-new.png")));
		
		// Compare output with gold standard 
		compareAction = new Action() {
			@Override
			public void run() {
				final IFile treebankFile = getSelectedTreebankFile();
				if (treebankFile == null)
					return;
				final IFile outputFile = GFTreebankHelper.getOutputFile(treebankFile);
				final IFile goldStandardFile = GFTreebankHelper.getGoldStandardFile(treebankFile);
				if (outputFile == null || goldStandardFile == null)
					return;
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						compareOutputWithGoldStandard(treebankFile, outputFile, goldStandardFile);
					}
				});
			}
		};
		compareAction.setText("Compare output with gold standard");
	}
	
	/**
	 * Compare a given output file with a gold standard, and write the results directly to the supplied view.
	 * @param treebankFile
	 * @param outputFile
	 * @param goldStandardFile
	 */
	private void compareOutputWithGoldStandard(IFile treebankFile, IFile outputFile, IFile goldStandardFile) {
		resetStatusBar();
		setStatusText("Comparing against "+goldStandardFile.getName());
		redrawStatusBar();
		
		// Do it
		TreebankResults results = GFTreebankHelper.compareOutputWithGoldStandard(treebankFile, outputFile, goldStandardFile);
		
		// Set items in viewer
		setStatusText("Results of "+outputFile.getName());
		setPassedText(String.format("%d/%d", results.getPassed(), results.getTotal()));
		setFailedText(String.format("%d/%d", results.getFailed(), results.getTotal()));
		clearOutputViewer();
		getOutputViewer().add(results.getItems().toArray());
		redrawStatusBar();
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
		if (GFTreebankHelper.hasGoldStandardFile(treebankFile)) {
			manager.add(runAction);
			if (GFTreebankHelper.hasOutputFile(treebankFile)) {
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
