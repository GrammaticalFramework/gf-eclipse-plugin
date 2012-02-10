/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.labeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.ui.label.StylerFactory;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.SourceModule;
import org.grammaticalframework.eclipse.gF.TopDef;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * These are used in the Outline view, and contextual pup-ups too.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class GFLabelProvider extends DefaultEObjectLabelProvider {

	/**
	 * Instantiates a new gF label provider.
	 *
	 * @param delegate the delegate
	 */
	@Inject
	public GFLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/**
	 * Image helper
	 */
	@Inject
	private GFImages images;
	
	/**
	 * Xtext style factory
	 */
	@Inject 
	private StylerFactory stylerFactory;
	
	/**
	 * Brown-greyed
	 * @return
	 */
	protected TextStyle getTypeTextStyle() {
	    TextStyle textStyle = new TextStyle();
	    textStyle.setColor(new RGB(149, 125, 71));
	    return textStyle;
	}
	
	/**
	 * Format a teo-part label, with the name regular and the type greyed and italic
	 * @param name
	 * @param type
	 * @return
	 */
	public StyledString twoPartLabel(String name, String type) {
		StyledString ss = new StyledString(name);
		if (type != null && !type.isEmpty())
			ss.append(" : " + type, stylerFactory.createXtextStyleAdapterStyler(getTypeTextStyle()));
		return ss;
	}

	// Source module (top level node)
	public Object text(SourceModule module) {
		String name = module.getType().getName().getS();
		String type = null;
		if (module.getType().isAbstract()) {
			type = "<Abstract module>";
		}
		else if (module.getType().isResource()) {
			type = "<Resource module>";
		}
		else if (module.getType().isInterface()) {
			type = "<Interface>";
		}
		else if (module.getType().isConcrete()) {
			if (module.isIncomplete()) {
				type = String.format("<Functor of %s>", module.getType().getAbstractName().getS());
			}
			else if (module.getBody().isFunctorInstantiation()) {
				type = String.format("<Functor instantiation of %s>", module.getBody().getFunctor().getName().getS());
			}
			else {
				type = String.format("<Concrete of %s>", module.getType().getAbstractName().getS());
			}
		}
		else if (module.getType().isInstance()) {
			type = String.format("<Instance of %s>", module.getType().getInterfaceInclude().getName().getS());
		}		
		return twoPartLabel(name, type);
	}
	public Object image(SourceModule ele) {
		return images.filenameForModule(ele);
	}
	
	// ModType - ignore!
	public Object text(ModType ele) {
		return null;
	}
	
	// Top def
	public Object text(TopDef ele) {
		if (ele.isCat()) return "cat";
		if (ele.isFun()) return "fun";
		if (ele.isData()) return "data";
		if (ele.isDef()) return "def";
		if (ele.isParam()) return "param";
		if (ele.isOper()) return "oper";
		if (ele.isLincat()) return "lincat";
		if (ele.isLindef()) return "lindef";
		if (ele.isLin()) return "lin";
		if (ele.isPrintname()) return "printname";
		if (ele.isFlags()) return "flags";
		
		return null;
	}
	
	/**
	 * This is used for the contextual pop-ups.
	 * @param id
	 * @return
	 */
	public Object text(Ident id) {
		for (EObject ref : id.eContainingFeature().eCrossReferences()) {
			// TODO How to get a proper handle on thsi stuff?
			System.out.println(ref.eResource());
		}
		return super.text(id);
	}

}
