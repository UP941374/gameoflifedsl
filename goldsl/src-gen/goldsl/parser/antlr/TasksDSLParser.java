/*
 * generated by Xtext 2.28.0
 */
package goldsl.parser.antlr;

import com.google.inject.Inject;
import goldsl.parser.antlr.internal.InternalTasksDSLParser;
import goldsl.services.TasksDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TasksDSLParser extends AbstractAntlrParser {

	@Inject
	private TasksDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTasksDSLParser createParser(XtextTokenStream stream) {
		return new InternalTasksDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public TasksDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TasksDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
