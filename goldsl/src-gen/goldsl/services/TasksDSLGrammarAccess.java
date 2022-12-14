/*
 * generated by Xtext 2.28.0
 */
package goldsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TasksDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GameOfLifeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.GameOfLife");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cGridKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cGridAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cGridGridParserRuleCall_0_1_0 = (RuleCall)cGridAssignment_0_1.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cCellsKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cCellsAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cCellsCellParserRuleCall_1_0_1_0 = (RuleCall)cCellsAssignment_1_0_1.eContents().get(0);
		private final Assignment cRulesAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_1_1_0 = (RuleCall)cRulesAssignment_1_1.eContents().get(0);
		
		////Gameoflife:
		////    cells+=Cell*
		////    rules+=Rule*
		////;
		////
		////
		////Cell:
		////    'Cell' x=INT y=INT |
		////    'Cells' x=INT y=INT no=INT dir=INT direction=Direction |
		////    'Fill' x1=INT y1=INT x2=INT y2=INT |
		////    'Random' no=INT
		////;
		////Gameoflife:
		////    cells += Cell*
		////    multiCells += Cells*
		////    fillCells += FillCell*
		////    rules += Rule*
		////;
		////
		////
		////Cell:
		//////    "(" x=INT y=INT ((no=INT dir=Direction) | (x2=INT y2=INT))? ")"
		////    'Cell' x=INT y=INT
		////;
		////
		////Cells:
		////    'Cells' x=INT y=INT no=INT dir=Direction
		////;
		////
		////FillCell:
		////    'Fill' x1=INT y1=INT x2=INT y2=INT
		////;
		////
		////Rule:
		////    'Rule' type=RuleType sign=CompareSign  n=INT
		////;
		//GameOfLife:
		//    ('Grid' grid=Grid)?
		//    ("Cells" cells+=Cell | rules += Rule)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('Grid' grid=Grid)?
		//("Cells" cells+=Cell | rules += Rule)*
		public Group getGroup() { return cGroup; }
		
		//('Grid' grid=Grid)?
		public Group getGroup_0() { return cGroup_0; }
		
		//'Grid'
		public Keyword getGridKeyword_0_0() { return cGridKeyword_0_0; }
		
		//grid=Grid
		public Assignment getGridAssignment_0_1() { return cGridAssignment_0_1; }
		
		//Grid
		public RuleCall getGridGridParserRuleCall_0_1_0() { return cGridGridParserRuleCall_0_1_0; }
		
		//("Cells" cells+=Cell | rules += Rule)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"Cells" cells+=Cell
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"Cells"
		public Keyword getCellsKeyword_1_0_0() { return cCellsKeyword_1_0_0; }
		
		//cells+=Cell
		public Assignment getCellsAssignment_1_0_1() { return cCellsAssignment_1_0_1; }
		
		//Cell
		public RuleCall getCellsCellParserRuleCall_1_0_1_0() { return cCellsCellParserRuleCall_1_0_1_0; }
		
		//rules += Rule
		public Assignment getRulesAssignment_1_1() { return cRulesAssignment_1_1; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_1_1_0() { return cRulesRuleParserRuleCall_1_1_0; }
	}
	public class GridElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.Grid");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWidthKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cWidthAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cWidthINTTerminalRuleCall_1_0 = (RuleCall)cWidthAssignment_1.eContents().get(0);
		private final Keyword cHeightKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cHeightAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cHeightINTTerminalRuleCall_3_0 = (RuleCall)cHeightAssignment_3.eContents().get(0);
		
		//Grid:
		//    'width:' width=INT
		//    'height:' height=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'width:' width=INT
		//'height:' height=INT
		public Group getGroup() { return cGroup; }
		
		//'width:'
		public Keyword getWidthKeyword_0() { return cWidthKeyword_0; }
		
		//width=INT
		public Assignment getWidthAssignment_1() { return cWidthAssignment_1; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_1_0() { return cWidthINTTerminalRuleCall_1_0; }
		
		//'height:'
		public Keyword getHeightKeyword_2() { return cHeightKeyword_2; }
		
		//height=INT
		public Assignment getHeightAssignment_3() { return cHeightAssignment_3; }
		
		//INT
		public RuleCall getHeightINTTerminalRuleCall_3_0() { return cHeightINTTerminalRuleCall_3_0; }
	}
	public class CellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.Cell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cNCellsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cNCellsNormalCellParserRuleCall_1_0_0 = (RuleCall)cNCellsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cFillCellKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cFillCellsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cFillCellsFillCellParserRuleCall_1_1_1_0 = (RuleCall)cFillCellsAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Cell:
		//    '['(nCells+=NormalCell | 'fillCell:' (fillCells+=FillCell))* ']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'['(nCells+=NormalCell | 'fillCell:' (fillCells+=FillCell))* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//(nCells+=NormalCell | 'fillCell:' (fillCells+=FillCell))*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//nCells+=NormalCell
		public Assignment getNCellsAssignment_1_0() { return cNCellsAssignment_1_0; }
		
		//NormalCell
		public RuleCall getNCellsNormalCellParserRuleCall_1_0_0() { return cNCellsNormalCellParserRuleCall_1_0_0; }
		
		//'fillCell:' (fillCells+=FillCell)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'fillCell:'
		public Keyword getFillCellKeyword_1_1_0() { return cFillCellKeyword_1_1_0; }
		
		//(fillCells+=FillCell)
		public Assignment getFillCellsAssignment_1_1_1() { return cFillCellsAssignment_1_1_1; }
		
		//FillCell
		public RuleCall getFillCellsFillCellParserRuleCall_1_1_1_0() { return cFillCellsFillCellParserRuleCall_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}
	public class NormalCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.NormalCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXINTTerminalRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYINTTerminalRuleCall_3_0 = (RuleCall)cYAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//NormalCell:
		//    '(' x=INT ',' y=INT ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' x=INT ',' y=INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//x=INT
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_1_0() { return cXINTTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//y=INT
		public Assignment getYAssignment_3() { return cYAssignment_3; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_3_0() { return cYINTTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class FillCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.FillCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXINTTerminalRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYINTTerminalRuleCall_3_0 = (RuleCall)cYAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRepAmountAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRepAmountINTTerminalRuleCall_5_0 = (RuleCall)cRepAmountAssignment_5.eContents().get(0);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cDirAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cDirDirectionEnumRuleCall_7_0 = (RuleCall)cDirAssignment_7.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//FillCell:
		//    '(' x=INT ',' y=INT ',' repAmount=INT ',' dir=Direction ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' x=INT ',' y=INT ',' repAmount=INT ',' dir=Direction ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//x=INT
		public Assignment getXAssignment_1() { return cXAssignment_1; }
		
		//INT
		public RuleCall getXINTTerminalRuleCall_1_0() { return cXINTTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//y=INT
		public Assignment getYAssignment_3() { return cYAssignment_3; }
		
		//INT
		public RuleCall getYINTTerminalRuleCall_3_0() { return cYINTTerminalRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//repAmount=INT
		public Assignment getRepAmountAssignment_5() { return cRepAmountAssignment_5; }
		
		//INT
		public RuleCall getRepAmountINTTerminalRuleCall_5_0() { return cRepAmountINTTerminalRuleCall_5_0; }
		
		//','
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }
		
		//dir=Direction
		public Assignment getDirAssignment_7() { return cDirAssignment_7; }
		
		//Direction
		public RuleCall getDirDirectionEnumRuleCall_7_0() { return cDirDirectionEnumRuleCall_7_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeRuleTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cSignAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSignCompareSignEnumRuleCall_2_0 = (RuleCall)cSignAssignment_2.eContents().get(0);
		private final Assignment cNAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNINTTerminalRuleCall_3_0 = (RuleCall)cNAssignment_3.eContents().get(0);
		
		//Rule:
		//    'Rule' type=RuleType sign=CompareSign  n=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Rule' type=RuleType sign=CompareSign  n=INT
		public Group getGroup() { return cGroup; }
		
		//'Rule'
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }
		
		//type=RuleType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//RuleType
		public RuleCall getTypeRuleTypeEnumRuleCall_1_0() { return cTypeRuleTypeEnumRuleCall_1_0; }
		
		//sign=CompareSign
		public Assignment getSignAssignment_2() { return cSignAssignment_2; }
		
		//CompareSign
		public RuleCall getSignCompareSignEnumRuleCall_2_0() { return cSignCompareSignEnumRuleCall_2_0; }
		
		//n=INT
		public Assignment getNAssignment_3() { return cNAssignment_3; }
		
		//INT
		public RuleCall getNINTTerminalRuleCall_3_0() { return cNINTTerminalRuleCall_3_0; }
	}
	
	public class DirectionElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.Direction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNORTHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNORTHNorthKeyword_0_0 = (Keyword)cNORTHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEASTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEASTEastKeyword_1_0 = (Keyword)cEASTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSOUTHEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSOUTHSouthKeyword_2_0 = (Keyword)cSOUTHEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cWESTEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cWESTWestKeyword_3_0 = (Keyword)cWESTEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Direction:
		//    NORTH = 'north' |
		//    EAST = 'east' |
		//    SOUTH = 'south' |
		//    WEST = 'west'
		//;
		public EnumRule getRule() { return rule; }
		
		//NORTH = 'north' |
		//EAST = 'east' |
		//SOUTH = 'south' |
		//WEST = 'west'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NORTH = 'north'
		public EnumLiteralDeclaration getNORTHEnumLiteralDeclaration_0() { return cNORTHEnumLiteralDeclaration_0; }
		
		//'north'
		public Keyword getNORTHNorthKeyword_0_0() { return cNORTHNorthKeyword_0_0; }
		
		//EAST = 'east'
		public EnumLiteralDeclaration getEASTEnumLiteralDeclaration_1() { return cEASTEnumLiteralDeclaration_1; }
		
		//'east'
		public Keyword getEASTEastKeyword_1_0() { return cEASTEastKeyword_1_0; }
		
		//SOUTH = 'south'
		public EnumLiteralDeclaration getSOUTHEnumLiteralDeclaration_2() { return cSOUTHEnumLiteralDeclaration_2; }
		
		//'south'
		public Keyword getSOUTHSouthKeyword_2_0() { return cSOUTHSouthKeyword_2_0; }
		
		//WEST = 'west'
		public EnumLiteralDeclaration getWESTEnumLiteralDeclaration_3() { return cWESTEnumLiteralDeclaration_3; }
		
		//'west'
		public Keyword getWESTWestKeyword_3_0() { return cWESTWestKeyword_3_0; }
	}
	public class RuleTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.RuleType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCOME_ALIVEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCOME_ALIVECome_aliveKeyword_0_0 = (Keyword)cCOME_ALIVEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSTAYEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSTAYStayKeyword_1_0 = (Keyword)cSTAYEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDIEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDIEDieKeyword_2_0 = (Keyword)cDIEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum RuleType:
		//    COME_ALIVE = 'come_alive' |
		//    STAY = 'stay' |
		//    DIE = 'die'
		//;
		public EnumRule getRule() { return rule; }
		
		//COME_ALIVE = 'come_alive' |
		//STAY = 'stay' |
		//DIE = 'die'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//COME_ALIVE = 'come_alive'
		public EnumLiteralDeclaration getCOME_ALIVEEnumLiteralDeclaration_0() { return cCOME_ALIVEEnumLiteralDeclaration_0; }
		
		//'come_alive'
		public Keyword getCOME_ALIVECome_aliveKeyword_0_0() { return cCOME_ALIVECome_aliveKeyword_0_0; }
		
		//STAY = 'stay'
		public EnumLiteralDeclaration getSTAYEnumLiteralDeclaration_1() { return cSTAYEnumLiteralDeclaration_1; }
		
		//'stay'
		public Keyword getSTAYStayKeyword_1_0() { return cSTAYStayKeyword_1_0; }
		
		//DIE = 'die'
		public EnumLiteralDeclaration getDIEEnumLiteralDeclaration_2() { return cDIEEnumLiteralDeclaration_2; }
		
		//'die'
		public Keyword getDIEDieKeyword_2_0() { return cDIEDieKeyword_2_0; }
	}
	public class CompareSignElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "goldsl.TasksDSL.CompareSign");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBIGGER_THANEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBIGGER_THANGreaterThanSignKeyword_0_0 = (Keyword)cBIGGER_THANEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEQUALEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEQUALEqualsSignEqualsSignKeyword_1_0 = (Keyword)cEQUALEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSMALLER_THANEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSMALLER_THANLessThanSignKeyword_2_0 = (Keyword)cSMALLER_THANEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum CompareSign:
		//    BIGGER_THAN = '>' |
		//    EQUAL = '==' |
		//    SMALLER_THAN = '<'
		//;
		public EnumRule getRule() { return rule; }
		
		//BIGGER_THAN = '>' |
		//EQUAL = '==' |
		//SMALLER_THAN = '<'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BIGGER_THAN = '>'
		public EnumLiteralDeclaration getBIGGER_THANEnumLiteralDeclaration_0() { return cBIGGER_THANEnumLiteralDeclaration_0; }
		
		//'>'
		public Keyword getBIGGER_THANGreaterThanSignKeyword_0_0() { return cBIGGER_THANGreaterThanSignKeyword_0_0; }
		
		//EQUAL = '=='
		public EnumLiteralDeclaration getEQUALEnumLiteralDeclaration_1() { return cEQUALEnumLiteralDeclaration_1; }
		
		//'=='
		public Keyword getEQUALEqualsSignEqualsSignKeyword_1_0() { return cEQUALEqualsSignEqualsSignKeyword_1_0; }
		
		//SMALLER_THAN = '<'
		public EnumLiteralDeclaration getSMALLER_THANEnumLiteralDeclaration_2() { return cSMALLER_THANEnumLiteralDeclaration_2; }
		
		//'<'
		public Keyword getSMALLER_THANLessThanSignKeyword_2_0() { return cSMALLER_THANLessThanSignKeyword_2_0; }
	}
	
	private final GameOfLifeElements pGameOfLife;
	private final GridElements pGrid;
	private final CellElements pCell;
	private final NormalCellElements pNormalCell;
	private final FillCellElements pFillCell;
	private final RuleElements pRule;
	private final DirectionElements eDirection;
	private final RuleTypeElements eRuleType;
	private final CompareSignElements eCompareSign;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TasksDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGameOfLife = new GameOfLifeElements();
		this.pGrid = new GridElements();
		this.pCell = new CellElements();
		this.pNormalCell = new NormalCellElements();
		this.pFillCell = new FillCellElements();
		this.pRule = new RuleElements();
		this.eDirection = new DirectionElements();
		this.eRuleType = new RuleTypeElements();
		this.eCompareSign = new CompareSignElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("goldsl.TasksDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	////Gameoflife:
	////    cells+=Cell*
	////    rules+=Rule*
	////;
	////
	////
	////Cell:
	////    'Cell' x=INT y=INT |
	////    'Cells' x=INT y=INT no=INT dir=INT direction=Direction |
	////    'Fill' x1=INT y1=INT x2=INT y2=INT |
	////    'Random' no=INT
	////;
	////Gameoflife:
	////    cells += Cell*
	////    multiCells += Cells*
	////    fillCells += FillCell*
	////    rules += Rule*
	////;
	////
	////
	////Cell:
	//////    "(" x=INT y=INT ((no=INT dir=Direction) | (x2=INT y2=INT))? ")"
	////    'Cell' x=INT y=INT
	////;
	////
	////Cells:
	////    'Cells' x=INT y=INT no=INT dir=Direction
	////;
	////
	////FillCell:
	////    'Fill' x1=INT y1=INT x2=INT y2=INT
	////;
	////
	////Rule:
	////    'Rule' type=RuleType sign=CompareSign  n=INT
	////;
	//GameOfLife:
	//    ('Grid' grid=Grid)?
	//    ("Cells" cells+=Cell | rules += Rule)*
	//;
	public GameOfLifeElements getGameOfLifeAccess() {
		return pGameOfLife;
	}
	
	public ParserRule getGameOfLifeRule() {
		return getGameOfLifeAccess().getRule();
	}
	
	//Grid:
	//    'width:' width=INT
	//    'height:' height=INT
	//;
	public GridElements getGridAccess() {
		return pGrid;
	}
	
	public ParserRule getGridRule() {
		return getGridAccess().getRule();
	}
	
	//Cell:
	//    '['(nCells+=NormalCell | 'fillCell:' (fillCells+=FillCell))* ']'
	//;
	public CellElements getCellAccess() {
		return pCell;
	}
	
	public ParserRule getCellRule() {
		return getCellAccess().getRule();
	}
	
	//NormalCell:
	//    '(' x=INT ',' y=INT ')'
	//;
	public NormalCellElements getNormalCellAccess() {
		return pNormalCell;
	}
	
	public ParserRule getNormalCellRule() {
		return getNormalCellAccess().getRule();
	}
	
	//FillCell:
	//    '(' x=INT ',' y=INT ',' repAmount=INT ',' dir=Direction ')'
	//;
	public FillCellElements getFillCellAccess() {
		return pFillCell;
	}
	
	public ParserRule getFillCellRule() {
		return getFillCellAccess().getRule();
	}
	
	//Rule:
	//    'Rule' type=RuleType sign=CompareSign  n=INT
	//;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//enum Direction:
	//    NORTH = 'north' |
	//    EAST = 'east' |
	//    SOUTH = 'south' |
	//    WEST = 'west'
	//;
	public DirectionElements getDirectionAccess() {
		return eDirection;
	}
	
	public EnumRule getDirectionRule() {
		return getDirectionAccess().getRule();
	}
	
	//enum RuleType:
	//    COME_ALIVE = 'come_alive' |
	//    STAY = 'stay' |
	//    DIE = 'die'
	//;
	public RuleTypeElements getRuleTypeAccess() {
		return eRuleType;
	}
	
	public EnumRule getRuleTypeRule() {
		return getRuleTypeAccess().getRule();
	}
	
	//enum CompareSign:
	//    BIGGER_THAN = '>' |
	//    EQUAL = '==' |
	//    SMALLER_THAN = '<'
	//;
	public CompareSignElements getCompareSignAccess() {
		return eCompareSign;
	}
	
	public EnumRule getCompareSignRule() {
		return getCompareSignAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
