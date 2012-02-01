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
  public void parseGF() {
    this.testFile("model/chapter5/Foods.gf");
  }
}
