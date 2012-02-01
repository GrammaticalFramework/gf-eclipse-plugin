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
public class RGLTests extends XtextTest {
  public void RGLTests() {
    this.ignoreSerializationDifferences();
  }
  
  @Test
  public void Constructors() {
    this.testFile("rgl/Constructors.gf");
  }
  
  @Test
  public void ExtraEng() {
    this.testFile("rgl/ExtraEng.gf");
  }
  
  @Test
  public void NounEng() {
    this.testFile("rgl/NounEng.gf");
  }
  
  @Test
  public void NumeralEng() {
    this.testFile("rgl/NumeralEng.gf");
  }
  
  @Test
  public void ParadigmsEng() {
    this.testFile("rgl/ParadigmsEng.gf");
  }
  
  @Test
  public void ResEng() {
    this.testFile("rgl/ResEng.gf");
  }
}
