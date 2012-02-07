/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.outline;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.grammaticalframework.eclipse.GFException;
import org.grammaticalframework.eclipse.gF.CatDef;
import org.grammaticalframework.eclipse.gF.DataDef;
import org.grammaticalframework.eclipse.gF.DefDef;
import org.grammaticalframework.eclipse.gF.FlagDef;
import org.grammaticalframework.eclipse.gF.FunDef;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.Inst;
import org.grammaticalframework.eclipse.gF.LinDef;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.Name;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.OperDef;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParamDef;
import org.grammaticalframework.eclipse.gF.SourceModule;
import org.grammaticalframework.eclipse.gF.TermDef;
import org.grammaticalframework.eclipse.gF.TopDef;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

/**
 * customization of the default outline structure.
 */
public class GFOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFOutlineTreeProvider.class);
	
	/**
	 * Image helper
	 */
	@Inject
	private GFImages images;
	
	/**
	 * Top-most node
	 *
	 * @param parentNode the parent node
	 * @param modDef the mod def
	 */
	protected void _createChildren(IOutlineNode parentNode, SourceModule modDef) {
		createChildren(parentNode, modDef.getBody());
	}

	/**
	 * Handle opens, extends etc.
	 *
	 * @param parentNode the parent node
	 * @param modBody the mod body
	 */
	protected void _createChildren(IOutlineNode parentNode, ModBody modBody) {

		// Opens
		if (modBody.getModContent().getOpenList()!=null && !modBody.getModContent().getOpenList().getOpens().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_CONTENT__OPEN_LIST, images.forOpen(), "Opens", false);
			for (Open o : modBody.getModContent().getOpenList().getOpens()) {
				EObjectNode subnode = createEObjectNode(node, o.getName());
				if (o.getAlias() != null) {
					String text = String.format("%s (as \"%s\")", subnode.getText(), o.getAlias().getS());
					subnode.setText(text);
				}
			}
		}
		
		// Extends
		if (modBody.getExtendList()!=null && !modBody.getExtendList().getIncluded().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__EXTEND_LIST, images.forExtend(), "Extends", false);
			for (Included i : modBody.getExtendList().getIncluded()) {
//				createNode(node, i.getName());
				EObjectNode subnode = createEObjectNode(node, i.getName());
				if (i.isInclusive()) {
					for (Ident id : i.getIncludes()) {
						createEStructuralFeatureNode(subnode, i, GFPackage.Literals.IDENT__S, images.forExtendInclude(), id.getS(), true);
					}
				}
				if (i.isExclusive()) {
					for (Ident id : i.getExcludes()) {
						createEStructuralFeatureNode(subnode, i, GFPackage.Literals.IDENT__S, images.forExtendExclude(), id.getS(), true);
					}
				}
			}
		}
		
		// Functor
		if (modBody.getFunctor()!=null) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__FUNCTOR, images.forFunctor(), "Functor", false);
			createNode(node, modBody.getFunctor().getName());
		}
		
		// Instantiations
		if (modBody.getInstantiationList()!=null && !modBody.getInstantiationList().getInstantiations().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__INSTANTIATION_LIST, images.forInstantiate(), "Instantiates", false);
			for (Inst i : modBody.getInstantiationList().getInstantiations()) {
				EObjectNode subnode = createEObjectNode(node, i.getName());
				String text = String.format("%s = %s", i.getInterface().getS(), subnode.getText());
				subnode.setText(text);
			}
		}
		
		// Judgements
		for (TopDef t : modBody.getModContent().getJudgements()) {
			createNode(parentNode, t);
		}
		
	}

	protected void _createChildren(IOutlineNode parentNode, CatDef topDef) {
		createNode(parentNode, topDef.getName());
	}

	
	/**
	 * Handle top-level judgements
	 *
	 * @param parentNode the parent node
	 * @param topDef the top def
	 * @throws GFException the gF exception
	 */
	protected void _createChildren(IOutlineNode parentNode, TopDef topDef) {

		for (EObject e : topDef.getDefinitions()) {
			// cat
			if (topDef.isCat()) {
				createNode(parentNode, ((CatDef)e).getName());
			}
			// fun
			else if (topDef.isFun()) {
				for (Ident i : ((FunDef)e).getName()) { 
					createNode(parentNode, i);
				}
			}
			// def
			else if (topDef.isDef()) {
				for (Name n : ((DefDef)e).getName()) { 
					createNode(parentNode, n.getName());
				}
			}
			// data
			else if (topDef.isData()) {
				DataDef d = (DataDef)e;
				for (Ident i : d.getName()) { 
					EObjectNode node = createEObjectNode(parentNode, i);
					node.setImage(images.forParam());
					for (Ident cons : d.getConstructors()) {
						createNode(node, cons);
					}
				}
			}
			// param
			else if (topDef.isParam()) {
				ParamDef p = (ParamDef)e;
				EObjectNode node = createEObjectNode(parentNode, p.getName());
				node.setImage(images.forParam());
				for (ParConstr pc : p.getConstructors()) {
					createNode(node, pc.getName());
				}
			}
			// oper
			else if (topDef.isOper()) {
				OperDef o = (OperDef)e;
				for (Name n : o.getName()) {
					EObjectNode node = createEObjectNode(parentNode, n.getName());
					if (o.isOverload()) {
						for (OperDef overload : o.getOverloads()) {
							for (Name n2 : overload.getName()) {
								createNode(node, n2.getName());
							}
						}
					}
				}
			}
			// lincat, lindef, printname
			else if (topDef.isLincat() || topDef.isLindef() || topDef.isPrintname()) {
				for (Name n : ((TermDef)e).getName()) { 
					createNode(parentNode, n.getName());
				}
			}
			// lin
			else if (topDef.isLin()) {
				for (Name n : ((LinDef)e).getName()) { 
					createNode(parentNode, n.getName());
				}
			}
			// flags
			else if (topDef.isFlags()) {
				EStructuralFeature feature = topDef.getDefinitions().get(0).eContainingFeature();
				FlagDef f = (FlagDef)e; 
				String text = String.format("%s = %s", f.getName().getS(), f.getValue().getS());
				createEStructuralFeatureNode(parentNode, topDef, feature, images.forFlag(), text, true);
			}
			// Unknown
			else {
				// This should never happen
				log.info("Unknown case in outline provider");
			}
		}
	}	
}