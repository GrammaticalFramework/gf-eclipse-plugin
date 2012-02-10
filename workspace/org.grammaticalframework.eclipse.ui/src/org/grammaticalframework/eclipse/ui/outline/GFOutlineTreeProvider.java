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
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.serializer.impl.Serializer;
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
import org.grammaticalframework.eclipse.ui.labeling.GFLabelProvider;

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
	 * Prepare label
	 * @param name
	 * @return
	 */
	protected StyledString makeLabel(String name) {
		return ((GFLabelProvider)labelProvider).twoPartLabel(name, null);
	}
	
	/**
	 * Prepare label
	 * @param name
	 * @param type
	 * @return
	 */
	protected StyledString makeLabel(String name, String type) {
		return ((GFLabelProvider)labelProvider).twoPartLabel(name, type);
	}
	
	@SuppressWarnings("restriction")
	@Inject
	protected Serializer serializer;
	
	protected String getTokens(EObject eobj) {
		return getTokens(eobj, (String)null);
	}
	@SuppressWarnings("restriction")
	protected String getTokens(EObject eobj, String fallback) {
		try {
			return serializer.serialize(eobj);
		}
		catch (Exception e) {
			return fallback;
		}
	}
	
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

		// This happens with functor instantiations!
		if (modBody.getModContent() == null)
			return;
		
		// Opens
		if (modBody.getModContent().getOpenList()!=null && !modBody.getModContent().getOpenList().getOpens().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_CONTENT__OPEN_LIST, images.forOpenList(), "Opens", false);
			for (Open o : modBody.getModContent().getOpenList().getOpens()) {
				EObjectNode subnode = createEObjectNode(node, o.getName(), images.forOpen(), o.getName().getS(), true);
				if (o.getAlias() != null) {
					String text = String.format("%s (as \"%s\")", subnode.getText(), o.getAlias().getS());
					subnode.setText(text);
				}
			}
		}
		
		// Extends
		if (modBody.getExtendList()!=null && !modBody.getExtendList().getIncluded().isEmpty()) {
			EStructuralFeatureNode node = createEStructuralFeatureNode(parentNode, modBody, GFPackage.Literals.MOD_BODY__EXTEND_LIST, images.forExtendList(), "Extends", false);
			for (Included i : modBody.getExtendList().getIncluded()) {
//				createNode(node, i.getName());
				EObjectNode subnode = createEObjectNode(node, i.getName(), images.forExtend(), i.getName().getS(), true);
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
				CatDef entity = (CatDef)e;
				StyledString text = makeLabel(entity.getName().getS(), "<Category>");
				createEObjectNode(parentNode, entity.getName(), images.forCatDef(), text, true);
			}
			// fun
			else if (topDef.isFun()) {
				FunDef entity = (FunDef)e;
				for (Ident i : entity.getName()) { 
					StyledString text = makeLabel(i.getS(), getTokens(entity.getType(), "<Function>"));
					createEObjectNode(parentNode, i, images.forFunDef(), text, true);
				}
			}
			// def
			else if (topDef.isDef()) {
				DefDef entity = (DefDef)e;
				for (Name n : entity.getName()) { 
					StyledString text = makeLabel(n.getName().getS(), "<Semantic definition>");
					createEObjectNode(parentNode, n.getName(), images.forDefDef(), text, true);
				}
			}
			// data
			else if (topDef.isData()) {
				DataDef entity = (DataDef)e;
				for (Ident i : entity.getName()) { 
					StyledString text = makeLabel(i.getS(), getTokens(entity.getType(), "<Data constructor definitions>"));
					EObjectNode node = createEObjectNode(parentNode, i, images.forDataDef(), text, false);
					node.setImage(images.forParam());
					for (Ident cons : entity.getConstructors()) {
						createEObjectNode(node, cons, images.forConstructor(), cons.getS(), true);
					}
				}
			}
			// param
			else if (topDef.isParam()) {
				ParamDef entity = (ParamDef)e;
				StyledString text = makeLabel(entity.getName().getS(), "<Parameter type>");
				EObjectNode node = createEObjectNode(parentNode, entity.getName(), images.forParamDef(), text, false);
				node.setImage(images.forParam());
				for (ParConstr cons : entity.getConstructors()) {
					text = makeLabel(cons.getName().getS(), entity.getName().getS());
					createEObjectNode(node, cons, images.forConstructor(), text, true);
				}
			}
			// oper
			else if (topDef.isOper()) {
				OperDef entity = (OperDef)e;
				for (Name n : entity.getName()) {
					if (entity.isOverload()) {
						StyledString text = makeLabel(n.getName().getS(), "<Overloaded operation>");
						EObjectNode node = createEObjectNode(parentNode, n.getName(), images.forOperDef(), text, false);
						for (OperDef overload : entity.getOverloads()) {
							for (Name n2 : overload.getName()) {
								text = makeLabel(n2.getName().getS(), getTokens(overload.getType(), "<Operation>"));
								createEObjectNode(node, n2, images.forConstructor(), text, true);
							}
						}
					} else {
						StyledString text = makeLabel(n.getName().getS(), getTokens(entity.getType(), "<Operation>"));
						createEObjectNode(parentNode, n.getName(), images.forOperDef(), text, true);
					}
				}
			}
			// lincat, lindef, printname
			else if (topDef.isLincat() || topDef.isLindef() || topDef.isPrintname()) {
				TermDef entity = (TermDef)e;
				for (Name n : entity.getName()) { 
					StyledString text = makeLabel(n.getName().getS(), getTokens(entity.getDefinition()));
					createEObjectNode(parentNode, n.getName(), images.forTermDef(), text, true);
				}
			}
			// lin
			else if (topDef.isLin()) {
				for (Name n : ((LinDef)e).getName()) { 
					StyledString text = makeLabel(n.getName().getS(), "<Linearisation>");
					createEObjectNode(parentNode, n.getName(), images.forLinDef(), text, true);
				}
			}
			// flags
			else if (topDef.isFlags()) {
				StyledString text = makeLabel(String.format("%s = %s", ((FlagDef)e).getName().getS(), ((FlagDef)e).getValue().getS()), "<Flag>");
				createEObjectNode(parentNode, (FlagDef)e, images.forFlag(), text, true);
			}
			// Unknown
			else {
				// This should never happen
				log.info("Unknown case in outline provider");
			}
		}
	}
	
	protected void _createChildren(IOutlineNode parentNode, CatDef _) {
		return;
	}	

}