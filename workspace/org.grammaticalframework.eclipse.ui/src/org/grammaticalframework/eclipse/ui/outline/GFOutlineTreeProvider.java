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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;
import org.grammaticalframework.eclipse.GFException;
import org.grammaticalframework.eclipse.gF.*;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;

import com.google.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * customization of the default outline structure.
 */
public class GFOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	/**
	 * The images.
	 */
	@Inject
	private GFImages images;
	
	/**
	 * _create children.
	 *
	 * @param parentNode the parent node
	 * @param modDef the mod def
	 */
	protected void _createChildren(IOutlineNode parentNode, ModDef modDef) {
		createChildren(parentNode, modDef.getBody());
	}

	/**
	 * _create children.
	 *
	 * @param parentNode the parent node
	 * @param modBody the mod body
	 */
	protected void _createChildren(IOutlineNode parentNode, ModBody modBody) {

		// Opens
		if (!modBody.getOpens().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__OPENS, images.forOpen(), "Opens", false);
			for (Open o : modBody.getOpens()) {
				EObjectNode subnode = createEObjectNode(node, o.getName());
				if (o.getAlias() != null) {
					String text = String.format("%s (as \"%s\")", subnode.getText(), o.getAlias().getS());
					subnode.setText(text);
				}
			}
		}
		
		// Extends
		if (!modBody.getExtends().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__EXTENDS, images.forExtend(), "Extends", false);
			for (Included i : modBody.getExtends()) {
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
		if (modBody.getFunctor() != null) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__FUNCTOR, images.forFunctor(), "Functor", false);
			createNode(node, modBody.getFunctor().getName());
		}
		
		// Instantiations
		if (!modBody.getInstantiations().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__INSTANTIATIONS, images.forInstantiate(), "Instantiates", false);
			for (Open i : modBody.getInstantiations()) {
				EObjectNode subnode = createEObjectNode(node, i.getName());
				String text = String.format("%s = %s", i.getAlias().getS(), subnode.getText());
				subnode.setText(text);
			}
		}
		
		// Judgements
		for (TopDef t : modBody.getJudgements()) {
			createNode(parentNode, t);
		}
		
	}

	
	/**
	 * _create children.
	 *
	 * @param parentNode the parent node
	 * @param topDef the top def
	 * @throws GFException the gF exception
	 */
	protected void _createChildren(IOutlineNode parentNode, TopDef topDef) throws GFException {
		
		// Cat
		if (topDef.isCat()) {
			for (EObject e : topDef.getDefinitions()) {
				CatDef c = (CatDef)e; 
				createNode(parentNode, c.getName());
			}
		}
		
		// Fun, Data
		else if (topDef.isFun() || topDef.isData()) {
			for (EObject e : topDef.getDefinitions()) {
				FunDef f = (FunDef)e;
				for (Ident i : f.getName()) { 
					createNode(parentNode, i);
				}
			}
		}
		
		// Def, Oper, Lindef, Lin
		else if (topDef.isDef() || topDef.isOper() || topDef.isLindef() || topDef.isLin()) {
			for (EObject e : topDef.getDefinitions()) {
				Def d = (Def)e;
				for (Name n : d.getName()) { 
					createNode(parentNode, n.getName());
				}
			}
		}
		
		// Param
		else if (topDef.isParam()) {
			for (EObject e : topDef.getDefinitions()) {
				ParDef p = (ParDef)e;
				EObjectNode node = createEObjectNode(parentNode, p.getName());
				node.setImage(images.forParam());
				
				for (ParConstr pc : p.getConstructors()) {
					createNode(node, pc.getName());
				}
			}
		}
		
		// Lincat, printnane
		else if (topDef.isLincat() || topDef.isPrintname()) {
			for (EObject e : topDef.getDefinitions()) {
				PrintDef p = (PrintDef)e;
				for (Name n : p.getName()) { 
					createNode(parentNode, n.getName());
				}
			}
		}
		
		// Flags
		else if (topDef.isFlags()) {
			EStructuralFeature feature = topDef.getDefinitions().get(0).eContainingFeature();
			for (EObject e : topDef.getDefinitions()) {
				FlagDef f = (FlagDef)e; 
				String text = String.format("%s = %s", f.getName().getS(), f.getValue().getS());
				createEStructuralFeatureNode(parentNode, topDef, feature, images.forFlag(), text, true);
			}
		}
		
		else {
			// This should never happen
			throw new GFException("Unknown case");
		}
	}	
}