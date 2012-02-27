package org.grammaticalframework.eclipse.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class TreebankFileNode extends FileNode {
	
	private IFile goldStandardFile;
	
	public boolean hasGoldStandard() {
		return goldStandardFile != null;
	}

	public TreebankFileNode(ITreeNode parent, IFile file) {
		super(parent, file);
		// Look for GS file
	}

	@Override
	public Image getImage() {
		if (hasGoldStandard()) {
			return AbstractUIPlugin.imageDescriptorFromPlugin("org.grammaticalframework.eclipse.ui", "icons/treebank-item.png").createImage();		
		} else {
			return AbstractUIPlugin.imageDescriptorFromPlugin("org.grammaticalframework.eclipse.ui", "icons/treebank-item-gold.png").createImage();		
		}
	}
	
}
