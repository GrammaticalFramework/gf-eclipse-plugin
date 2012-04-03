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

import java.util.List;

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
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.treebank.GFTestHelper;
import org.grammaticalframework.eclipse.treebank.TestResults;
import org.grammaticalframework.eclipse.treebank.TestResultItem;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.launch.GFTestLaunchShortcut;
import org.grammaticalframework.eclipse.ui.wizards.GFNewTreesWizard;

import com.google.inject.Inject;

/**
 * Test Manager view, for running linearisationg and parsing tests and browsing the results.
 * @author John J. Camilleri
 *
 */
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
	private Action makeTreesFileAction;
	private Action compareAction;
	private Action hideSuccessfulAction;
	private Action hideLanguageColumnAction;
	private Action hideParametersColumnAction;
	private Action hideTreeColumnAction;
	
	// Widgets
	private Label statusLabel;
	private Label passedLabel;
	private Label failedLabel;
	private Label errorsLabel;
	private Composite statusBar;
	private TreeViewer fileViewer;
	private TableViewer resultsViewer;
	
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
	
	public String getErrorText() {
		return errorsLabel.getText();
	}

	public void setErrorText(String failedLabel) {
		this.errorsLabel.setText(failedLabel);
	}

	/**
	 * Set the input for the file viewer
	 * @param data
	 */
	protected void setFileViewerInput(Object input) {
		fileViewer.setInput(input);
	}
	
	/**
	 * Set the input data for the results viewer
	 * @param data
	 */
	protected void setResultData(List<TestResultItem> data) {
		resultsViewer.setInput(data);
	}

	private TestResultViewerComparator resultComparator;
	
	private IPartListener2 editorListener;
	
	private IResourceChangeListener resourceListener;
	
	private IProject currentProject;

	private TableViewerColumn column_Result;

	private TableViewerColumn column_Language;

	private TableViewerColumn column_Params;

	private TableViewerColumn column_Input;
	
	private static int COLUMN_WIDTH_RESULT = 200;
	
	private static int COLUMN_WIDTH_LANGUAGE = 80;
	
	private static int COLUMN_WIDTH_PARAMS = 120;
	
	private static int COLUMN_WIDTH_INPUT = 150;
	
	private static String COLUMN_TEXT_RESULT = "Result";

	private static String COLUMN_TEXT_LANGUAGE = "Language";
	
	private static String COLUMN_TEXT_PARAMS = "Parameters";
	
	private static String COLUMN_TEXT_INPUT = "Input";

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
        configureResultsViewer(right);

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
		statusBar.setLayout(new GridLayout(7, false));
		statusBar.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		statusLabel = new Label(statusBar, SWT.LEFT);
		statusLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		new Label(statusBar, SWT.RIGHT).setText("Passed:");
		passedLabel = new Label(statusBar, SWT.LEFT);
		
		new Label(statusBar, SWT.RIGHT).setText("Failed:");
		failedLabel = new Label(statusBar, SWT.LEFT);
		
		new Label(statusBar, SWT.RIGHT).setText("Errors:");
		errorsLabel = new Label(statusBar, SWT.LEFT);
		
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
		statusLabel.setText("");
		passedLabel.setText("-");
		failedLabel.setText("-");
		errorsLabel.setText("-");
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
					return GFTestHelper.isInputFile((IFile)element);
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
					if (GFTestHelper.hasGoldStandardFile((IFile)element))
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
	}
	
	/**
	 * Setup the test results viewer, table columns etc.
	 * @param parent
	 */
	private void configureResultsViewer(Composite parent) {
        resultsViewer = new TableViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION);
        resultsViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        resultsViewer.getTable().setLinesVisible(true);
        resultsViewer.getTable().setHeaderVisible(true);
        resultsViewer.setContentProvider(new ArrayContentProvider(){
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				viewer.refresh();
			}
        });
        resultsViewer.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
        		TestResultItem item = (TestResultItem)element;
        		return !(hideSuccessfulAction.isChecked() && item.isPass()); 
			}
		});
        resultComparator = new TestResultViewerComparator();
        resultsViewer.setComparator(resultComparator);
        
        column_Result = createResultsViewerColumn(COLUMN_TEXT_RESULT, COLUMN_WIDTH_RESULT, 0);
        column_Result.setLabelProvider(new StyledCellLabelProvider() {
        	@Override
        	public void update(ViewerCell cell) {
        		TestResultItem item = (TestResultItem)cell.getElement();
        		String out = item.getOut().getMeat();
        		String gold = item.getGold().getMeat();
        		if (item.isPass()) {
        			if (!hideSuccessfulAction.isChecked()) {
	        			cell.setImage(images.forTreebankPass());
	        			cell.setStyleRanges(null);
	        			cell.setText(out);
        			}
        		} else {
        			cell.setImage(images.forTreebankFail());
	        		StyledString text = new StyledString();
	        		StyleRange rangeGold = new StyleRange(0, gold.length(), new Color(Display.getCurrent(), 184, 134, 11), null);
	        		StyleRange rangeOut = new StyleRange(gold.length()+1, out.length(), Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED), null);
	        		text.append(gold+"\n");
	        		text.append(out);
	        		cell.setText(text.toString());
	        		StyleRange[] range = { rangeGold, rangeOut };
	        		cell.setStyleRanges(range);
        		}
        		super.update(cell);
        	}
        });
        
        column_Language = createResultsViewerColumn(COLUMN_TEXT_LANGUAGE, COLUMN_WIDTH_LANGUAGE, 1);
        column_Language.setLabelProvider(new CellLabelProvider() {
        	@Override
        	public void update(ViewerCell cell) {
        		TestResultItem item = (TestResultItem)cell.getElement();
        		if (item.getOut().hasLanguage()) {
        			cell.setText(item.getOut().getLanguage());
        		}
        	}        	
        });
        
        column_Params = createResultsViewerColumn(COLUMN_TEXT_PARAMS, COLUMN_WIDTH_PARAMS, 2);
        column_Params.setLabelProvider(new CellLabelProvider() {
        	@Override
        	public void update(ViewerCell cell) {
        		TestResultItem item = (TestResultItem)cell.getElement();
        		if (item.getOut().hasParameters()) {
        			cell.setText(item.getOut().getParameters());
        		}
        	}        	
        });
        
        column_Input = createResultsViewerColumn(COLUMN_TEXT_INPUT, COLUMN_WIDTH_INPUT, 3);
        column_Input.setLabelProvider(new CellLabelProvider() {
        	@Override
        	public void update(ViewerCell cell) {
        		TestResultItem item = (TestResultItem)cell.getElement();
       			cell.setText(item.getIn().toString());
        	}        	
        });
        
	}
	
	/**
	 * Create a column in the resultsViewer
	 * @param title
	 * @param width
	 * @return
	 */
	private TableViewerColumn createResultsViewerColumn(String title, int width, final int colNumber) {
		TableViewerColumn viewerColumn = new TableViewerColumn(resultsViewer, SWT.LEFT | SWT.BORDER);
		final TableColumn column = viewerColumn.getColumn();
        column.setWidth(width);
        column.setText(title);
        column.setResizable(true);
        column.addSelectionListener(getSelectionAdapter(column, colNumber));
        return viewerColumn;
	}
	
	/**
	 * Get a selection adapter for the specified column and column number
	 * @param column
	 * @param index
	 * @return
	 */
	private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
		SelectionAdapter selectionAdapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				resultComparator.setColumn(index);
				int dir = resultComparator.getDirection();
				resultsViewer.getTable().setSortDirection(dir);
				resultsViewer.getTable().setSortColumn(column);
				resultsViewer.refresh();
			}
		};
		return selectionAdapter;
	}
	
	/**
	 * Clear contents of output viewer
	 */
	private void clearResultsViewer() {
		resultsViewer.setInput(null);
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
							clearResultsViewer();
							resetStatusBar();
						}
						currentProject = file.getProject();
						IContainer newInput = currentProject.getParent();
						setFileViewerInput(newInput);
					}
				} catch (NullPointerException e) {
					currentProject = null;
					setFileViewerInput(null);
					clearResultsViewer();
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
							if (delta.getResource() instanceof IFile
									&& (delta.getKind() == IResourceDelta.ADDED || delta.getKind() == IResourceDelta.CHANGED)
									&& ((IFile)delta.getResource()).getFileExtension().equalsIgnoreCase(GFTestHelper.getOutputExtension(false))) {
								final IFile outputFile = (IFile) delta.getResource();
								final IFile inputFile = GFTestHelper.getInputFileFromOutputFile(outputFile);
								final IFile goldStandardFile = GFTestHelper.getGoldStandardFile(inputFile);
								if (goldStandardFile!=null) {
									Display.getDefault().syncExec(new Runnable() {
										public void run() {
											compareOutputWithGoldStandard(inputFile, outputFile, goldStandardFile);
										}
									});
								}
								return false; // stop looking... right?
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
	 * Get the currently selected file from the tree files viewer, only if it is an input file
	 * @return the selected file, or <code>null</code> if nothing is selected (or some other error occurs).
	 */
	private IFile getSelectedInputFile() {
		IFile file = getSelectedFile();
		return (file != null && GFTestHelper.isInputFile(file)) ? file : null;
	}
	
	/**
	 * Create all the actions with their run() methods
	 */
	private void makeActions() {
		// Run a single test
		runAction = new Action("Run test") {
			private IFile inputFile;
			private IFile goldStandardFile;
			@Override
			public void run() {
				// See what's selected in our viewer and validate
				if ((inputFile = getSelectedInputFile()) == null)
					return;
				goldStandardFile = GFTestHelper.getGoldStandardFile(inputFile);
				if (goldStandardFile == null) {
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					String title = "Error running test";
					String message = String.format("Found no corresponding gold standard for %s", inputFile.getName());
					MessageDialog.openInformation(shell, title, message);
					log.info(message);
					return;
				}
				// Launch
				GFTestLaunchShortcut launchShortcut = new GFTestLaunchShortcut();
				launchShortcut.launch(fileViewer.getSelection(), ILaunchManager.RUN_MODE);
			}
		};
		
		// Create a gold standard file from an input file
		makeGoldStandardAction = new Action("Make gold standard") {
			@Override
			public void run() {
				if (getSelectedInputFile() == null)
					return;
				GFTestLaunchShortcut launchShortcut = new GFTestLaunchShortcut();
				launchShortcut.setMakeGoldStandard();
				launchShortcut.launch(fileViewer.getSelection(), ILaunchManager.RUN_MODE);
			}
		};
//		makeGoldStandardAction.setImageDescriptor(ImageDescriptor.createFromImage(images.getImage("treebank-new.png")));
		
		// Create a treebank
		makeTreesFileAction = new Action("Generate trees file") {
			@Override
			public void run() {
				IWorkbench workbench = PlatformUI.getWorkbench();
				IWizardDescriptor descriptor = workbench.getNewWizardRegistry().findWizard(GFNewTreesWizard.ID);
				if (descriptor != null) {
					IWizard wizard;
					try {
						Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
						wizard = descriptor.createWizard();
						((GFNewTreesWizard)wizard).init(workbench, null);
						WizardDialog wd = new WizardDialog(shell, wizard);
						wd.setTitle(wizard.getWindowTitle());
						wd.open();
					} catch (CoreException e) {
						log.error("Unable to open wizard", e);
					}
				}
			}
		};
		makeTreesFileAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forTreebankNew()));
		
		// Compare output with gold standard 
		compareAction = new Action("Compare with gold standard") {
			@Override
			public void run() {
				final IFile inputFile = getSelectedInputFile();
				if (inputFile == null)
					return;
				final IFile outputFile = GFTestHelper.getOutputFile(inputFile);
				final IFile goldStandardFile = GFTestHelper.getGoldStandardFile(inputFile);
				if (outputFile == null || goldStandardFile == null)
					return;
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						compareOutputWithGoldStandard(inputFile, outputFile, goldStandardFile);
					}
				});
			}
		};
		
		// Actions for toggling table columns
		hideSuccessfulAction = new Action("Show only failures", SWT.TOGGLE){
			@Override
			public void run() {
				resultsViewer.refresh();
			}
		};
		hideSuccessfulAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forTreebankToggleSuccessful()));
		
		hideLanguageColumnAction = new Action("Hide '"+COLUMN_TEXT_LANGUAGE+"' column", SWT.TOGGLE) {
			@Override
			public void run() {
				toggleColumn(this, column_Language, COLUMN_WIDTH_LANGUAGE);
			}
		};
		hideLanguageColumnAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forLanguageToggle()));
		
		hideParametersColumnAction = new Action("Hide '"+COLUMN_TEXT_PARAMS+"' column", SWT.TOGGLE) {
			@Override
			public void run() {
				toggleColumn(this, column_Params, COLUMN_WIDTH_PARAMS);
			}
		};
		hideParametersColumnAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forParameterToggle()));
		
		hideTreeColumnAction = new Action("Hide '"+COLUMN_TEXT_INPUT+"' column", SWT.TOGGLE) {
			@Override
			public void run() {
				toggleColumn(this, column_Input, COLUMN_WIDTH_INPUT);
			}
		};
		hideTreeColumnAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forTreebankToggle()));
	}
	
	/**
	 * Toggle a column's visibility.
	 * @param column
	 * @param width
	 */
	private void toggleColumn(Action action, TableViewerColumn column, int width) {
		if (action.isChecked()) {
			column.getColumn().setWidth(0);
		} else {
			column.getColumn().setWidth(width);
		}
	}
	
	/**
	 * Compare a given output file with a gold standard, and write the results directly to the supplied view.
	 * @param inputFile
	 * @param outputFile
	 * @param goldStandardFile
	 */
	private void compareOutputWithGoldStandard(IFile inputFile, IFile outputFile, IFile goldStandardFile) {
		resetStatusBar();
		setStatusText("Comparing against "+goldStandardFile.getName());
		redrawStatusBar();
		
		// Do it
		TestResults results = GFTestHelper.compareOutputWithGoldStandard(inputFile, outputFile, goldStandardFile);
		
		// Set items in viewer
		setStatusText("Results of "+outputFile.getName());
		setPassedText(String.format("%d/%d", results.getPassed(), results.getTotal()));
		setFailedText(String.format("%d/%d", results.getFailed(), results.getTotal()));
		setErrorText(String.format("%d", results.getErrors()));
		clearResultsViewer();
		setResultData(results.getItems());
		redrawStatusBar();
	}

	/**
	 * Configure context menu
	 */
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
	}

	/**
	 * Configure double-click action (runs treebank)
	 */
	private void hookDoubleClickAction() {
		fileViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				runAction.run();
			}
		});
	}

	/**
	 * Add actions to various parts of the view
	 */
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	/**
	 * Add contributions to the text menu at the top-right (i.e. when clicking the small white arrow)
	 * @param manager
	 */
	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(hideSuccessfulAction);
		manager.add(hideLanguageColumnAction);
		manager.add(hideParametersColumnAction);
		manager.add(hideTreeColumnAction);
		manager.add(new Separator());
		manager.add(makeTreesFileAction);
	}

	/**
	 * Add contributions to the {@link #fileViewer} context menu.
	 * @param manager
	 */
	private void fillContextMenu(IMenuManager manager) {
		IFile inputFile = getSelectedInputFile();
		if (inputFile == null)
			return;
		if (GFTestHelper.hasGoldStandardFile(inputFile)) {
			manager.add(runAction);
			if (GFTestHelper.hasOutputFile(inputFile)) {
				manager.add(compareAction);
			}
		} else {
			manager.add(makeGoldStandardAction);
		}
	}

	/**
	 * Add contributions to the button area at the top-right of the view.
	 * Actions added here should probably have an icon associated with them.
	 * @param manager
	 */
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(hideSuccessfulAction);
		manager.add(hideLanguageColumnAction);
		manager.add(hideParametersColumnAction);
		manager.add(hideTreeColumnAction);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	public void setFocus() {
		fileViewer.getControl().setFocus();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		removeEditorListener();
	}

}
