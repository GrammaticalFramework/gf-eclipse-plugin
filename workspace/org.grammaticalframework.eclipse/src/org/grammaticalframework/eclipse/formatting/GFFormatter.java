/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.IIndentationInformation;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.grammaticalframework.eclipse.services.GFGrammarAccess;

import com.google.inject.Inject;

/**
 * This class contains custom formatting description.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class GFFormatter extends AbstractDeclarativeFormatter {

	/**
	 * Custom indentation, using 2 spaces.
	 */
	@Inject(optional = true)
	private IIndentationInformation indentInfo_2Spaces = new IIndentationInformation() {
		public String getIndentString() {
			return "  ";
		}
	};
	
	/**
	 * Get out custom indentation
	 */
	@Override
	protected IIndentationInformation getIndentInfo() {
		return indentInfo_2Spaces;
	}
	
	/**
	 * Create formatting config, using our custom indentation

	 * @see org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter#
	 * createFormatterStream(String, org.eclipse.xtext.parsetree.reconstr.ITokenStream, boolean)
	 */
	@Override
	@SuppressWarnings("deprecation")
	protected FormattingConfig createFormattingConfig() {
		FormattingConfig cfg = new FormattingConfig(super.getGrammarAccess(), super.getHiddenTokenHelper(), indentInfo_2Spaces);
		cfg.setWhitespaceRule(getWSRule());
		return cfg;
	}

	/**
	 * Convenience method for block indenting between keyword pairs
	 * @param c
	 * @param keywords
	 */
	protected void blockIndent(FormattingConfig c, Keyword[][] keywords) {
		for (Keyword[] k : keywords) {
			c.setLinewrap().after(k[0]);
			c.setIndentation(k[0], k[1]);
			c.setLinewrap().before(k[1]);
		}
	}

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
//		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
//		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 1).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

		// open
		for (Keyword k : new Keyword[] {
				f.getModBodyAccess().getOpenKeyword_0_2_0(),
				f.getModBodyAccess().getOpenKeyword_3_5_0(),
				f.getModBodyAccess().getOpenKeyword_5_7_0(),
		}) {
			c.setLinewrap().before(k);
			c.setIndentationIncrement().before(k);
			c.setIndentationDecrement().after(k);
		}

		// Special case when using `open (Alias = Name)`
		for (Keyword k : new Keyword[] {
			f.getOpenAccess().getLeftParenthesisKeyword_2_0()
		}) {
			c.setLinewrap().before(k);
			c.setIndentationIncrement().before(k);
			c.setIndentationDecrement().after(k);
		}
			
		// Indentation within the ModDef's body
		for (Keyword[] k : new Keyword[][] {
				{ f.getModBodyAccess().getLeftCurlyBracketKeyword_0_3(), f.getModBodyAccess().getRightCurlyBracketKeyword_0_5() },
				{ f.getModBodyAccess().getLeftCurlyBracketKeyword_3_6(), f.getModBodyAccess().getRightCurlyBracketKeyword_3_8() },
				{ f.getModBodyAccess().getLeftCurlyBracketKeyword_5_8(), f.getModBodyAccess().getRightCurlyBracketKeyword_5_10() },
		}) {
			c.setIndentation(k[0], k[1]);
		}		

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
			c.setLinewrap(1, 1, 2).before(k);
			c.setLinewrap().after(k);
			c.setIndentationIncrement().after(k);
		}
		c.setIndentationDecrement().after(f.getTopDefRule());
		
		/* TODO What about when we have a judgement type keyword on every line? e.g.:
				cat Noun ;
				cat Verb ;
		*/
		
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

		// Comma in lincat judgements, e.g.: `Cat1,\nCat2 : SS ;`
		c.setLinewrap().after(f.getPrintDefAccess().getCommaKeyword_1_0());

