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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.grammaticalframework.eclipse.gF.SourceModule;

/**
 * Refer: org.eclipse.xtext.xtend2.ui.labeling.Xtend2Images
 * Note: If you need an ImageDescriptor, use: {@link ImageDescriptor#createFromImage(Image)}
 * 
 * @author John J. Camilleri
 */
public class GFImages extends PluginImageHelper {
	
	public static ImageDescriptor getImageDescriptorWithoutHelper(String filename) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.grammaticalframework.eclipse.ui", "icons/"+filename);
	}
	public static Image getImageWithoutHelper(String filename) {
		return getImageDescriptorWithoutHelper(filename).createImage();
	}
	

	public Image forProject() {
		return getImage("project.png");
	}
	public Image forFolder() {
		return getImage("folder-open.png");
	}
	
	/**
	 * The GF logo
	 */
	public Image logo() {
		return getImage("gf-logo.png");
	}
	
	/**
	 * An icon based on the module type
	 * 
	 * @param module
	 * @return
	 */
	public Image forModule(SourceModule module) {
		return getImage( filenameForModule(module) );
	}
	
	/**
	 * Filename for module.
	 *
	 * @param module the module
	 * @return the string
	 */
	public String filenameForModule(SourceModule module) {
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
				return "module-functor-instantiation.png";
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
		return getImage("extends-item.png");
	}
	
	public Image forOpenList() {
		return getImage("extends-list.png");
	}
	
	public Image forExtend() {
		return getImage("extends-item.png");
	}
	
	public Image forExtendList() {
		return getImage("extends-list.png");
	}

	public Image forInstantiate() {
		return getImage("module-instance.png");
	}
	
	public Image forFunctor() {
		return getImage("module-functor.png");
	}

	public Image forExtendInclude() {
		return getImage("extend-include.png");
	}

	public Image forExtendExclude() {
		return getImage("extend-exclude.png");
	}

	public Image forFlag() {
		return getImage("flag.png");
	}

	public Image forParam() {
		return getImage("parameter.png");
	}
	
	public Image forConstructor() {
		return getImage("constructor.png");
	}

	public Image forLibraryReference() {
		return getImage("library-reference.png");
	}

	public Image forTopDef() {
		return getImage("library-reference.png");
	}
	public Image forAnyJudgement() {
		return getImage("judgement.png");
	}
	public Image forCatDef() {
		return forAnyJudgement();
	}
	public Image forFunDef() {
		return forAnyJudgement();
	}
	public Image forDefDef() {
		return forAnyJudgement();
	}
	public Image forDataDef() {
		return forAnyJudgement();
	}
	public Image forParamDef() {
		return forAnyJudgement();
	}
	public Image forOperDef() {
		return forAnyJudgement();
	}
	public Image forLinDef() {
		return forAnyJudgement();
	}
	public Image forTermDef() {
		return forAnyJudgement();
	}
	public Image forFlagDef() {
		return forAnyJudgement();
	}

	/**
	 * Expand all action
	 */
	public Image forExpandAll() {
		return getImage("expandall.png");
	}
	
	/**
	 * Collapse all action
	 */
	public Image forCollapseAll() {
		return getImage("collapseall.png");
	}

	/**
	 * Expand all action (disabled)
	 */
	public Image forExpandAllDisabled() {
		return getImage("expandall-disabled.png");
	}
	
	/**
	 * Collapse all action (disabled)
	 */
	public Image forCollapseAllDisabled() {
		return getImage("collapseall-disabled.png");
	}

	/**
	 * Run treebank set
	 */
	public Image forTreebankRun() {
		return getImage("treebank-run.png");
	}
	public Image forTreebankItem() {
		return getImage("treebank-item.png");
	}
	public Image forTreebankItemWithGoldStandard() {
		return getImage("treebank-item-gold.png");
	}
	

	
}
