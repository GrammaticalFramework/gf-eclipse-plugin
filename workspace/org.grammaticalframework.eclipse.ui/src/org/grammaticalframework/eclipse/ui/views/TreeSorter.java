package org.grammaticalframework.eclipse.ui.views;

import org.eclipse.jface.viewers.ViewerComparator;

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