//		for (ParserRule r : new ParserRule[]{
//		 f.getCatDefRule(),
//		 f.getFunDefRule(),
//		 f.getDefRule(),
//		 f.getDataDefRule(),
//		 f.getParDefRule(),
//		 f.getPrintDefRule(),
//		 f.getFlagDefRule(),
//	}) {
//	}
		
		// overload
		blockIndent(c, new Keyword[][] {
				{ f.getOperDefAccess().getLeftCurlyBracketKeyword_0_3_1_1(), f.getOperDefAccess().getRightCurlyBracketKeyword_0_3_1_5() },
				{ f.getOperDefAccess().getLeftCurlyBracketKeyword_1_4_1_1_1(), f.getOperDefAccess().getRightCurlyBracketKeyword_1_4_1_1_5() },
				{ f.getOperDefAccess().getLeftCurlyBracketKeyword_2_4(), f.getOperDefAccess().getRightCurlyBracketKeyword_2_8() },
		});	

		// case, table
		// c.setLinewrap().before(f.getListCaseRule());
		c.setLinewrap().after(f.getListCaseAccess().getSemicolonKeyword_1_0());
		blockIndent(c, new Keyword[][] {
				{ f.getExp4Access().getLeftCurlyBracketKeyword_0_1(), f.getExp4Access().getRightCurlyBracketKeyword_0_3() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_1_2_0_0(), f.getExp4Access().getRightCurlyBracketKeyword_1_2_0_2() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_2_3(), f.getExp4Access().getRightCurlyBracketKeyword_2_5() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_3_1(), f.getExp4Access().getRightCurlyBracketKeyword_3_3() },
				{ f.getExp4Access().getLeftCurlyBracketKeyword_4_1(), f.getExp4Access().getRightCurlyBracketKeyword_4_3() },
		});
		
		// let ... in ...
		// TODO This should be combined with the commented code below, although that refuses to work :(
		// See: https://bugs.eclipse.org/bugs/show_bug.cgi?id=369795
		// and: http://www.eclipse.org/forums/index.php/t/279480/
		for (Keyword[] k : new Keyword[][] {
				{ f.getExpAccess().getLetKeyword_2_0(), f.getExpAccess().getInKeyword_2_4() },
				{ f.getExpAccess().getLetKeyword_3_0(), f.getExpAccess().getInKeyword_3_2() },
		}) {
			c.setLinewrap().before(k[0]);
			c.setIndentationIncrement().before(k[0]);
		}
		for (Keyword[] k : new Keyword[][] {
				{ f.getExpAccess().getLeftCurlyBracketKeyword_2_1(), f.getExpAccess().getRightCurlyBracketKeyword_2_3() },
				{ f.getExpAccess().getLetKeyword_3_0(), f.getExpAccess().getInKeyword_3_2() },
		}) {
			c.setLinewrap().after(k[0]);
			c.setIndentationIncrement().after(k[0]);
			
			c.setLinewrap().before(k[1]);
			c.setIndentationDecrement().before(k[1]);
			c.setIndentationDecrement().after(k[1]); // this is probably wrong
		}
		
//		for (Assignment k : new Assignment[] {
//				f.getExpAccess().getVAssignment_0_3(),
//				f.getExpAccess().getVAssignment_1_4(),
//				f.getExpAccess().getVAssignment_2_5(),
//				f.getExpAccess().getVAssignment_3_3(),
//				f.getExpAccess().getVAssignment_4_6(),
//				f.getExpAccess().getVAssignment_5_0(),
//				f.getExpAccess().getVAssignment_6_1(),
//				f.getExpAccess().getDefListAssignment_2_2(),
//				f.getExpAccess().getDefListAssignment_3_1(),
//				f.getExpAccess().getDefListAssignment_5_1_0_1_1_2(),
//				f.getExpAccess().getDefListAssignment_6_3_1_2(),
//		}) {
//			c.setLinewrap().before(k);
//			c.setIndentationIncrement().before(k);
//			c.setIndentationDecrement().after(k);
//			c.setLinewrap().after(k);
//		}

		// Record fields
		blockIndent(c, new Keyword[][] {
				// { f.getPatt2Access().getLeftCurlyBracketKeyword_6_0(), f.getPatt2Access().getLeftCurlyBracketKeyword_6_0() },
				{ f.getExp6Access().getRecordLeftCurlyBracketKeyword_11_0_0(), f.getExp6Access().getRightCurlyBracketKeyword_11_2() },
		});
		c.setLinewrap().after(f.getListLocDefAccess().getSemicolonKeyword_1_1_0());
		c.setLinewrap().after(f.getListLocDefAccess().getSemicolonKeyword_1_2());
		
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

	}
}
