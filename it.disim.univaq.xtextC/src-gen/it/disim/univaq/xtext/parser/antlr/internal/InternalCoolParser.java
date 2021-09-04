package it.disim.univaq.xtext.parser.antlr.internal;

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
import it.disim.univaq.xtext.services.CoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'user'", "','", "'}'", "'User'", "'description'", "'email'", "'username'", "'uname'", "'birthdate'", "'surname'", "'userType'", "'solutions'", "'problems'", "'itemProcess'", "'process'", "'EDate'", "'Solution'", "'author'", "'('", "')'", "'Problem'", "'ItemProcess'", "'itemProcessType'", "'Process'", "'startDate'", "'endDate'", "'status'", "'weight'", "'location'", "'actionHistory'", "'ItemSpecies'", "'Location'", "'-'", "'.'", "'E'", "'e'", "'Action'", "'actionsType'", "'actionStatus'", "'problem'", "'solution'", "'ADMIN'", "'BASIC'", "'DRAFT'", "'PROGRESS'", "'COMPLETE'", "'CUSTOM'", "'PROBLEM'", "'SOLUTION'", "'TODO'", "'SUCCESS'", "'FAIL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCoolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCool.g"; }



     	private CoolGrammarAccess grammarAccess;

        public InternalCoolParser(TokenStream input, CoolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected CoolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalCool.g:65:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalCool.g:65:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalCool.g:66:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalCool.g:72:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_user_4_0 = null;

        EObject lv_user_6_0 = null;



        	enterRule();

        try {
            // InternalCool.g:78:2: ( (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalCool.g:79:2: (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalCool.g:79:2: (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalCool.g:80:3: otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getUserKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCool.g:96:3: ( (lv_user_4_0= ruleUser ) )
            // InternalCool.g:97:4: (lv_user_4_0= ruleUser )
            {
            // InternalCool.g:97:4: (lv_user_4_0= ruleUser )
            // InternalCool.g:98:5: lv_user_4_0= ruleUser
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getUserUserParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_user_4_0=ruleUser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"user",
            						lv_user_4_0,
            						"it.disim.univaq.xtext.Cool.User");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:115:3: (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCool.g:116:4: otherlv_5= ',' ( (lv_user_6_0= ruleUser ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCool.g:120:4: ( (lv_user_6_0= ruleUser ) )
            	    // InternalCool.g:121:5: (lv_user_6_0= ruleUser )
            	    {
            	    // InternalCool.g:121:5: (lv_user_6_0= ruleUser )
            	    // InternalCool.g:122:6: lv_user_6_0= ruleUser
            	    {

            	    						newCompositeNode(grammarAccess.getApplicationAccess().getUserUserParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_user_6_0=ruleUser();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"user",
            	    							lv_user_6_0,
            	    							"it.disim.univaq.xtext.Cool.User");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleUser"
    // InternalCool.g:152:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalCool.g:152:45: (iv_ruleUser= ruleUser EOF )
            // InternalCool.g:153:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalCool.g:159:1: ruleUser returns [EObject current=null] : (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) otherlv_9= 'uname' ( (lv_uname_10_0= ruleEString ) ) (otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) ) )? (otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) ) )? otherlv_15= 'userType' ( (lv_userType_16_0= ruleUserType ) ) (otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}' )? (otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}' )? (otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}' )? (otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_email_6_0 = null;

        AntlrDatatypeRuleToken lv_username_8_0 = null;

        AntlrDatatypeRuleToken lv_uname_10_0 = null;

        AntlrDatatypeRuleToken lv_birthdate_12_0 = null;

        AntlrDatatypeRuleToken lv_surname_14_0 = null;

        Enumerator lv_userType_16_0 = null;

        EObject lv_solutions_19_0 = null;

        EObject lv_solutions_21_0 = null;

        EObject lv_problems_25_0 = null;

        EObject lv_problems_27_0 = null;

        EObject lv_itemProcess_31_0 = null;

        EObject lv_itemProcess_33_0 = null;

        EObject lv_process_37_0 = null;

        EObject lv_process_39_0 = null;



        	enterRule();

        try {
            // InternalCool.g:165:2: ( (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) otherlv_9= 'uname' ( (lv_uname_10_0= ruleEString ) ) (otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) ) )? (otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) ) )? otherlv_15= 'userType' ( (lv_userType_16_0= ruleUserType ) ) (otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}' )? (otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}' )? (otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}' )? (otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalCool.g:166:2: (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) otherlv_9= 'uname' ( (lv_uname_10_0= ruleEString ) ) (otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) ) )? (otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) ) )? otherlv_15= 'userType' ( (lv_userType_16_0= ruleUserType ) ) (otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}' )? (otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}' )? (otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}' )? (otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalCool.g:166:2: (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) otherlv_9= 'uname' ( (lv_uname_10_0= ruleEString ) ) (otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) ) )? (otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) ) )? otherlv_15= 'userType' ( (lv_userType_16_0= ruleUserType ) ) (otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}' )? (otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}' )? (otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}' )? (otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}' )? otherlv_41= '}' )
            // InternalCool.g:167:3: otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) otherlv_9= 'uname' ( (lv_uname_10_0= ruleEString ) ) (otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) ) )? (otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) ) )? otherlv_15= 'userType' ( (lv_userType_16_0= ruleUserType ) ) (otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}' )? (otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}' )? (otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}' )? (otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalCool.g:171:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCool.g:172:4: (lv_name_1_0= ruleEString )
            {
            // InternalCool.g:172:4: (lv_name_1_0= ruleEString )
            // InternalCool.g:173:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCool.g:194:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCool.g:195:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCool.g:199:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCool.g:200:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCool.g:200:5: (lv_description_4_0= ruleEString )
                    // InternalCool.g:201:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getUserAccess().getEmailKeyword_4());
            		
            // InternalCool.g:223:3: ( (lv_email_6_0= ruleEString ) )
            // InternalCool.g:224:4: (lv_email_6_0= ruleEString )
            {
            // InternalCool.g:224:4: (lv_email_6_0= ruleEString )
            // InternalCool.g:225:5: lv_email_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getEmailEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_email_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_6_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getUserAccess().getUsernameKeyword_6());
            		
            // InternalCool.g:246:3: ( (lv_username_8_0= ruleEString ) )
            // InternalCool.g:247:4: (lv_username_8_0= ruleEString )
            {
            // InternalCool.g:247:4: (lv_username_8_0= ruleEString )
            // InternalCool.g:248:5: lv_username_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getUsernameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_username_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_8_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getUserAccess().getUnameKeyword_8());
            		
            // InternalCool.g:269:3: ( (lv_uname_10_0= ruleEString ) )
            // InternalCool.g:270:4: (lv_uname_10_0= ruleEString )
            {
            // InternalCool.g:270:4: (lv_uname_10_0= ruleEString )
            // InternalCool.g:271:5: lv_uname_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUserAccess().getUnameEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_uname_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"uname",
            						lv_uname_10_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:288:3: (otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCool.g:289:4: otherlv_11= 'birthdate' ( (lv_birthdate_12_0= ruleEDate ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getUserAccess().getBirthdateKeyword_10_0());
                    			
                    // InternalCool.g:293:4: ( (lv_birthdate_12_0= ruleEDate ) )
                    // InternalCool.g:294:5: (lv_birthdate_12_0= ruleEDate )
                    {
                    // InternalCool.g:294:5: (lv_birthdate_12_0= ruleEDate )
                    // InternalCool.g:295:6: lv_birthdate_12_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getBirthdateEDateParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_birthdate_12_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"birthdate",
                    							lv_birthdate_12_0,
                    							"it.disim.univaq.xtext.Cool.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCool.g:313:3: (otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCool.g:314:4: otherlv_13= 'surname' ( (lv_surname_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getUserAccess().getSurnameKeyword_11_0());
                    			
                    // InternalCool.g:318:4: ( (lv_surname_14_0= ruleEString ) )
                    // InternalCool.g:319:5: (lv_surname_14_0= ruleEString )
                    {
                    // InternalCool.g:319:5: (lv_surname_14_0= ruleEString )
                    // InternalCool.g:320:6: lv_surname_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getSurnameEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_surname_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"surname",
                    							lv_surname_14_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_15, grammarAccess.getUserAccess().getUserTypeKeyword_12());
            		
            // InternalCool.g:342:3: ( (lv_userType_16_0= ruleUserType ) )
            // InternalCool.g:343:4: (lv_userType_16_0= ruleUserType )
            {
            // InternalCool.g:343:4: (lv_userType_16_0= ruleUserType )
            // InternalCool.g:344:5: lv_userType_16_0= ruleUserType
            {

            					newCompositeNode(grammarAccess.getUserAccess().getUserTypeUserTypeEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_18);
            lv_userType_16_0=ruleUserType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"userType",
            						lv_userType_16_0,
            						"it.disim.univaq.xtext.Cool.UserType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:361:3: (otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCool.g:362:4: otherlv_17= 'solutions' otherlv_18= '{' ( (lv_solutions_19_0= ruleSolution ) )* (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getUserAccess().getSolutionsKeyword_14_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_18, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalCool.g:370:4: ( (lv_solutions_19_0= ruleSolution ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCool.g:371:5: (lv_solutions_19_0= ruleSolution )
                    	    {
                    	    // InternalCool.g:371:5: (lv_solutions_19_0= ruleSolution )
                    	    // InternalCool.g:372:6: lv_solutions_19_0= ruleSolution
                    	    {

                    	    						newCompositeNode(grammarAccess.getUserAccess().getSolutionsSolutionParserRuleCall_14_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_solutions_19_0=ruleSolution();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUserRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"solutions",
                    	    							lv_solutions_19_0,
                    	    							"it.disim.univaq.xtext.Cool.Solution");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalCool.g:389:4: (otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCool.g:390:5: otherlv_20= ',' ( (lv_solutions_21_0= ruleSolution ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getUserAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalCool.g:394:5: ( (lv_solutions_21_0= ruleSolution ) )
                    	    // InternalCool.g:395:6: (lv_solutions_21_0= ruleSolution )
                    	    {
                    	    // InternalCool.g:395:6: (lv_solutions_21_0= ruleSolution )
                    	    // InternalCool.g:396:7: lv_solutions_21_0= ruleSolution
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getSolutionsSolutionParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_solutions_21_0=ruleSolution();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"solutions",
                    	    								lv_solutions_21_0,
                    	    								"it.disim.univaq.xtext.Cool.Solution");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_22, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalCool.g:419:3: (otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCool.g:420:4: otherlv_23= 'problems' otherlv_24= '{' ( (lv_problems_25_0= ruleProblem ) )* (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getUserAccess().getProblemsKeyword_15_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_24, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalCool.g:428:4: ( (lv_problems_25_0= ruleProblem ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==33) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCool.g:429:5: (lv_problems_25_0= ruleProblem )
                    	    {
                    	    // InternalCool.g:429:5: (lv_problems_25_0= ruleProblem )
                    	    // InternalCool.g:430:6: lv_problems_25_0= ruleProblem
                    	    {

                    	    						newCompositeNode(grammarAccess.getUserAccess().getProblemsProblemParserRuleCall_15_2_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_problems_25_0=ruleProblem();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUserRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"problems",
                    	    							lv_problems_25_0,
                    	    							"it.disim.univaq.xtext.Cool.Problem");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // InternalCool.g:447:4: (otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCool.g:448:5: otherlv_26= ',' ( (lv_problems_27_0= ruleProblem ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getUserAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalCool.g:452:5: ( (lv_problems_27_0= ruleProblem ) )
                    	    // InternalCool.g:453:6: (lv_problems_27_0= ruleProblem )
                    	    {
                    	    // InternalCool.g:453:6: (lv_problems_27_0= ruleProblem )
                    	    // InternalCool.g:454:7: lv_problems_27_0= ruleProblem
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getProblemsProblemParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_problems_27_0=ruleProblem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"problems",
                    	    								lv_problems_27_0,
                    	    								"it.disim.univaq.xtext.Cool.Problem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_28, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalCool.g:477:3: (otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCool.g:478:4: otherlv_29= 'itemProcess' otherlv_30= '{' ( (lv_itemProcess_31_0= ruleItemProcess ) )* (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getUserAccess().getItemProcessKeyword_16_0());
                    			
                    otherlv_30=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_30, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalCool.g:486:4: ( (lv_itemProcess_31_0= ruleItemProcess ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==34) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCool.g:487:5: (lv_itemProcess_31_0= ruleItemProcess )
                    	    {
                    	    // InternalCool.g:487:5: (lv_itemProcess_31_0= ruleItemProcess )
                    	    // InternalCool.g:488:6: lv_itemProcess_31_0= ruleItemProcess
                    	    {

                    	    						newCompositeNode(grammarAccess.getUserAccess().getItemProcessItemProcessParserRuleCall_16_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_itemProcess_31_0=ruleItemProcess();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUserRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"itemProcess",
                    	    							lv_itemProcess_31_0,
                    	    							"it.disim.univaq.xtext.Cool.ItemProcess");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // InternalCool.g:505:4: (otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCool.g:506:5: otherlv_32= ',' ( (lv_itemProcess_33_0= ruleItemProcess ) )
                    	    {
                    	    otherlv_32=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getUserAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalCool.g:510:5: ( (lv_itemProcess_33_0= ruleItemProcess ) )
                    	    // InternalCool.g:511:6: (lv_itemProcess_33_0= ruleItemProcess )
                    	    {
                    	    // InternalCool.g:511:6: (lv_itemProcess_33_0= ruleItemProcess )
                    	    // InternalCool.g:512:7: lv_itemProcess_33_0= ruleItemProcess
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getItemProcessItemProcessParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_itemProcess_33_0=ruleItemProcess();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"itemProcess",
                    	    								lv_itemProcess_33_0,
                    	    								"it.disim.univaq.xtext.Cool.ItemProcess");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_34, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalCool.g:535:3: (otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCool.g:536:4: otherlv_35= 'process' otherlv_36= '{' ( (lv_process_37_0= ruleProcess ) )* (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getUserAccess().getProcessKeyword_17_0());
                    			
                    otherlv_36=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_36, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalCool.g:544:4: ( (lv_process_37_0= ruleProcess ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==36) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCool.g:545:5: (lv_process_37_0= ruleProcess )
                    	    {
                    	    // InternalCool.g:545:5: (lv_process_37_0= ruleProcess )
                    	    // InternalCool.g:546:6: lv_process_37_0= ruleProcess
                    	    {

                    	    						newCompositeNode(grammarAccess.getUserAccess().getProcessProcessParserRuleCall_17_2_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_process_37_0=ruleProcess();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUserRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"process",
                    	    							lv_process_37_0,
                    	    							"it.disim.univaq.xtext.Cool.Process");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // InternalCool.g:563:4: (otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCool.g:564:5: otherlv_38= ',' ( (lv_process_39_0= ruleProcess ) )
                    	    {
                    	    otherlv_38=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getUserAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalCool.g:568:5: ( (lv_process_39_0= ruleProcess ) )
                    	    // InternalCool.g:569:6: (lv_process_39_0= ruleProcess )
                    	    {
                    	    // InternalCool.g:569:6: (lv_process_39_0= ruleProcess )
                    	    // InternalCool.g:570:7: lv_process_39_0= ruleProcess
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getProcessProcessParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_process_39_0=ruleProcess();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"process",
                    	    								lv_process_39_0,
                    	    								"it.disim.univaq.xtext.Cool.Process");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_40, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleEString"
    // InternalCool.g:601:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCool.g:601:47: (iv_ruleEString= ruleEString EOF )
            // InternalCool.g:602:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCool.g:608:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCool.g:614:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCool.g:615:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCool.g:615:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCool.g:616:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCool.g:624:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalCool.g:635:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalCool.g:635:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalCool.g:636:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalCool.g:642:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCool.g:648:2: (kw= 'EDate' )
            // InternalCool.g:649:2: kw= 'EDate'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleSolution"
    // InternalCool.g:657:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalCool.g:657:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalCool.g:658:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalCool.g:664:1: ruleSolution returns [EObject current=null] : (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalCool.g:670:2: ( (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalCool.g:671:2: (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalCool.g:671:2: (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalCool.g:672:3: otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSolutionAccess().getSolutionKeyword_0());
            		
            // InternalCool.g:676:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCool.g:677:4: (lv_name_1_0= ruleEString )
            {
            // InternalCool.g:677:4: (lv_name_1_0= ruleEString )
            // InternalCool.g:678:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSolutionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCool.g:699:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCool.g:700:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCool.g:704:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCool.g:705:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCool.g:705:5: (lv_description_4_0= ruleEString )
                    // InternalCool.g:706:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSolutionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCool.g:724:3: (otherlv_5= 'author' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCool.g:725:4: otherlv_5= 'author' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSolutionAccess().getAuthorKeyword_4_0());
                    			
                    // InternalCool.g:729:4: ( ( ruleEString ) )
                    // InternalCool.g:730:5: ( ruleEString )
                    {
                    // InternalCool.g:730:5: ( ruleEString )
                    // InternalCool.g:731:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSolutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSolutionAccess().getAuthorUserCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getSolutionAccess().getProblemsKeyword_5());
            		
            otherlv_8=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_6());
            		
            // InternalCool.g:754:3: ( ( ruleEString ) )
            // InternalCool.g:755:4: ( ruleEString )
            {
            // InternalCool.g:755:4: ( ruleEString )
            // InternalCool.g:756:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSolutionAccess().getProblemsProblemCrossReference_7_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:770:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCool.g:771:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSolutionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCool.g:775:4: ( ( ruleEString ) )
            	    // InternalCool.g:776:5: ( ruleEString )
            	    {
            	    // InternalCool.g:776:5: ( ruleEString )
            	    // InternalCool.g:777:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSolutionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSolutionAccess().getProblemsProblemCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_12=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getSolutionAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleSolution"


    // $ANTLR start "entryRuleProblem"
    // InternalCool.g:804:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalCool.g:804:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalCool.g:805:2: iv_ruleProblem= ruleProblem EOF
            {
             newCompositeNode(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblem=ruleProblem();

            state._fsp--;

             current =iv_ruleProblem; 
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
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // InternalCool.g:811:1: ruleProblem returns [EObject current=null] : (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalCool.g:817:2: ( (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // InternalCool.g:818:2: (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // InternalCool.g:818:2: (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // InternalCool.g:819:3: otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProblemAccess().getProblemKeyword_0());
            		
            // InternalCool.g:823:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCool.g:824:4: (lv_name_1_0= ruleEString )
            {
            // InternalCool.g:824:4: (lv_name_1_0= ruleEString )
            // InternalCool.g:825:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProblemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCool.g:846:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCool.g:847:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCool.g:851:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCool.g:852:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCool.g:852:5: (lv_description_4_0= ruleEString )
                    // InternalCool.g:853:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProblemAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getProblemAccess().getAuthorKeyword_4());
            		
            // InternalCool.g:875:3: ( ( ruleEString ) )
            // InternalCool.g:876:4: ( ruleEString )
            {
            // InternalCool.g:876:4: ( ruleEString )
            // InternalCool.g:877:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProblemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProblemAccess().getAuthorUserCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:891:3: (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCool.g:892:4: otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getProblemAccess().getSolutionsKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getProblemAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalCool.g:900:4: ( ( ruleEString ) )
                    // InternalCool.g:901:5: ( ruleEString )
                    {
                    // InternalCool.g:901:5: ( ruleEString )
                    // InternalCool.g:902:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProblemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProblemAccess().getSolutionsSolutionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCool.g:916:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCool.g:917:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getProblemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCool.g:921:5: ( ( ruleEString ) )
                    	    // InternalCool.g:922:6: ( ruleEString )
                    	    {
                    	    // InternalCool.g:922:6: ( ruleEString )
                    	    // InternalCool.g:923:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProblemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProblemAccess().getSolutionsSolutionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getProblemAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCool.g:943:3: (otherlv_13= 'process' ( ( ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCool.g:944:4: otherlv_13= 'process' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getProblemAccess().getProcessKeyword_7_0());
                    			
                    // InternalCool.g:948:4: ( ( ruleEString ) )
                    // InternalCool.g:949:5: ( ruleEString )
                    {
                    // InternalCool.g:949:5: ( ruleEString )
                    // InternalCool.g:950:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProblemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProblemAccess().getProcessItemProcessCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleItemProcess"
    // InternalCool.g:973:1: entryRuleItemProcess returns [EObject current=null] : iv_ruleItemProcess= ruleItemProcess EOF ;
    public final EObject entryRuleItemProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemProcess = null;


        try {
            // InternalCool.g:973:52: (iv_ruleItemProcess= ruleItemProcess EOF )
            // InternalCool.g:974:2: iv_ruleItemProcess= ruleItemProcess EOF
            {
             newCompositeNode(grammarAccess.getItemProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemProcess=ruleItemProcess();

            state._fsp--;

             current =iv_ruleItemProcess; 
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
    // $ANTLR end "entryRuleItemProcess"


    // $ANTLR start "ruleItemProcess"
    // InternalCool.g:980:1: ruleItemProcess returns [EObject current=null] : (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleItemProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_itemProcessType_8_0 = null;

        EObject lv_problems_11_0 = null;

        EObject lv_problems_13_0 = null;



        	enterRule();

        try {
            // InternalCool.g:986:2: ( (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalCool.g:987:2: (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalCool.g:987:2: (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalCool.g:988:3: otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getItemProcessAccess().getItemProcessKeyword_0());
            		
            // InternalCool.g:992:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCool.g:993:4: (lv_name_1_0= ruleEString )
            {
            // InternalCool.g:993:4: (lv_name_1_0= ruleEString )
            // InternalCool.g:994:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getItemProcessAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getItemProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCool.g:1015:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCool.g:1016:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getItemProcessAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCool.g:1020:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCool.g:1021:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCool.g:1021:5: (lv_description_4_0= ruleEString )
                    // InternalCool.g:1022:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getItemProcessAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemProcessRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getItemProcessAccess().getAuthorKeyword_4());
            		
            // InternalCool.g:1044:3: ( ( ruleEString ) )
            // InternalCool.g:1045:4: ( ruleEString )
            {
            // InternalCool.g:1045:4: ( ruleEString )
            // InternalCool.g:1046:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemProcessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemProcessAccess().getAuthorUserCrossReference_5_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:1060:3: (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCool.g:1061:4: otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getItemProcessAccess().getItemProcessTypeKeyword_6_0());
                    			
                    // InternalCool.g:1065:4: ( (lv_itemProcessType_8_0= ruleItemSpecies ) )
                    // InternalCool.g:1066:5: (lv_itemProcessType_8_0= ruleItemSpecies )
                    {
                    // InternalCool.g:1066:5: (lv_itemProcessType_8_0= ruleItemSpecies )
                    // InternalCool.g:1067:6: lv_itemProcessType_8_0= ruleItemSpecies
                    {

                    						newCompositeNode(grammarAccess.getItemProcessAccess().getItemProcessTypeItemSpeciesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_itemProcessType_8_0=ruleItemSpecies();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemProcessRule());
                    						}
                    						set(
                    							current,
                    							"itemProcessType",
                    							lv_itemProcessType_8_0,
                    							"it.disim.univaq.xtext.Cool.ItemSpecies");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCool.g:1085:3: (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCool.g:1086:4: otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getItemProcessAccess().getProblemsKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getItemProcessAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCool.g:1094:4: ( (lv_problems_11_0= ruleProblem ) )
                    // InternalCool.g:1095:5: (lv_problems_11_0= ruleProblem )
                    {
                    // InternalCool.g:1095:5: (lv_problems_11_0= ruleProblem )
                    // InternalCool.g:1096:6: lv_problems_11_0= ruleProblem
                    {

                    						newCompositeNode(grammarAccess.getItemProcessAccess().getProblemsProblemParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_problems_11_0=ruleProblem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemProcessRule());
                    						}
                    						add(
                    							current,
                    							"problems",
                    							lv_problems_11_0,
                    							"it.disim.univaq.xtext.Cool.Problem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCool.g:1113:4: (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalCool.g:1114:5: otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getItemProcessAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCool.g:1118:5: ( (lv_problems_13_0= ruleProblem ) )
                    	    // InternalCool.g:1119:6: (lv_problems_13_0= ruleProblem )
                    	    {
                    	    // InternalCool.g:1119:6: (lv_problems_13_0= ruleProblem )
                    	    // InternalCool.g:1120:7: lv_problems_13_0= ruleProblem
                    	    {

                    	    							newCompositeNode(grammarAccess.getItemProcessAccess().getProblemsProblemParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_problems_13_0=ruleProblem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getItemProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"problems",
                    	    								lv_problems_13_0,
                    	    								"it.disim.univaq.xtext.Cool.Problem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getItemProcessAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getItemProcessAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleItemProcess"


    // $ANTLR start "entryRuleProcess"
    // InternalCool.g:1151:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalCool.g:1151:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalCool.g:1152:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalCool.g:1158:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) (otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) ) )? otherlv_11= 'weight' ( (lv_weight_12_0= ruleEDouble ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_startDate_6_0 = null;

        AntlrDatatypeRuleToken lv_endDate_8_0 = null;

        Enumerator lv_status_10_0 = null;

        AntlrDatatypeRuleToken lv_weight_12_0 = null;

        EObject lv_location_16_0 = null;

        EObject lv_actionHistory_19_0 = null;

        EObject lv_actionHistory_21_0 = null;



        	enterRule();

        try {
            // InternalCool.g:1164:2: ( (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) (otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) ) )? otherlv_11= 'weight' ( (lv_weight_12_0= ruleEDouble ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalCool.g:1165:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) (otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) ) )? otherlv_11= 'weight' ( (lv_weight_12_0= ruleEDouble ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalCool.g:1165:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) (otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) ) )? otherlv_11= 'weight' ( (lv_weight_12_0= ruleEDouble ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalCool.g:1166:3: otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) (otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) ) )? otherlv_11= 'weight' ( (lv_weight_12_0= ruleEDouble ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalCool.g:1170:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCool.g:1171:4: (lv_name_1_0= ruleEString )
            {
            // InternalCool.g:1171:4: (lv_name_1_0= ruleEString )
            // InternalCool.g:1172:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCool.g:1193:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCool.g:1194:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCool.g:1198:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCool.g:1199:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCool.g:1199:5: (lv_description_4_0= ruleEString )
                    // InternalCool.g:1200:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getStartDateKeyword_4());
            		
            // InternalCool.g:1222:3: ( (lv_startDate_6_0= ruleEDate ) )
            // InternalCool.g:1223:4: (lv_startDate_6_0= ruleEDate )
            {
            // InternalCool.g:1223:4: (lv_startDate_6_0= ruleEDate )
            // InternalCool.g:1224:5: lv_startDate_6_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getStartDateEDateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
            lv_startDate_6_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"startDate",
            						lv_startDate_6_0,
            						"it.disim.univaq.xtext.Cool.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getEndDateKeyword_6());
            		
            // InternalCool.g:1245:3: ( (lv_endDate_8_0= ruleEDate ) )
            // InternalCool.g:1246:4: (lv_endDate_8_0= ruleEDate )
            {
            // InternalCool.g:1246:4: (lv_endDate_8_0= ruleEDate )
            // InternalCool.g:1247:5: lv_endDate_8_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getEndDateEDateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_44);
            lv_endDate_8_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_8_0,
            						"it.disim.univaq.xtext.Cool.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:1264:3: (otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCool.g:1265:4: otherlv_9= 'status' ( (lv_status_10_0= ruleProcessStatus ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getStatusKeyword_8_0());
                    			
                    // InternalCool.g:1269:4: ( (lv_status_10_0= ruleProcessStatus ) )
                    // InternalCool.g:1270:5: (lv_status_10_0= ruleProcessStatus )
                    {
                    // InternalCool.g:1270:5: (lv_status_10_0= ruleProcessStatus )
                    // InternalCool.g:1271:6: lv_status_10_0= ruleProcessStatus
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getStatusProcessStatusEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_status_10_0=ruleProcessStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_10_0,
                    							"it.disim.univaq.xtext.Cool.ProcessStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,40,FOLLOW_47); 

            			newLeafNode(otherlv_11, grammarAccess.getProcessAccess().getWeightKeyword_9());
            		
            // InternalCool.g:1293:3: ( (lv_weight_12_0= ruleEDouble ) )
            // InternalCool.g:1294:4: (lv_weight_12_0= ruleEDouble )
            {
            // InternalCool.g:1294:4: (lv_weight_12_0= ruleEDouble )
            // InternalCool.g:1295:5: lv_weight_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWeightEDoubleParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_48);
            lv_weight_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_12_0,
            						"it.disim.univaq.xtext.Cool.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:1312:3: (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCool.g:1313:4: otherlv_13= 'itemProcess' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcessAccess().getItemProcessKeyword_11_0());
                    			
                    // InternalCool.g:1317:4: ( ( ruleEString ) )
                    // InternalCool.g:1318:5: ( ruleEString )
                    {
                    // InternalCool.g:1318:5: ( ruleEString )
                    // InternalCool.g:1319:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProcessAccess().getItemProcessItemProcessCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCool.g:1334:3: (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCool.g:1335:4: otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) )
                    {
                    otherlv_15=(Token)match(input,41,FOLLOW_50); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getLocationKeyword_12_0());
                    			
                    // InternalCool.g:1339:4: ( (lv_location_16_0= ruleLocation ) )
                    // InternalCool.g:1340:5: (lv_location_16_0= ruleLocation )
                    {
                    // InternalCool.g:1340:5: (lv_location_16_0= ruleLocation )
                    // InternalCool.g:1341:6: lv_location_16_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getLocationLocationParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_location_16_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_16_0,
                    							"it.disim.univaq.xtext.Cool.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCool.g:1359:3: (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCool.g:1360:4: otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getProcessAccess().getActionHistoryKeyword_13_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalCool.g:1368:4: ( (lv_actionHistory_19_0= ruleAction ) )
                    // InternalCool.g:1369:5: (lv_actionHistory_19_0= ruleAction )
                    {
                    // InternalCool.g:1369:5: (lv_actionHistory_19_0= ruleAction )
                    // InternalCool.g:1370:6: lv_actionHistory_19_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getActionHistoryActionParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actionHistory_19_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"actionHistory",
                    							lv_actionHistory_19_0,
                    							"it.disim.univaq.xtext.Cool.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCool.g:1387:4: (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalCool.g:1388:5: otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_52); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getProcessAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalCool.g:1392:5: ( (lv_actionHistory_21_0= ruleAction ) )
                    	    // InternalCool.g:1393:6: (lv_actionHistory_21_0= ruleAction )
                    	    {
                    	    // InternalCool.g:1393:6: (lv_actionHistory_21_0= ruleAction )
                    	    // InternalCool.g:1394:7: lv_actionHistory_21_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getActionHistoryActionParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionHistory_21_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionHistory",
                    	    								lv_actionHistory_21_0,
                    	    								"it.disim.univaq.xtext.Cool.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleItemSpecies"
    // InternalCool.g:1425:1: entryRuleItemSpecies returns [EObject current=null] : iv_ruleItemSpecies= ruleItemSpecies EOF ;
    public final EObject entryRuleItemSpecies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemSpecies = null;


        try {
            // InternalCool.g:1425:52: (iv_ruleItemSpecies= ruleItemSpecies EOF )
            // InternalCool.g:1426:2: iv_ruleItemSpecies= ruleItemSpecies EOF
            {
             newCompositeNode(grammarAccess.getItemSpeciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemSpecies=ruleItemSpecies();

            state._fsp--;

             current =iv_ruleItemSpecies; 
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
    // $ANTLR end "entryRuleItemSpecies"


    // $ANTLR start "ruleItemSpecies"
    // InternalCool.g:1432:1: ruleItemSpecies returns [EObject current=null] : ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleItemSpecies() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalCool.g:1438:2: ( ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalCool.g:1439:2: ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalCool.g:1439:2: ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalCool.g:1440:3: () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalCool.g:1440:3: ()
            // InternalCool.g:1441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getItemSpeciesAccess().getItemSpeciesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getItemSpeciesAccess().getItemSpeciesKeyword_1());
            		
            // InternalCool.g:1451:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCool.g:1452:4: (lv_name_2_0= ruleEString )
            {
            // InternalCool.g:1452:4: (lv_name_2_0= ruleEString )
            // InternalCool.g:1453:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getItemSpeciesAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemSpeciesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getItemSpeciesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCool.g:1474:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCool.g:1475:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getItemSpeciesAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalCool.g:1479:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalCool.g:1480:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalCool.g:1480:5: (lv_description_5_0= ruleEString )
                    // InternalCool.g:1481:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getItemSpeciesAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemSpeciesRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getItemSpeciesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleItemSpecies"


    // $ANTLR start "entryRuleLocation"
    // InternalCool.g:1507:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalCool.g:1507:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalCool.g:1508:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalCool.g:1514:1: ruleLocation returns [EObject current=null] : ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalCool.g:1520:2: ( ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalCool.g:1521:2: ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalCool.g:1521:2: ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalCool.g:1522:3: () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalCool.g:1522:3: ()
            // InternalCool.g:1523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1());
            		
            // InternalCool.g:1533:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCool.g:1534:4: (lv_name_2_0= ruleEString )
            {
            // InternalCool.g:1534:4: (lv_name_2_0= ruleEString )
            // InternalCool.g:1535:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCool.g:1556:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCool.g:1557:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalCool.g:1561:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalCool.g:1562:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalCool.g:1562:5: (lv_description_5_0= ruleEString )
                    // InternalCool.g:1563:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleEDouble"
    // InternalCool.g:1589:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalCool.g:1589:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalCool.g:1590:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalCool.g:1596:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCool.g:1602:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCool.g:1603:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCool.g:1603:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCool.g:1604:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCool.g:1604:3: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCool.g:1605:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_54); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCool.g:1611:3: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCool.g:1612:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_55); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,46,FOLLOW_56); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_57); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalCool.g:1632:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=47 && LA41_0<=48)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCool.g:1633:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCool.g:1633:4: (kw= 'E' | kw= 'e' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==47) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==48) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalCool.g:1634:5: kw= 'E'
                            {
                            kw=(Token)match(input,47,FOLLOW_58); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCool.g:1640:5: kw= 'e'
                            {
                            kw=(Token)match(input,48,FOLLOW_58); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCool.g:1646:4: (kw= '-' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==45) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalCool.g:1647:5: kw= '-'
                            {
                            kw=(Token)match(input,45,FOLLOW_56); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleAction"
    // InternalCool.g:1665:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalCool.g:1665:47: (iv_ruleAction= ruleAction EOF )
            // InternalCool.g:1666:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalCool.g:1672:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) otherlv_9= 'actionsType' ( (lv_actionsType_10_0= ruleActionType ) ) otherlv_11= 'actionStatus' ( (lv_actionStatus_12_0= ruleActionStatus ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_startDate_6_0 = null;

        AntlrDatatypeRuleToken lv_endDate_8_0 = null;

        Enumerator lv_actionsType_10_0 = null;

        Enumerator lv_actionStatus_12_0 = null;



        	enterRule();

        try {
            // InternalCool.g:1678:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) otherlv_9= 'actionsType' ( (lv_actionsType_10_0= ruleActionType ) ) otherlv_11= 'actionStatus' ( (lv_actionStatus_12_0= ruleActionStatus ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' ) )
            // InternalCool.g:1679:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) otherlv_9= 'actionsType' ( (lv_actionsType_10_0= ruleActionType ) ) otherlv_11= 'actionStatus' ( (lv_actionStatus_12_0= ruleActionStatus ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' )
            {
            // InternalCool.g:1679:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) otherlv_9= 'actionsType' ( (lv_actionsType_10_0= ruleActionType ) ) otherlv_11= 'actionStatus' ( (lv_actionStatus_12_0= ruleActionStatus ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' )
            // InternalCool.g:1680:3: otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'startDate' ( (lv_startDate_6_0= ruleEDate ) ) otherlv_7= 'endDate' ( (lv_endDate_8_0= ruleEDate ) ) otherlv_9= 'actionsType' ( (lv_actionsType_10_0= ruleActionType ) ) otherlv_11= 'actionStatus' ( (lv_actionStatus_12_0= ruleActionStatus ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalCool.g:1684:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCool.g:1685:4: (lv_name_1_0= ruleEString )
            {
            // InternalCool.g:1685:4: (lv_name_1_0= ruleEString )
            // InternalCool.g:1686:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.disim.univaq.xtext.Cool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCool.g:1707:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCool.g:1708:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalCool.g:1712:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalCool.g:1713:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalCool.g:1713:5: (lv_description_4_0= ruleEString )
                    // InternalCool.g:1714:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.Cool.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getStartDateKeyword_4());
            		
            // InternalCool.g:1736:3: ( (lv_startDate_6_0= ruleEDate ) )
            // InternalCool.g:1737:4: (lv_startDate_6_0= ruleEDate )
            {
            // InternalCool.g:1737:4: (lv_startDate_6_0= ruleEDate )
            // InternalCool.g:1738:5: lv_startDate_6_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getActionAccess().getStartDateEDateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
            lv_startDate_6_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"startDate",
            						lv_startDate_6_0,
            						"it.disim.univaq.xtext.Cool.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getEndDateKeyword_6());
            		
            // InternalCool.g:1759:3: ( (lv_endDate_8_0= ruleEDate ) )
            // InternalCool.g:1760:4: (lv_endDate_8_0= ruleEDate )
            {
            // InternalCool.g:1760:4: (lv_endDate_8_0= ruleEDate )
            // InternalCool.g:1761:5: lv_endDate_8_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getActionAccess().getEndDateEDateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_59);
            lv_endDate_8_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_8_0,
            						"it.disim.univaq.xtext.Cool.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,50,FOLLOW_60); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getActionsTypeKeyword_8());
            		
            // InternalCool.g:1782:3: ( (lv_actionsType_10_0= ruleActionType ) )
            // InternalCool.g:1783:4: (lv_actionsType_10_0= ruleActionType )
            {
            // InternalCool.g:1783:4: (lv_actionsType_10_0= ruleActionType )
            // InternalCool.g:1784:5: lv_actionsType_10_0= ruleActionType
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionsTypeActionTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_61);
            lv_actionsType_10_0=ruleActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionsType",
            						lv_actionsType_10_0,
            						"it.disim.univaq.xtext.Cool.ActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,51,FOLLOW_62); 

            			newLeafNode(otherlv_11, grammarAccess.getActionAccess().getActionStatusKeyword_10());
            		
            // InternalCool.g:1805:3: ( (lv_actionStatus_12_0= ruleActionStatus ) )
            // InternalCool.g:1806:4: (lv_actionStatus_12_0= ruleActionStatus )
            {
            // InternalCool.g:1806:4: (lv_actionStatus_12_0= ruleActionStatus )
            // InternalCool.g:1807:5: lv_actionStatus_12_0= ruleActionStatus
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionStatusActionStatusEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_63);
            lv_actionStatus_12_0=ruleActionStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionStatus",
            						lv_actionStatus_12_0,
            						"it.disim.univaq.xtext.Cool.ActionStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCool.g:1824:3: (otherlv_13= 'problem' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCool.g:1825:4: otherlv_13= 'problem' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,52,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getProblemKeyword_12_0());
                    			
                    // InternalCool.g:1829:4: ( ( ruleEString ) )
                    // InternalCool.g:1830:5: ( ruleEString )
                    {
                    // InternalCool.g:1830:5: ( ruleEString )
                    // InternalCool.g:1831:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getProblemProblemCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCool.g:1846:3: (otherlv_15= 'solution' ( ( ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCool.g:1847:4: otherlv_15= 'solution' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,53,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getSolutionKeyword_13_0());
                    			
                    // InternalCool.g:1851:4: ( ( ruleEString ) )
                    // InternalCool.g:1852:5: ( ruleEString )
                    {
                    // InternalCool.g:1852:5: ( ruleEString )
                    // InternalCool.g:1853:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getSolutionSolutionCrossReference_13_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getActionAccess().getProcessKeyword_14());
            		
            // InternalCool.g:1872:3: ( ( ruleEString ) )
            // InternalCool.g:1873:4: ( ruleEString )
            {
            // InternalCool.g:1873:4: ( ruleEString )
            // InternalCool.g:1874:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getProcessProcessCrossReference_15_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleUserType"
    // InternalCool.g:1896:1: ruleUserType returns [Enumerator current=null] : ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) ) ;
    public final Enumerator ruleUserType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCool.g:1902:2: ( ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) ) )
            // InternalCool.g:1903:2: ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) )
            {
            // InternalCool.g:1903:2: ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            else if ( (LA45_0==55) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalCool.g:1904:3: (enumLiteral_0= 'ADMIN' )
                    {
                    // InternalCool.g:1904:3: (enumLiteral_0= 'ADMIN' )
                    // InternalCool.g:1905:4: enumLiteral_0= 'ADMIN'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getUserTypeAccess().getADMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserTypeAccess().getADMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCool.g:1912:3: (enumLiteral_1= 'BASIC' )
                    {
                    // InternalCool.g:1912:3: (enumLiteral_1= 'BASIC' )
                    // InternalCool.g:1913:4: enumLiteral_1= 'BASIC'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getUserTypeAccess().getBASICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUserTypeAccess().getBASICEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleUserType"


    // $ANTLR start "ruleProcessStatus"
    // InternalCool.g:1923:1: ruleProcessStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) ) ;
    public final Enumerator ruleProcessStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCool.g:1929:2: ( ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) ) )
            // InternalCool.g:1930:2: ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) )
            {
            // InternalCool.g:1930:2: ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt46=1;
                }
                break;
            case 57:
                {
                alt46=2;
                }
                break;
            case 58:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalCool.g:1931:3: (enumLiteral_0= 'DRAFT' )
                    {
                    // InternalCool.g:1931:3: (enumLiteral_0= 'DRAFT' )
                    // InternalCool.g:1932:4: enumLiteral_0= 'DRAFT'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getProcessStatusAccess().getDRAFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessStatusAccess().getDRAFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCool.g:1939:3: (enumLiteral_1= 'PROGRESS' )
                    {
                    // InternalCool.g:1939:3: (enumLiteral_1= 'PROGRESS' )
                    // InternalCool.g:1940:4: enumLiteral_1= 'PROGRESS'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getProcessStatusAccess().getPROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessStatusAccess().getPROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCool.g:1947:3: (enumLiteral_2= 'COMPLETE' )
                    {
                    // InternalCool.g:1947:3: (enumLiteral_2= 'COMPLETE' )
                    // InternalCool.g:1948:4: enumLiteral_2= 'COMPLETE'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getProcessStatusAccess().getCOMPLETEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProcessStatusAccess().getCOMPLETEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleProcessStatus"


    // $ANTLR start "ruleActionType"
    // InternalCool.g:1958:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCool.g:1964:2: ( ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) ) )
            // InternalCool.g:1965:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) )
            {
            // InternalCool.g:1965:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt47=1;
                }
                break;
            case 60:
                {
                alt47=2;
                }
                break;
            case 61:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalCool.g:1966:3: (enumLiteral_0= 'CUSTOM' )
                    {
                    // InternalCool.g:1966:3: (enumLiteral_0= 'CUSTOM' )
                    // InternalCool.g:1967:4: enumLiteral_0= 'CUSTOM'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getCUSTOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getCUSTOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCool.g:1974:3: (enumLiteral_1= 'PROBLEM' )
                    {
                    // InternalCool.g:1974:3: (enumLiteral_1= 'PROBLEM' )
                    // InternalCool.g:1975:4: enumLiteral_1= 'PROBLEM'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getPROBLEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getPROBLEMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCool.g:1982:3: (enumLiteral_2= 'SOLUTION' )
                    {
                    // InternalCool.g:1982:3: (enumLiteral_2= 'SOLUTION' )
                    // InternalCool.g:1983:4: enumLiteral_2= 'SOLUTION'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getSOLUTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionTypeAccess().getSOLUTIONEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleActionType"


    // $ANTLR start "ruleActionStatus"
    // InternalCool.g:1993:1: ruleActionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) ) ;
    public final Enumerator ruleActionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCool.g:1999:2: ( ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) ) )
            // InternalCool.g:2000:2: ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) )
            {
            // InternalCool.g:2000:2: ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt48=1;
                }
                break;
            case 57:
                {
                alt48=2;
                }
                break;
            case 63:
                {
                alt48=3;
                }
                break;
            case 64:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalCool.g:2001:3: (enumLiteral_0= 'TODO' )
                    {
                    // InternalCool.g:2001:3: (enumLiteral_0= 'TODO' )
                    // InternalCool.g:2002:4: enumLiteral_0= 'TODO'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getTODOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionStatusAccess().getTODOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCool.g:2009:3: (enumLiteral_1= 'PROGRESS' )
                    {
                    // InternalCool.g:2009:3: (enumLiteral_1= 'PROGRESS' )
                    // InternalCool.g:2010:4: enumLiteral_1= 'PROGRESS'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getPROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionStatusAccess().getPROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCool.g:2017:3: (enumLiteral_2= 'SUCCESS' )
                    {
                    // InternalCool.g:2017:3: (enumLiteral_2= 'SUCCESS' )
                    // InternalCool.g:2018:4: enumLiteral_2= 'SUCCESS'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getSUCCESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionStatusAccess().getSUCCESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCool.g:2025:3: (enumLiteral_3= 'FAIL' )
                    {
                    // InternalCool.g:2025:3: (enumLiteral_3= 'FAIL' )
                    // InternalCool.g:2026:4: enumLiteral_3= 'FAIL'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getFAILEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionStatusAccess().getFAILEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleActionStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000002000C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000020000C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000040000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000100000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000042020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000009008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000802008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000600000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000060004008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000060000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xC200000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0030000008000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0020000008000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000008000000L});

}