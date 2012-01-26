/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Configuration for highlighting
 */
public class GFHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String ID_ID = "id";
	public static final String COMPILER_PRAGMA_ID = "compiler pragma";
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration#configure(org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor)
	 */
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ID_ID, "Identifier", idTextStyle());
		acceptor.acceptDefaultHighlighting(COMPILER_PRAGMA_ID, "Compiler pragma", compilerPragmaTextStyle());
	}
	
	/**
	 * Id text style.
	 */
	public TextStyle idTextStyle() {
		return defaultTextStyle().copy();
	}
	
	/**
	 * Punctuation text style.
	 */
	@Override
	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(102, 102, 102)); // #666666
		return textStyle;
	}
	
	/**
	 * Number text style.
	 */
	@Override
	public TextStyle numberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(165, 42, 42)); // maroon
		return textStyle;
	}

	/**
	 * Compiler pragma text style.
	 */
	public TextStyle compilerPragmaTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(82, 143, 201)); // light greyish-blue
		return textStyle;
	}
}
