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

import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.grammaticalframework.eclipse.gF.ModDef;

import com.google.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * Refer: org.eclipse.xtext.xtend2.ui.labeling.Xtend2Images
 * URL: http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xtend2.ui/src/org/eclipse/xtext/xtend2/ui/labeling/Xtend2Images.java?id=v2.0.1
 * @author John J. Camilleri
 *
 */

public class GFImages {

	/**
	 * The image helper.
	 */
	@Inject
	private IImageHelper imageHelper;
	
	/* --------- */
	
	/**
	 * Logo.
	 *
	 * @return the image
	 */
	public Image logo() {
		return imageHelper.getImage("gf-logo.png");
	}
	
	/**
	 * For module.
	 *
	 * @param module the module
	 * @return the image
	 */
	public Image forModule(ModDef module) {
		return imageHelper.getImage( filenameForModule(module) );
	}
	
	/**
	 * Filename for module.
	 *
	 * @param module the module
	 * @return the string
	 */
	public String filenameForModule(ModDef module) {
		if (module.getType().isAbstract()) {
			return "module-abstract.png";
		}
		else if (module.getType().isResource()) {
			return "module-resource.png";
		}
		else if (module.getType().isInterface()) {
			return "module-interface.png";
		}
		else if (module.getType().isConcrete()) {
			if (module.isIncomplete()) {
				// Functor declaration
				return "module-functor.png";
			}
			else if (module.getBody().isFunctorInstantiation()) {
				// Functor instantiation
				return "module-instance.png";
			}
			else {
				// regular Concrete module
				return "module-concrete.png";
			}
		}
		else if (module.getType().isInstance()) {
			return "module-instance.png";
		} else {
			return "gf-logo.png";
		}
	}
	
	/**
	 * For open.
	 *
	 * @return the image
	 */
	public Image forOpen() {
		return imageHelper.getImage("module-open.gif");
	}
	
	/**
	 * For extend.
	 *
	 * @return the image
	 */
	public Image forExtend() {
		return imageHelper.getImage("module-extend.gif");
	}

	/**
	 * For instantiate.
	 *
	 * @return the image
	 */
	public Image forInstantiate() {
		return imageHelper.getImage("module-instance.gif");
	}
	
	/**
	 * For functor.
	 *
	 * @return the image
	 */
	public Image forFunctor() {
		return imageHelper.getImage("module-functor.gif");
	}

	/**
	 * For extend include.
	 *
	 * @return the image
	 */
	public Image forExtendInclude() {
		return imageHelper.getImage("extend-include.png");
	}

	/**
	 * For extend exclude.
	 *
	 * @return the image
	 */
	public Image forExtendExclude() {
		return imageHelper.getImage("extend-exclude.png");
	}

	/**
	 * For flag.
	 *
	 * @return the image
	 */
	public Image forFlag() {
		return imageHelper.getImage("flag.png");
	}

	/**
	 * For param.
	 *
	 * @return the image
	 */
	public Image forParam() {
		return imageHelper.getImage("parameter.gif");
	}
	
	/**
	 * For library reference.
	 *
	 * @return the image
	 */
	public Image forLibraryReference() {
		return imageHelper.getImage("library-reference.gif");
	}



}
