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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cell'", "'Random'", "'Rule'", "'<'", "'='", "'>'", "'north'", "'east'", "'south'", "'west'", "'multiply'", "'stay'", "'die'"
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
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
        	return "Gameoflife";
       	}

       	@Override
       	protected TasksDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameoflife"
    // InternalTasksDSL.g:65:1: entryRuleGameoflife returns [EObject current=null] : iv_ruleGameoflife= ruleGameoflife EOF ;
    public final EObject entryRuleGameoflife() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameoflife = null;


        try {
            // InternalTasksDSL.g:65:51: (iv_ruleGameoflife= ruleGameoflife EOF )
            // InternalTasksDSL.g:66:2: iv_ruleGameoflife= ruleGameoflife EOF
            {
             newCompositeNode(grammarAccess.getGameoflifeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameoflife=ruleGameoflife();

            state._fsp--;

             current =iv_ruleGameoflife; 
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
    // $ANTLR end "entryRuleGameoflife"


    // $ANTLR start "ruleGameoflife"
    // InternalTasksDSL.g:72:1: ruleGameoflife returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) )* ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleGameoflife() throws RecognitionException {
        EObject current = null;

        EObject lv_cells_0_0 = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:78:2: ( ( ( (lv_cells_0_0= ruleCell ) )* ( (lv_rules_1_0= ruleRule ) )* ) )
            // InternalTasksDSL.g:79:2: ( ( (lv_cells_0_0= ruleCell ) )* ( (lv_rules_1_0= ruleRule ) )* )
            {
            // InternalTasksDSL.g:79:2: ( ( (lv_cells_0_0= ruleCell ) )* ( (lv_rules_1_0= ruleRule ) )* )
            // InternalTasksDSL.g:80:3: ( (lv_cells_0_0= ruleCell ) )* ( (lv_rules_1_0= ruleRule ) )*
            {
            // InternalTasksDSL.g:80:3: ( (lv_cells_0_0= ruleCell ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTasksDSL.g:81:4: (lv_cells_0_0= ruleCell )
            	    {
            	    // InternalTasksDSL.g:81:4: (lv_cells_0_0= ruleCell )
            	    // InternalTasksDSL.g:82:5: lv_cells_0_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getGameoflifeAccess().getCellsCellParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_cells_0_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameoflifeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_0_0,
            	    						"goldsl.TasksDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTasksDSL.g:99:3: ( (lv_rules_1_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTasksDSL.g:100:4: (lv_rules_1_0= ruleRule )
            	    {
            	    // InternalTasksDSL.g:100:4: (lv_rules_1_0= ruleRule )
            	    // InternalTasksDSL.g:101:5: lv_rules_1_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getGameoflifeAccess().getRulesRuleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_rules_1_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameoflifeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_1_0,
            	    						"goldsl.TasksDSL.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleGameoflife"


    // $ANTLR start "entryRuleCell"
    // InternalTasksDSL.g:122:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalTasksDSL.g:122:45: (iv_ruleCell= ruleCell EOF )
            // InternalTasksDSL.g:123:2: iv_ruleCell= ruleCell EOF
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
    // InternalTasksDSL.g:129:1: ruleCell returns [EObject current=null] : ( (otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )? ) | (otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token lv_y_2_0=null;
        Token lv_no_3_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Enumerator lv_dir_4_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:135:2: ( ( (otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )? ) | (otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) ) ) ) )
            // InternalTasksDSL.g:136:2: ( (otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )? ) | (otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) ) ) )
            {
            // InternalTasksDSL.g:136:2: ( (otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )? ) | (otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTasksDSL.g:137:3: (otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )? )
                    {
                    // InternalTasksDSL.g:137:3: (otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )? )
                    // InternalTasksDSL.g:138:4: otherlv_0= 'Cell' ( (lv_x_1_0= RULE_INT ) ) ( (lv_y_2_0= RULE_INT ) ) ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )?
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCellKeyword_0_0());
                    			
                    // InternalTasksDSL.g:142:4: ( (lv_x_1_0= RULE_INT ) )
                    // InternalTasksDSL.g:143:5: (lv_x_1_0= RULE_INT )
                    {
                    // InternalTasksDSL.g:143:5: (lv_x_1_0= RULE_INT )
                    // InternalTasksDSL.g:144:6: lv_x_1_0= RULE_INT
                    {
                    lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_x_1_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalTasksDSL.g:160:4: ( (lv_y_2_0= RULE_INT ) )
                    // InternalTasksDSL.g:161:5: (lv_y_2_0= RULE_INT )
                    {
                    // InternalTasksDSL.g:161:5: (lv_y_2_0= RULE_INT )
                    // InternalTasksDSL.g:162:6: lv_y_2_0= RULE_INT
                    {
                    lv_y_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    						newLeafNode(lv_y_2_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalTasksDSL.g:178:4: ( ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_INT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTasksDSL.g:179:5: ( (lv_no_3_0= RULE_INT ) ) ( (lv_dir_4_0= ruleDirection ) )
                            {
                            // InternalTasksDSL.g:179:5: ( (lv_no_3_0= RULE_INT ) )
                            // InternalTasksDSL.g:180:6: (lv_no_3_0= RULE_INT )
                            {
                            // InternalTasksDSL.g:180:6: (lv_no_3_0= RULE_INT )
                            // InternalTasksDSL.g:181:7: lv_no_3_0= RULE_INT
                            {
                            lv_no_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                            							newLeafNode(lv_no_3_0, grammarAccess.getCellAccess().getNoINTTerminalRuleCall_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCellRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"no",
                            								lv_no_3_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            // InternalTasksDSL.g:197:5: ( (lv_dir_4_0= ruleDirection ) )
                            // InternalTasksDSL.g:198:6: (lv_dir_4_0= ruleDirection )
                            {
                            // InternalTasksDSL.g:198:6: (lv_dir_4_0= ruleDirection )
                            // InternalTasksDSL.g:199:7: lv_dir_4_0= ruleDirection
                            {

                            							newCompositeNode(grammarAccess.getCellAccess().getDirDirectionEnumRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_dir_4_0=ruleDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCellRule());
                            							}
                            							set(
                            								current,
                            								"dir",
                            								lv_dir_4_0,
                            								"goldsl.TasksDSL.Direction");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:219:3: (otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) ) )
                    {
                    // InternalTasksDSL.g:219:3: (otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) ) )
                    // InternalTasksDSL.g:220:4: otherlv_5= 'Random' ( (lv_no_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getCellAccess().getRandomKeyword_1_0());
                    			
                    // InternalTasksDSL.g:224:4: ( (lv_no_6_0= RULE_INT ) )
                    // InternalTasksDSL.g:225:5: (lv_no_6_0= RULE_INT )
                    {
                    // InternalTasksDSL.g:225:5: (lv_no_6_0= RULE_INT )
                    // InternalTasksDSL.g:226:6: lv_no_6_0= RULE_INT
                    {
                    lv_no_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_no_6_0, grammarAccess.getCellAccess().getNoINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"no",
                    							lv_no_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRule"
    // InternalTasksDSL.g:247:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTasksDSL.g:247:45: (iv_ruleRule= ruleRule EOF )
            // InternalTasksDSL.g:248:2: iv_ruleRule= ruleRule EOF
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
    // InternalTasksDSL.g:254:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( ( (lv_sign_2_0= '<' ) ) | otherlv_3= '=' | otherlv_4= '>' ) ( (lv_n_5_0= RULE_INT ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sign_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_n_5_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalTasksDSL.g:260:2: ( (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( ( (lv_sign_2_0= '<' ) ) | otherlv_3= '=' | otherlv_4= '>' ) ( (lv_n_5_0= RULE_INT ) ) ) )
            // InternalTasksDSL.g:261:2: (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( ( (lv_sign_2_0= '<' ) ) | otherlv_3= '=' | otherlv_4= '>' ) ( (lv_n_5_0= RULE_INT ) ) )
            {
            // InternalTasksDSL.g:261:2: (otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( ( (lv_sign_2_0= '<' ) ) | otherlv_3= '=' | otherlv_4= '>' ) ( (lv_n_5_0= RULE_INT ) ) )
            // InternalTasksDSL.g:262:3: otherlv_0= 'Rule' ( (lv_type_1_0= ruleRuleType ) ) ( ( (lv_sign_2_0= '<' ) ) | otherlv_3= '=' | otherlv_4= '>' ) ( (lv_n_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalTasksDSL.g:266:3: ( (lv_type_1_0= ruleRuleType ) )
            // InternalTasksDSL.g:267:4: (lv_type_1_0= ruleRuleType )
            {
            // InternalTasksDSL.g:267:4: (lv_type_1_0= ruleRuleType )
            // InternalTasksDSL.g:268:5: lv_type_1_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalTasksDSL.g:285:3: ( ( (lv_sign_2_0= '<' ) ) | otherlv_3= '=' | otherlv_4= '>' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
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
                    // InternalTasksDSL.g:286:4: ( (lv_sign_2_0= '<' ) )
                    {
                    // InternalTasksDSL.g:286:4: ( (lv_sign_2_0= '<' ) )
                    // InternalTasksDSL.g:287:5: (lv_sign_2_0= '<' )
                    {
                    // InternalTasksDSL.g:287:5: (lv_sign_2_0= '<' )
                    // InternalTasksDSL.g:288:6: lv_sign_2_0= '<'
                    {
                    lv_sign_2_0=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_sign_2_0, grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "sign", lv_sign_2_0, "<");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:301:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getEqualsSignKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:306:4: otherlv_4= '>'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getGreaterThanSignKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalTasksDSL.g:311:3: ( (lv_n_5_0= RULE_INT ) )
            // InternalTasksDSL.g:312:4: (lv_n_5_0= RULE_INT )
            {
            // InternalTasksDSL.g:312:4: (lv_n_5_0= RULE_INT )
            // InternalTasksDSL.g:313:5: lv_n_5_0= RULE_INT
            {
            lv_n_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_5_0, grammarAccess.getRuleAccess().getNINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_5_0,
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
    // InternalTasksDSL.g:333:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:339:2: ( ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) ) )
            // InternalTasksDSL.g:340:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            {
            // InternalTasksDSL.g:340:2: ( (enumLiteral_0= 'north' ) | (enumLiteral_1= 'east' ) | (enumLiteral_2= 'south' ) | (enumLiteral_3= 'west' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTasksDSL.g:341:3: (enumLiteral_0= 'north' )
                    {
                    // InternalTasksDSL.g:341:3: (enumLiteral_0= 'north' )
                    // InternalTasksDSL.g:342:4: enumLiteral_0= 'north'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:349:3: (enumLiteral_1= 'east' )
                    {
                    // InternalTasksDSL.g:349:3: (enumLiteral_1= 'east' )
                    // InternalTasksDSL.g:350:4: enumLiteral_1= 'east'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:357:3: (enumLiteral_2= 'south' )
                    {
                    // InternalTasksDSL.g:357:3: (enumLiteral_2= 'south' )
                    // InternalTasksDSL.g:358:4: enumLiteral_2= 'south'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTasksDSL.g:365:3: (enumLiteral_3= 'west' )
                    {
                    // InternalTasksDSL.g:365:3: (enumLiteral_3= 'west' )
                    // InternalTasksDSL.g:366:4: enumLiteral_3= 'west'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalTasksDSL.g:376:1: ruleRuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) ) ;
    public final Enumerator ruleRuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTasksDSL.g:382:2: ( ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) ) )
            // InternalTasksDSL.g:383:2: ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) )
            {
            // InternalTasksDSL.g:383:2: ( (enumLiteral_0= 'multiply' ) | (enumLiteral_1= 'stay' ) | (enumLiteral_2= 'die' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
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
                    // InternalTasksDSL.g:384:3: (enumLiteral_0= 'multiply' )
                    {
                    // InternalTasksDSL.g:384:3: (enumLiteral_0= 'multiply' )
                    // InternalTasksDSL.g:385:4: enumLiteral_0= 'multiply'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRuleTypeAccess().getMultiplyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:392:3: (enumLiteral_1= 'stay' )
                    {
                    // InternalTasksDSL.g:392:3: (enumLiteral_1= 'stay' )
                    // InternalTasksDSL.g:393:4: enumLiteral_1= 'stay'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getStayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRuleTypeAccess().getStayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:400:3: (enumLiteral_2= 'die' )
                    {
                    // InternalTasksDSL.g:400:3: (enumLiteral_2= 'die' )
                    // InternalTasksDSL.g:401:4: enumLiteral_2= 'die'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getRuleTypeAccess().getDieEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRuleTypeAccess().getDieEnumLiteralDeclaration_2());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001C000L});

}