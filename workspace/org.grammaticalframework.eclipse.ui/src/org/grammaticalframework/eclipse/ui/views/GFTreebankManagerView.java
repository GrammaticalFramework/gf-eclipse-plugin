package org.grammaticalframework.eclipse.ui.views;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class GFTreebankManagerView extends ViewPart {
	
	private Action runAction;
	
	private TableViewer treeFilesViewer;
	private TableViewer outputViewer;

	public GFTreebankManagerView() {
		
	}

	@Override
	public void createPartControl(Composite parent) {
		// Layout
		parent.setLayout(new GridLayout(1, true));
		new Button(parent, SWT.PUSH).setText("Status and stats");
		
		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(new FillLayout());

        SashForm sash = new SashForm(comp, SWT.HORIZONTAL | SWT.SMOOTH);
        treeFilesViewer = new TableViewer(sash, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        outputViewer = new TableViewer(sash, SWT.H_SCROLL | SWT.V_SCROLL);
        
        for (int i = 0; i < 10; i++) {
            treeFilesViewer.add("File "+i);
            outputViewer.add("Output "+i+"A");
            outputViewer.add("Output "+i+"B");
        }
        
		// Actions and menus
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
    }
	
	private void makeActions() {
		runAction = new Action() {
			public void run() {
				// get selection from trees panel, or run everything if not
				System.out.println("Running that shit");
			}
		};
	}	

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				GFTreebankManagerView.this.fillContextMenu(manager);
			}
		});
//		Menu menu = menuMgr.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, viewer);
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
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
