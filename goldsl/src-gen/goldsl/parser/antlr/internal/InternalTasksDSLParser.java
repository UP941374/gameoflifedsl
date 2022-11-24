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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cells'", "'['", "'fillCell:'", "']'", "'('", "','", "')'", "'Rule'", "'north'", "'east'", "'south'", "'west'", "'multiply'", "'stay'", "'die'", "'>'", "'='", "'<'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // InternalTasksDSL.g:72:1: ruleGameOfLife returns [EObject current=null] : ( (otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+ )? ( (lv_rules_2_0= ruleRule ) )* ) ;
    public final EObject ruleGameOfLife() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cells_1_0 = null;

        EObject lv_rules_2_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:78:2: ( ( (otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+ )? ( (lv_rules_2_0= ruleRule ) )* ) )
            // InternalTasksDSL.g:79:2: ( (otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+ )? ( (lv_rules_2_0= ruleRule ) )* )
            {
            // InternalTasksDSL.g:79:2: ( (otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+ )? ( (lv_rules_2_0= ruleRule ) )* )
            // InternalTasksDSL.g:80:3: (otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+ )? ( (lv_rules_2_0= ruleRule ) )*
            {
            // InternalTasksDSL.g:80:3: (otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTasksDSL.g:81:4: otherlv_0= 'Cells' ( (lv_cells_1_0= ruleCell ) )+
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getGameOfLifeAccess().getCellsKeyword_0_0());
                    			
                    // InternalTasksDSL.g:85:4: ( (lv_cells_1_0= ruleCell ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTasksDSL.g:86:5: (lv_cells_1_0= ruleCell )
                    	    {
                    	    // InternalTasksDSL.g:86:5: (lv_cells_1_0= ruleCell )
                    	    // InternalTasksDSL.g:87:6: lv_cells_1_0= ruleCell
                    	    {

                    	    						newCompositeNode(grammarAccess.getGameOfLifeAccess().getCellsCellParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_cells_1_0=ruleCell();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"cells",
                    	    							lv_cells_1_0,
                    	    							"goldsl.TasksDSL.Cell");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }

            // InternalTasksDSL.g:105:3: ( (lv_rules_2_0= ruleRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTasksDSL.g:106:4: (lv_rules_2_0= ruleRule )
            	    {
            	    // InternalTasksDSL.g:106:4: (lv_rules_2_0= ruleRule )
            	    // InternalTasksDSL.g:107:5: lv_rules_2_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getGameOfLifeAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rules_2_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_2_0,
            	    						"goldsl.TasksDSL.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleCell"
    // InternalTasksDSL.g:128:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalTasksDSL.g:128:45: (iv_ruleCell= ruleCell EOF )
            // InternalTasksDSL.g:129:2: iv_ruleCell= ruleCell EOF
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
    // InternalTasksDSL.g:135:1: ruleCell returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nCells_1_0 = null;

        EObject lv_fillCells_3_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:141:2: ( (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' ) )
            // InternalTasksDSL.g:142:2: (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' )
            {
            // InternalTasksDSL.g:142:2: (otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']' )
            // InternalTasksDSL.g:143:3: otherlv_0= '[' ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalTasksDSL.g:147:3: ( ( (lv_nCells_1_0= ruleNormalCell ) ) | (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }
                else if ( (LA4_0==13) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTasksDSL.g:148:4: ( (lv_nCells_1_0= ruleNormalCell ) )
            	    {
            	    // InternalTasksDSL.g:148:4: ( (lv_nCells_1_0= ruleNormalCell ) )
            	    // InternalTasksDSL.g:149:5: (lv_nCells_1_0= ruleNormalCell )
            	    {
            	    // InternalTasksDSL.g:149:5: (lv_nCells_1_0= ruleNormalCell )
            	    // InternalTasksDSL.g:150:6: lv_nCells_1_0= ruleNormalCell
            	    {

            	    						newCompositeNode(grammarAccess.getCellAccess().getNCellsNormalCellParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    // InternalTasksDSL.g:168:4: (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) )
            	    {
            	    // InternalTasksDSL.g:168:4: (otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) ) )
            	    // InternalTasksDSL.g:169:5: otherlv_2= 'fillCell:' ( (lv_fillCells_3_0= ruleFillCell ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_7); 

            	    					newLeafNode(otherlv_2, grammarAccess.getCellAccess().getFillCellKeyword_1_1_0());
            	    				
            	    // InternalTasksDSL.g:173:5: ( (lv_fillCells_3_0= ruleFillCell ) )
            	    // InternalTasksDSL.g:174:6: (lv_fillCells_3_0= ruleFillCell )
            	    {
            	    // InternalTasksDSL.g:174:6: (lv_fillCells_3_0= ruleFillCell )
            	    // InternalTasksDSL.g:175:7: lv_fillCells_3_0= ruleFillCell
            	    {

            	    							newCompositeNode(grammarAccess.getCellAccess().getFillCellsFillCellParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalTasksDSL.g:202:1: entryRuleNormalCell returns [EObject current=null] : iv_ruleNormalCell= ruleNormalCell EOF ;
    public final EObject entryRuleNormalCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalCell = null;


        try {
            // InternalTasksDSL.g:202:51: (iv_ruleNormalCell= ruleNormalCell EOF )
            // InternalTasksDSL.g:203:2: iv_ruleNormalCell= ruleNormalCell EOF
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
    // InternalTasksDSL.g:209:1: ruleNormalCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleNormalCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:215:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalTasksDSL.g:216:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalTasksDSL.g:216:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalTasksDSL.g:217:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTasksDSL.g:221:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalTasksDSL.g:222:4: (lv_x_1_0= RULE_INT )
            {
            // InternalTasksDSL.g:222:4: (lv_x_1_0= RULE_INT )
            // InternalTasksDSL.g:223:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNormalCellAccess().getCommaKeyword_2());
            		
            // InternalTasksDSL.g:243:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalTasksDSL.g:244:4: (lv_y_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:244:4: (lv_y_3_0= RULE_INT )
            // InternalTasksDSL.g:245:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalTasksDSL.g:269:1: entryRuleFillCell returns [EObject current=null] : iv_ruleFillCell= ruleFillCell EOF ;
    public final EObject entryRuleFillCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillCell = null;


        try {
            // InternalTasksDSL.g:269:49: (iv_ruleFillCell= ruleFillCell EOF )
            // InternalTasksDSL.g:270:2: iv_ruleFillCell= ruleFillCell EOF
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
    // InternalTasksDSL.g:276:1: ruleFillCell returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' ) ;
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
            // InternalTasksDSL.g:282:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' ) )
            // InternalTasksDSL.g:283:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' )
            {
            // InternalTasksDSL.g:283:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')' )
            // InternalTasksDSL.g:284:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_repAmount_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_dir_7_0= ruleDirection ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFillCellAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTasksDSL.g:288:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalTasksDSL.g:289:4: (lv_x_1_0= RULE_INT )
            {
            // InternalTasksDSL.g:289:4: (lv_x_1_0= RULE_INT )
            // InternalTasksDSL.g:290:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFillCellAccess().getCommaKeyword_2());
            		
            // InternalTasksDSL.g:310:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalTasksDSL.g:311:4: (lv_y_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:311:4: (lv_y_3_0= RULE_INT )
            // InternalTasksDSL.g:312:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFillCellAccess().getCommaKeyword_4());
            		
            // InternalTasksDSL.g:332:3: ( (lv_repAmount_5_0= RULE_INT ) )
            // InternalTasksDSL.g:333:4: (lv_repAmount_5_0= RULE_INT )
            {
            // InternalTasksDSL.g:333:4: (lv_repAmount_5_0= RULE_INT )
            // InternalTasksDSL.g:334:5: lv_repAmount_5_0= RULE_INT
            {
            lv_repAmount_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getFillCellAccess().getCommaKeyword_6());
            		
            // InternalTasksDSL.g:354:3: ( (lv_dir_7_0= ruleDirection ) )
            // InternalTasksDSL.g:355:4: (lv_dir_7_0= ruleDirection )
            {
            // InternalTasksDSL.g:355:4: (lv_dir_7_0= ruleDirection )
            // InternalTasksDSL.g:356:5: lv_dir_7_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getFillCellAccess().getDirDirectionEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalTasksDSL.g:381:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTasksDSL.g:381:45: (iv_ruleRule= ruleRule EOF )
            // InternalTasksDSL.g:382:2: iv_ruleRule= ruleRule EOF
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
    // InternalTasksDSL.g:388:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_3_0=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_sign_2_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:394:2: ( (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) ) )
            // InternalTasksDSL.g:395:2: (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) )
            {
            // InternalTasksDSL.g:395:2: (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) ) )
            // InternalTasksDSL.g:396:3: otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( (lv_sign_2_0= ruleCompareSign ) ) ( (lv_n_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalTasksDSL.g:400:3: ( (lv_type_1_0= ruleRuleType ) )
            // InternalTasksDSL.g:401:4: (lv_type_1_0= ruleRuleType )
            {
            // InternalTasksDSL.g:401:4: (lv_type_1_0= ruleRuleType )
            // InternalTasksDSL.g:402:5: lv_type_1_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalTasksDSL.g:419:3: ( (lv_sign_2_0= ruleCompareSign ) )
            // InternalTasksDSL.g:420:4: (lv_sign_2_0= ruleCompareSign )
            {
            // InternalTasksDSL.g:420:4: (lv_sign_2_0= ruleCompareSign )
            // InternalTasksDSL.g:421:5: lv_sign_2_0= ruleCompareSign
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSignCompareSignEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalTasksDSL.g:438:3: ( (lv_n_3_0= RULE_INT ) )
            // InternalTasksDSL.g:439:4: (lv_n_3_0= RULE_INT )
            {
            // InternalTasksDSL.g:439:4: (lv_n_3_0= RULE_INT )
            // InternalTasksDSL.g:440:5: lv_n_3_0= RULE_INT
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
    // InternalTasksDSL.g:460:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:466:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) )
            // InternalTasksDSL.g:467:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalTasksDSL.g:467:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 22:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTasksDSL.g:468:3: (enumLiteral_0= 'north' )
                    {
                    // InternalTasksDSL.g:468:3: (enumLiteral_0= 'north' )
                    // InternalTasksDSL.g:469:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:476:3: (enumLiteral_1= 'east' )
                    {
                    // InternalTasksDSL.g:476:3: (enumLiteral_1= 'east' )
                    // InternalTasksDSL.g:477:4: enumLiteral_1= 'east'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:484:3: (enumLiteral_2= 'south' )
                    {
                    // InternalTasksDSL.g:484:3: (enumLiteral_2= 'south' )
                    // InternalTasksDSL.g:485:4: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTasksDSL.g:492:3: (enumLiteral_3= 'west' )
                    {
                    // InternalTasksDSL.g:492:3: (enumLiteral_3= 'west' )
                    // InternalTasksDSL.g:493:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

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
    // InternalTasksDSL.g:503:1: ruleRuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) ) ;
    public final Enumerator ruleRuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:509:2: ( ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) ) )
            // InternalTasksDSL.g:510:2: ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) )
            {
            // InternalTasksDSL.g:510:2: ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
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
                    // InternalTasksDSL.g:511:3: (enumLiteral_0= 'multiply' )
                    {
                    // InternalTasksDSL.g:511:3: (enumLiteral_0= 'multiply' )
                    // InternalTasksDSL.g:512:4: enumLiteral_0= 'multiply'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getMULTIPLYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:519:3: (enumLiteral_1= 'stay' )
                    {
                    // InternalTasksDSL.g:519:3: (enumLiteral_1= 'stay' )
                    // InternalTasksDSL.g:520:4: enumLiteral_1= 'stay'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getSTAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getSTAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:527:3: (enumLiteral_2= 'die' )
                    {
                    // InternalTasksDSL.g:527:3: (enumLiteral_2= 'die' )
                    // InternalTasksDSL.g:528:4: enumLiteral_2= 'die'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalTasksDSL.g:538:1: ruleCompareSign returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '<' ) ) ;
    public final Enumerator ruleCompareSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:544:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '<' ) ) )
            // InternalTasksDSL.g:545:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '<' ) )
            {
            // InternalTasksDSL.g:545:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= '<' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTasksDSL.g:546:3: (enumLiteral_0= '>' )
                    {
                    // InternalTasksDSL.g:546:3: (enumLiteral_0= '>' )
                    // InternalTasksDSL.g:547:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getCompareSignAccess().getBIGGER_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareSignAccess().getBIGGER_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:554:3: (enumLiteral_1= '=' )
                    {
                    // InternalTasksDSL.g:554:3: (enumLiteral_1= '=' )
                    // InternalTasksDSL.g:555:4: enumLiteral_1= '='
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getCompareSignAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareSignAccess().getEQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:562:3: (enumLiteral_2= '<' )
                    {
                    // InternalTasksDSL.g:562:3: (enumLiteral_2= '<' )
                    // InternalTasksDSL.g:563:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C000000L});

}