package org.grammaticalframework.eclipse.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class GFAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	protected String calculateId(String tokenName, int tokenType) {
		if("RULE_COMPILER_PRAGMA".equals(tokenName)) {
			return GFHighlightingConfiguration.COMPILER_PRAGMA_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
