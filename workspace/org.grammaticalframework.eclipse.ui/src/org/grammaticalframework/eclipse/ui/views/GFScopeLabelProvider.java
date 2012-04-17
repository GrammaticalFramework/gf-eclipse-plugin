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

import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.grammaticalframework.eclipse.scoping.TagEntry;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.labeling.GFLabelProvider;
import org.grammaticalframework.eclipse.ui.views.GFScopeContentProvider.ModuleItem;

import com.google.inject.Inject;

public class GFScopeLabelProvider extends StyledCellLabelProvider {

	/**
	 * Image helper
	 */
	@Inject
	private GFImages images;
	
	@Inject
	private GFLabelProvider labelProvider;
	
	@Override
	public void update(ViewerCell cell) {
		if (cell.getElement() instanceof ModuleItem) {
			ModuleItem moduleItem = (ModuleItem)cell.getElement();
			
			cell.setImage(images.forLibraryReference());
			cell.setText(moduleItem.getName());
			
		} else if (cell.getElement() instanceof IEObjectDescription) {
			IEObjectDescription item = (IEObjectDescription)cell.getElement();
			
//			IEObjectDescription item = (IEObjectDescription)element;
//			item.getUserData(TagEntry.USER_DATA_KEY_TYPE);
			cell.setImage(images.forAnyJudgement());
			
			String name = item.getName().toString();
			String type = item.getUserData(TagEntry.USER_DATA_KEY_ARGS);
			StyledString styledString = labelProvider.twoPartLabel(name, type);
			
			cell.setText(styledString.getString());
			cell.setStyleRanges(styledString.getStyleRanges());
		}

		super.update(cell);
	}

}
