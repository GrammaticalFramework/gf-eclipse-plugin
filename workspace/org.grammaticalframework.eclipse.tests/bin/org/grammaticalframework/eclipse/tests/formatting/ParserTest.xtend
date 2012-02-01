package org.grammaticalframework.eclipse.tests.formatting

import org.eclipse.xtext.junit.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.grammaticalframework.eclipse.GFInjectorProvider
import org.grammaticalframework.eclipse.gF.ModDef
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipselabs.xtext.utils.unittesting.XtextTest

import com.google.inject.Inject
import static junit.framework.Assert.*

@InjectWith(typeof(GFInjectorProvider))
@RunWith(typeof(XtextRunner))
public class ParserTest extends XtextTest {
//	@Inject
//	ParseHelper<ModDef> parser
//	
//	@Test
//	def void parseGF() {
//		val model = parser.parse("abstract Foods = { cat Kind; }")
////		val modname = model.type.name as Ident
//		assertEquals(model.type.name.s, "Foods")
//	}

	@Test
	def void parseGF() {
		testFile("gf-files/chapter5/Foods.gf")
	}
}
