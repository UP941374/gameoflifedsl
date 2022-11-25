package goldsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import goldsl.services.TasksDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTasksDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grid'", "'Cells'", "'width:'", "'height:'", "'['", "'fillCell:'", "']'", "'('", "','", "')'", "'Rule'", "'north'", "'east'", "'south'", "'west'", "'come_alive'", "'stay'", "'die'", "'>'", "'=='", "'<'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTasksDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTasksDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTasksDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTasksDSL.g"; }



     	private TasksDSLGrammarAccess grammarAccess;

        public InternalTasksDSLParser(TokenStream input, TasksDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GameOfLife";
       	}

       	@Override
       	protected TasksDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameOfLife"
    // InternalTasksDSL.g:65:1: entryRuleGameOfLife returns [EObject current=null] : iv_ruleGameOfLife= ruleGameOfLife EOF ;
    public final EObject entryRuleGameOfLife() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameOfLife = null;


        try {
            // InternalTasksDSL.g:65:51: (iv_ruleGameOfLife= ruleGameOfLife EOF )
            // InternalTasksDSL.g:66:2: iv_ruleGameOfLife= ruleGameOfLife EOF
            {
             newCompositeNode(grammarAccess.getGameOfLifeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameOfLife=ruleGameOfLife();

            state._fsp--;

             current =iv_ruleGameOfLife; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGameOfLife"


    // $ANTLR start "ruleGameOfLife"
    // InternalTasksDSL.g:72:1: ruleGameOfLife returns [EObject current=null] : ( (otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) ) )? ( (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) ) | ( (lv_rules_4_0= ruleRule ) ) )* ) ;
    public final EObject ruleGameOfLife() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_grid_1_0 = null;

        EObject lv_cells_3_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:78:2: ( ( (otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) ) )? ( (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) ) | ( (lv_rules_4_0= ruleRule ) ) )* ) )
            // InternalTasksDSL.g:79:2: ( (otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) ) )? ( (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) ) | ( (lv_rules_4_0= ruleRule ) ) )* )
            {
            // InternalTasksDSL.g:79:2: ( (otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) ) )? ( (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) ) | ( (lv_rules_4_0= ruleRule ) ) )* )
            // InternalTasksDSL.g:80:3: (otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) ) )? ( (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) ) | ( (lv_rules_4_0= ruleRule ) ) )*
            {
            // InternalTasksDSL.g:80:3: (otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTasksDSL.g:81:4: otherlv_0= 'Grid' ( (lv_grid_1_0= ruleGrid ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getGameOfLifeAccess().getGridKeyword_0_0());
                    			
                    // InternalTasksDSL.g:85:4: ( (lv_grid_1_0= ruleGrid ) )
                    // InternalTasksDSL.g:86:5: (lv_grid_1_0= ruleGrid )
                    {
                    // InternalTasksDSL.g:86:5: (lv_grid_1_0= ruleGrid )
                    // InternalTasksDSL.g:87:6: lv_grid_1_0= ruleGrid
                    {

                    						newCompositeNode(grammarAccess.getGameOfLifeAccess().getGridGridParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_grid_1_0=ruleGrid();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
                    						}
                    						set(
                    							current,
                    							"grid",
                    							lv_grid_1_0,
                    							"goldsl.TasksDSL.Grid");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTasksDSL.g:105:3: ( (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) ) | ( (lv_rules_4_0= ruleRule ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }
                else if ( (LA2_0==21) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTasksDSL.g:106:4: (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) )
            	    {
            	    // InternalTasksDSL.g:106:4: (otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) ) )
            	    // InternalTasksDSL.g:107:5: otherlv_2= 'Cells' ( (lv_cells_3_0= ruleCell ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    					newLeafNode(otherlv_2, grammarAccess.getGameOfLifeAccess().getCellsKeyword_1_0_0());
            	    				
            	    // InternalTasksDSL.g:111:5: ( (lv_cells_3_0= ruleCell ) )
            	    // InternalTasksDSL.g:112:6: (lv_cells_3_0= ruleCell )
            	    {
            	    // InternalTasksDSL.g:112:6: (lv_cells_3_0= ruleCell )
            	    // InternalTasksDSL.g:113:7: lv_cells_3_0= ruleCell
            	    {

            	    							newCompositeNode(grammarAccess.getGameOfLifeAccess().getCellsCellParserRuleCall_1_0_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_cells_3_0=ruleCell();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"cells",
            	    								lv_cells_3_0,
            	    								"goldsl.TasksDSL.Cell");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTasksDSL.g:132:4: ( (lv_rules_4_0= ruleRule ) )
            	    {
            	    // InternalTasksDSL.g:132:4: ( (lv_rules_4_0= ruleRule ) )
            	    // InternalTasksDSL.g:133:5: (lv_rules_4_0= ruleRule )
            	    {
            	    // InternalTasksDSL.g:133:5: (lv_rules_4_0= ruleRule )
            	    // InternalTasksDSL.g:134:6: lv_rules_4_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getGameOfLifeAccess().getRulesRuleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_rules_4_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_4_0,
            	    							"goldsl.TasksDSL.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGameOfLife"


    // $ANTLR start "entryRuleGrid"
    // InternalTasksDSL.g:156:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalTasksDSL.g:156:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalTasksDSL.g:157:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalTasksDSL.g:163:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'width:' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token lv_height_3_0=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:169:2: ( (otherlv_0= 'width:' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) ) )
            // InternalTasksDSL.g:170:2: (otherlv_0= 'width:' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) )
            {
            // InternalTasksDSL.g:170:2: (otherlv_0= 'width:' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) ) )
            // InternalTasksDSL.g:171:3: otherlv_0= 'width:' ( (lv_width_1_0= RULE_INT ) ) otherlv_2= 'height:' ( (lv_height_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getWidthKeyword_0());
            		
            // InternalTasksDSL.g:175:3: ( (lv_width_1_0= RULE_INT ) )
            // InternalTasksDSL.g:176:4: (lv_width_1_0= RULE_INT )
            {
            // InternalTasksDSL.g:176:4: (lv_width_1_0= RULE_INT )
            // InternalTasksDSL.g:177:5: lv_width_1_0= RULE_INT
            {
            lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_width_1_0, grammarAccess.getGridAccess().getWidthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGridAccess().getHeightKeyword_2());
            		
            // InternalTasksDSL.g:197:3: ( (lv_height_3_0= RULE_INT ) )
            // InternalTasksDSL.g:198:4: (lv_height_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:198:4: (lv_height_3_0= RULE_INT )
            // InternalTasksDSL.g:199:5: lv_height_3_0= RULE_INT
            {
            lv_height_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_height_3_0, grammarAccess.getGridAccess().getHeightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalTasksDSL.g:219:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalTasksDSL.g:219:45: (iv_ruleCell= ruleCell EOF )
            // InternalTasksDSL.g:220:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalTasksDSL.g:226:1: ruleCell returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nCells_1_0 = null;

        EObject lv_fillCells_3_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:232:2: ( (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' ) )
            // InternalTasksDSL.g:233:2: (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' )
            {
            // InternalTasksDSL.g:233:2: (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' )
            // InternalTasksDSL.g:234:3: otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalTasksDSL.g:238:3: ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }
                else if ( (LA3_0==16) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTasksDSL.g:239:4: ( (lv_nCells_1_0= ruleNormalCell ) )
            	    {
            	    // InternalTasksDSL.g:239:4: ( (lv_nCells_1_0= ruleNormalCell ) )
            	    // InternalTasksDSL.g:240:5: (lv_nCells_1_0= ruleNormalCell )
            	    {
            	    // InternalTasksDSL.g:240:5: (lv_nCells_1_0= ruleNormalCell )
            	    // InternalTasksDSL.g:241:6: lv_nCells_1_0= ruleNormalCell
            	    {

            	    						newCompositeNode(grammarAccess.getCellAccess().getNCellsNormalCellParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_nCells_1_0=ruleNormalCell();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCellRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nCells",
            	    							lv_nCells_1_0,
            	    							"goldsl.TasksDSL.NormalCell");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTasksDSL.g:259:4: (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) )
            	    {
            	    // InternalTasksDSL.g:259:4: (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) )
            	    // InternalTasksDSL.g:260:5: otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_9); 

            	    					newLeafNode(otherlv_2, grammarAccess.getCellAccess().getFillCellKeyword_1_1_0());
            	    				
            	    // InternalTasksDSL.g:264:5: ( (lv_fillCells_3_0= ruleFillCell ) )
            	    // InternalTasksDSL.g:265:6: (lv_fillCells_3_0= ruleFillCell )
            	    {
            	    // InternalTasksDSL.g:265:6: (lv_fillCells_3_0= ruleFillCell )
            	    // InternalTasksDSL.g:266:7: lv_fillCells_3_0= ruleFillCell
            	    {

            	    							newCompositeNode(grammarAccess.getCellAccess().getFillCellsFillCellParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_fillCells_3_0=ruleFillCell();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCellRule());
            	    							}
            	    							add(
            	    								current,
            	    								"fillCells",
            	    								lv_fillCells_3_0,
            	    								"goldsl.TasksDSL.FillCell");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCellAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleNormalCell"
    // InternalTasksDSL.g:293:1: entryRuleNormalCell returns [EObject current=null] : iv_ruleNormalCell= ruleNormalCell EOF ;
    public final EObject entryRuleNormalCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalCell = null;


        try {
            // InternalTasksDSL.g:293:51: (iv_ruleNormalCell= ruleNormalCell EOF )
            // InternalTasksDSL.g:294:2: iv_ruleNormalCell= ruleNormalCell EOF
            {
             newCompositeNode(grammarAccess.getNormalCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalCell=ruleNormalCell();

            state._fsp--;

             current =iv_ruleNormalCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormalCell"


    // $ANTLR start "ruleNormalCell"
    // InternalTasksDSL.g:300:1: ruleNormalCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleNormalCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:306:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalTasksDSL.g:307:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalTasksDSL.g:307:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalTasksDSL.g:308:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTasksDSL.g:312:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalTasksDSL.g:313:4: (lv_x_1_0= RULE_INT )
            {
            // InternalTasksDSL.g:313:4: (lv_x_1_0= RULE_INT )
            // InternalTasksDSL.g:314:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_x_1_0, grammarAccess.getNormalCellAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNormalCellAccess().getCommaKeyword_2());
            		
            // InternalTasksDSL.g:334:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalTasksDSL.g:335:4: (lv_y_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:335:4: (lv_y_3_0= RULE_INT )
            // InternalTasksDSL.g:336:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_y_3_0, grammarAccess.getNormalCellAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNormalCellAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormalCell"


    // $ANTLR start "entryRuleFillCell"
    // InternalTasksDSL.g:360:1: entryRuleFillCell returns [EObject current=null] : iv_ruleFillCell= ruleFillCell EOF ;
    public final EObject entryRuleFillCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillCell = null;


        try {
            // InternalTasksDSL.g:360:49: (iv_ruleFillCell= ruleFillCell EOF )
            // InternalTasksDSL.g:361:2: iv_ruleFillCell= ruleFillCell EOF
            {
             newCompositeNode(grammarAccess.getFillCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillCell=ruleFillCell();

            state._fsp--;

             current =iv_ruleFillCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFillCell"


    // $ANTLR start "ruleFillCell"
    // InternalTasksDSL.g:367:1: ruleFillCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' ) ;
    public final EObject ruleFillCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;
        Token lv_repAmount_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_dir_7_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:373:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' ) )
            // InternalTasksDSL.g:374:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' )
            {
            // InternalTasksDSL.g:374:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' )
            // InternalTasksDSL.g:375:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFillCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTasksDSL.g:379:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalTasksDSL.g:380:4: (lv_x_1_0= RULE_INT )
            {
            // InternalTasksDSL.g:380:4: (lv_x_1_0= RULE_INT )
            // InternalTasksDSL.g:381:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_x_1_0, grammarAccess.getFillCellAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFillCellAccess().getCommaKeyword_2());
            		
            // InternalTasksDSL.g:401:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalTasksDSL.g:402:4: (lv_y_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:402:4: (lv_y_3_0= RULE_INT )
            // InternalTasksDSL.g:403:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_y_3_0, grammarAccess.getFillCellAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFillCellAccess().getCommaKeyword_4());
            		
            // InternalTasksDSL.g:423:3: ( (lv_repAmount_5_0= RULE_INT ) )
            // InternalTasksDSL.g:424:4: (lv_repAmount_5_0= RULE_INT )
            {
            // InternalTasksDSL.g:424:4: (lv_repAmount_5_0= RULE_INT )
            // InternalTasksDSL.g:425:5: lv_repAmount_5_0= RULE_INT
            {
            lv_repAmount_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_repAmount_5_0, grammarAccess.getFillCellAccess().getRepAmountINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repAmount",
            						lv_repAmount_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getFillCellAccess().getCommaKeyword_6());
            		
            // InternalTasksDSL.g:445:3: ( (lv_dir_7_0= ruleDirection ) )
            // InternalTasksDSL.g:446:4: (lv_dir_7_0= ruleDirection )
            {
            // InternalTasksDSL.g:446:4: (lv_dir_7_0= ruleDirection )
            // InternalTasksDSL.g:447:5: lv_dir_7_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getFillCellAccess().getDirDirectionEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_dir_7_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillCellRule());
            					}
            					set(
            						current,
            						"dir",
            						lv_dir_7_0,
            						"goldsl.TasksDSL.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFillCellAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFillCell"


    // $ANTLR start "entryRuleRule"
    // InternalTasksDSL.g:472:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTasksDSL.g:472:45: (iv_ruleRule= ruleRule EOF )
            // InternalTasksDSL.g:473:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTasksDSL.g:479:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_3_0=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_sign_2_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:485:2: ( (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) ) )
            // InternalTasksDSL.g:486:2: (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) )
            {
            // InternalTasksDSL.g:486:2: (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) )
            // InternalTasksDSL.g:487:3: otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalTasksDSL.g:491:3: ( (lv_type_1_0= ruleRuleType ) )
            // InternalTasksDSL.g:492:4: (lv_type_1_0= ruleRuleType )
            {
            // InternalTasksDSL.g:492:4: (lv_type_1_0= ruleRuleType )
            // InternalTasksDSL.g:493:5: lv_type_1_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_1_0=ruleRuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"goldsl.TasksDSL.RuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTasksDSL.g:510:3: ( (lv_sign_2_0= ruleCompareSign ) )
            // InternalTasksDSL.g:511:4: (lv_sign_2_0= ruleCompareSign )
            {
            // InternalTasksDSL.g:511:4: (lv_sign_2_0= ruleCompareSign )
            // InternalTasksDSL.g:512:5: lv_sign_2_0= ruleCompareSign
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSignCompareSignEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_sign_2_0=ruleCompareSign();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sign",
            						lv_sign_2_0,
            						"goldsl.TasksDSL.CompareSign");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTasksDSL.g:529:3: ( (lv_n_3_0= RULE_INT ) )
            // InternalTasksDSL.g:530:4: (lv_n_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:530:4: (lv_n_3_0= RULE_INT )
            // InternalTasksDSL.g:531:5: lv_n_3_0= RULE_INT
            {
            lv_n_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_3_0, grammarAccess.getRuleAccess().getNINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "ruleDirection"
    // InternalTasksDSL.g:551:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:557:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) )
            // InternalTasksDSL.g:558:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalTasksDSL.g:558:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTasksDSL.g:559:3: (enumLiteral_0= 'north' )
                    {
                    // InternalTasksDSL.g:559:3: (enumLiteral_0= 'north' )
                    // InternalTasksDSL.g:560:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:567:3: (enumLiteral_1= 'east' )
                    {
                    // InternalTasksDSL.g:567:3: (enumLiteral_1= 'east' )
                    // InternalTasksDSL.g:568:4: enumLiteral_1= 'east'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:575:3: (enumLiteral_2= 'south' )
                    {
                    // InternalTasksDSL.g:575:3: (enumLiteral_2= 'south' )
                    // InternalTasksDSL.g:576:4: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTasksDSL.g:583:3: (enumLiteral_3= 'west' )
                    {
                    // InternalTasksDSL.g:583:3: (enumLiteral_3= 'west' )
                    // InternalTasksDSL.g:584:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleRuleType"
    // InternalTasksDSL.g:594:1: ruleRuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'come_alive' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) ) ;
    public final Enumerator ruleRuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:600:2: ( ( (enumLiteral_0= 'come_alive' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) ) )
            // InternalTasksDSL.g:601:2: ( (enumLiteral_0= 'come_alive' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) )
            {
            // InternalTasksDSL.g:601:2: ( (enumLiteral_0= 'come_alive' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTasksDSL.g:602:3: (enumLiteral_0= 'come_alive' )
                    {
                    // InternalTasksDSL.g:602:3: (enumLiteral_0= 'come_alive' )
                    // InternalTasksDSL.g:603:4: enumLiteral_0= 'come_alive'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getCOME_ALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getCOME_ALIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:610:3: (enumLiteral_1= 'stay' )
                    {
                    // InternalTasksDSL.g:610:3: (enumLiteral_1= 'stay' )
                    // InternalTasksDSL.g:611:4: enumLiteral_1= 'stay'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getSTAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getSTAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:618:3: (enumLiteral_2= 'die' )
                    {
                    // InternalTasksDSL.g:618:3: (enumLiteral_2= 'die' )
                    // InternalTasksDSL.g:619:4: enumLiteral_2= 'die'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getDIEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRuleTypeAccess().getDIEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "ruleCompareSign"
    // InternalTasksDSL.g:629:1: ruleCompareSign returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) ) ;
    public final Enumerator ruleCompareSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:635:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) ) )
            // InternalTasksDSL.g:636:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) )
            {
            // InternalTasksDSL.g:636:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTasksDSL.g:637:3: (enumLiteral_0= '>' )
                    {
                    // InternalTasksDSL.g:637:3: (enumLiteral_0= '>' )
                    // InternalTasksDSL.g:638:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getCompareSignAccess().getBIGGER_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareSignAccess().getBIGGER_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:645:3: (enumLiteral_1= '==' )
                    {
                    // InternalTasksDSL.g:645:3: (enumLiteral_1= '==' )
                    // InternalTasksDSL.g:646:4: enumLiteral_1= '=='
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getCompareSignAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareSignAccess().getEQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:653:3: (enumLiteral_2= '<' )
                    {
                    // InternalTasksDSL.g:653:3: (enumLiteral_2= '<' )
                    // InternalTasksDSL.g:654:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getCompareSignAccess().getSMALLER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareSignAccess().getSMALLER_THANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareSign"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0000000L});

}