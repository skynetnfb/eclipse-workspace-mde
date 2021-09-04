package it.disim.univaq.xtext.processmanagement.parser.antlr.internal;

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
import it.disim.univaq.xtext.processmanagement.services.PmanagementGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPmanagementParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'user'", "','", "'}'", "'User'", "'description'", "'email'", "'username'", "'surname'", "'userType'", "'birthdate'", "'solutions'", "'problems'", "'itemProcess'", "'process'", "'Solution'", "'author'", "'('", "')'", "'Problem'", "'ItemProcess'", "'itemProcessType'", "'Process'", "'status'", "'startDate'", "'endDate'", "'weight'", "'location'", "'actionHistory'", "'ItemSpecies'", "'Location'", "'Action'", "'actionsType'", "'actionStatus'", "'problem'", "'solution'", "'ADMIN'", "'BASIC'", "'DRAFT'", "'PROGRESS'", "'COMPLETE'", "'CUSTOM'", "'PROBLEM'", "'SOLUTION'", "'TODO'", "'SUCCESS'", "'FAIL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
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
    public static final int T__20=20;
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


        public InternalPmanagementParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPmanagementParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPmanagementParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPmanagement.g"; }



     	private PmanagementGrammarAccess grammarAccess;

        public InternalPmanagementParser(TokenStream input, PmanagementGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected PmanagementGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalPmanagement.g:65:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalPmanagement.g:65:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalPmanagement.g:66:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalPmanagement.g:72:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalPmanagement.g:78:2: ( (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalPmanagement.g:79:2: (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalPmanagement.g:79:2: (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalPmanagement.g:80:3: otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'user' otherlv_3= '{' ( (lv_user_4_0= ruleUser ) ) (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getUserKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPmanagement.g:96:3: ( (lv_user_4_0= ruleUser ) )
            // InternalPmanagement.g:97:4: (lv_user_4_0= ruleUser )
            {
            // InternalPmanagement.g:97:4: (lv_user_4_0= ruleUser )
            // InternalPmanagement.g:98:5: lv_user_4_0= ruleUser
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.User");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:115:3: (otherlv_5= ',' ( (lv_user_6_0= ruleUser ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPmanagement.g:116:4: otherlv_5= ',' ( (lv_user_6_0= ruleUser ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalPmanagement.g:120:4: ( (lv_user_6_0= ruleUser ) )
            	    // InternalPmanagement.g:121:5: (lv_user_6_0= ruleUser )
            	    {
            	    // InternalPmanagement.g:121:5: (lv_user_6_0= ruleUser )
            	    // InternalPmanagement.g:122:6: lv_user_6_0= ruleUser
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
            	    							"it.disim.univaq.xtext.processmanagement.Pmanagement.User");
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
    // InternalPmanagement.g:152:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalPmanagement.g:152:45: (iv_ruleUser= ruleUser EOF )
            // InternalPmanagement.g:153:2: iv_ruleUser= ruleUser EOF
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
    // InternalPmanagement.g:159:1: ruleUser returns [EObject current=null] : (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) (otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) ) )? otherlv_11= 'userType' ( (lv_userType_12_0= ruleUserType ) ) (otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) ) )? (otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}' )? (otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}' )? (otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}' )? (otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_email_6_0 = null;

        AntlrDatatypeRuleToken lv_username_8_0 = null;

        AntlrDatatypeRuleToken lv_surname_10_0 = null;

        Enumerator lv_userType_12_0 = null;

        AntlrDatatypeRuleToken lv_birthdate_14_0 = null;

        EObject lv_solutions_17_0 = null;

        EObject lv_solutions_19_0 = null;

        EObject lv_problems_23_0 = null;

        EObject lv_problems_25_0 = null;

        EObject lv_itemProcess_29_0 = null;

        EObject lv_itemProcess_31_0 = null;

        EObject lv_process_35_0 = null;

        EObject lv_process_37_0 = null;



        	enterRule();

        try {
            // InternalPmanagement.g:165:2: ( (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) (otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) ) )? otherlv_11= 'userType' ( (lv_userType_12_0= ruleUserType ) ) (otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) ) )? (otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}' )? (otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}' )? (otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}' )? (otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // InternalPmanagement.g:166:2: (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) (otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) ) )? otherlv_11= 'userType' ( (lv_userType_12_0= ruleUserType ) ) (otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) ) )? (otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}' )? (otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}' )? (otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}' )? (otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // InternalPmanagement.g:166:2: (otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) (otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) ) )? otherlv_11= 'userType' ( (lv_userType_12_0= ruleUserType ) ) (otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) ) )? (otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}' )? (otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}' )? (otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}' )? (otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // InternalPmanagement.g:167:3: otherlv_0= 'User' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'email' ( (lv_email_6_0= ruleEString ) ) otherlv_7= 'username' ( (lv_username_8_0= ruleEString ) ) (otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) ) )? otherlv_11= 'userType' ( (lv_userType_12_0= ruleUserType ) ) (otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) ) )? (otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}' )? (otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}' )? (otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}' )? (otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalPmanagement.g:171:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPmanagement.g:172:4: (lv_name_1_0= ruleEString )
            {
            // InternalPmanagement.g:172:4: (lv_name_1_0= ruleEString )
            // InternalPmanagement.g:173:5: lv_name_1_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPmanagement.g:194:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPmanagement.g:195:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getUserAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalPmanagement.g:199:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalPmanagement.g:200:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalPmanagement.g:200:5: (lv_description_4_0= ruleEString )
                    // InternalPmanagement.g:201:6: lv_description_4_0= ruleEString
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
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getUserAccess().getEmailKeyword_4());
            		
            // InternalPmanagement.g:223:3: ( (lv_email_6_0= ruleEString ) )
            // InternalPmanagement.g:224:4: (lv_email_6_0= ruleEString )
            {
            // InternalPmanagement.g:224:4: (lv_email_6_0= ruleEString )
            // InternalPmanagement.g:225:5: lv_email_6_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getUserAccess().getUsernameKeyword_6());
            		
            // InternalPmanagement.g:246:3: ( (lv_username_8_0= ruleEString ) )
            // InternalPmanagement.g:247:4: (lv_username_8_0= ruleEString )
            {
            // InternalPmanagement.g:247:4: (lv_username_8_0= ruleEString )
            // InternalPmanagement.g:248:5: lv_username_8_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:265:3: (otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPmanagement.g:266:4: otherlv_9= 'surname' ( (lv_surname_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getUserAccess().getSurnameKeyword_8_0());
                    			
                    // InternalPmanagement.g:270:4: ( (lv_surname_10_0= ruleEString ) )
                    // InternalPmanagement.g:271:5: (lv_surname_10_0= ruleEString )
                    {
                    // InternalPmanagement.g:271:5: (lv_surname_10_0= ruleEString )
                    // InternalPmanagement.g:272:6: lv_surname_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getSurnameEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_surname_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"surname",
                    							lv_surname_10_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getUserAccess().getUserTypeKeyword_9());
            		
            // InternalPmanagement.g:294:3: ( (lv_userType_12_0= ruleUserType ) )
            // InternalPmanagement.g:295:4: (lv_userType_12_0= ruleUserType )
            {
            // InternalPmanagement.g:295:4: (lv_userType_12_0= ruleUserType )
            // InternalPmanagement.g:296:5: lv_userType_12_0= ruleUserType
            {

            					newCompositeNode(grammarAccess.getUserAccess().getUserTypeUserTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_userType_12_0=ruleUserType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"userType",
            						lv_userType_12_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.UserType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:313:3: (otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPmanagement.g:314:4: otherlv_13= 'birthdate' ( (lv_birthdate_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getUserAccess().getBirthdateKeyword_11_0());
                    			
                    // InternalPmanagement.g:318:4: ( (lv_birthdate_14_0= ruleEString ) )
                    // InternalPmanagement.g:319:5: (lv_birthdate_14_0= ruleEString )
                    {
                    // InternalPmanagement.g:319:5: (lv_birthdate_14_0= ruleEString )
                    // InternalPmanagement.g:320:6: lv_birthdate_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getBirthdateEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_birthdate_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						set(
                    							current,
                    							"birthdate",
                    							lv_birthdate_14_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:338:3: (otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPmanagement.g:339:4: otherlv_15= 'solutions' otherlv_16= '{' ( (lv_solutions_17_0= ruleSolution ) ) (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getUserAccess().getSolutionsKeyword_12_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalPmanagement.g:347:4: ( (lv_solutions_17_0= ruleSolution ) )
                    // InternalPmanagement.g:348:5: (lv_solutions_17_0= ruleSolution )
                    {
                    // InternalPmanagement.g:348:5: (lv_solutions_17_0= ruleSolution )
                    // InternalPmanagement.g:349:6: lv_solutions_17_0= ruleSolution
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getSolutionsSolutionParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_solutions_17_0=ruleSolution();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"solutions",
                    							lv_solutions_17_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.Solution");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:366:4: (otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPmanagement.g:367:5: otherlv_18= ',' ( (lv_solutions_19_0= ruleSolution ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getUserAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalPmanagement.g:371:5: ( (lv_solutions_19_0= ruleSolution ) )
                    	    // InternalPmanagement.g:372:6: (lv_solutions_19_0= ruleSolution )
                    	    {
                    	    // InternalPmanagement.g:372:6: (lv_solutions_19_0= ruleSolution )
                    	    // InternalPmanagement.g:373:7: lv_solutions_19_0= ruleSolution
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getSolutionsSolutionParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_solutions_19_0=ruleSolution();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"solutions",
                    	    								lv_solutions_19_0,
                    	    								"it.disim.univaq.xtext.processmanagement.Pmanagement.Solution");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_20, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalPmanagement.g:396:3: (otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPmanagement.g:397:4: otherlv_21= 'problems' otherlv_22= '{' ( (lv_problems_23_0= ruleProblem ) ) (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getUserAccess().getProblemsKeyword_13_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_22, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalPmanagement.g:405:4: ( (lv_problems_23_0= ruleProblem ) )
                    // InternalPmanagement.g:406:5: (lv_problems_23_0= ruleProblem )
                    {
                    // InternalPmanagement.g:406:5: (lv_problems_23_0= ruleProblem )
                    // InternalPmanagement.g:407:6: lv_problems_23_0= ruleProblem
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getProblemsProblemParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_problems_23_0=ruleProblem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"problems",
                    							lv_problems_23_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.Problem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:424:4: (otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPmanagement.g:425:5: otherlv_24= ',' ( (lv_problems_25_0= ruleProblem ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getUserAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalPmanagement.g:429:5: ( (lv_problems_25_0= ruleProblem ) )
                    	    // InternalPmanagement.g:430:6: (lv_problems_25_0= ruleProblem )
                    	    {
                    	    // InternalPmanagement.g:430:6: (lv_problems_25_0= ruleProblem )
                    	    // InternalPmanagement.g:431:7: lv_problems_25_0= ruleProblem
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getProblemsProblemParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_problems_25_0=ruleProblem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"problems",
                    	    								lv_problems_25_0,
                    	    								"it.disim.univaq.xtext.processmanagement.Pmanagement.Problem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_26, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalPmanagement.g:454:3: (otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPmanagement.g:455:4: otherlv_27= 'itemProcess' otherlv_28= '{' ( (lv_itemProcess_29_0= ruleItemProcess ) ) (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getUserAccess().getItemProcessKeyword_14_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_28, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalPmanagement.g:463:4: ( (lv_itemProcess_29_0= ruleItemProcess ) )
                    // InternalPmanagement.g:464:5: (lv_itemProcess_29_0= ruleItemProcess )
                    {
                    // InternalPmanagement.g:464:5: (lv_itemProcess_29_0= ruleItemProcess )
                    // InternalPmanagement.g:465:6: lv_itemProcess_29_0= ruleItemProcess
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getItemProcessItemProcessParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_itemProcess_29_0=ruleItemProcess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"itemProcess",
                    							lv_itemProcess_29_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.ItemProcess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:482:4: (otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPmanagement.g:483:5: otherlv_30= ',' ( (lv_itemProcess_31_0= ruleItemProcess ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getUserAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalPmanagement.g:487:5: ( (lv_itemProcess_31_0= ruleItemProcess ) )
                    	    // InternalPmanagement.g:488:6: (lv_itemProcess_31_0= ruleItemProcess )
                    	    {
                    	    // InternalPmanagement.g:488:6: (lv_itemProcess_31_0= ruleItemProcess )
                    	    // InternalPmanagement.g:489:7: lv_itemProcess_31_0= ruleItemProcess
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getItemProcessItemProcessParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_itemProcess_31_0=ruleItemProcess();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"itemProcess",
                    	    								lv_itemProcess_31_0,
                    	    								"it.disim.univaq.xtext.processmanagement.Pmanagement.ItemProcess");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_32, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalPmanagement.g:512:3: (otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPmanagement.g:513:4: otherlv_33= 'process' otherlv_34= '{' ( (lv_process_35_0= ruleProcess ) ) (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getUserAccess().getProcessKeyword_15_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_34, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalPmanagement.g:521:4: ( (lv_process_35_0= ruleProcess ) )
                    // InternalPmanagement.g:522:5: (lv_process_35_0= ruleProcess )
                    {
                    // InternalPmanagement.g:522:5: (lv_process_35_0= ruleProcess )
                    // InternalPmanagement.g:523:6: lv_process_35_0= ruleProcess
                    {

                    						newCompositeNode(grammarAccess.getUserAccess().getProcessProcessParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_process_35_0=ruleProcess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserRule());
                    						}
                    						add(
                    							current,
                    							"process",
                    							lv_process_35_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.Process");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:540:4: (otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPmanagement.g:541:5: otherlv_36= ',' ( (lv_process_37_0= ruleProcess ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getUserAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalPmanagement.g:545:5: ( (lv_process_37_0= ruleProcess ) )
                    	    // InternalPmanagement.g:546:6: (lv_process_37_0= ruleProcess )
                    	    {
                    	    // InternalPmanagement.g:546:6: (lv_process_37_0= ruleProcess )
                    	    // InternalPmanagement.g:547:7: lv_process_37_0= ruleProcess
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserAccess().getProcessProcessParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_process_37_0=ruleProcess();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"process",
                    	    								lv_process_37_0,
                    	    								"it.disim.univaq.xtext.processmanagement.Pmanagement.Process");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_38, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalPmanagement.g:578:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPmanagement.g:578:47: (iv_ruleEString= ruleEString EOF )
            // InternalPmanagement.g:579:2: iv_ruleEString= ruleEString EOF
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
    // InternalPmanagement.g:585:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPmanagement.g:591:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPmanagement.g:592:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPmanagement.g:592:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPmanagement.g:593:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPmanagement.g:601:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSolution"
    // InternalPmanagement.g:612:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalPmanagement.g:612:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalPmanagement.g:613:2: iv_ruleSolution= ruleSolution EOF
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
    // InternalPmanagement.g:619:1: ruleSolution returns [EObject current=null] : (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) ;
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
            // InternalPmanagement.g:625:2: ( (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalPmanagement.g:626:2: (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalPmanagement.g:626:2: (otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalPmanagement.g:627:3: otherlv_0= 'Solution' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'author' ( ( ruleEString ) ) )? otherlv_7= 'problems' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSolutionAccess().getSolutionKeyword_0());
            		
            // InternalPmanagement.g:631:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPmanagement.g:632:4: (lv_name_1_0= ruleEString )
            {
            // InternalPmanagement.g:632:4: (lv_name_1_0= ruleEString )
            // InternalPmanagement.g:633:5: lv_name_1_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPmanagement.g:654:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPmanagement.g:655:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalPmanagement.g:659:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalPmanagement.g:660:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalPmanagement.g:660:5: (lv_description_4_0= ruleEString )
                    // InternalPmanagement.g:661:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSolutionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:679:3: (otherlv_5= 'author' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPmanagement.g:680:4: otherlv_5= 'author' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSolutionAccess().getAuthorKeyword_4_0());
                    			
                    // InternalPmanagement.g:684:4: ( ( ruleEString ) )
                    // InternalPmanagement.g:685:5: ( ruleEString )
                    {
                    // InternalPmanagement.g:685:5: ( ruleEString )
                    // InternalPmanagement.g:686:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSolutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSolutionAccess().getAuthorUserCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getSolutionAccess().getProblemsKeyword_5());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getSolutionAccess().getLeftParenthesisKeyword_6());
            		
            // InternalPmanagement.g:709:3: ( ( ruleEString ) )
            // InternalPmanagement.g:710:4: ( ruleEString )
            {
            // InternalPmanagement.g:710:4: ( ruleEString )
            // InternalPmanagement.g:711:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolutionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSolutionAccess().getProblemsProblemCrossReference_7_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:725:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPmanagement.g:726:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSolutionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalPmanagement.g:730:4: ( ( ruleEString ) )
            	    // InternalPmanagement.g:731:5: ( ruleEString )
            	    {
            	    // InternalPmanagement.g:731:5: ( ruleEString )
            	    // InternalPmanagement.g:732:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSolutionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSolutionAccess().getProblemsProblemCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_12=(Token)match(input,30,FOLLOW_7); 

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
    // InternalPmanagement.g:759:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalPmanagement.g:759:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalPmanagement.g:760:2: iv_ruleProblem= ruleProblem EOF
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
    // InternalPmanagement.g:766:1: ruleProblem returns [EObject current=null] : (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
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
            // InternalPmanagement.g:772:2: ( (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // InternalPmanagement.g:773:2: (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // InternalPmanagement.g:773:2: (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // InternalPmanagement.g:774:3: otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'process' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProblemAccess().getProblemKeyword_0());
            		
            // InternalPmanagement.g:778:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPmanagement.g:779:4: (lv_name_1_0= ruleEString )
            {
            // InternalPmanagement.g:779:4: (lv_name_1_0= ruleEString )
            // InternalPmanagement.g:780:5: lv_name_1_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPmanagement.g:801:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPmanagement.g:802:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalPmanagement.g:806:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalPmanagement.g:807:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalPmanagement.g:807:5: (lv_description_4_0= ruleEString )
                    // InternalPmanagement.g:808:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProblemAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProblemRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getProblemAccess().getAuthorKeyword_4());
            		
            // InternalPmanagement.g:830:3: ( ( ruleEString ) )
            // InternalPmanagement.g:831:4: ( ruleEString )
            {
            // InternalPmanagement.g:831:4: ( ruleEString )
            // InternalPmanagement.g:832:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProblemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProblemAccess().getAuthorUserCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:846:3: (otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPmanagement.g:847:4: otherlv_7= 'solutions' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getProblemAccess().getSolutionsKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getProblemAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalPmanagement.g:855:4: ( ( ruleEString ) )
                    // InternalPmanagement.g:856:5: ( ruleEString )
                    {
                    // InternalPmanagement.g:856:5: ( ruleEString )
                    // InternalPmanagement.g:857:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProblemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProblemAccess().getSolutionsSolutionCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:871:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalPmanagement.g:872:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getProblemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPmanagement.g:876:5: ( ( ruleEString ) )
                    	    // InternalPmanagement.g:877:6: ( ruleEString )
                    	    {
                    	    // InternalPmanagement.g:877:6: ( ruleEString )
                    	    // InternalPmanagement.g:878:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProblemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProblemAccess().getSolutionsSolutionCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getProblemAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalPmanagement.g:898:3: (otherlv_13= 'process' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPmanagement.g:899:4: otherlv_13= 'process' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getProblemAccess().getProcessKeyword_7_0());
                    			
                    // InternalPmanagement.g:903:4: ( ( ruleEString ) )
                    // InternalPmanagement.g:904:5: ( ruleEString )
                    {
                    // InternalPmanagement.g:904:5: ( ruleEString )
                    // InternalPmanagement.g:905:6: ruleEString
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
    // InternalPmanagement.g:928:1: entryRuleItemProcess returns [EObject current=null] : iv_ruleItemProcess= ruleItemProcess EOF ;
    public final EObject entryRuleItemProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemProcess = null;


        try {
            // InternalPmanagement.g:928:52: (iv_ruleItemProcess= ruleItemProcess EOF )
            // InternalPmanagement.g:929:2: iv_ruleItemProcess= ruleItemProcess EOF
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
    // InternalPmanagement.g:935:1: ruleItemProcess returns [EObject current=null] : (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
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
            // InternalPmanagement.g:941:2: ( (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalPmanagement.g:942:2: (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalPmanagement.g:942:2: (otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalPmanagement.g:943:3: otherlv_0= 'ItemProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'author' ( ( ruleEString ) ) (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )? (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getItemProcessAccess().getItemProcessKeyword_0());
            		
            // InternalPmanagement.g:947:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPmanagement.g:948:4: (lv_name_1_0= ruleEString )
            {
            // InternalPmanagement.g:948:4: (lv_name_1_0= ruleEString )
            // InternalPmanagement.g:949:5: lv_name_1_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getItemProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPmanagement.g:970:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPmanagement.g:971:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getItemProcessAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalPmanagement.g:975:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalPmanagement.g:976:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalPmanagement.g:976:5: (lv_description_4_0= ruleEString )
                    // InternalPmanagement.g:977:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getItemProcessAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemProcessRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getItemProcessAccess().getAuthorKeyword_4());
            		
            // InternalPmanagement.g:999:3: ( ( ruleEString ) )
            // InternalPmanagement.g:1000:4: ( ruleEString )
            {
            // InternalPmanagement.g:1000:4: ( ruleEString )
            // InternalPmanagement.g:1001:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItemProcessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getItemProcessAccess().getAuthorUserCrossReference_5_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:1015:3: (otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPmanagement.g:1016:4: otherlv_7= 'itemProcessType' ( (lv_itemProcessType_8_0= ruleItemSpecies ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getItemProcessAccess().getItemProcessTypeKeyword_6_0());
                    			
                    // InternalPmanagement.g:1020:4: ( (lv_itemProcessType_8_0= ruleItemSpecies ) )
                    // InternalPmanagement.g:1021:5: (lv_itemProcessType_8_0= ruleItemSpecies )
                    {
                    // InternalPmanagement.g:1021:5: (lv_itemProcessType_8_0= ruleItemSpecies )
                    // InternalPmanagement.g:1022:6: lv_itemProcessType_8_0= ruleItemSpecies
                    {

                    						newCompositeNode(grammarAccess.getItemProcessAccess().getItemProcessTypeItemSpeciesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_itemProcessType_8_0=ruleItemSpecies();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getItemProcessRule());
                    						}
                    						set(
                    							current,
                    							"itemProcessType",
                    							lv_itemProcessType_8_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.ItemSpecies");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:1040:3: (otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPmanagement.g:1041:4: otherlv_9= 'problems' otherlv_10= '{' ( (lv_problems_11_0= ruleProblem ) ) (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getItemProcessAccess().getProblemsKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getItemProcessAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPmanagement.g:1049:4: ( (lv_problems_11_0= ruleProblem ) )
                    // InternalPmanagement.g:1050:5: (lv_problems_11_0= ruleProblem )
                    {
                    // InternalPmanagement.g:1050:5: (lv_problems_11_0= ruleProblem )
                    // InternalPmanagement.g:1051:6: lv_problems_11_0= ruleProblem
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
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.Problem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:1068:4: (otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalPmanagement.g:1069:5: otherlv_12= ',' ( (lv_problems_13_0= ruleProblem ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getItemProcessAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalPmanagement.g:1073:5: ( (lv_problems_13_0= ruleProblem ) )
                    	    // InternalPmanagement.g:1074:6: (lv_problems_13_0= ruleProblem )
                    	    {
                    	    // InternalPmanagement.g:1074:6: (lv_problems_13_0= ruleProblem )
                    	    // InternalPmanagement.g:1075:7: lv_problems_13_0= ruleProblem
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
                    	    								"it.disim.univaq.xtext.processmanagement.Pmanagement.Problem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // InternalPmanagement.g:1106:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPmanagement.g:1106:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPmanagement.g:1107:2: iv_ruleProcess= ruleProcess EOF
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
    // InternalPmanagement.g:1113:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) ) )? otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) otherlv_11= 'weight' ( (lv_weight_12_0= ruleEString ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
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

        Enumerator lv_status_6_0 = null;

        AntlrDatatypeRuleToken lv_startDate_8_0 = null;

        AntlrDatatypeRuleToken lv_endDate_10_0 = null;

        AntlrDatatypeRuleToken lv_weight_12_0 = null;

        EObject lv_location_16_0 = null;

        EObject lv_actionHistory_19_0 = null;

        EObject lv_actionHistory_21_0 = null;



        	enterRule();

        try {
            // InternalPmanagement.g:1119:2: ( (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) ) )? otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) otherlv_11= 'weight' ( (lv_weight_12_0= ruleEString ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalPmanagement.g:1120:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) ) )? otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) otherlv_11= 'weight' ( (lv_weight_12_0= ruleEString ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalPmanagement.g:1120:2: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) ) )? otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) otherlv_11= 'weight' ( (lv_weight_12_0= ruleEString ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalPmanagement.g:1121:3: otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) ) )? otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) otherlv_11= 'weight' ( (lv_weight_12_0= ruleEString ) ) (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )? (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )? (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPmanagement.g:1125:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPmanagement.g:1126:4: (lv_name_1_0= ruleEString )
            {
            // InternalPmanagement.g:1126:4: (lv_name_1_0= ruleEString )
            // InternalPmanagement.g:1127:5: lv_name_1_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPmanagement.g:1148:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPmanagement.g:1149:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalPmanagement.g:1153:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalPmanagement.g:1154:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalPmanagement.g:1154:5: (lv_description_4_0= ruleEString )
                    // InternalPmanagement.g:1155:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:1173:3: (otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPmanagement.g:1174:4: otherlv_5= 'status' ( (lv_status_6_0= ruleProcessStatus ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getStatusKeyword_4_0());
                    			
                    // InternalPmanagement.g:1178:4: ( (lv_status_6_0= ruleProcessStatus ) )
                    // InternalPmanagement.g:1179:5: (lv_status_6_0= ruleProcessStatus )
                    {
                    // InternalPmanagement.g:1179:5: (lv_status_6_0= ruleProcessStatus )
                    // InternalPmanagement.g:1180:6: lv_status_6_0= ruleProcessStatus
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getStatusProcessStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_status_6_0=ruleProcessStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_6_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.ProcessStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getStartDateKeyword_5());
            		
            // InternalPmanagement.g:1202:3: ( (lv_startDate_8_0= ruleEString ) )
            // InternalPmanagement.g:1203:4: (lv_startDate_8_0= ruleEString )
            {
            // InternalPmanagement.g:1203:4: (lv_startDate_8_0= ruleEString )
            // InternalPmanagement.g:1204:5: lv_startDate_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getStartDateEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_startDate_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"startDate",
            						lv_startDate_8_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getEndDateKeyword_7());
            		
            // InternalPmanagement.g:1225:3: ( (lv_endDate_10_0= ruleEString ) )
            // InternalPmanagement.g:1226:4: (lv_endDate_10_0= ruleEString )
            {
            // InternalPmanagement.g:1226:4: (lv_endDate_10_0= ruleEString )
            // InternalPmanagement.g:1227:5: lv_endDate_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getEndDateEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_40);
            lv_endDate_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_10_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getProcessAccess().getWeightKeyword_9());
            		
            // InternalPmanagement.g:1248:3: ( (lv_weight_12_0= ruleEString ) )
            // InternalPmanagement.g:1249:4: (lv_weight_12_0= ruleEString )
            {
            // InternalPmanagement.g:1249:4: (lv_weight_12_0= ruleEString )
            // InternalPmanagement.g:1250:5: lv_weight_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWeightEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_41);
            lv_weight_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"weight",
            						lv_weight_12_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:1267:3: (otherlv_13= 'itemProcess' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPmanagement.g:1268:4: otherlv_13= 'itemProcess' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcessAccess().getItemProcessKeyword_11_0());
                    			
                    // InternalPmanagement.g:1272:4: ( ( ruleEString ) )
                    // InternalPmanagement.g:1273:5: ( ruleEString )
                    {
                    // InternalPmanagement.g:1273:5: ( ruleEString )
                    // InternalPmanagement.g:1274:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProcessAccess().getItemProcessItemProcessCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:1289:3: (otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPmanagement.g:1290:4: otherlv_15= 'location' ( (lv_location_16_0= ruleLocation ) )
                    {
                    otherlv_15=(Token)match(input,39,FOLLOW_43); 

                    				newLeafNode(otherlv_15, grammarAccess.getProcessAccess().getLocationKeyword_12_0());
                    			
                    // InternalPmanagement.g:1294:4: ( (lv_location_16_0= ruleLocation ) )
                    // InternalPmanagement.g:1295:5: (lv_location_16_0= ruleLocation )
                    {
                    // InternalPmanagement.g:1295:5: (lv_location_16_0= ruleLocation )
                    // InternalPmanagement.g:1296:6: lv_location_16_0= ruleLocation
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getLocationLocationParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_location_16_0=ruleLocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_16_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.Location");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:1314:3: (otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPmanagement.g:1315:4: otherlv_17= 'actionHistory' otherlv_18= '{' ( (lv_actionHistory_19_0= ruleAction ) ) (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getProcessAccess().getActionHistoryKeyword_13_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_45); 

                    				newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalPmanagement.g:1323:4: ( (lv_actionHistory_19_0= ruleAction ) )
                    // InternalPmanagement.g:1324:5: (lv_actionHistory_19_0= ruleAction )
                    {
                    // InternalPmanagement.g:1324:5: (lv_actionHistory_19_0= ruleAction )
                    // InternalPmanagement.g:1325:6: lv_actionHistory_19_0= ruleAction
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
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPmanagement.g:1342:4: (otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalPmanagement.g:1343:5: otherlv_20= ',' ( (lv_actionHistory_21_0= ruleAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_45); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getProcessAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalPmanagement.g:1347:5: ( (lv_actionHistory_21_0= ruleAction ) )
                    	    // InternalPmanagement.g:1348:6: (lv_actionHistory_21_0= ruleAction )
                    	    {
                    	    // InternalPmanagement.g:1348:6: (lv_actionHistory_21_0= ruleAction )
                    	    // InternalPmanagement.g:1349:7: lv_actionHistory_21_0= ruleAction
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
                    	    								"it.disim.univaq.xtext.processmanagement.Pmanagement.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
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
    // InternalPmanagement.g:1380:1: entryRuleItemSpecies returns [EObject current=null] : iv_ruleItemSpecies= ruleItemSpecies EOF ;
    public final EObject entryRuleItemSpecies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemSpecies = null;


        try {
            // InternalPmanagement.g:1380:52: (iv_ruleItemSpecies= ruleItemSpecies EOF )
            // InternalPmanagement.g:1381:2: iv_ruleItemSpecies= ruleItemSpecies EOF
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
    // InternalPmanagement.g:1387:1: ruleItemSpecies returns [EObject current=null] : ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalPmanagement.g:1393:2: ( ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPmanagement.g:1394:2: ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPmanagement.g:1394:2: ( () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalPmanagement.g:1395:3: () otherlv_1= 'ItemSpecies' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPmanagement.g:1395:3: ()
            // InternalPmanagement.g:1396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getItemSpeciesAccess().getItemSpeciesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getItemSpeciesAccess().getItemSpeciesKeyword_1());
            		
            // InternalPmanagement.g:1406:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPmanagement.g:1407:4: (lv_name_2_0= ruleEString )
            {
            // InternalPmanagement.g:1407:4: (lv_name_2_0= ruleEString )
            // InternalPmanagement.g:1408:5: lv_name_2_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getItemSpeciesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPmanagement.g:1429:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPmanagement.g:1430:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getItemSpeciesAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalPmanagement.g:1434:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalPmanagement.g:1435:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalPmanagement.g:1435:5: (lv_description_5_0= ruleEString )
                    // InternalPmanagement.g:1436:6: lv_description_5_0= ruleEString
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
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
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
    // InternalPmanagement.g:1462:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalPmanagement.g:1462:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalPmanagement.g:1463:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalPmanagement.g:1469:1: ruleLocation returns [EObject current=null] : ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalPmanagement.g:1475:2: ( ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPmanagement.g:1476:2: ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPmanagement.g:1476:2: ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalPmanagement.g:1477:3: () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPmanagement.g:1477:3: ()
            // InternalPmanagement.g:1478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1());
            		
            // InternalPmanagement.g:1488:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPmanagement.g:1489:4: (lv_name_2_0= ruleEString )
            {
            // InternalPmanagement.g:1489:4: (lv_name_2_0= ruleEString )
            // InternalPmanagement.g:1490:5: lv_name_2_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPmanagement.g:1511:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPmanagement.g:1512:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalPmanagement.g:1516:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalPmanagement.g:1517:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalPmanagement.g:1517:5: (lv_description_5_0= ruleEString )
                    // InternalPmanagement.g:1518:6: lv_description_5_0= ruleEString
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
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
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


    // $ANTLR start "entryRuleAction"
    // InternalPmanagement.g:1544:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPmanagement.g:1544:47: (iv_ruleAction= ruleAction EOF )
            // InternalPmanagement.g:1545:2: iv_ruleAction= ruleAction EOF
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
    // InternalPmanagement.g:1551:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'actionsType' ( (lv_actionsType_6_0= ruleActionType ) ) otherlv_7= 'actionStatus' ( (lv_actionStatus_8_0= ruleActionStatus ) ) (otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) ) )? otherlv_11= 'endDate' ( (lv_endDate_12_0= ruleEString ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' ) ;
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

        Enumerator lv_actionsType_6_0 = null;

        Enumerator lv_actionStatus_8_0 = null;

        AntlrDatatypeRuleToken lv_startDate_10_0 = null;

        AntlrDatatypeRuleToken lv_endDate_12_0 = null;



        	enterRule();

        try {
            // InternalPmanagement.g:1557:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'actionsType' ( (lv_actionsType_6_0= ruleActionType ) ) otherlv_7= 'actionStatus' ( (lv_actionStatus_8_0= ruleActionStatus ) ) (otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) ) )? otherlv_11= 'endDate' ( (lv_endDate_12_0= ruleEString ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' ) )
            // InternalPmanagement.g:1558:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'actionsType' ( (lv_actionsType_6_0= ruleActionType ) ) otherlv_7= 'actionStatus' ( (lv_actionStatus_8_0= ruleActionStatus ) ) (otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) ) )? otherlv_11= 'endDate' ( (lv_endDate_12_0= ruleEString ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' )
            {
            // InternalPmanagement.g:1558:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'actionsType' ( (lv_actionsType_6_0= ruleActionType ) ) otherlv_7= 'actionStatus' ( (lv_actionStatus_8_0= ruleActionStatus ) ) (otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) ) )? otherlv_11= 'endDate' ( (lv_endDate_12_0= ruleEString ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}' )
            // InternalPmanagement.g:1559:3: otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= 'actionsType' ( (lv_actionsType_6_0= ruleActionType ) ) otherlv_7= 'actionStatus' ( (lv_actionStatus_8_0= ruleActionStatus ) ) (otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) ) )? otherlv_11= 'endDate' ( (lv_endDate_12_0= ruleEString ) ) (otherlv_13= 'problem' ( ( ruleEString ) ) )? (otherlv_15= 'solution' ( ( ruleEString ) ) )? otherlv_17= 'process' ( ( ruleEString ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalPmanagement.g:1563:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPmanagement.g:1564:4: (lv_name_1_0= ruleEString )
            {
            // InternalPmanagement.g:1564:4: (lv_name_1_0= ruleEString )
            // InternalPmanagement.g:1565:5: lv_name_1_0= ruleEString
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
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPmanagement.g:1586:3: (otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPmanagement.g:1587:4: otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalPmanagement.g:1591:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalPmanagement.g:1592:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalPmanagement.g:1592:5: (lv_description_4_0= ruleEString )
                    // InternalPmanagement.g:1593:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FOLLOW_49); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getActionsTypeKeyword_4());
            		
            // InternalPmanagement.g:1615:3: ( (lv_actionsType_6_0= ruleActionType ) )
            // InternalPmanagement.g:1616:4: (lv_actionsType_6_0= ruleActionType )
            {
            // InternalPmanagement.g:1616:4: (lv_actionsType_6_0= ruleActionType )
            // InternalPmanagement.g:1617:5: lv_actionsType_6_0= ruleActionType
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionsTypeActionTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_50);
            lv_actionsType_6_0=ruleActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionsType",
            						lv_actionsType_6_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.ActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_51); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getActionStatusKeyword_6());
            		
            // InternalPmanagement.g:1638:3: ( (lv_actionStatus_8_0= ruleActionStatus ) )
            // InternalPmanagement.g:1639:4: (lv_actionStatus_8_0= ruleActionStatus )
            {
            // InternalPmanagement.g:1639:4: (lv_actionStatus_8_0= ruleActionStatus )
            // InternalPmanagement.g:1640:5: lv_actionStatus_8_0= ruleActionStatus
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionStatusActionStatusEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_52);
            lv_actionStatus_8_0=ruleActionStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionStatus",
            						lv_actionStatus_8_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.ActionStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:1657:3: (otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPmanagement.g:1658:4: otherlv_9= 'startDate' ( (lv_startDate_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getStartDateKeyword_8_0());
                    			
                    // InternalPmanagement.g:1662:4: ( (lv_startDate_10_0= ruleEString ) )
                    // InternalPmanagement.g:1663:5: (lv_startDate_10_0= ruleEString )
                    {
                    // InternalPmanagement.g:1663:5: (lv_startDate_10_0= ruleEString )
                    // InternalPmanagement.g:1664:6: lv_startDate_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getStartDateEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_startDate_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"startDate",
                    							lv_startDate_10_0,
                    							"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getActionAccess().getEndDateKeyword_9());
            		
            // InternalPmanagement.g:1686:3: ( (lv_endDate_12_0= ruleEString ) )
            // InternalPmanagement.g:1687:4: (lv_endDate_12_0= ruleEString )
            {
            // InternalPmanagement.g:1687:4: (lv_endDate_12_0= ruleEString )
            // InternalPmanagement.g:1688:5: lv_endDate_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getEndDateEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_53);
            lv_endDate_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_12_0,
            						"it.disim.univaq.xtext.processmanagement.Pmanagement.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPmanagement.g:1705:3: (otherlv_13= 'problem' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPmanagement.g:1706:4: otherlv_13= 'problem' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getProblemKeyword_11_0());
                    			
                    // InternalPmanagement.g:1710:4: ( ( ruleEString ) )
                    // InternalPmanagement.g:1711:5: ( ruleEString )
                    {
                    // InternalPmanagement.g:1711:5: ( ruleEString )
                    // InternalPmanagement.g:1712:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getProblemProblemCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPmanagement.g:1727:3: (otherlv_15= 'solution' ( ( ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPmanagement.g:1728:4: otherlv_15= 'solution' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getSolutionKeyword_12_0());
                    			
                    // InternalPmanagement.g:1732:4: ( ( ruleEString ) )
                    // InternalPmanagement.g:1733:5: ( ruleEString )
                    {
                    // InternalPmanagement.g:1733:5: ( ruleEString )
                    // InternalPmanagement.g:1734:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getSolutionSolutionCrossReference_12_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getActionAccess().getProcessKeyword_13());
            		
            // InternalPmanagement.g:1753:3: ( ( ruleEString ) )
            // InternalPmanagement.g:1754:4: ( ruleEString )
            {
            // InternalPmanagement.g:1754:4: ( ruleEString )
            // InternalPmanagement.g:1755:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getProcessProcessCrossReference_14_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalPmanagement.g:1777:1: ruleUserType returns [Enumerator current=null] : ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) ) ;
    public final Enumerator ruleUserType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPmanagement.g:1783:2: ( ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) ) )
            // InternalPmanagement.g:1784:2: ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) )
            {
            // InternalPmanagement.g:1784:2: ( (enumLiteral_0= 'ADMIN' ) | (enumLiteral_1= 'BASIC' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            else if ( (LA37_0==49) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalPmanagement.g:1785:3: (enumLiteral_0= 'ADMIN' )
                    {
                    // InternalPmanagement.g:1785:3: (enumLiteral_0= 'ADMIN' )
                    // InternalPmanagement.g:1786:4: enumLiteral_0= 'ADMIN'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getUserTypeAccess().getADMINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUserTypeAccess().getADMINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPmanagement.g:1793:3: (enumLiteral_1= 'BASIC' )
                    {
                    // InternalPmanagement.g:1793:3: (enumLiteral_1= 'BASIC' )
                    // InternalPmanagement.g:1794:4: enumLiteral_1= 'BASIC'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalPmanagement.g:1804:1: ruleProcessStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) ) ;
    public final Enumerator ruleProcessStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPmanagement.g:1810:2: ( ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) ) )
            // InternalPmanagement.g:1811:2: ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) )
            {
            // InternalPmanagement.g:1811:2: ( (enumLiteral_0= 'DRAFT' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'COMPLETE' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt38=1;
                }
                break;
            case 51:
                {
                alt38=2;
                }
                break;
            case 52:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPmanagement.g:1812:3: (enumLiteral_0= 'DRAFT' )
                    {
                    // InternalPmanagement.g:1812:3: (enumLiteral_0= 'DRAFT' )
                    // InternalPmanagement.g:1813:4: enumLiteral_0= 'DRAFT'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getProcessStatusAccess().getDRAFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProcessStatusAccess().getDRAFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPmanagement.g:1820:3: (enumLiteral_1= 'PROGRESS' )
                    {
                    // InternalPmanagement.g:1820:3: (enumLiteral_1= 'PROGRESS' )
                    // InternalPmanagement.g:1821:4: enumLiteral_1= 'PROGRESS'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getProcessStatusAccess().getPROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProcessStatusAccess().getPROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPmanagement.g:1828:3: (enumLiteral_2= 'COMPLETE' )
                    {
                    // InternalPmanagement.g:1828:3: (enumLiteral_2= 'COMPLETE' )
                    // InternalPmanagement.g:1829:4: enumLiteral_2= 'COMPLETE'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

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
    // InternalPmanagement.g:1839:1: ruleActionType returns [Enumerator current=null] : ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) ) ;
    public final Enumerator ruleActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPmanagement.g:1845:2: ( ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) ) )
            // InternalPmanagement.g:1846:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) )
            {
            // InternalPmanagement.g:1846:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'PROBLEM' ) | (enumLiteral_2= 'SOLUTION' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt39=1;
                }
                break;
            case 54:
                {
                alt39=2;
                }
                break;
            case 55:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalPmanagement.g:1847:3: (enumLiteral_0= 'CUSTOM' )
                    {
                    // InternalPmanagement.g:1847:3: (enumLiteral_0= 'CUSTOM' )
                    // InternalPmanagement.g:1848:4: enumLiteral_0= 'CUSTOM'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getCUSTOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionTypeAccess().getCUSTOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPmanagement.g:1855:3: (enumLiteral_1= 'PROBLEM' )
                    {
                    // InternalPmanagement.g:1855:3: (enumLiteral_1= 'PROBLEM' )
                    // InternalPmanagement.g:1856:4: enumLiteral_1= 'PROBLEM'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getActionTypeAccess().getPROBLEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionTypeAccess().getPROBLEMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPmanagement.g:1863:3: (enumLiteral_2= 'SOLUTION' )
                    {
                    // InternalPmanagement.g:1863:3: (enumLiteral_2= 'SOLUTION' )
                    // InternalPmanagement.g:1864:4: enumLiteral_2= 'SOLUTION'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

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
    // InternalPmanagement.g:1874:1: ruleActionStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) ) ;
    public final Enumerator ruleActionStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPmanagement.g:1880:2: ( ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) ) )
            // InternalPmanagement.g:1881:2: ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) )
            {
            // InternalPmanagement.g:1881:2: ( (enumLiteral_0= 'TODO' ) | (enumLiteral_1= 'PROGRESS' ) | (enumLiteral_2= 'SUCCESS' ) | (enumLiteral_3= 'FAIL' ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                alt40=2;
                }
                break;
            case 57:
                {
                alt40=3;
                }
                break;
            case 58:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalPmanagement.g:1882:3: (enumLiteral_0= 'TODO' )
                    {
                    // InternalPmanagement.g:1882:3: (enumLiteral_0= 'TODO' )
                    // InternalPmanagement.g:1883:4: enumLiteral_0= 'TODO'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getTODOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionStatusAccess().getTODOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPmanagement.g:1890:3: (enumLiteral_1= 'PROGRESS' )
                    {
                    // InternalPmanagement.g:1890:3: (enumLiteral_1= 'PROGRESS' )
                    // InternalPmanagement.g:1891:4: enumLiteral_1= 'PROGRESS'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getPROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionStatusAccess().getPROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPmanagement.g:1898:3: (enumLiteral_2= 'SUCCESS' )
                    {
                    // InternalPmanagement.g:1898:3: (enumLiteral_2= 'SUCCESS' )
                    // InternalPmanagement.g:1899:4: enumLiteral_2= 'SUCCESS'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getActionStatusAccess().getSUCCESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionStatusAccess().getSUCCESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPmanagement.g:1906:3: (enumLiteral_3= 'FAIL' )
                    {
                    // InternalPmanagement.g:1906:3: (enumLiteral_3= 'FAIL' )
                    // InternalPmanagement.g:1907:4: enumLiteral_3= 'FAIL'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000011020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004808000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000201008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018002008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0708000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000C00004000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800004000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000004000000L});

}