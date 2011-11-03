package org.grammaticalframework.eclipse.ui.labeling;

import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.grammaticalframework.eclipse.gF.ModDef;

import com.google.inject.Inject;

/**
 * Refer: org.eclipse.xtext.xtend2.ui.labeling.Xtend2Images
 * URL: http://git.eclipse.org/c/tmf/org.eclipse.xtext.git/tree/plugins/org.eclipse.xtext.xtend2.ui/src/org/eclipse/xtext/xtend2/ui/labeling/Xtend2Images.java?id=v2.0.1
 * @author John J. Camilleri
 *
 */

public class GFImages {

	@Inject
	private IImageHelper imageHelper;
	
	/* --------- */
	
	public Image logo() {
		return imageHelper.getImage("gf-logo.png");
	}
	
	public Image forModule(ModDef module) {
		return imageHelper.getImage( filenameForModule(module) );
	}
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
	
	public Image forOpen() {
		return imageHelper.getImage("module-open.gif");
	}
	
	public Image forExtend() {
		return imageHelper.getImage("module-extend.gif");
	}

	public Image forInstantiate() {
		return imageHelper.getImage("module-instance.gif");
	}
	
	public Image forFunctor() {
		return imageHelper.getImage("module-functor.gif");
	}

	public Image forExtendInclude() {
		return imageHelper.getImage("extend-include.png");
	}

	public Image forExtendExclude() {
		return imageHelper.getImage("extend-exclude.png");
	}

	public Image forFlag() {
		return imageHelper.getImage("flag.png");
	}

	public Image forParam() {
		return imageHelper.getImage("parameter.gif");
	}



}
