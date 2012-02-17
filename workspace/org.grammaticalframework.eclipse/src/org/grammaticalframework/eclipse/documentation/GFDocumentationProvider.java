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

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.PolymorphicDispatcher.ErrorHandler;
import org.grammaticalframework.eclipse.gF.CatDef;
import org.grammaticalframework.eclipse.gF.DataDef;
import org.grammaticalframework.eclipse.gF.DefDef;
import org.grammaticalframework.eclipse.gF.FlagDef;
import org.grammaticalframework.eclipse.gF.FunDef;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.Inst;
import org.grammaticalframework.eclipse.gF.LinDef;
import org.grammaticalframework.eclipse.gF.ListIncluded;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModContent;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Name;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.OperDef;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParamDef;
import org.grammaticalframework.eclipse.gF.TermDef;
import org.grammaticalframework.eclipse.gF.TopDef;
import org.grammaticalframework.eclipse.scoping.GFScopingHelper;

/**
 * Custom documentation provider, provides:
 * 1. Type information
 * 2. In-source comments/gfDoc
 * @author John J. Camilleri
 *
 */
public class GFDocumentationProvider implements IEObjectDocumentationProvider {
//public class GFDocumentationProvider extends MultiLineCommentDocumentationProvider {
	
	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFDocumentationProvider.class);
	
	
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
		// Empirically this is only ever an Ident
		if (o instanceof Ident) {
			String gfDoc = findComment(o);
			String documentation = textDispatcher.invoke(o.eContainer());
			String format = "%s <font style=\"color:#888; font-style:italic;\">(inline comment)</font><br/>%s";
			return (gfDoc!=null) ? String.format(format, gfDoc, documentation) : documentation;
		}
		else {
			log.warn("Wasn't expecting to get documentation for: "+o.toString());
			return null;
		}
	}
	

	String startTag = "--"; // regex
	String ruleName = "SL_COMMENT";

	private String checkNodeForComments(INode abstractNode) {
		if (abstractNode instanceof ILeafNode && !((ILeafNode) abstractNode).isHidden())
			// Not interested in non-hidden nodes
			return null;
		if (abstractNode instanceof ILeafNode && abstractNode.getGrammarElement() instanceof TerminalRule
				&& ruleName.equalsIgnoreCase(((TerminalRule) abstractNode.getGrammarElement()).getName())) {
			
			// We've found our SL_COMMENT
			String comment = ((ILeafNode) abstractNode).getText();
			if (comment.matches("(?s)" + startTag + ".*")) {
				return comment;
			}
		}
		return null;
	}
	
	
	/**
	 * Try to find some meaningful comments around the Ident declaration:
	 * <ul>
	 * 		<li>SL comment at end of line</li>
	 * </ul>
	 * 
	 * Based heavily on MultiLineCommentDocumentationProvider#findComment(EObject)
	 * @param o EObject
	 * @return Found comments as a string, or <code>null</code>
	 */
	protected String findComment(EObject o) {
		StringBuilder sb = new StringBuilder();
		
		ICompositeNode node = NodeModelUtils.getNode(o);
		outer: while (node!=null && !(node.getSemanticElement() instanceof ModContent) && sb.length()==0) {
			
			for (INode abstractNode : node.getAsTreeIterable()) {
				String s = checkNodeForComments(abstractNode);
				if (s!=null) {
					sb.append(s);
					break outer;
				}
			}
			INode sibling = node;
			while (sibling.hasNextSibling()) {
				sibling = sibling.getNextSibling();
				String s = checkNodeForComments(sibling);
				if (s!=null) {
					sb.append(s);
					break;
				}
			}
			
			// climb upwards
			node = node.getParent();
		}
		if (sb.length()>0) {
			String returnValue = sb.toString();
			returnValue = returnValue.replaceAll("\\A" + startTag, "");
//			returnValue = returnValue.replaceAll(endTag + "\\z", "");
//			returnValue = returnValue.replaceAll("(?m)^"+ whitespace + linePrefix, "");
//			returnValue = returnValue.replaceAll("(?m)" + whitespace + linePostfix + whitespace + "$", "");
			return returnValue.trim();
		} else {
			return null;
		}
	}
	
	/**
	 * Get actual source tokens for eObject and append to stringbuilder in a &lt;pre&gt; block.
	 * @param eobj EObject to serialize
	 * @param sb StringBuilder to append to
	 */
	private void appendTokens(EObject eobj, StringBuilder sb) {
		final ICompositeNode node = NodeModelUtils.findActualNodeFor(eobj);		
		if (node != null) {
			sb.append("<pre>");
		    sb.append(NodeModelUtils.getTokenText(node));
			sb.append("</pre>");
		}
	}
	
	/**
	 * Start a list with the given heading (using &lt;dl&gt; tags) 
	 * @param string
	 * @return
	 */
	private String startList(String string) {
		return String.format("<dl><dt>%s:</dt>", string);
	}
	
	/**
	 * End a list (using &lt;dl&gt; tags) 
	 * @param string
	 * @return
	 */
	private String endList() {
		return String.format("</dl>");
	}
	
	/**
	 * Wrap Ident in &lt;code&gt; tags
	 * @param id Ident instance
	 * @return String
	 */
	@SuppressWarnings("unused")
	private String wrapID(Ident id) {
		return String.format("<code>%s</code>", id.getS());
	}
	
	/**
	 * Wrap Ident in quotes and &lt;code&gt; tags
	 * @param id Ident instance
	 * @return String
	 */
	private String wrapIDQuotes(Ident id) {
		return String.format("\"<code>%s</code>\"", id.getS());
	}
	
	/**
	 * Wrap Ident in &lt;li&gt; and &lt;code&gt; tags
	 * @param id Ident instance
	 * @return String
	 */
	private String wrapIDList(Ident id) {
		return wrapIDList(id.getS());
	}
	
	/**
	 * Wrap String in &lt;li&gt; and &lt;code&gt; tags
	 * @param s String to wrap
	 * @return String
	 */
	private String wrapIDList(String s) {
		return String.format("<dd><code>%s</code></dd>", s);
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
			return String.format("Module %s as %s.", wrapIDQuotes(def.getName()), wrapIDQuotes(def.getAlias()));
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
		return String.format("Instantiation of %s with %s.", wrapIDQuotes(def.getInterface()), wrapIDQuotes(def.getName()));
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
			sb.append(String.format("Inherited module %s.", wrapIDQuotes(def.getName())));
		} else if (def.eContainer() instanceof ModBody) {
			// Functor instantiaion
			sb.append(String.format("Instantiation of functor %s.", wrapIDQuotes(def.getName())));
		} else if (def.eContainer() instanceof ModType) {
			// Interface instantiaion
			sb.append(String.format("Instantiation of interface %s.", wrapIDQuotes(def.getName())));
		}
		
		if (def.isInclusive()) {
			sb.append(startList("Includes only"));
			for (Ident id : def.getIncludes()) {
				sb.append(wrapIDList(id));
			}
			sb.append(endList());
		} else if (def.isExclusive()) {
			sb.append(startList("Excludes"));
			for (Ident id : def.getExcludes()) {
				sb.append(wrapIDList(id));
			}
			sb.append(endList());
		}
		return sb.toString();
	}
	
	/**
	 * Category declaration (cat)
	 * @param def
	 * @return
	 */
	protected String handle(CatDef def) {
		StringBuilder sb = new StringBuilder("Category declaration.");
		appendTokens(def, sb);
		return sb.toString();
	}
	
	/**
	 * Function declaration (fun)
	 * @param def
	 * @return
	 */
	protected String handle(FunDef def) {
		StringBuilder sb = new StringBuilder("Function declaration.");
		appendTokens(def, sb);
		return sb.toString();
	}
	
	/**
	 * Names can occur in: DefDef, OperDef, LinDef, TermDef; just delegate to parent.
	 * @param def
	 * @return
	 */
	protected String handle(Name def) {
		return textDispatcher.invoke(def.eContainer());
	}
	
	/**
	 * Function definition (def)
	 * @param def
	 * @return
	 */
	protected String handle(DefDef def) {
		StringBuilder sb = new StringBuilder("Function definition.");
		appendTokens(def, sb);
		return sb.toString();
	}
	
	/**
	 * Data constructor definition
	 * @param def
	 * @return
	 */
	protected String handle(DataDef def) {
		StringBuilder sb = new StringBuilder("Data constructor.");
		appendTokens(def, sb);
		return sb.toString();
	}
	
	/**
	 * Parameter declaration (param)
	 * @param def
	 * @return
	 */
	protected String handle(ParamDef def) {
		StringBuilder sb = new StringBuilder();
		sb.append(startList("Possible constructors"));
		for (ParConstr constr : def.getConstructors()) {
			final ICompositeNode node = NodeModelUtils.findActualNodeFor(constr);
			String s = (node!=null) ? NodeModelUtils.getTokenText(node) : constr.getName().getS();
			sb.append(wrapIDList(s));
		}
		sb.append(endList());
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
		sb.append(String.format("Constructor of parameter %s.", wrapIDQuotes(paramdef.getName())));
		sb.append(startList("Other constructors"));
		for (ParConstr constrAlt : paramdef.getConstructors()) {
			if (!constrAlt.equals(constr)) {
				final ICompositeNode node = NodeModelUtils.findActualNodeFor(constrAlt);
				String s = (node!=null) ? NodeModelUtils.getTokenText(node) : constrAlt.getName().getS();
				sb.append(wrapIDList(s));
			}
		}
		sb.append(endList());
		return sb.toString();
	}
	
	/**
	 * Operation definition (oper)
	 * @param def
	 * @return
	 */
	protected String handle(OperDef def) {
		StringBuilder sb = new StringBuilder();
		if (def.isOverload()) {
			sb.append("Overloaded operation definitions.");
			sb.append(startList("All forms"));
			for (OperDef oper : def.getOverloads()) {
				final ICompositeNode node = NodeModelUtils.findActualNodeFor(oper.getType());		
				if (node != null) {
				    sb.append( wrapIDList( NodeModelUtils.getTokenText(node) ) );
				}
			}
			sb.append(endList());
		} else {
			sb.append("Operation definition.");
			appendTokens(def.getType(), sb);
		}
		return sb.toString();
	}
	
	/**
	 * Linearization definition (lin)
	 * @param def
	 * @return
	 */
	protected String handle(LinDef def) {
		StringBuilder sb = new StringBuilder("Linearization definition.");
		appendTokens(def, sb);
		return sb.toString();
	}
	
	/**
	 * TermDef can occur in: lincat, lindef, printname cat, printname fun;
	 * @param def
	 * @return
	 */
	protected String handle(TermDef def) {
		StringBuilder sb = new StringBuilder();
		
		TopDef topdef = (TopDef)def.eContainer();
		if (topdef.isLincat()) {
			sb.append("Linearization type definition for");
		} else if (topdef.isLindef()) {
			sb.append("Linearization default definition for");
		} else if (topdef.isPrintname()) {
			sb.append("Printname definition for");
		}
		
		if (def.getName().size()==1) {
			sb.append(" " + wrapIDQuotes(def.getName().get(0).getName()));
		} else {
			sb = new StringBuilder( startList(sb.toString()) );
			for (Name name : def.getName()) {
				sb.append( wrapIDList(name.getName()) );
			}
			sb.append(endList());
		}

		return sb.toString();
	}
		
	/**
	 * Flag definition
	 * @param def
	 * @return
	 */
	protected String handle(FlagDef def) {
		StringBuilder sb = new StringBuilder("Flag.");
		appendTokens(def, sb);
		return sb.toString();
	}
		
}
