package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.grammaticalframework.eclipse.builder.GFBuilder;

public class WizardHelper {
	
	/**
	 * Recursively find all files in the workspace, in a flat list to be used as suggestions.
	 *
	 * @return the file list
	 */
	public static String[] getFileList(boolean includeExternal) {
		ArrayList<String> suggestions = new ArrayList<String>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		traverseFileList(root, suggestions, includeExternal);
		return suggestions.toArray(new String[]{});
	}
	
	/**
	 * Traverse file list recursively, for suggestions
	 *
	 * @param resource the resource
	 * @param suggestions the suggestions
	 */
	private static void traverseFileList(IResource resource, ArrayList<String> suggestions, boolean includeExternal) {
		if (resource instanceof IFile) {
			IFile file = (IFile)resource;
			try {
				if (file.getFileExtension().equalsIgnoreCase("gf")) {
					suggestions.add( resource.getName().substring(0, resource.getName().length()-3) );
				}
			} catch (NullPointerException e) {
				// there was no file extension
			}
		} else if (resource instanceof IContainer) {
			if (!includeExternal && ((IContainer)resource).getName().equals(GFBuilder.EXTERNAL_FOLDER)) {
				return;
			}
			try {
				for (IResource member : ((IContainer)resource).members()) {
					traverseFileList(member, suggestions, includeExternal);
				}
			} catch (CoreException e) {
				// No problem
			}
		}
	}
	
	public static class GFModuleContentProposalProvider extends SimpleContentProposalProvider {
		public GFModuleContentProposalProvider(String[] proposals) {
			super(proposals);
			this.setFiltering(true);
		}
		@Override
		public IContentProposal[] getProposals(String contents, int position) {
			// Only consider AFTER the last comma (but before cursor), then delegate to parent
			contents = contents.substring(0, position);
			int ix = contents.lastIndexOf(',');
			if (ix > -1) {
				contents = contents.substring(ix+1).trim();
			}
			return super.getProposals(contents, position);
		}
	}
	
	public static class GFModuleContentAdapter extends TextContentAdapter {
		@Override
		public Point getSelection(Control control) {
			//Always select from caret position to left-closest comma or space character
			// e.g. for "Kittens, Pupp|ies" we want to return "Pupp"
			int pos = ((Text) control).getCaretPosition();
			String contents = ((Text) control).getText(0, pos);
			int ix = Math.max(contents.lastIndexOf(','), contents.lastIndexOf(' '));
			return (ix < 0) ? new Point(0, pos) : new Point(ix+1, pos);
		}
	}	
}
