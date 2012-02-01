package org.grammaticalframework.eclipse.tests.formatting;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidatorTester;
import org.grammaticalframework.eclipse.GFInjectorProvider;
import org.grammaticalframework.eclipse.gF.ModDef;
import org.grammaticalframework.eclipse.validation.GFJavaValidator;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;
import com.google.inject.Injector;

@InjectWith(GFInjectorProvider.class)
@RunWith(XtextRunner.class)
public class ValidatorTest extends AbstractXtextTests {

	@Inject
	GFJavaValidator validator;

	@Inject
	Injector injector;

	@Inject
	ParseHelper<ModDef> parser;

	@Test
	public void TestIt() throws Exception {
		ValidatorTester<GFJavaValidator> tester = new ValidatorTester<GFJavaValidator>(validator, injector);
		System.out.println(tester.validate(parser.parse("Hello You! Hello You!")));
	}	
}
