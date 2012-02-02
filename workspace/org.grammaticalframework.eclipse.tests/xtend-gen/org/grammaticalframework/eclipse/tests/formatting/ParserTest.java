package org.grammaticalframework.eclipse.tests.formatting;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.grammaticalframework.eclipse.GFInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@InjectWith(GFInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ParserTest extends XtextTest {
  @Test
  public void testIdent() {
      this.testTerminal("bar", "ID");
      this.testTerminal("bar3", "ID");
      this.testTerminal("bar\'", "ID");
      this.testTerminal("bar\'s", "ID");
      this.testNotTerminal("_bar_", "ID");
      this.testNotTerminal("$bar$", "ID");
      this.testNotTerminal("3bar", "ID");
      this.testNotTerminal("#bar", "ID");
      this.testTerminal("foo.bar", "ID", "\'.\'", "ID");
      this.testTerminal("foo.*", "ID", "\'.\'", "\'*\'");
  }
  
  @Test
  public void testString() {
      this.testTerminal("\"bar\"", "STRING");
      this.testTerminal("\"bar\'s\"", "STRING");
      this.testTerminal("\"bar\\\"s\"", "STRING");
      this.testTerminal("\"bar\\\\s\"", "STRING");
      this.testNotTerminal("\"bar\\s\"", "STRING");
      this.testNotTerminal("\"bar\"s\"", "STRING");
  }
  
  @Test
  public void testInteger() {
      this.testTerminal("0", "INTEGER");
      this.testTerminal("5", "INTEGER");
      this.testTerminal("09", "INTEGER");
      this.testTerminal("10", "INTEGER");
  }
  
  @Test
  public void testDouble() {
      this.testTerminal("0.135", "DOUBLE");
      this.testTerminal("15.5", "DOUBLE");
      this.testTerminal("15.5e10", "DOUBLE");
      this.testTerminal("15.5e-10", "DOUBLE");
      this.testNotTerminal(".5", "DOUBLE");
      this.testNotTerminal("0.", "DOUBLE");
      this.testNotTerminal(".", "DOUBLE");
  }
  
  @Test
  public void testHidden() {
      this.testTerminal("--# ...", "COMPILER_PRAGMA");
      this.testTerminal("--% ...", "GF_DOC");
      this.testTerminal("--: ...", "GF_COC");
      this.testTerminal("-- ...", "SL_COMMENT");
  }
  
  @Test
  public void testExpressions() {
    this.testParserRule("\nlin VV {\n  s = table {\n    R.VVF R.VInf => [\"shall\"] ;\n    R.VVPresNeg => \"shall not\"\n  } ;\n  typ = R.VVAux }\n", "Exp");
  }
  
  @Test
  public void testOverloads() {
    this.testParserRule("\nmkQuant : overload {\n  mkQuant : (this, these : Str) -> Quant ; --%\n  mkQuant : (no_sg, no_pl, none_sg, non_pl : Str) -> Quant ; --%\n}\n", "OperDef");
  }
}
