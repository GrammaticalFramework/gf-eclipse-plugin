package org.grammaticalframework.eclipse.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGFLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_COMPILER_PRAGMA=8;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_GF_DOC=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=12;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_INTEGER=5;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalGFLexer() {;} 
    public InternalGFLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGFLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:11:7: ( '++' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:11:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:12:7: ( '+' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:13:7: ( '!' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:13:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:14:7: ( '*' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:14:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:15:7: ( '**' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:15:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:16:7: ( 'Type' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:16:9: 'Type'
            {
            match("Type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:17:7: ( 'PType' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:17:9: 'PType'
            {
            match("PType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:18:7: ( 'Tok' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:18:9: 'Tok'
            {
            match("Tok"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:19:7: ( 'Str' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:19:9: 'Str'
            {
            match("Str"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:20:7: ( 'Strs' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:20:9: 'Strs'
            {
            match("Strs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:21:7: ( '=' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:22:7: ( ';' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:23:7: ( 'of' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:23:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24:7: ( 'open' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24:9: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:25:7: ( '{' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:26:7: ( '}' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:27:7: ( 'in' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:27:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:28:7: ( ',' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:29:7: ( '(' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:30:7: ( ')' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:31:7: ( ']' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:32:7: ( '[' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:33:7: ( 'cat' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:33:9: 'cat'
            {
            match("cat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:34:7: ( 'fun' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:34:9: 'fun'
            {
            match("fun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:35:7: ( ':' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:35:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:36:7: ( '|' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:36:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:37:7: ( '\\\\' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:37:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:38:7: ( '->' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:38:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:39:7: ( '\\\\\\\\' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:39:9: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:40:7: ( '=>' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:40:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:41:7: ( 'let' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:41:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:42:7: ( 'where' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:42:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:43:7: ( 'table' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:43:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:44:7: ( 'case' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:44:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:45:7: ( 'variants' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:45:9: 'variants'
            {
            match("variants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:46:7: ( 'pre' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:46:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:47:7: ( 'strs' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:47:9: 'strs'
            {
            match("strs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:48:7: ( '#' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:48:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:49:7: ( 'pattern' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:49:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:50:7: ( 'lincat' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:50:9: 'lincat'
            {
            match("lincat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:51:7: ( 'lin' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:51:9: 'lin'
            {
            match("lin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:52:7: ( '.' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:52:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:53:7: ( '>' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:53:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:54:7: ( '@' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:54:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:55:7: ( '-' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:55:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:56:7: ( '~' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:56:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:57:7: ( '<' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:57:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:58:7: ( '$' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:58:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:59:7: ( '/' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:59:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:60:7: ( 'incomplete' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:60:9: 'incomplete'
            {
            match("incomplete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:61:7: ( 'abstract' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:61:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:62:7: ( 'resource' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:62:9: 'resource'
            {
            match("resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:63:7: ( 'interface' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:63:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:64:7: ( 'concrete' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:64:9: 'concrete'
            {
            match("concrete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:65:7: ( 'instance' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:65:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:66:7: ( 'with' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:66:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:67:7: ( 'def' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:67:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:68:7: ( 'data' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:68:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:69:7: ( 'param' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:69:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:70:7: ( 'oper' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:70:9: 'oper'
            {
            match("oper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:71:7: ( 'lindef' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:71:9: 'lindef'
            {
            match("lindef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:72:7: ( 'printname' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:72:9: 'printname'
            {
            match("printname"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:73:7: ( 'flags' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:73:9: 'flags'
            {
            match("flags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:74:7: ( 'overload' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:74:9: 'overload'
            {
            match("overload"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:75:7: ( '?' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:75:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:76:7: ( '_' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:76:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24174:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\'' )* )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24174:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\'' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24174:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\\'' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\''||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:
            	    {
            	    if ( input.LA(1)=='\''||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24176:13: ( '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24176:15: '\"' ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24176:19: ( '\\\\' ( '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24176:20: '\\\\' ( '\"' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24176:36: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24178:14: ( ( '0' .. '9' )+ )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24178:16: ( '0' .. '9' )+
            {
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24178:16: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24178:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( 'e' ( '-' )? ( '0' .. '9' )+ )? )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( 'e' ( '-' )? ( '0' .. '9' )+ )?
            {
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:15: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('.'); 
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:31: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:43: ( 'e' ( '-' )? ( '0' .. '9' )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:44: 'e' ( '-' )? ( '0' .. '9' )+
                    {
                    match('e'); 
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:48: ( '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:48: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:53: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24180:54: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_COMPILER_PRAGMA"
    public final void mRULE_COMPILER_PRAGMA() throws RecognitionException {
        try {
            int _type = RULE_COMPILER_PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:22: ( '--#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:24: '--#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--#"); 

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:30: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:46: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:47: ( '\\r' )? '\\n'
                    {
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:47: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24182:47: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPILER_PRAGMA"

    // $ANTLR start "RULE_GF_DOC"
    public final void mRULE_GF_DOC() throws RecognitionException {
        try {
            int _type = RULE_GF_DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:13: ( ( '--%' | '--:' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:15: ( '--%' | '--:' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:15: ( '--%' | '--:' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='-') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='-') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='%') ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==':') ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:16: '--%'
                    {
                    match("--%"); 


                    }
                    break;
                case 2 :
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:22: '--:'
                    {
                    match("--:"); 


                    }
                    break;

            }

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:29: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:29: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:45: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:46: ( '\\r' )? '\\n'
                    {
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:46: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24184:46: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GF_DOC"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24186:17: ( '{-' ( options {greedy=false; } : . )* '-}' )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24186:19: '{-' ( options {greedy=false; } : . )* '-}'
            {
            match("{-"); 

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24186:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='-') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='}') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='|')||(LA16_1>='~' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=',')||(LA16_0>='.' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24186:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("-}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:41: ( '\\r' )? '\\n'
                    {
                    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24188:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24190:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24190:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24190:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24192:16: ( . )
            // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:24192:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_ID | RULE_STRING | RULE_INTEGER | RULE_DOUBLE | RULE_COMPILER_PRAGMA | RULE_GF_DOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=76;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:406: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:414: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 69 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:426: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 70 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:439: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 71 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:451: RULE_COMPILER_PRAGMA
                {
                mRULE_COMPILER_PRAGMA(); 

                }
                break;
            case 72 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:472: RULE_GF_DOC
                {
                mRULE_GF_DOC(); 

                }
                break;
            case 73 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:484: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:500: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:516: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // ../org.grammaticalframework.eclipse.ui/src-gen/org/grammaticalframework/eclipse/ui/contentassist/antlr/internal/InternalGF.g:1:524: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\61\1\uffff\1\64\3\67\1\73\1\uffff\1\67\1\101\1\uffff"+
        "\1\67\5\uffff\2\67\2\uffff\1\120\1\123\6\67\10\uffff\3\67\1\uffff"+
        "\1\152\1\uffff\1\57\1\154\7\uffff\2\67\1\uffff\2\67\3\uffff\1\164"+
        "\2\67\3\uffff\1\172\5\uffff\4\67\5\uffff\1\u0083\1\uffff\11\67\10"+
        "\uffff\4\67\4\uffff\1\154\2\uffff\1\67\1\u0094\1\67\1\u0097\1\uffff"+
        "\5\67\1\uffff\1\u009e\2\67\1\u00a1\1\67\1\u00a6\2\u00aa\1\uffff"+
        "\1\u00ab\1\u00ae\4\67\1\u00b3\6\67\1\u00ba\1\67\1\u00bc\1\uffff"+
        "\1\67\1\u00be\1\uffff\1\u00bf\1\u00c0\4\67\1\uffff\1\u00c5\1\67"+
        "\1\uffff\1\67\1\u00a6\3\uffff\1\u00aa\4\uffff\2\67\1\uffff\1\67"+
        "\1\u00cb\2\67\1\uffff\3\67\1\u00d1\2\67\1\uffff\1\u00d4\1\uffff"+
        "\1\u00d5\3\uffff\4\67\1\uffff\1\67\1\u00db\2\67\1\u00de\1\uffff"+
        "\1\u00df\3\67\1\u00e3\1\uffff\2\67\2\uffff\5\67\1\uffff\1\u00eb"+
        "\1\u00ec\2\uffff\3\67\1\uffff\7\67\2\uffff\2\67\1\u00f9\2\67\1\u00fc"+
        "\2\67\1\u00ff\1\u0100\1\u0101\1\67\1\uffff\1\u0103\1\u0104\1\uffff"+
        "\1\67\1\u0106\3\uffff\1\u0107\2\uffff\1\u0108\3\uffff";
    static final String DFA21_eofS =
        "\u0109\uffff";
    static final String DFA21_minS =
        "\1\0\1\53\1\uffff\1\52\1\157\1\124\1\164\1\76\1\uffff\1\146\1\55"+
        "\1\uffff\1\156\5\uffff\1\141\1\154\2\uffff\1\134\1\55\1\145\1\150"+
        "\3\141\1\164\10\uffff\1\142\1\145\1\141\1\uffff\1\47\1\uffff\1\0"+
        "\1\56\7\uffff\1\160\1\153\1\uffff\1\171\1\162\3\uffff\1\47\2\145"+
        "\3\uffff\1\47\5\uffff\1\163\2\156\1\141\5\uffff\1\43\1\uffff\1\164"+
        "\1\156\1\145\1\164\1\142\1\162\1\145\2\162\10\uffff\2\163\1\146"+
        "\1\164\4\uffff\1\56\2\uffff\1\145\1\47\1\160\1\47\1\uffff\1\156"+
        "\1\162\1\157\1\145\1\164\1\uffff\1\47\1\145\1\143\1\47\1\147\3\0"+
        "\1\uffff\2\47\1\162\1\150\1\154\1\151\1\47\1\156\1\164\1\141\1\163"+
        "\1\164\1\157\1\47\1\141\1\47\1\uffff\1\145\1\47\1\uffff\2\47\1\154"+
        "\1\155\1\162\1\141\1\uffff\1\47\1\162\1\uffff\1\163\1\0\1\12\2\uffff"+
        "\1\0\1\12\3\uffff\1\141\1\145\1\uffff\1\145\1\47\1\145\1\141\1\uffff"+
        "\1\164\1\145\1\155\1\47\1\162\1\165\1\uffff\1\47\1\uffff\1\47\3"+
        "\uffff\1\157\1\160\1\146\1\156\1\uffff\1\145\1\47\1\164\1\146\1"+
        "\47\1\uffff\1\47\2\156\1\162\1\47\1\uffff\1\141\1\162\2\uffff\1"+
        "\141\1\154\1\141\1\143\1\164\1\uffff\2\47\2\uffff\1\164\1\141\1"+
        "\156\1\uffff\2\143\1\144\1\145\1\143\2\145\2\uffff\1\163\1\155\1"+
        "\47\1\164\1\145\1\47\1\164\1\145\3\47\1\145\1\uffff\2\47\1\uffff"+
        "\1\145\1\47\3\uffff\1\47\2\uffff\1\47\3\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\53\1\uffff\1\52\1\171\1\124\1\164\1\76\1\uffff\1\166"+
        "\1\55\1\uffff\1\156\5\uffff\1\157\1\165\2\uffff\1\134\1\76\2\151"+
        "\2\141\1\162\1\164\10\uffff\1\142\2\145\1\uffff\1\172\1\uffff\1"+
        "\uffff\1\71\7\uffff\1\160\1\153\1\uffff\1\171\1\162\3\uffff\1\172"+
        "\2\145\3\uffff\1\172\5\uffff\1\164\2\156\1\141\5\uffff\1\72\1\uffff"+
        "\1\164\1\156\1\145\1\164\1\142\1\162\1\151\1\164\1\162\10\uffff"+
        "\2\163\1\146\1\164\4\uffff\1\71\2\uffff\1\145\1\172\1\160\1\172"+
        "\1\uffff\2\162\1\157\1\145\1\164\1\uffff\1\172\1\145\1\143\1\172"+
        "\1\147\3\uffff\1\uffff\2\172\1\162\1\150\1\154\1\151\1\172\1\156"+
        "\1\164\1\141\1\163\1\164\1\157\1\172\1\141\1\172\1\uffff\1\145\1"+
        "\172\1\uffff\2\172\1\154\1\155\1\162\1\141\1\uffff\1\172\1\162\1"+
        "\uffff\1\163\1\uffff\1\12\2\uffff\1\uffff\1\12\3\uffff\1\141\1\145"+
        "\1\uffff\1\145\1\172\1\145\1\141\1\uffff\1\164\1\145\1\155\1\172"+
        "\1\162\1\165\1\uffff\1\172\1\uffff\1\172\3\uffff\1\157\1\160\1\146"+
        "\1\156\1\uffff\1\145\1\172\1\164\1\146\1\172\1\uffff\1\172\2\156"+
        "\1\162\1\172\1\uffff\1\141\1\162\2\uffff\1\141\1\154\1\141\1\143"+
        "\1\164\1\uffff\2\172\2\uffff\1\164\1\141\1\156\1\uffff\2\143\1\144"+
        "\1\145\1\143\2\145\2\uffff\1\163\1\155\1\172\1\164\1\145\1\172\1"+
        "\164\1\145\3\172\1\145\1\uffff\2\172\1\uffff\1\145\1\172\3\uffff"+
        "\1\172\2\uffff\1\172\3\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\3\5\uffff\1\14\2\uffff\1\20\1\uffff\1\22\1\23\1\24\1"+
        "\25\1\26\2\uffff\1\31\1\32\10\uffff\1\46\1\52\1\53\1\54\1\56\1\57"+
        "\1\60\1\61\3\uffff\1\101\1\uffff\1\103\2\uffff\1\113\1\114\1\1\1"+
        "\2\1\3\1\5\1\4\2\uffff\1\103\2\uffff\1\36\1\13\1\14\3\uffff\1\111"+
        "\1\17\1\20\1\uffff\1\22\1\23\1\24\1\25\1\26\4\uffff\1\31\1\32\1"+
        "\35\1\33\1\34\1\uffff\1\55\11\uffff\1\46\1\52\1\53\1\54\1\56\1\57"+
        "\1\60\1\61\4\uffff\1\101\1\102\1\104\1\105\1\uffff\1\106\1\113\4"+
        "\uffff\1\15\5\uffff\1\21\10\uffff\1\112\20\uffff\1\10\2\uffff\1"+
        "\11\6\uffff\1\27\2\uffff\1\30\3\uffff\2\107\2\uffff\2\110\1\37\2"+
        "\uffff\1\51\4\uffff\1\44\6\uffff\1\71\1\uffff\1\6\1\uffff\1\12\1"+
        "\16\1\74\4\uffff\1\42\5\uffff\1\70\5\uffff\1\45\2\uffff\1\72\1\7"+
        "\5\uffff\1\77\2\uffff\1\40\1\41\3\uffff\1\73\7\uffff\1\50\1\75\14"+
        "\uffff\1\47\2\uffff\1\100\2\uffff\1\67\1\66\1\43\1\uffff\1\63\1"+
        "\64\1\uffff\1\65\1\76\1\62";
    static final String DFA21_specialS =
        "\1\4\53\uffff\1\6\123\uffff\1\2\1\1\1\0\40\uffff\1\3\3\uffff\1\5"+
        "\141\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\2\1\54\1\36\1\44\3\57\1\16"+
            "\1\17\1\3\1\1\1\15\1\27\1\37\1\45\12\55\1\24\1\10\1\43\1\7\1"+
            "\40\1\51\1\41\17\53\1\5\2\53\1\6\1\4\6\53\1\21\1\26\1\20\1\57"+
            "\1\52\1\57\1\46\1\53\1\22\1\50\1\53\1\23\2\53\1\14\2\53\1\30"+
            "\2\53\1\11\1\34\1\53\1\47\1\35\1\32\1\53\1\33\1\31\3\53\1\12"+
            "\1\25\1\13\1\42\uff81\57",
            "\1\60",
            "",
            "\1\63",
            "\1\66\11\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\1\75\11\uffff\1\76\5\uffff\1\77",
            "\1\100",
            "",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "\1\111\15\uffff\1\112",
            "\1\114\10\uffff\1\113",
            "",
            "",
            "\1\117",
            "\1\122\20\uffff\1\121",
            "\1\124\3\uffff\1\125",
            "\1\126\1\127",
            "\1\130",
            "\1\131",
            "\1\133\20\uffff\1\132",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\150\3\uffff\1\147",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\0\153",
            "\1\156\1\uffff\12\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "",
            "",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67"+
            "\1\167\17\67\1\171\1\170\6\67",
            "",
            "",
            "",
            "",
            "",
            "\1\174\1\173",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080\1\uffff\1\u0081\24\uffff\1\u0082",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\3\uffff\1\u008b",
            "\1\u008d\1\uffff\1\u008c",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "\1\156\1\uffff\12\155",
            "",
            "",
            "\1\u0093",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u0095",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22"+
            "\67\1\u0096\7\67",
            "",
            "\1\u0098\3\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u009f",
            "\1\u00a0",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00a2",
            "\12\u00a3\1\u00a5\2\u00a3\1\u00a4\ufff2\u00a3",
            "\12\u00a7\1\u00a9\2\u00a7\1\u00a8\ufff2\u00a7",
            "\12\u00a7\1\u00a9\2\u00a7\1\u00a8\ufff2\u00a7",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67"+
            "\1\u00ac\1\u00ad\26\67",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00bb",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\1\u00bd",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\12\u00a3\1\u00a5\2\u00a3\1\u00a4\ufff2\u00a3",
            "\1\u00a5",
            "",
            "",
            "\12\u00a7\1\u00a9\2\u00a7\1\u00a8\ufff2\u00a7",
            "\1\u00a9",
            "",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00dc",
            "\1\u00dd",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00fa",
            "\1\u00fb",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u00fd",
            "\1\u00fe",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\u0102",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "\1\u0105",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "",
            "\1\67\10\uffff\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32"+
            "\67",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_ID | RULE_STRING | RULE_INTEGER | RULE_DOUBLE | RULE_COMPILER_PRAGMA | RULE_GF_DOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_130 = input.LA(1);

                        s = -1;
                        if ( (LA21_130=='\r') ) {s = 168;}

                        else if ( (LA21_130=='\n') ) {s = 169;}

                        else if ( ((LA21_130>='\u0000' && LA21_130<='\t')||(LA21_130>='\u000B' && LA21_130<='\f')||(LA21_130>='\u000E' && LA21_130<='\uFFFF')) ) {s = 167;}

                        else s = 170;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_129 = input.LA(1);

                        s = -1;
                        if ( ((LA21_129>='\u0000' && LA21_129<='\t')||(LA21_129>='\u000B' && LA21_129<='\f')||(LA21_129>='\u000E' && LA21_129<='\uFFFF')) ) {s = 167;}

                        else if ( (LA21_129=='\r') ) {s = 168;}

                        else if ( (LA21_129=='\n') ) {s = 169;}

                        else s = 170;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_128 = input.LA(1);

                        s = -1;
                        if ( ((LA21_128>='\u0000' && LA21_128<='\t')||(LA21_128>='\u000B' && LA21_128<='\f')||(LA21_128>='\u000E' && LA21_128<='\uFFFF')) ) {s = 163;}

                        else if ( (LA21_128=='\r') ) {s = 164;}

                        else if ( (LA21_128=='\n') ) {s = 165;}

                        else s = 166;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_163 = input.LA(1);

                        s = -1;
                        if ( (LA21_163=='\r') ) {s = 164;}

                        else if ( (LA21_163=='\n') ) {s = 165;}

                        else if ( ((LA21_163>='\u0000' && LA21_163<='\t')||(LA21_163>='\u000B' && LA21_163<='\f')||(LA21_163>='\u000E' && LA21_163<='\uFFFF')) ) {s = 163;}

                        else s = 166;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='+') ) {s = 1;}

                        else if ( (LA21_0=='!') ) {s = 2;}

                        else if ( (LA21_0=='*') ) {s = 3;}

                        else if ( (LA21_0=='T') ) {s = 4;}

                        else if ( (LA21_0=='P') ) {s = 5;}

                        else if ( (LA21_0=='S') ) {s = 6;}

                        else if ( (LA21_0=='=') ) {s = 7;}

                        else if ( (LA21_0==';') ) {s = 8;}

                        else if ( (LA21_0=='o') ) {s = 9;}

                        else if ( (LA21_0=='{') ) {s = 10;}

                        else if ( (LA21_0=='}') ) {s = 11;}

                        else if ( (LA21_0=='i') ) {s = 12;}

                        else if ( (LA21_0==',') ) {s = 13;}

                        else if ( (LA21_0=='(') ) {s = 14;}

                        else if ( (LA21_0==')') ) {s = 15;}

                        else if ( (LA21_0==']') ) {s = 16;}

                        else if ( (LA21_0=='[') ) {s = 17;}

                        else if ( (LA21_0=='c') ) {s = 18;}

                        else if ( (LA21_0=='f') ) {s = 19;}

                        else if ( (LA21_0==':') ) {s = 20;}

                        else if ( (LA21_0=='|') ) {s = 21;}

                        else if ( (LA21_0=='\\') ) {s = 22;}

                        else if ( (LA21_0=='-') ) {s = 23;}

                        else if ( (LA21_0=='l') ) {s = 24;}

                        else if ( (LA21_0=='w') ) {s = 25;}

                        else if ( (LA21_0=='t') ) {s = 26;}

                        else if ( (LA21_0=='v') ) {s = 27;}

                        else if ( (LA21_0=='p') ) {s = 28;}

                        else if ( (LA21_0=='s') ) {s = 29;}

                        else if ( (LA21_0=='#') ) {s = 30;}

                        else if ( (LA21_0=='.') ) {s = 31;}

                        else if ( (LA21_0=='>') ) {s = 32;}

                        else if ( (LA21_0=='@') ) {s = 33;}

                        else if ( (LA21_0=='~') ) {s = 34;}

                        else if ( (LA21_0=='<') ) {s = 35;}

                        else if ( (LA21_0=='$') ) {s = 36;}

                        else if ( (LA21_0=='/') ) {s = 37;}

                        else if ( (LA21_0=='a') ) {s = 38;}

                        else if ( (LA21_0=='r') ) {s = 39;}

                        else if ( (LA21_0=='d') ) {s = 40;}

                        else if ( (LA21_0=='?') ) {s = 41;}

                        else if ( (LA21_0=='_') ) {s = 42;}

                        else if ( ((LA21_0>='A' && LA21_0<='O')||(LA21_0>='Q' && LA21_0<='R')||(LA21_0>='U' && LA21_0<='Z')||LA21_0=='b'||LA21_0=='e'||(LA21_0>='g' && LA21_0<='h')||(LA21_0>='j' && LA21_0<='k')||(LA21_0>='m' && LA21_0<='n')||LA21_0=='q'||LA21_0=='u'||(LA21_0>='x' && LA21_0<='z')) ) {s = 43;}

                        else if ( (LA21_0=='\"') ) {s = 44;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 45;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 46;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='%' && LA21_0<='\'')||LA21_0=='^'||LA21_0=='`'||(LA21_0>='\u007F' && LA21_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_167 = input.LA(1);

                        s = -1;
                        if ( (LA21_167=='\r') ) {s = 168;}

                        else if ( (LA21_167=='\n') ) {s = 169;}

                        else if ( ((LA21_167>='\u0000' && LA21_167<='\t')||(LA21_167>='\u000B' && LA21_167<='\f')||(LA21_167>='\u000E' && LA21_167<='\uFFFF')) ) {s = 167;}

                        else s = 170;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_44 = input.LA(1);

                        s = -1;
                        if ( ((LA21_44>='\u0000' && LA21_44<='\uFFFF')) ) {s = 107;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}