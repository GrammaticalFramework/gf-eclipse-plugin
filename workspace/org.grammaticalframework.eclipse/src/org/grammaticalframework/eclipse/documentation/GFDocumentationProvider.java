/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.documentation;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Exceptions;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;
import org.grammaticalframework.eclipse.gF.CatDef;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.Inst;
import org.grammaticalframework.eclipse.gF.ListIncluded;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParamDef;

/**
 * Custom documentation provider, provides:
 * 1. Type information
 * 2. In-source comments/gfDoc
 * @author John J. Camilleri
 *
 */
public class GFDocumentationProvider implements IEObjectDocumentationProvider {
//public class GFDocumentationProvider extends MultiLineCommentDocumentationProvider {
	
	private final PolymorphicDispatcher<String> textDispatcher = new PolymorphicDispatcher<String>("handle", 1, 1,
			Collections.singletonList(this), new ErrorHandler<String>() {
				public String handle(Object[] params, Throwable e) {
					return null;
				}
			});	

	/**
	 * Get documentation for the [resolved] eobject. Polymorphically dispatches to the other methods. 
	 */
	public String getDocumentation(EObject o) {
		return textDispatcher.invoke(o.eContainer());
	}
	
	/**
	 * Module declaration
	 * @param def
	 * @return
	 */
	protected String handle(ModType def) {
		return "Module definition.";
	}
	
	/**
	 * Opened module
	 * @param def
	 * @return
	 */
	protected String handle(Open def) {
		if (def.getAlias()!=null) {
			return String.format("Module \"%s\" as \"%s\".", def.getName().getS(), def.getAlias().getS());
		} else {
			return "Opened module.";
		}
	}
	
	/**
	 * Instance instantiation
	 * @param def
	 * @return
	 */
	protected String handle(Inst def) {
		return String.format("Instantiation of \"%s\" with \"%s\".", def.getInterface().getS(), def.getName().getS());
	}
	
	/**
	 * Functor instantiation
	 * @param def
	 * @return
	 */
	protected String handle(Included def) {
		StringBuilder sb = new StringBuilder();
		
		// We need some further checking
		if (def.eContainer() instanceof ListIncluded) {
			// Extends
			sb.append(String.format("Inherited module \"%s\".", def.getName().getS()));
		} else if (def.eContainer() instanceof ModBody) {
			// Functor instantiaion
			sb.append(String.format("Instantiation of functor \"%s\".", def.getName().getS()));
		} else if (def.eContainer() instanceof ModType) {
			// Interface instantiaion
			sb.append(String.format("Instantiation of interface \"%s\".", def.getName().getS()));
		}
		
		if (def.isInclusive()) {
			sb.append("<br/>Includes only:<ul>");
			for (Ident id : def.getIncludes()) {
				sb.append(String.format("<li>%s</li>", id.getS()));
			}
			sb.append("</ul>");
		} else if (def.isExclusive()) {
			sb.append("<br/>Excludes:<ul>");
			for (Ident id : def.getExcludes()) {
				sb.append(String.format("<li>%s</li>", id.getS()));
			}
			sb.append("</ul>");
		}
		return sb.toString();
	}
	
	/**
	 * Category declaration
	 * @param def
	 * @return
	 */
	protected String handle(CatDef def) {
		final ICompositeNode node = NodeModelUtils.findActualNodeFor(def);		
		if (node != null) {
		    return NodeModelUtils.getTokenText(node);
		}
		return null;
	}
	
	/**
	 * Parameter declaration
	 * @param def
	 * @return
	 */
	protected String handle(ParamDef def) {
		StringBuilder sb = new StringBuilder();
		sb.append("Possible constructors:<ul>");
		for (ParConstr constr : def.getConstructors()) {
			final ICompositeNode node = NodeModelUtils.findActualNodeFor(constr);
			String s = (node!=null) ? NodeModelUtils.getTokenText(node) : constr.getName().getS();
			sb.append(String.format("<li>%s</li>", s));
		}
		sb.append("</ul>");
		return sb.toString();
	}
	
	/**
	 * Parameter constructor
	 * @param def
	 * @return
	 */
	protected String handle(ParConstr constr) {
		ParamDef paramdef = (ParamDef)constr.eContainer();
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Constructor of parameter \"%s\".<br/>", paramdef.getName().getS()));
		sb.append("Other constructors:<ul>");
		for (ParConstr constrAlt : paramdef.getConstructors()) {
			if (!constrAlt.equals(constr)) {
				final ICompositeNode node = NodeModelUtils.findActualNodeFor(constrAlt);
				String s = (node!=null) ? NodeModelUtils.getTokenText(node) : constrAlt.getName().getS();
				sb.append(String.format("<li>%s</li>", s));
			}
		}
		sb.append("</ul>");
		return sb.toString();
	}

}
