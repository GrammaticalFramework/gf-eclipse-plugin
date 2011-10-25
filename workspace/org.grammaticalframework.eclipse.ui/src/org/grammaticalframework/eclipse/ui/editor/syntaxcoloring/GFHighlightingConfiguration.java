package org.grammaticalframework.eclipse.ui.editor.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class GFHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String COMPILER_PRAGMA_ID = "compiler pragma";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(COMPILER_PRAGMA_ID, "Compiler pragma", compilerPragmaTextStyle());
	}

	public TextStyle compilerPragmaTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(82, 143, 201)); // light greyish-blue
		return textStyle;
	}
}
