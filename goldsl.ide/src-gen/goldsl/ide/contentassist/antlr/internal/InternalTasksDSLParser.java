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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTasksDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'>'", "'north'", "'east'", "'south'", "'west'", "'multiply'", "'stay'", "'die'", "'Cell'", "'Random'", "'Rule'", "'<'"
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



    // $ANTLR start "entryRuleGameoflife"
    // InternalTasksDSL.g:53:1: entryRuleGameoflife : ruleGameoflife EOF ;
    public final void entryRuleGameoflife() throws RecognitionException {
        try {
            // InternalTasksDSL.g:54:1: ( ruleGameoflife EOF )
            // InternalTasksDSL.g:55:1: ruleGameoflife EOF
            {
             before(grammarAccess.getGameoflifeRule()); 
            pushFollow(FOLLOW_1);
            ruleGameoflife();

            state._fsp--;

             after(grammarAccess.getGameoflifeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameoflife"


    // $ANTLR start "ruleGameoflife"
    // InternalTasksDSL.g:62:1: ruleGameoflife : ( ( rule__Gameoflife__Group__0 ) ) ;
    public final void ruleGameoflife() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:66:2: ( ( ( rule__Gameoflife__Group__0 ) ) )
            // InternalTasksDSL.g:67:2: ( ( rule__Gameoflife__Group__0 ) )
            {
            // InternalTasksDSL.g:67:2: ( ( rule__Gameoflife__Group__0 ) )
            // InternalTasksDSL.g:68:3: ( rule__Gameoflife__Group__0 )
            {
             before(grammarAccess.getGameoflifeAccess().getGroup()); 
            // InternalTasksDSL.g:69:3: ( rule__Gameoflife__Group__0 )
            // InternalTasksDSL.g:69:4: rule__Gameoflife__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gameoflife__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameoflifeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameoflife"


    // $ANTLR start "entryRuleCell"
    // InternalTasksDSL.g:78:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalTasksDSL.g:79:1: ( ruleCell EOF )
            // InternalTasksDSL.g:80:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalTasksDSL.g:87:1: ruleCell : ( ( rule__Cell__Alternatives ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:91:2: ( ( ( rule__Cell__Alternatives ) ) )
            // InternalTasksDSL.g:92:2: ( ( rule__Cell__Alternatives ) )
            {
            // InternalTasksDSL.g:92:2: ( ( rule__Cell__Alternatives ) )
            // InternalTasksDSL.g:93:3: ( rule__Cell__Alternatives )
            {
             before(grammarAccess.getCellAccess().getAlternatives()); 
            // InternalTasksDSL.g:94:3: ( rule__Cell__Alternatives )
            // InternalTasksDSL.g:94:4: rule__Cell__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRule"
    // InternalTasksDSL.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTasksDSL.g:104:1: ( ruleRule EOF )
            // InternalTasksDSL.g:105:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTasksDSL.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTasksDSL.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTasksDSL.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalTasksDSL.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalTasksDSL.g:119:3: ( rule__Rule__Group__0 )
            // InternalTasksDSL.g:119:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "ruleDirection"
    // InternalTasksDSL.g:128:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:132:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalTasksDSL.g:133:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalTasksDSL.g:133:2: ( ( rule__Direction__Alternatives ) )
            // InternalTasksDSL.g:134:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalTasksDSL.g:135:3: ( rule__Direction__Alternatives )
            // InternalTasksDSL.g:135:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleRuleType"
    // InternalTasksDSL.g:144:1: ruleRuleType : ( ( rule__RuleType__Alternatives ) ) ;
    public final void ruleRuleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:148:1: ( ( ( rule__RuleType__Alternatives ) ) )
            // InternalTasksDSL.g:149:2: ( ( rule__RuleType__Alternatives ) )
            {
            // InternalTasksDSL.g:149:2: ( ( rule__RuleType__Alternatives ) )
            // InternalTasksDSL.g:150:3: ( rule__RuleType__Alternatives )
            {
             before(grammarAccess.getRuleTypeAccess().getAlternatives()); 
            // InternalTasksDSL.g:151:3: ( rule__RuleType__Alternatives )
            // InternalTasksDSL.g:151:4: rule__RuleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "rule__Cell__Alternatives"
    // InternalTasksDSL.g:159:1: rule__Cell__Alternatives : ( ( ( rule__Cell__Group_0__0 ) ) | ( ( rule__Cell__Group_1__0 ) ) );
    public final void rule__Cell__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:163:1: ( ( ( rule__Cell__Group_0__0 ) ) | ( ( rule__Cell__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTasksDSL.g:164:2: ( ( rule__Cell__Group_0__0 ) )
                    {
                    // InternalTasksDSL.g:164:2: ( ( rule__Cell__Group_0__0 ) )
                    // InternalTasksDSL.g:165:3: ( rule__Cell__Group_0__0 )
                    {
                     before(grammarAccess.getCellAccess().getGroup_0()); 
                    // InternalTasksDSL.g:166:3: ( rule__Cell__Group_0__0 )
                    // InternalTasksDSL.g:166:4: rule__Cell__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cell__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:170:2: ( ( rule__Cell__Group_1__0 ) )
                    {
                    // InternalTasksDSL.g:170:2: ( ( rule__Cell__Group_1__0 ) )
                    // InternalTasksDSL.g:171:3: ( rule__Cell__Group_1__0 )
                    {
                     before(grammarAccess.getCellAccess().getGroup_1()); 
                    // InternalTasksDSL.g:172:3: ( rule__Cell__Group_1__0 )
                    // InternalTasksDSL.g:172:4: rule__Cell__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cell__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Alternatives"


    // $ANTLR start "rule__Rule__Alternatives_2"
    // InternalTasksDSL.g:180:1: rule__Rule__Alternatives_2 : ( ( ( rule__Rule__SignAssignment_2_0 ) ) | ( '=' ) | ( '>' ) );
    public final void rule__Rule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:184:1: ( ( ( rule__Rule__SignAssignment_2_0 ) ) | ( '=' ) | ( '>' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTasksDSL.g:185:2: ( ( rule__Rule__SignAssignment_2_0 ) )
                    {
                    // InternalTasksDSL.g:185:2: ( ( rule__Rule__SignAssignment_2_0 ) )
                    // InternalTasksDSL.g:186:3: ( rule__Rule__SignAssignment_2_0 )
                    {
                     before(grammarAccess.getRuleAccess().getSignAssignment_2_0()); 
                    // InternalTasksDSL.g:187:3: ( rule__Rule__SignAssignment_2_0 )
                    // InternalTasksDSL.g:187:4: rule__Rule__SignAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__SignAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getSignAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:191:2: ( '=' )
                    {
                    // InternalTasksDSL.g:191:2: ( '=' )
                    // InternalTasksDSL.g:192:3: '='
                    {
                     before(grammarAccess.getRuleAccess().getEqualsSignKeyword_2_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getEqualsSignKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:197:2: ( '>' )
                    {
                    // InternalTasksDSL.g:197:2: ( '>' )
                    // InternalTasksDSL.g:198:3: '>'
                    {
                     before(grammarAccess.getRuleAccess().getGreaterThanSignKeyword_2_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getGreaterThanSignKeyword_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_2"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalTasksDSL.g:207:1: rule__Direction__Alternatives : ( ( ( 'north' ) ) | ( ( 'east' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:211:1: ( ( ( 'north' ) ) | ( ( 'east' ) ) | ( ( 'south' ) ) | ( ( 'west' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTasksDSL.g:212:2: ( ( 'north' ) )
                    {
                    // InternalTasksDSL.g:212:2: ( ( 'north' ) )
                    // InternalTasksDSL.g:213:3: ( 'north' )
                    {
                     before(grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0()); 
                    // InternalTasksDSL.g:214:3: ( 'north' )
                    // InternalTasksDSL.g:214:4: 'north'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getNORTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:218:2: ( ( 'east' ) )
                    {
                    // InternalTasksDSL.g:218:2: ( ( 'east' ) )
                    // InternalTasksDSL.g:219:3: ( 'east' )
                    {
                     before(grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1()); 
                    // InternalTasksDSL.g:220:3: ( 'east' )
                    // InternalTasksDSL.g:220:4: 'east'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEASTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:224:2: ( ( 'south' ) )
                    {
                    // InternalTasksDSL.g:224:2: ( ( 'south' ) )
                    // InternalTasksDSL.g:225:3: ( 'south' )
                    {
                     before(grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2()); 
                    // InternalTasksDSL.g:226:3: ( 'south' )
                    // InternalTasksDSL.g:226:4: 'south'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSOUTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTasksDSL.g:230:2: ( ( 'west' ) )
                    {
                    // InternalTasksDSL.g:230:2: ( ( 'west' ) )
                    // InternalTasksDSL.g:231:3: ( 'west' )
                    {
                     before(grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3()); 
                    // InternalTasksDSL.g:232:3: ( 'west' )
                    // InternalTasksDSL.g:232:4: 'west'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getWESTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__RuleType__Alternatives"
    // InternalTasksDSL.g:240:1: rule__RuleType__Alternatives : ( ( ( 'multiply' ) ) | ( ( 'stay' ) ) | ( ( 'die' ) ) );
    public final void rule__RuleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:244:1: ( ( ( 'multiply' ) ) | ( ( 'stay' ) ) | ( ( 'die' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTasksDSL.g:245:2: ( ( 'multiply' ) )
                    {
                    // InternalTasksDSL.g:245:2: ( ( 'multiply' ) )
                    // InternalTasksDSL.g:246:3: ( 'multiply' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getMultiplyEnumLiteralDeclaration_0()); 
                    // InternalTasksDSL.g:247:3: ( 'multiply' )
                    // InternalTasksDSL.g:247:4: 'multiply'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getMultiplyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTasksDSL.g:251:2: ( ( 'stay' ) )
                    {
                    // InternalTasksDSL.g:251:2: ( ( 'stay' ) )
                    // InternalTasksDSL.g:252:3: ( 'stay' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getStayEnumLiteralDeclaration_1()); 
                    // InternalTasksDSL.g:253:3: ( 'stay' )
                    // InternalTasksDSL.g:253:4: 'stay'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getStayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTasksDSL.g:257:2: ( ( 'die' ) )
                    {
                    // InternalTasksDSL.g:257:2: ( ( 'die' ) )
                    // InternalTasksDSL.g:258:3: ( 'die' )
                    {
                     before(grammarAccess.getRuleTypeAccess().getDieEnumLiteralDeclaration_2()); 
                    // InternalTasksDSL.g:259:3: ( 'die' )
                    // InternalTasksDSL.g:259:4: 'die'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRuleTypeAccess().getDieEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleType__Alternatives"


    // $ANTLR start "rule__Gameoflife__Group__0"
    // InternalTasksDSL.g:267:1: rule__Gameoflife__Group__0 : rule__Gameoflife__Group__0__Impl rule__Gameoflife__Group__1 ;
    public final void rule__Gameoflife__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:271:1: ( rule__Gameoflife__Group__0__Impl rule__Gameoflife__Group__1 )
            // InternalTasksDSL.g:272:2: rule__Gameoflife__Group__0__Impl rule__Gameoflife__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Gameoflife__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gameoflife__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameoflife__Group__0"


    // $ANTLR start "rule__Gameoflife__Group__0__Impl"
    // InternalTasksDSL.g:279:1: rule__Gameoflife__Group__0__Impl : ( ( rule__Gameoflife__CellsAssignment_0 )* ) ;
    public final void rule__Gameoflife__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:283:1: ( ( ( rule__Gameoflife__CellsAssignment_0 )* ) )
            // InternalTasksDSL.g:284:1: ( ( rule__Gameoflife__CellsAssignment_0 )* )
            {
            // InternalTasksDSL.g:284:1: ( ( rule__Gameoflife__CellsAssignment_0 )* )
            // InternalTasksDSL.g:285:2: ( rule__Gameoflife__CellsAssignment_0 )*
            {
             before(grammarAccess.getGameoflifeAccess().getCellsAssignment_0()); 
            // InternalTasksDSL.g:286:2: ( rule__Gameoflife__CellsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=20 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTasksDSL.g:286:3: rule__Gameoflife__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Gameoflife__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGameoflifeAccess().getCellsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameoflife__Group__0__Impl"


    // $ANTLR start "rule__Gameoflife__Group__1"
    // InternalTasksDSL.g:294:1: rule__Gameoflife__Group__1 : rule__Gameoflife__Group__1__Impl ;
    public final void rule__Gameoflife__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:298:1: ( rule__Gameoflife__Group__1__Impl )
            // InternalTasksDSL.g:299:2: rule__Gameoflife__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gameoflife__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameoflife__Group__1"


    // $ANTLR start "rule__Gameoflife__Group__1__Impl"
    // InternalTasksDSL.g:305:1: rule__Gameoflife__Group__1__Impl : ( ( rule__Gameoflife__RulesAssignment_1 )* ) ;
    public final void rule__Gameoflife__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:309:1: ( ( ( rule__Gameoflife__RulesAssignment_1 )* ) )
            // InternalTasksDSL.g:310:1: ( ( rule__Gameoflife__RulesAssignment_1 )* )
            {
            // InternalTasksDSL.g:310:1: ( ( rule__Gameoflife__RulesAssignment_1 )* )
            // InternalTasksDSL.g:311:2: ( rule__Gameoflife__RulesAssignment_1 )*
            {
             before(grammarAccess.getGameoflifeAccess().getRulesAssignment_1()); 
            // InternalTasksDSL.g:312:2: ( rule__Gameoflife__RulesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTasksDSL.g:312:3: rule__Gameoflife__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Gameoflife__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGameoflifeAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameoflife__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group_0__0"
    // InternalTasksDSL.g:321:1: rule__Cell__Group_0__0 : rule__Cell__Group_0__0__Impl rule__Cell__Group_0__1 ;
    public final void rule__Cell__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:325:1: ( rule__Cell__Group_0__0__Impl rule__Cell__Group_0__1 )
            // InternalTasksDSL.g:326:2: rule__Cell__Group_0__0__Impl rule__Cell__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Cell__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__0"


    // $ANTLR start "rule__Cell__Group_0__0__Impl"
    // InternalTasksDSL.g:333:1: rule__Cell__Group_0__0__Impl : ( 'Cell' ) ;
    public final void rule__Cell__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:337:1: ( ( 'Cell' ) )
            // InternalTasksDSL.g:338:1: ( 'Cell' )
            {
            // InternalTasksDSL.g:338:1: ( 'Cell' )
            // InternalTasksDSL.g:339:2: 'Cell'
            {
             before(grammarAccess.getCellAccess().getCellKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCellKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__0__Impl"


    // $ANTLR start "rule__Cell__Group_0__1"
    // InternalTasksDSL.g:348:1: rule__Cell__Group_0__1 : rule__Cell__Group_0__1__Impl rule__Cell__Group_0__2 ;
    public final void rule__Cell__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:352:1: ( rule__Cell__Group_0__1__Impl rule__Cell__Group_0__2 )
            // InternalTasksDSL.g:353:2: rule__Cell__Group_0__1__Impl rule__Cell__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Cell__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__1"


    // $ANTLR start "rule__Cell__Group_0__1__Impl"
    // InternalTasksDSL.g:360:1: rule__Cell__Group_0__1__Impl : ( ( rule__Cell__XAssignment_0_1 ) ) ;
    public final void rule__Cell__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:364:1: ( ( ( rule__Cell__XAssignment_0_1 ) ) )
            // InternalTasksDSL.g:365:1: ( ( rule__Cell__XAssignment_0_1 ) )
            {
            // InternalTasksDSL.g:365:1: ( ( rule__Cell__XAssignment_0_1 ) )
            // InternalTasksDSL.g:366:2: ( rule__Cell__XAssignment_0_1 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_0_1()); 
            // InternalTasksDSL.g:367:2: ( rule__Cell__XAssignment_0_1 )
            // InternalTasksDSL.g:367:3: rule__Cell__XAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__XAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getXAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__1__Impl"


    // $ANTLR start "rule__Cell__Group_0__2"
    // InternalTasksDSL.g:375:1: rule__Cell__Group_0__2 : rule__Cell__Group_0__2__Impl rule__Cell__Group_0__3 ;
    public final void rule__Cell__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:379:1: ( rule__Cell__Group_0__2__Impl rule__Cell__Group_0__3 )
            // InternalTasksDSL.g:380:2: rule__Cell__Group_0__2__Impl rule__Cell__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Cell__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__2"


    // $ANTLR start "rule__Cell__Group_0__2__Impl"
    // InternalTasksDSL.g:387:1: rule__Cell__Group_0__2__Impl : ( ( rule__Cell__YAssignment_0_2 ) ) ;
    public final void rule__Cell__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:391:1: ( ( ( rule__Cell__YAssignment_0_2 ) ) )
            // InternalTasksDSL.g:392:1: ( ( rule__Cell__YAssignment_0_2 ) )
            {
            // InternalTasksDSL.g:392:1: ( ( rule__Cell__YAssignment_0_2 ) )
            // InternalTasksDSL.g:393:2: ( rule__Cell__YAssignment_0_2 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_0_2()); 
            // InternalTasksDSL.g:394:2: ( rule__Cell__YAssignment_0_2 )
            // InternalTasksDSL.g:394:3: rule__Cell__YAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Cell__YAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getYAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__2__Impl"


    // $ANTLR start "rule__Cell__Group_0__3"
    // InternalTasksDSL.g:402:1: rule__Cell__Group_0__3 : rule__Cell__Group_0__3__Impl ;
    public final void rule__Cell__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:406:1: ( rule__Cell__Group_0__3__Impl )
            // InternalTasksDSL.g:407:2: rule__Cell__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__3"


    // $ANTLR start "rule__Cell__Group_0__3__Impl"
    // InternalTasksDSL.g:413:1: rule__Cell__Group_0__3__Impl : ( ( rule__Cell__Group_0_3__0 )? ) ;
    public final void rule__Cell__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:417:1: ( ( ( rule__Cell__Group_0_3__0 )? ) )
            // InternalTasksDSL.g:418:1: ( ( rule__Cell__Group_0_3__0 )? )
            {
            // InternalTasksDSL.g:418:1: ( ( rule__Cell__Group_0_3__0 )? )
            // InternalTasksDSL.g:419:2: ( rule__Cell__Group_0_3__0 )?
            {
             before(grammarAccess.getCellAccess().getGroup_0_3()); 
            // InternalTasksDSL.g:420:2: ( rule__Cell__Group_0_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTasksDSL.g:420:3: rule__Cell__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cell__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__3__Impl"


    // $ANTLR start "rule__Cell__Group_0_3__0"
    // InternalTasksDSL.g:429:1: rule__Cell__Group_0_3__0 : rule__Cell__Group_0_3__0__Impl rule__Cell__Group_0_3__1 ;
    public final void rule__Cell__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:433:1: ( rule__Cell__Group_0_3__0__Impl rule__Cell__Group_0_3__1 )
            // InternalTasksDSL.g:434:2: rule__Cell__Group_0_3__0__Impl rule__Cell__Group_0_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Cell__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0_3__0"


    // $ANTLR start "rule__Cell__Group_0_3__0__Impl"
    // InternalTasksDSL.g:441:1: rule__Cell__Group_0_3__0__Impl : ( ( rule__Cell__NoAssignment_0_3_0 ) ) ;
    public final void rule__Cell__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:445:1: ( ( ( rule__Cell__NoAssignment_0_3_0 ) ) )
            // InternalTasksDSL.g:446:1: ( ( rule__Cell__NoAssignment_0_3_0 ) )
            {
            // InternalTasksDSL.g:446:1: ( ( rule__Cell__NoAssignment_0_3_0 ) )
            // InternalTasksDSL.g:447:2: ( rule__Cell__NoAssignment_0_3_0 )
            {
             before(grammarAccess.getCellAccess().getNoAssignment_0_3_0()); 
            // InternalTasksDSL.g:448:2: ( rule__Cell__NoAssignment_0_3_0 )
            // InternalTasksDSL.g:448:3: rule__Cell__NoAssignment_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__NoAssignment_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getNoAssignment_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0_3__0__Impl"


    // $ANTLR start "rule__Cell__Group_0_3__1"
    // InternalTasksDSL.g:456:1: rule__Cell__Group_0_3__1 : rule__Cell__Group_0_3__1__Impl ;
    public final void rule__Cell__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:460:1: ( rule__Cell__Group_0_3__1__Impl )
            // InternalTasksDSL.g:461:2: rule__Cell__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0_3__1"


    // $ANTLR start "rule__Cell__Group_0_3__1__Impl"
    // InternalTasksDSL.g:467:1: rule__Cell__Group_0_3__1__Impl : ( ( rule__Cell__DirAssignment_0_3_1 ) ) ;
    public final void rule__Cell__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:471:1: ( ( ( rule__Cell__DirAssignment_0_3_1 ) ) )
            // InternalTasksDSL.g:472:1: ( ( rule__Cell__DirAssignment_0_3_1 ) )
            {
            // InternalTasksDSL.g:472:1: ( ( rule__Cell__DirAssignment_0_3_1 ) )
            // InternalTasksDSL.g:473:2: ( rule__Cell__DirAssignment_0_3_1 )
            {
             before(grammarAccess.getCellAccess().getDirAssignment_0_3_1()); 
            // InternalTasksDSL.g:474:2: ( rule__Cell__DirAssignment_0_3_1 )
            // InternalTasksDSL.g:474:3: rule__Cell__DirAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__DirAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getDirAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0_3__1__Impl"


    // $ANTLR start "rule__Cell__Group_1__0"
    // InternalTasksDSL.g:483:1: rule__Cell__Group_1__0 : rule__Cell__Group_1__0__Impl rule__Cell__Group_1__1 ;
    public final void rule__Cell__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:487:1: ( rule__Cell__Group_1__0__Impl rule__Cell__Group_1__1 )
            // InternalTasksDSL.g:488:2: rule__Cell__Group_1__0__Impl rule__Cell__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Cell__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_1__0"


    // $ANTLR start "rule__Cell__Group_1__0__Impl"
    // InternalTasksDSL.g:495:1: rule__Cell__Group_1__0__Impl : ( 'Random' ) ;
    public final void rule__Cell__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:499:1: ( ( 'Random' ) )
            // InternalTasksDSL.g:500:1: ( 'Random' )
            {
            // InternalTasksDSL.g:500:1: ( 'Random' )
            // InternalTasksDSL.g:501:2: 'Random'
            {
             before(grammarAccess.getCellAccess().getRandomKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getRandomKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_1__0__Impl"


    // $ANTLR start "rule__Cell__Group_1__1"
    // InternalTasksDSL.g:510:1: rule__Cell__Group_1__1 : rule__Cell__Group_1__1__Impl ;
    public final void rule__Cell__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:514:1: ( rule__Cell__Group_1__1__Impl )
            // InternalTasksDSL.g:515:2: rule__Cell__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_1__1"


    // $ANTLR start "rule__Cell__Group_1__1__Impl"
    // InternalTasksDSL.g:521:1: rule__Cell__Group_1__1__Impl : ( ( rule__Cell__NoAssignment_1_1 ) ) ;
    public final void rule__Cell__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:525:1: ( ( ( rule__Cell__NoAssignment_1_1 ) ) )
            // InternalTasksDSL.g:526:1: ( ( rule__Cell__NoAssignment_1_1 ) )
            {
            // InternalTasksDSL.g:526:1: ( ( rule__Cell__NoAssignment_1_1 ) )
            // InternalTasksDSL.g:527:2: ( rule__Cell__NoAssignment_1_1 )
            {
             before(grammarAccess.getCellAccess().getNoAssignment_1_1()); 
            // InternalTasksDSL.g:528:2: ( rule__Cell__NoAssignment_1_1 )
            // InternalTasksDSL.g:528:3: rule__Cell__NoAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__NoAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getNoAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalTasksDSL.g:537:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:541:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTasksDSL.g:542:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalTasksDSL.g:549:1: rule__Rule__Group__0__Impl : ( 'Rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:553:1: ( ( 'Rule' ) )
            // InternalTasksDSL.g:554:1: ( 'Rule' )
            {
            // InternalTasksDSL.g:554:1: ( 'Rule' )
            // InternalTasksDSL.g:555:2: 'Rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalTasksDSL.g:564:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:568:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTasksDSL.g:569:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalTasksDSL.g:576:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__TypeAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:580:1: ( ( ( rule__Rule__TypeAssignment_1 ) ) )
            // InternalTasksDSL.g:581:1: ( ( rule__Rule__TypeAssignment_1 ) )
            {
            // InternalTasksDSL.g:581:1: ( ( rule__Rule__TypeAssignment_1 ) )
            // InternalTasksDSL.g:582:2: ( rule__Rule__TypeAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getTypeAssignment_1()); 
            // InternalTasksDSL.g:583:2: ( rule__Rule__TypeAssignment_1 )
            // InternalTasksDSL.g:583:3: rule__Rule__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalTasksDSL.g:591:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:595:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalTasksDSL.g:596:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalTasksDSL.g:603:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Alternatives_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:607:1: ( ( ( rule__Rule__Alternatives_2 ) ) )
            // InternalTasksDSL.g:608:1: ( ( rule__Rule__Alternatives_2 ) )
            {
            // InternalTasksDSL.g:608:1: ( ( rule__Rule__Alternatives_2 ) )
            // InternalTasksDSL.g:609:2: ( rule__Rule__Alternatives_2 )
            {
             before(grammarAccess.getRuleAccess().getAlternatives_2()); 
            // InternalTasksDSL.g:610:2: ( rule__Rule__Alternatives_2 )
            // InternalTasksDSL.g:610:3: rule__Rule__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalTasksDSL.g:618:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:622:1: ( rule__Rule__Group__3__Impl )
            // InternalTasksDSL.g:623:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalTasksDSL.g:629:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__NAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:633:1: ( ( ( rule__Rule__NAssignment_3 ) ) )
            // InternalTasksDSL.g:634:1: ( ( rule__Rule__NAssignment_3 ) )
            {
            // InternalTasksDSL.g:634:1: ( ( rule__Rule__NAssignment_3 ) )
            // InternalTasksDSL.g:635:2: ( rule__Rule__NAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getNAssignment_3()); 
            // InternalTasksDSL.g:636:2: ( rule__Rule__NAssignment_3 )
            // InternalTasksDSL.g:636:3: rule__Rule__NAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Gameoflife__CellsAssignment_0"
    // InternalTasksDSL.g:645:1: rule__Gameoflife__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Gameoflife__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:649:1: ( ( ruleCell ) )
            // InternalTasksDSL.g:650:2: ( ruleCell )
            {
            // InternalTasksDSL.g:650:2: ( ruleCell )
            // InternalTasksDSL.g:651:3: ruleCell
            {
             before(grammarAccess.getGameoflifeAccess().getCellsCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getGameoflifeAccess().getCellsCellParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameoflife__CellsAssignment_0"


    // $ANTLR start "rule__Gameoflife__RulesAssignment_1"
    // InternalTasksDSL.g:660:1: rule__Gameoflife__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__Gameoflife__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:664:1: ( ( ruleRule ) )
            // InternalTasksDSL.g:665:2: ( ruleRule )
            {
            // InternalTasksDSL.g:665:2: ( ruleRule )
            // InternalTasksDSL.g:666:3: ruleRule
            {
             before(grammarAccess.getGameoflifeAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getGameoflifeAccess().getRulesRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gameoflife__RulesAssignment_1"


    // $ANTLR start "rule__Cell__XAssignment_0_1"
    // InternalTasksDSL.g:675:1: rule__Cell__XAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:679:1: ( ( RULE_INT ) )
            // InternalTasksDSL.g:680:2: ( RULE_INT )
            {
            // InternalTasksDSL.g:680:2: ( RULE_INT )
            // InternalTasksDSL.g:681:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__XAssignment_0_1"


    // $ANTLR start "rule__Cell__YAssignment_0_2"
    // InternalTasksDSL.g:690:1: rule__Cell__YAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:694:1: ( ( RULE_INT ) )
            // InternalTasksDSL.g:695:2: ( RULE_INT )
            {
            // InternalTasksDSL.g:695:2: ( RULE_INT )
            // InternalTasksDSL.g:696:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__YAssignment_0_2"


    // $ANTLR start "rule__Cell__NoAssignment_0_3_0"
    // InternalTasksDSL.g:705:1: rule__Cell__NoAssignment_0_3_0 : ( RULE_INT ) ;
    public final void rule__Cell__NoAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:709:1: ( ( RULE_INT ) )
            // InternalTasksDSL.g:710:2: ( RULE_INT )
            {
            // InternalTasksDSL.g:710:2: ( RULE_INT )
            // InternalTasksDSL.g:711:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_0_3_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__NoAssignment_0_3_0"


    // $ANTLR start "rule__Cell__DirAssignment_0_3_1"
    // InternalTasksDSL.g:720:1: rule__Cell__DirAssignment_0_3_1 : ( ruleDirection ) ;
    public final void rule__Cell__DirAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:724:1: ( ( ruleDirection ) )
            // InternalTasksDSL.g:725:2: ( ruleDirection )
            {
            // InternalTasksDSL.g:725:2: ( ruleDirection )
            // InternalTasksDSL.g:726:3: ruleDirection
            {
             before(grammarAccess.getCellAccess().getDirDirectionEnumRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getCellAccess().getDirDirectionEnumRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__DirAssignment_0_3_1"


    // $ANTLR start "rule__Cell__NoAssignment_1_1"
    // InternalTasksDSL.g:735:1: rule__Cell__NoAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Cell__NoAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:739:1: ( ( RULE_INT ) )
            // InternalTasksDSL.g:740:2: ( RULE_INT )
            {
            // InternalTasksDSL.g:740:2: ( RULE_INT )
            // InternalTasksDSL.g:741:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getNoINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__NoAssignment_1_1"


    // $ANTLR start "rule__Rule__TypeAssignment_1"
    // InternalTasksDSL.g:750:1: rule__Rule__TypeAssignment_1 : ( ruleRuleType ) ;
    public final void rule__Rule__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:754:1: ( ( ruleRuleType ) )
            // InternalTasksDSL.g:755:2: ( ruleRuleType )
            {
            // InternalTasksDSL.g:755:2: ( ruleRuleType )
            // InternalTasksDSL.g:756:3: ruleRuleType
            {
             before(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTypeRuleTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TypeAssignment_1"


    // $ANTLR start "rule__Rule__SignAssignment_2_0"
    // InternalTasksDSL.g:765:1: rule__Rule__SignAssignment_2_0 : ( ( '<' ) ) ;
    public final void rule__Rule__SignAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:769:1: ( ( ( '<' ) ) )
            // InternalTasksDSL.g:770:2: ( ( '<' ) )
            {
            // InternalTasksDSL.g:770:2: ( ( '<' ) )
            // InternalTasksDSL.g:771:3: ( '<' )
            {
             before(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); 
            // InternalTasksDSL.g:772:3: ( '<' )
            // InternalTasksDSL.g:773:4: '<'
            {
             before(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); 

            }

             after(grammarAccess.getRuleAccess().getSignLessThanSignKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SignAssignment_2_0"


    // $ANTLR start "rule__Rule__NAssignment_3"
    // InternalTasksDSL.g:784:1: rule__Rule__NAssignment_3 : ( RULE_INT ) ;
    public final void rule__Rule__NAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTasksDSL.g:788:1: ( ( RULE_INT ) )
            // InternalTasksDSL.g:789:2: ( RULE_INT )
            {
            // InternalTasksDSL.g:789:2: ( RULE_INT )
            // InternalTasksDSL.g:790:3: RULE_INT
            {
             before(grammarAccess.getRuleAccess().getNINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000801800L});

}