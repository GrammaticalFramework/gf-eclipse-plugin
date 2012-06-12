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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.part.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.grammaticalframework.eclipse.scoping.GFScopingHelper;
import org.grammaticalframework.eclipse.scoping.TagEntry;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.views.GFScopeContentProvider.ModuleItem;

import com.google.inject.Inject;

/**
 * View for browsing all external modules references by the active file.
 * @author John J. Camilleri
 *
 */
public class GFLibraryTreeView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.grammaticalframework.eclipse.ui.views.GFLibraryTreeView";
	
	/**
	 * Logger
	 */
	protected static final Logger log = Logger.getLogger(GFLibraryTreeView.class);

	/**
	 * Image helper
	 */
	@Inject
	private GFImages images;
	
	// Widgets
	private Text searchField;
	private TreeViewer viewer;

	// Actions
	private Action expandAllAction;
	private Action collapseAllAction;
	private Action caseSensitiveSearchAction;
	private Action regexSearchAction;
	private Action doubleClickAction;

	private IPartListener2 listener;
	
	@Inject
	GFScopeContentProvider contentProvider;
	
	@Inject
	GFScopeLabelProvider labelProvider;
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	private IFile currentFile;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		
		parent.setLayout(new GridLayout(1, true));
		
		searchField = new Text(parent, SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH | SWT.ICON_CANCEL );
		searchField.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		searchField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				refreshAndExpandViewer();
			}
		});
		
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));		
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(labelProvider);
		viewer.addFilter(new ViewerFilter() {
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				String search = searchField.getText().trim();
				if (search.isEmpty()) {
					return true;
				}
				if (element instanceof TagEntry) {
					String name = ((TagEntry)element).getIdent();
//					String moduleName = ((ModuleItem)parentElement).getName().toString().toLowerCase();
					if (regexSearchAction.isChecked()) {
						return (caseSensitiveSearchAction.isChecked()) ? name.matches(search) : name.matches("(?i)"+search) ;
					} else {
						return (caseSensitiveSearchAction.isChecked()) ? name.contains(search) : name.toLowerCase().contains(search.toLowerCase());
					}
					
				}
				return true;
			}
		});
		viewer.setInput(null); // our listener below will take care of this

		// Create the help context id for the viewer's control
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.grammaticalframework.eclipse.ui.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();

		// Add a listener which updates the view each time the active editor is changed
		listener = new IPartListener2() {
			/**
			 * Finds the corresponding Resource and sets it as input.
			 * This causes <code>inputChanged</code> to fire in the content provider.
			 * In our case, this retrieves the module scope, which is long-running, so this
			 * method should always be called asynchronously.
			 * 
			 * @param partRef
			 */
			private void changeInput(IWorkbenchPartReference partRef) {
				try {
					IEditorPart editor = partRef.getPage().getActiveEditor();
					XtextEditor xEditor = (XtextEditor)editor;
					XtextDocument doc = (XtextDocument)xEditor.getDocument();
					URI uri = doc.getResourceURI();
					currentFile = (IFile) ResourceUtil.getResource(editor.getEditorInput());
					ResourceSet resourceSet = resourceSetProvider.get(currentFile.getProject());
					final Resource resource = resourceSet.getResource(uri, true);
					Job job = new Job("Updating External Libraries view") {
						protected IStatus run(IProgressMonitor monitor) {
							// If you want to update the UI
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									try {
										viewer.setInput(resource);
										if (!searchField.getText().isEmpty()) {
											viewer.expandAll();
										}
									} catch (IllegalStateException e) {
										return;
									}
								}
							});
							return Status.OK_STATUS;
						}
					};
					job.schedule();
				} catch (Exception _) {
					viewer.setInput(null);
					currentFile = null;
				}
			}
			public void partActivated(final IWorkbenchPartReference partRef) {
				changeInput(partRef);
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
	
	private void refreshAndExpandViewer() {
		viewer.refresh();
		viewer.expandAll();
	}
	
	/**
	 * Create all the actions with their run() methods
	 */
	private void makeActions() {
		// Expand all items in view
		expandAllAction = new Action() {
			public void run() {
				viewer.expandAll();
			}
		};
		expandAllAction.setText("Expand all");
		expandAllAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forExpandAll()));
		
		// Collapse all items in view
		collapseAllAction = new Action() {
			public void run() {
				viewer.collapseAll();
			}
		};
		collapseAllAction.setText("Expand all");
		collapseAllAction.setImageDescriptor(ImageDescriptor.createFromImage(images.forCollapseAll()));
		
		// Case sensitive search action
		caseSensitiveSearchAction = new Action("Case-sensitive search", SWT.TOGGLE){
			@Override
			public void run() {
				refreshAndExpandViewer();
			}
		};
		
		// Regex search action
		regexSearchAction = new Action("Regular expression search", SWT.TOGGLE){
			@Override
			public void run() {
				refreshAndExpandViewer();
			}
		};

		// Double-clicking on an item should take you to its definition
		doubleClickAction = new Action() {
			public void run() {
				if (currentFile == null)
					return;

				IFolder extFolder = GFScopingHelper.getExernalFolder(currentFile);
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection).getFirstElement();

				if (obj instanceof ModuleItem) {
					IResource res = extFolder.findMember(((ModuleItem)obj).getName()+".gf");
					if (res != null && res instanceof IFile) {
						IFile file = (IFile) res;
						IWorkbenchPage page = getSite().getWorkbenchWindow().getActivePage();
						try {
							IDE.openEditor(page, file);
						} catch (Exception e) {
							log.warn("Couldn't open "+file.getRawLocation().toOSString());
						}
					}
				}
				else if (obj instanceof TagEntry) {
					// TODO Open the respective file and jump to the right point in the file!
				}
			}
		};
	}

	/**
	 * Configure double-click action
	 */
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	/**
	 * Configure context menu
	 */
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
		manager.add(caseSensitiveSearchAction);
		manager.add(regexSearchAction);
	}

	/**
	 * Add contributions to the {@link #viewer} context menu.
	 * @param manager
	 */
	private void fillContextMenu(IMenuManager manager) {
	}

	/**
	 * Add contributions to the button area at the top-right of the view.
	 * Actions added here should probably have an icon associated with them.
	 * @param manager
	 */
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(expandAllAction);
		manager.add(collapseAllAction);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(listener);
		super.dispose();
	}
	
	
}