package org.grammaticalframework.eclipse.tests.formatting

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.grammaticalframework.eclipse.GFInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@InjectWith(typeof(GFInjectorProvider))
@RunWith(typeof(XtextRunner))
class RGLTests extends XtextTest {
	
	def RGLTests() {
//		ignoreFormattingDifferences()
		ignoreSerializationDifferences()
//		suppressSerialization()
	}
	
	@Test
	def void Constructors() {
		testFile("rgl/Constructors.gf")
	}
	
	@Test
	def void ExtraEng() {
		testFile("rgl/ExtraEng.gf")
	}
	
	@Test
	def void NounEng() {
		testFile("rgl/NounEng.gf")
	}
	
	@Test
	def void NumeralEng() {
		testFile("rgl/NumeralEng.gf")
	}
	
	@Test
	def void ParadigmsEng() {
		testFile("rgl/ParadigmsEng.gf")
	}
	
	@Test
	def void ResEng() {
		testFile("rgl/ResEng.gf")
	}
	
}