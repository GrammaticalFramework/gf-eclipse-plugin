/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.grammaticalframework.eclipse.services.GFGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class GFFormatter extends AbstractDeclarativeFormatter {

	/*
	 * Can't get this to work, and either way it's best to allow users to choose
	 * their own preferences for indentation
	 * 
	 * @Override protected IIndentationInformation getIndentInfo() { return
	 * indentInfo; }
	 * 
	 * @Inject(optional = true) private IIndentationInformation indentInfo = new
	 * IIndentationInformation() { public String getIndentString() { return
	 * "  "; } };
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter#
	 * configureFormatting(org.eclipse.xtext.formatting.impl.FormattingConfig)
	 */
	protected void configureFormatting(FormattingConfig c) {
		GFGrammarAccess f = (GFGrammarAccess) getGrammarAccess();

		// Never auto-wrap lines
		c.setAutoLinewrap(Integer.MAX_VALUE / 2);

		// Preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

		// open
		for (Keyword k : new Keyword[] {
				f.getModBodyAccess().getOpenKeyword_0_2_0(),
				f.getModBodyAccess().getOpenKeyword_3_5_0(),
				f.getModBodyAccess().getOpenKeyword_5_7_0(),
		}) {
			c.setLinewrap().before(k);
			c.setIndentationIncrement().before(k);
			c.setIndentationDecrement().after(k); // don't cascade the
													// indentation!
		}

		// Special case when using `open (Alias = Name)`
		Keyword k2 = f.getOpenAccess().getLeftParenthesisKeyword_2_0();
		c.setLinewrap().before(k2);
		c.setIndentationIncrement().before(k2);
		c.setIndentationDecrement().after(k2); // don't cascade the indentation!

		// Indentation within the ModDef's body
		c.setIndentation(f.getModBodyAccess().getLeftCurlyBracketKeyword_0_3(), f.getModBodyAccess().getRightCurlyBracketKeyword_0_5());
		c.setIndentation(f.getModBodyAccess().getLeftCurlyBracketKeyword_3_6(), f.getModBodyAccess().getRightCurlyBracketKeyword_3_8());
		c.setIndentation(f.getModBodyAccess().getLeftCurlyBracketKeyword_5_8(), f.getModBodyAccess().getRightCurlyBracketKeyword_5_10());

		// Top def groupings (`cat`, `fun`, `lin` ...)
		for (Keyword k : new Keyword[] {
				f.getTopDefAccess().getCatCatKeyword_0_0_0(),
				f.getTopDefAccess().getFunFunKeyword_1_0_0(),
				f.getTopDefAccess().getDataDataKeyword_2_0_0(),
				f.getTopDefAccess().getDefDefKeyword_3_0_0(),
				f.getTopDefAccess().getDataDataKeyword_4_0_0(),
				f.getTopDefAccess().getParamParamKeyword_5_0_0(),
				f.getTopDefAccess().getOperOperKeyword_6_0_0(),
				f.getTopDefAccess().getLincatLincatKeyword_7_0_0(),
				f.getTopDefAccess().getLindefLindefKeyword_8_0_0(),
				f.getTopDefAccess().getLinLinKeyword_9_0_0(),
				f.getTopDefAccess().getPrintnamePrintnameKeyword_10_0_0(),
				f.getTopDefAccess().getPrintnamePrintnameKeyword_11_0_0(),
				f.getTopDefAccess().getFlagsFlagsKeyword_12_0_0(),
		}) {
			c.setLinewrap(2).before(k);
			c.setLinewrap().after(k);
			c.setIndentationIncrement().after(k);
		}
		c.setIndentationDecrement().after(f.getTopDefRule());
		
		// TODO What about when we have a judgement type every time?:
		// cat Noun ;
		// cat Verb ;
		// etc... Not sure if this is possible!

		// New line for each judgement
		for (Keyword k : new Keyword[] {
				f.getTopDefAccess().getSemicolonKeyword_0_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_1_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_2_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_3_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_4_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_5_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_6_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_7_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_8_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_9_1_1(),
				f.getTopDefAccess().getSemicolonKeyword_10_2_1(),
				f.getTopDefAccess().getSemicolonKeyword_11_2_1(),
				f.getTopDefAccess().getSemicolonKeyword_12_1_1(),
		}) {
			c.setLinewrap().after(k);
		}

		// Braces in cat judgement, e.g. [Clause] {2}
		c.setNoSpace().bounds(
				f.getCatDefAccess().getLeftCurlyBracketKeyword_1_4_0(),
				f.getCatDefAccess().getRightCurlyBracketKeyword_1_4_2());

		// Comma in lincat judgements, e.g.: `Cat1, Cat2 : SS ;`
		c.setLinewrap().after(f.getPrintDefAccess().getCommaKeyword_1_0());

		// c.setLinewrap().before(f.getCatDefRule());
		// c.setLinewrap().before(f.getFunDefRule());
		// c.setLinewrap().before(f.getDefRule());
		// c.setLinewrap().before(f.getDataDefRule());
		// c.setLinewrap().before(f.getParDefRule());
		// c.setLinewrap().before(f.getPrintDefRule());
		// c.setLinewrap().before(f.getFlagDefRule());

		// case, table
		// c.setLinewrap().before(f.getListCaseRule());
		c.setLinewrap().after(f.getListCaseAccess().getSemicolonKeyword_1_0());
		for (Keyword[] k : new Keyword[][] {
				{ f.getExp4Access().getLeftCurlyBracketKeyword_0_1(), f.getExp4Access().getRightCurlyBracketKeyword_0_3() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_1_2_0_0(), f.getExp4Access().getRightCurlyBracketKeyword_1_2_0_2() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_2_3(), f.getExp4Access().getRightCurlyBracketKeyword_2_5() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_3_1(), f.getExp4Access().getRightCurlyBracketKeyword_3_3() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_4_1(), f.getExp4Access().getRightCurlyBracketKeyword_4_3() },
		}) {
			c.setLinewrap().after(k[0]);
			c.setIndentation(k[0], k[1]);
			c.setLinewrap().before(k[1]);
		}

		// Commas in local bindings
		c.setNoSpace().after(f.getListBindAccess().getCommaKeyword_1_1_0());

		// Find common keywords and specify formatting for them
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}
		for (Keyword period : f.findKeywords(".")) {
			c.setNoSpace().before(period);
			c.setNoSpace().after(period);
		}
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}
		for (Keyword slash : f.findKeywords("\\")) {
			c.setNoSpace().after(slash);
		}
		// for (Keyword semicolon : f.findKeywords(";")) {
		// c.setLinewrap().after(semicolon);
		// }
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("[", "]")) {
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}

		// TODO Formatting for let

	}
}
