package org.grammaticalframework.eclipse.tests.formatting

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.grammaticalframework.eclipse.GFInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@InjectWith(typeof(GFInjectorProvider))
@RunWith(typeof(XtextRunner))
class ParserTest extends XtextTest {
	
    @Test
    def void testIdent() {
        testTerminal("bar", "ID")
        testTerminal("bar3", "ID")
        testTerminal("bar'", "ID")
        testTerminal("bar's", "ID")
        
        testNotTerminal("_bar_", "ID")
        testNotTerminal("$bar$", "ID")
        testNotTerminal("3bar", "ID")
        testNotTerminal("#bar", "ID")
        
        // token streams with multiple token
        testTerminal("foo.bar", "ID", "'.'", "ID")
        testTerminal("foo.*", "ID", "'.'", "'*'")
	}

    @Test
    def void testString() {
        testTerminal("\"bar\"", "STRING")
        testTerminal("\"bar's\"", "STRING")
        testTerminal("\"bar\\\"s\"", "STRING")
        testTerminal("\"bar\\\\s\"", "STRING")
        
        testNotTerminal("\"bar\\s\"", "STRING")
        testNotTerminal("\"bar\"s\"", "STRING")
	}

    @Test
    def void testInteger() {
        testTerminal("0", "INTEGER")
        testTerminal("5", "INTEGER")
        testTerminal("09", "INTEGER")
        testTerminal("10", "INTEGER")
	}

    @Test
    def void testDouble() {
        testTerminal("0.135", "DOUBLE")
        testTerminal("15.5", "DOUBLE")
        testTerminal("15.5e10", "DOUBLE")
        testTerminal("15.5e-10", "DOUBLE")
        testNotTerminal(".5", "DOUBLE")
        testNotTerminal("0.", "DOUBLE")
        testNotTerminal(".", "DOUBLE")
	}

    @Test
    def void testHidden() {
        testTerminal("--# ...", "COMPILER_PRAGMA")
        testTerminal("--% ...", "GF_DOC")
        testTerminal("--: ...", "GF_COC")
        testTerminal("-- ...", "SL_COMMENT")
	}
	
    @Test
    def void testExpressions() {
        testParserRule("
lin VV {
  s = table {
    R.VVF R.VInf => [\"shall\"] ;
    R.VVPresNeg => \"shall not\"
  } ;
  typ = R.VVAux }
", "Exp")
	}

    @Test
    def void testOverloads() {
        testParserRule("
mkQuant : overload {
  mkQuant : (this, these : Str) -> Quant ; --%
  mkQuant : (no_sg, no_pl, none_sg, non_pl : Str) -> Quant ; --%
}
", "OperDef")
	}

}
