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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

public class GFTreebankManagerView extends ViewPart {
	
	@Inject
	private GFImages images;
	
	@Inject
	TreeLabelProvider labelProvider;
	
	@Inject
	ExtensionTypeTreeContentProvider contentProvider;
	
	@Inject
	TreeSorter sorter;
	
	// Actions
	Action runAction;
	Action makeGoldStandardAction;
	
	// Widgets
	TableViewer treeFilesViewer;
	TableViewer outputViewer;
	
	Button runButton;
	Label statusLabel;

	IPartListener2 listener;

	public void createPartControl(Composite parent) {
		// Overall layout
		GridLayout layout = new GridLayout(1, true);
		parent.setLayout(layout);
		
		// Top bar with buttons & stats
		Composite bar = new Composite(parent, SWT.NONE);
		bar.setLayout(new GridLayout(2, false));
		
		runButton = new Button(bar, SWT.PUSH);
//		runButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER));
		runButton.setText("Run");
		runButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				runAction.run();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		statusLabel = new Label(bar, SWT.FILL);
//		statusLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER));
		statusLabel.setText("Status and stats..");
		
		// Bottom section with tableviews
        SashForm sash = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);
        GridData gd = new GridData(SWT.FILL, SWT.TOP, true, true);
        gd.minimumHeight = 50;
        sash.setLayoutData(gd);
        
        // Table of trees files
        configureTreesViewer(sash);
        
        // Output
        configureOutputViewer(sash);

        sash.setWeights(new int[]{1,2});

        // Bottom line
		new Label(parent, SWT.LEFT).setText("bottom text");
        
		// Actions and menus
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		addEditorListener();
    }
	
	private void configureTreesViewer(Composite parent) {
        contentProvider.setExtension("trees");
        treeFilesViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
        treeFilesViewer.setContentProvider(contentProvider);
        treeFilesViewer.setLabelProvider(new TreeLabelProvider() {
			@Override
			public Image getImage(Object element) {
				// TODO determine if item has GS or not
				return images.getImage("treebank-item.png");
			}
        });
		// treeFilesViewer.setSorter(new NameSorter());
//        treeFilesViewer.setComparator(sorter);
        treeFilesViewer.setInput(null); // our listener below will take care of this
	}
	
	private void configureOutputViewer(Composite parent) {
        outputViewer = new TableViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER );
        // one column: icon shows result; tree, lin and gold are on separate lines as same entry.
	}
	
	private void addEditorListener() {
		// Add a listener which updates the view each time the active editor is changed
		listener = new IPartListener2() {
			public void partActivated(IWorkbenchPartReference partRef) {
				try {
					IEditorPart editor = partRef.getPage().getActiveEditor();
					IEditorInput input = editor.getEditorInput();
					if (input instanceof IFileEditorInput) {
						IFile file = ((IFileEditorInput) input).getFile();
						IProject project = file.getProject();
						treeFilesViewer.setInput(project);
					}
				} catch (NullPointerException e) {
					treeFilesViewer.setInput(null);
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
	
	private void removeEditorListener() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(listener);
	}
	
	private void makeActions() {
		runAction = new Action() {
			@Override
			public void run() {
				statusLabel.setText("Running");
				// get selection from trees panel, or run everything if not
//				IStructuredSelection selection = (IStructuredSelection) treeFilesViewer.getSelection();
//				while (selection.iterator().hasNext()) {
//					Object x = selection.iterator().next();
					for (int i = 0; i < 5; i++) {
//						outputViewer.add(x.toString() + " - "+i);
						outputViewer.add(" - "+i);
					}
//				}
				
			}
		};
		runAction.setText("Run test suite");
		runAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forTreebankRun()));
		
		makeGoldStandardAction = new Action() {
			@Override
			public void run() {
				statusLabel.setText("Making gold standard");
			}
		};
		makeGoldStandardAction.setText("Make gold standard");
		makeGoldStandardAction.setImageDescriptor(ImageDescriptor.createFromImage(images.getImage("treebank-new.png")));
	}	

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GFTreebankManagerView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeFilesViewer.getControl());
		treeFilesViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, treeFilesViewer);
	}

	private void hookDoubleClickAction() {
		treeFilesViewer.addDoubleClickListener(new IDoubleClickListener() {
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
		manager.add(runAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(runAction);
		manager.add(makeGoldStandardAction);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(runAction);
//		manager.add(action2);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
	}
	
	public void setFocus() {
		treeFilesViewer.getControl().setFocus();
	}

	@Override
	public void dispose() {
		super.dispose();
		removeEditorListener();
	}

}
