/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.grammaticalframework.eclipse.gF.*;

import com.google.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * Provides labels for a EObjects.
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
	 * The images.
	 */
	@Inject
	private GFImages images;
	

	/**
	 * Text.
	 *
	 * @param ele the ele
	 * @return the string
	 */
	public String text(ModDef ele) {
		StringBuilder sb = new StringBuilder();
		sb.append( ele.getType().getName().getS() );
		if (ele.getType().isConcrete() || ele.getType().isInstance()) {
			sb.append(" of ");
			sb.append( ele.getType().getAbstractName().getS() );
		}
		return sb.toString();
	}
	
	/**
	 * Text.
	 *
	 * @param ele the ele
	 * @return the string
	 */
	public String text(ModType ele) {
		//if (ele.isAbstract()) return "Abstract"
		return null;
	}
	
	/**
	 * Text.
	 *
	 * @param ele the ele
	 * @return the string
	 */
	public String text(TopDef ele) {
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
	 * Image.
	 *
	 * @param ele the ele
	 * @return the string
	 */
	public String image(ModDef ele) {
		return images.filenameForModule(ele);
	}
	
}
