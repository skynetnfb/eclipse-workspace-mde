/*
 * generated by Xtext 2.25.0
 */
package it.disim.univaq.xtext.processmanagement.parser.antlr;

import com.google.inject.Inject;
import it.disim.univaq.xtext.processmanagement.parser.antlr.internal.InternalPmanagementParser;
import it.disim.univaq.xtext.processmanagement.services.PmanagementGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PmanagementParser extends AbstractAntlrParser {

	@Inject
	private PmanagementGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPmanagementParser createParser(XtextTokenStream stream) {
		return new InternalPmanagementParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Application";
	}

	public PmanagementGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PmanagementGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
