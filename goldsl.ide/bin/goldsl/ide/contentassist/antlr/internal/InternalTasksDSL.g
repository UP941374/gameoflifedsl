/*
 * generated by Xtext 2.28.0
 */
grammar InternalTasksDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package goldsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package goldsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import goldsl.services.TasksDSLGrammarAccess;

}
@parser::members {
	private TasksDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(TasksDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGameoflife
entryRuleGameoflife
:
{ before(grammarAccess.getGameoflifeRule()); }
	 ruleGameoflife
{ after(grammarAccess.getGameoflifeRule()); } 
	 EOF 
;

// Rule Gameoflife
ruleGameoflife 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGameoflifeAccess().getGroup()); }
		(rule__Gameoflife__Group__0)
		{ after(grammarAccess.getGameoflifeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCell
entryRuleCell
:
{ before(grammarAccess.getCellRule()); }
	 ruleCell
{ after(grammarAccess.getCellRule()); } 
	 EOF 
;

// Rule Cell
ruleCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCellAccess().getAlternatives()); }
		(rule__Cell__Alternatives)
		{ after(grammarAccess.getCellAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRule
entryRuleRule
:
{ before(grammarAccess.getRuleRule()); }
	 ruleRule
{ after(grammarAccess.getRuleRule()); } 
	 EOF 
;

// Rule Rule
ruleRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleAccess().getGroup()); }
		(rule__Rule__Group__0)
		{ after(grammarAccess.getRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Direction
ruleDirection
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionAccess().getAlternatives()); }
		(rule__Direction__Alternatives)
		{ after(grammarAccess.getDirectionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule RuleType
ruleRuleType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleTypeAccess().getAlternatives()); }
		(rule__RuleType__Alternatives)
		{ after(grammarAccess.getRuleTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getGroup_0()); }
		(rule__Cell__Group_0__0)
		{ after(grammarAccess.getCellAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getCellAccess().getGroup_1()); }
		(rule__Cell__Group_1__0)
		{ after(grammarAccess.getCellAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getSignAssignment_2_0()); }
		(rule__Rule__SignAssignment_2_0)
		{ after(grammarAccess.getRuleAccess().getSignAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getRuleAccess().getEqualsSignKeyword_2_1()); }
		'='
		{ after(grammarAccess.getRuleAccess().getEqualsSignKeyword_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getRuleAccess().getGreaterThanSignKeyword_2_2()); }
		'>'
		{ after(grammarAccess.getRuleAccess().getGreaterThanSignKeyword_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Direction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0()); }
		('north')
		{ after(grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1()); }
		('east')
		{ after(grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2()); }
		('south')
		{ after(grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3()); }
		('west')
		{ after(grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleTypeAccess().getMultiplyEnumLiteralDeclaration_0()); }
		('multiply')
		{ after(grammarAccess.getRuleTypeAccess().getMultiplyEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getRuleTypeAccess().getStayEnumLiteralDeclaration_1()); }
		('stay')
		{ after(grammarAccess.getRuleTypeAccess().getStayEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getRuleTypeAccess().getDieEnumLiteralDeclaration_2()); }
		('die')
		{ after(grammarAccess.getRuleTypeAccess().getDieEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gameoflife__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gameoflife__Group__0__Impl
	rule__Gameoflife__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Gameoflife__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameoflifeAccess().getCellsAssignment_0()); }
	(rule__Gameoflife__CellsAssignment_0)*
	{ after(grammarAccess.getGameoflifeAccess().getCellsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gameoflife__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Gameoflife__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Gameoflife__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGameoflifeAccess().getRulesAssignment_1()); }
	(rule__Gameoflife__RulesAssignment_1)*
	{ after(grammarAccess.getGameoflifeAccess().getRulesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0__0__Impl
	rule__Cell__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getCellKeyword_0_0()); }
	'Cell'
	{ after(grammarAccess.getCellAccess().getCellKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0__1__Impl
	rule__Cell__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getXAssignment_0_1()); }
	(rule__Cell__XAssignment_0_1)
	{ after(grammarAccess.getCellAccess().getXAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0__2__Impl
	rule__Cell__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getYAssignment_0_2()); }
	(rule__Cell__YAssignment_0_2)
	{ after(grammarAccess.getCellAccess().getYAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getGroup_0_3()); }
	(rule__Cell__Group_0_3__0)?
	{ after(grammarAccess.getCellAccess().getGroup_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0_3__0__Impl
	rule__Cell__Group_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getNoAssignment_0_3_0()); }
	(rule__Cell__NoAssignment_0_3_0)
	{ after(grammarAccess.getCellAccess().getNoAssignment_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getDirAssignment_0_3_1()); }
	(rule__Cell__DirAssignment_0_3_1)
	{ after(grammarAccess.getCellAccess().getDirAssignment_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_1__0__Impl
	rule__Cell__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getRandomKeyword_1_0()); }
	'Random'
	{ after(grammarAccess.getCellAccess().getRandomKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getNoAssignment_1_1()); }
	(rule__Cell__NoAssignment_1_1)
	{ after(grammarAccess.getCellAccess().getNoAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Rule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__0__Impl
	rule__Rule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
	'Rule'
	{ after(grammarAccess.getRuleAccess().getRuleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__1__Impl
	rule__Rule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getTypeAssignment_1()); }
	(rule__Rule__TypeAssignment_1)
	{ after(grammarAccess.getRuleAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__2__Impl
	rule__Rule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getAlternatives_2()); }
	(rule__Rule__Alternatives_2)
	{ after(grammarAccess.getRuleAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Rule__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRuleAccess().getNAssignment_3()); }
	(rule__Rule__NAssignment_3)
	{ after(grammarAccess.getRuleAccess().getNAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Gameoflife__CellsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameoflifeAccess().getCellsCellParserRuleCall_0_0()); }
		ruleCell
		{ after(grammarAccess.getGameoflifeAccess().getCellsCellParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Gameoflife__RulesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGameoflifeAccess().getRulesRuleParserRuleCall_1_0()); }
		ruleRule
		{ after(grammarAccess.getGameoflifeAccess().getRulesRuleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__XAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__YAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_0_2_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__NoAssignment_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_0_3_0_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__DirAssignment_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getDirDirectionEnumRuleCall_0_3_1_0()); }
		ruleDirection
		{ after(grammarAccess.getCellAccess().getDirDirectionEnumRuleCall_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__NoAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0()); }
		ruleRuleType
		{ after(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__SignAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); }
			'<'
			{ after(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rule__NAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleAccess().getNINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getRuleAccess().getNINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
