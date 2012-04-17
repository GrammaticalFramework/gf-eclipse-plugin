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
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;
import org.grammaticalframework.eclipse.scoping.TagEntry;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.views.GFScopeContentProvider.ModuleItem;

import com.google.inject.Inject;

public class GFScopeLabelProvider extends StyledCellLabelProvider {

	/**
	 * Image helper
	 */
	@Inject
	private GFImages images;
	
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
			
			String type = item.getUserData(TagEntry.USER_DATA_KEY_TYPE);
			if (type.equals("oper-type")) {
				type = "oper";
			}
			if (type.equals("overload-def")) {
				type = "oper";
			}
			
			String name = item.getName().toString();
			String args = item.getUserData(TagEntry.USER_DATA_KEY_ARGS);
			StyledString styledString = threePartLabel(type, name, args);
			
			cell.setText(styledString.getString());
			cell.setStyleRanges(styledString.getStyleRanges());
		}

		super.update(cell);
	}
	
	@Inject 
	private StylerFactory stylerFactory;
	
	/**
	 * Format a three-part label: regular / bold / grey + italic
	 * @param s1
	 * @param s2
	 * @param s3
	 * @return
	 */
	public StyledString threePartLabel(String s1, String s2, String s3) {
		
		TextStyle boldTextStyle = new TextStyle();
//		boldTextStyle.setStyle(SWT.BOLD);
		boldTextStyle.setColor(new RGB(160, 160, 160));
		
	    TextStyle italicTextStyle = new TextStyle();
	    italicTextStyle.setColor(new RGB(149, 125, 71));
		
		StyledString ss = new StyledString();
		
		if (s1 != null && !s1.isEmpty())
			ss.append(s1 + " ", stylerFactory.createXtextStyleAdapterStyler(boldTextStyle));
		
		if (s2 != null && !s2.isEmpty())
			ss.append(s2);
		
		if (s3 != null && !s3.isEmpty())
			ss.append(" : " + s3, stylerFactory.createXtextStyleAdapterStyler(italicTextStyle));
		
		return ss;
	}
	

}
