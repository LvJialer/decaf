//### This file created by BYACC 1.8(/Java extension  1.13)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//###           14 Sep 06  -- Keltin Leung-- ReduceListener support, eliminate underflow report in error recovery
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 11 "Parser.y"
package decaf.frontend;

import decaf.tree.Tree;
import decaf.tree.Tree.*;
import decaf.error.*;
import java.util.*;
//#line 25 "Parser.java"
interface ReduceListener {
  public boolean onReduce(String rule);
}




public class Parser
             extends BaseParser
             implements ReduceListener
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

ReduceListener reduceListener = null;
void yyclearin ()       {yychar = (-1);}
void yyerrok ()         {yyerrflag=0;}
void addReduceListener(ReduceListener l) {
  reduceListener = l;}


//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//## **user defined:SemValue
String   yytext;//user variable to return contextual strings
SemValue yyval; //used to return semantic vals from action routines
SemValue yylval;//the 'lval' (result) I got from yylex()
SemValue valstk[] = new SemValue[YYSTACKSIZE];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
final void val_init()
{
  yyval=new SemValue();
  yylval=new SemValue();
  valptr=-1;
}
final void val_push(SemValue val)
{
  try {
    valptr++;
    valstk[valptr]=val;
  }
  catch (ArrayIndexOutOfBoundsException e) {
    int oldsize = valstk.length;
    int newsize = oldsize*2;
    SemValue[] newstack = new SemValue[newsize];
    System.arraycopy(valstk,0,newstack,0,oldsize);
    valstk = newstack;
    valstk[valptr]=val;
  }
}
final SemValue val_pop()
{
  return valstk[valptr--];
}
final void val_drop(int cnt)
{
  valptr -= cnt;
}
final SemValue val_peek(int relative)
{
  return valstk[valptr-relative];
}
//#### end semantic value section ####
public final static short VOID=257;
public final static short BOOL=258;
public final static short INT=259;
public final static short STRING=260;
public final static short COMPLEX=261;
public final static short CLASS=262;
public final static short NULL=263;
public final static short EXTENDS=264;
public final static short THIS=265;
public final static short WHILE=266;
public final static short FOR=267;
public final static short IF=268;
public final static short ELSE=269;
public final static short RETURN=270;
public final static short BREAK=271;
public final static short NEW=272;
public final static short PRINT=273;
public final static short READ_INTEGER=274;
public final static short READ_LINE=275;
public final static short PRINTCOMP=276;
public final static short LITERAL=277;
public final static short IDENTIFIER=278;
public final static short AND=279;
public final static short OR=280;
public final static short STATIC=281;
public final static short INSTANCEOF=282;
public final static short LESS_EQUAL=283;
public final static short GREATER_EQUAL=284;
public final static short EQUAL=285;
public final static short NOT_EQUAL=286;
public final static short CASE=287;
public final static short DEFAULT=288;
public final static short SUPER=289;
public final static short DCOPY=290;
public final static short SCOPY=291;
public final static short DO=292;
public final static short OD=293;
public final static short DOOR=294;
public final static short UMINUS=295;
public final static short EMPTY=296;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    3,    4,    5,    5,    5,    5,    5,
    5,    5,    2,    6,    6,    7,    7,    7,    9,    9,
   10,   10,    8,    8,   11,   12,   12,   13,   13,   13,
   13,   13,   13,   13,   13,   13,   13,   13,   22,   23,
   23,   25,   24,   14,   14,   14,   29,   29,   27,   27,
   28,   26,   26,   26,   26,   26,   26,   26,   26,   26,
   26,   26,   26,   26,   26,   26,   26,   26,   26,   26,
   26,   26,   26,   26,   26,   26,   26,   26,   26,   26,
   26,   26,   26,   26,   32,   33,   33,   35,   34,   31,
   31,   30,   30,   36,   36,   16,   17,   21,   15,   37,
   37,   18,   18,   19,   20,
};
final static short yylen[] = {                            2,
    1,    2,    1,    2,    2,    1,    1,    1,    1,    1,
    2,    3,    6,    2,    0,    2,    2,    0,    1,    0,
    3,    1,    7,    6,    3,    2,    0,    1,    2,    1,
    1,    1,    2,    2,    2,    2,    1,    2,    4,    2,
    0,    2,    3,    3,    1,    0,    2,    0,    2,    4,
    5,    1,    1,    1,    3,    3,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    3,    3,    2,    2,
    2,    2,    2,    3,    3,    1,    1,    4,    5,    6,
    5,    7,    4,    4,    2,    2,    0,    4,    4,    1,
    1,    1,    0,    3,    1,    5,    9,    1,    6,    2,
    0,    2,    1,    4,    4,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    3,    0,    2,    0,    0,   14,   18,
    0,    7,    8,    6,    9,   10,    0,    0,   13,   16,
    0,    0,   17,   11,    0,    4,    0,    0,    0,    0,
   12,    0,   22,    0,    0,    0,    0,    5,    0,    0,
    0,   27,   24,   21,   23,    0,   91,   76,    0,    0,
    0,    0,   98,    0,    0,    0,    0,    0,   90,    0,
    0,   77,    0,    0,   41,    0,    0,    0,    0,    0,
    0,   25,   28,   37,   26,    0,   30,   31,   32,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   54,    0,
    0,    0,    0,   52,   53,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   29,   33,   34,   35,   36,   38,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   47,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   74,   75,    0,    0,    0,    0,    0,
    0,   40,    0,    0,   68,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   78,    0,    0,  104,  105,    0,
    0,   83,   84,   39,   42,    0,    0,   50,    0,    0,
   96,    0,    0,   79,    0,    0,   87,   43,   81,   51,
    0,    0,   99,   80,    0,    0,    0,  100,   82,    0,
    0,   85,   86,    0,    0,    0,   97,    0,    0,   88,
   89,
};
final static short yydgoto[] = {                          2,
    3,    4,   73,   21,   34,    8,   11,   23,   35,   36,
   74,   46,   75,   76,   77,   78,   79,   80,   81,   82,
   83,   84,  106,  151,  152,   85,   94,   95,   88,  189,
   89,  205,  206,  212,  213,  143,  203,
};
final static short yysindex[] = {                      -219,
 -225,    0, -219,    0, -200,    0, -212,  -52,    0,    0,
 -105,    0,    0,    0,    0,    0, -198,  -80,    0,    0,
   26,  -85,    0,    0,  -74,    0,   47,    1,   48,  -80,
    0,  -80,    0,  -73,   55,   45,   58,    0,  -22,  -80,
  -22,    0,    0,    0,    0,    5,    0,    0,   64,   66,
   74,  102,    0, -149,   76,   80,   81,   83,    0,   84,
   85,    0,   91,   92,    0,  102,  102,  102,  102,  102,
   62,    0,    0,    0,    0,   75,    0,    0,    0,   77,
   86,   89,   90,   99,  935,   72,    0, -139,    0,  102,
  102,  102,  935,    0,    0,  100,   50,  102,  103,  109,
  102,  102,  102,  102,  102,  102,  -24,  -24,  -24,  -24,
  -24, -135,  517,    0,    0,    0,    0,    0,    0,  102,
  102,  102,  102,  102,  102,  102,  102,  102,  102,  102,
  102,  102,    0,  102,  102,  111,  543,  101,  554,  118,
   82,  935,   16,    0,    0,   21,  584,  610,  744,  770,
 -210,    0,  813,  120,    0, 1021,  997,    9,    9,  -32,
  -32,    2,    2,  -24,  -24,  -24,    9,    9,  837,  935,
  102,   41,  102,   41,    0,  863,  102,    0,    0, -116,
   42,    0,    0,    0,    0,   41,  102,    0,  133,  139,
    0,  874,  -78,    0,  935,  148,    0,    0,    0,    0,
  102,   41,    0,    0,   67, -230,  158,    0,    0,  143,
  144,    0,    0,   41,  102,  102,    0,  898,  924,    0,
    0,
};
final static short yyrindex[] = {                         0,
    0,    0,  203,    0,   87,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  147,    0,    0,  166,
    0,  166,    0,    0,    0,  167,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -58,    0,    0,    0,    0,
    0,  -55,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -69,  -69,  -69,  -69,  -69,
  -69,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  956,  491,    0,    0,  -69,
  -58,  -69,  155,    0,    0,    0,    0,  -69,    0,    0,
  -69,  -69,  -69,  -69,  -69,  -69,  153,  357,  383,  410,
  419,    0,    0,    0,    0,    0,    0,    0,    0,  -69,
  -69,  -69,  -69,  -69,  -69,  -69,  -69,  -69,  -69,  -69,
  -69,  -69,    0,  -69,  -69,  126,    0,    0,    0,    0,
  -69,   29,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  932,  -25,  566,  978, 1131,
 1158, 1046, 1070,  446,  455,  482, 1092, 1129,    0,  -17,
   -9,  -58,  -69,  -58,    0,    0,  -69,    0,    0,    0,
    0,    0,    0,    0,    0,  -58,  -69,    0,    0,  175,
    0,    0,  -33,    0,   38,    0,    0,    0,    0,    0,
   -4,  -58,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -58,  -69,  -69,    0,    0,    0,    0,
    0,
};
final static short yygindex[] = {                         0,
    0,  215,  210,   -5,   18,    0,    0,    0,  190,    0,
  -18,    0, -111,  -82,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0, 1299,  541, 1073,    0,    0,
    0,    0,    0,    0,    0,  -93,    0,
};
final static int YYTABLESIZE=1515;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        101,
   46,  101,  101,  103,  130,   28,  101,  146,  138,  128,
  126,  101,  127,  133,  129,   67,   28,   28,   67,   19,
   43,  133,   45,   44,   33,  101,   33,  132,   22,  131,
  101,   93,   67,   67,   44,   25,   46,   67,  130,   70,
   69,   44,    1,  128,   71,  130,  210,  133,  129,   66,
  128,  126,    5,  127,  133,  129,  178,  211,  134,  177,
  191,  179,  193,    7,  177,    9,  134,   67,   68,   95,
   10,   97,   95,   67,  198,   70,   69,  190,   94,   24,
   71,   94,  184,  185,   26,   66,   30,   32,   40,  101,
  208,  101,  134,   31,   67,   39,   70,   69,   41,  134,
   42,   71,  217,   90,   68,   91,   66,   12,   13,   14,
   15,   16,   17,   92,   67,   98,   70,   69,  207,   99,
  100,   71,  101,  102,  103,   68,   66,   42,   96,   72,
  104,  105,  135,  114,   67,  115,   70,   69,  136,  140,
  141,   71,  154,  144,  116,   68,   66,  117,  118,  145,
  171,   12,   13,   14,   15,   16,   17,  119,  175,  173,
  187,  196,   49,   42,  197,   68,   49,   49,   49,   49,
   49,   49,   49,  200,   31,   18,   12,   13,   14,   15,
   16,   17,  177,   49,   49,   49,   49,   49,  204,   69,
  202,  209,   27,   69,   69,   69,   69,   69,  214,   69,
  215,  216,    1,   29,   38,    5,   20,   19,   48,   15,
   69,   69,   69,  102,   69,   92,   49,    6,   49,   48,
   20,   37,   48,  101,  101,  101,  101,  101,  101,  101,
    0,  101,  101,  101,  101,    0,  101,  101,  101,  101,
  101,  101,  101,  101,  101,   69,    0,    0,  101,    0,
  122,  123,    0,  101,   67,  101,  101,  101,  101,  101,
  101,   12,   13,   14,   15,   16,   17,   47,   48,   48,
   49,   50,   51,   48,   52,   53,   54,   55,   56,   57,
   58,   59,    0,    0,    0,    0,   60,    0,    0,    0,
    0,   61,    0,   62,   63,   64,   65,   12,   13,   14,
   15,   16,   17,   47,    0,   48,   49,   50,   51,    0,
   52,   53,   54,   55,   56,   57,   58,   59,    0,    0,
    0,    0,   60,  112,   47,    0,   48,   61,    0,   62,
   63,   64,   65,   54,    0,   56,   57,    0,   59,    0,
    0,    0,    0,   60,   47,    0,   48,    0,   61,    0,
   62,   63,   64,   54,    0,   56,   57,    0,   59,    0,
    0,    0,    0,   60,   47,    0,   48,    0,   61,    0,
   62,   63,   64,   54,    0,   56,   57,    0,   59,    0,
    0,    0,    0,   60,    0,    0,    0,    0,   61,    0,
   62,   63,   64,   70,    0,    0,    0,   70,   70,   70,
   70,   70,    0,   70,   49,   49,    0,    0,   49,   49,
   49,   49,    0,    0,   70,   70,   70,    0,   70,   71,
    0,    0,    0,   71,   71,   71,   71,   71,    0,   71,
    0,   69,   69,    0,    0,   69,   69,   69,   69,    0,
   71,   71,   71,    0,   71,    0,   72,    0,    0,   70,
   72,   72,   72,   72,   72,   73,   72,    0,    0,   73,
   73,   73,   73,   73,    0,   73,    0,   72,   72,   72,
    0,   72,    0,    0,    0,   71,   73,   73,   73,    0,
   73,    0,   57,    0,    0,    0,   57,   57,   57,   57,
   57,   58,   57,    0,    0,   58,   58,   58,   58,   58,
    0,   58,   72,   57,   57,   57,    0,   57,    0,    0,
    0,   73,   58,   58,   58,    0,   58,    0,   59,    0,
    0,    0,   59,   59,   59,   59,   59,   53,   59,    0,
    0,   45,   53,   53,    0,   53,   53,   53,   57,   59,
   59,   59,    0,   59,    0,    0,    0,   58,    0,   45,
   53,    0,   53,  130,    0,    0,    0,  155,  128,  126,
    0,  127,  133,  129,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   59,    0,  132,    0,  131,  130,
    0,   53,    0,  172,  128,  126,   86,  127,  133,  129,
  130,    0,    0,    0,  174,  128,  126,    0,  127,  133,
  129,    0,  132,    0,  131,    0,   64,  134,    0,   64,
    0,    0,    0,  132,    0,  131,    0,    0,    0,    0,
  130,    0,    0,   64,   64,  128,  126,  180,  127,  133,
  129,   86,    0,  134,    0,   70,   70,    0,    0,   70,
   70,   70,   70,  132,  134,  131,  130,    0,    0,    0,
  181,  128,  126,    0,  127,  133,  129,    0,   64,    0,
    0,   71,   71,    0,    0,   71,   71,   71,   71,  132,
    0,  131,    0,    0,  134,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   72,   72,
    0,    0,   72,   72,   72,   72,    0,   73,   73,    0,
  134,   73,   73,   73,   73,    0,    0,    0,    0,    0,
    0,    0,   86,    0,   86,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   57,   57,   86,    0,   57,   57,
   57,   57,    0,   58,   58,    0,    0,   58,   58,   58,
   58,   86,   86,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   86,    0,    0,    0,    0,    0,
   59,   59,    0,    0,   59,   59,   59,   59,    0,   53,
   53,    0,    0,   53,   53,   53,   53,    0,    0,    0,
  130,    0,    0,    0,  182,  128,  126,    0,  127,  133,
  129,    0,    0,    0,    0,  120,  121,    0,    0,  122,
  123,  124,  125,  132,    0,  131,  130,    0,    0,    0,
  183,  128,  126,    0,  127,  133,  129,    0,    0,    0,
    0,  120,  121,    0,    0,  122,  123,  124,  125,  132,
    0,  131,  120,  121,  134,    0,  122,  123,  124,  125,
    0,    0,    0,    0,   64,   64,    0,    0,    0,  130,
   64,   64,    0,    0,  128,  126,    0,  127,  133,  129,
  134,    0,  120,  121,    0,    0,  122,  123,  124,  125,
  186,    0,  132,  130,  131,    0,    0,    0,  128,  126,
    0,  127,  133,  129,    0,    0,    0,    0,  120,  121,
    0,    0,  122,  123,  124,  125,  132,    0,  131,  130,
    0,    0,    0,  134,  128,  126,    0,  127,  133,  129,
  130,    0,    0,    0,    0,  128,  126,    0,  127,  133,
  129,    0,  132,    0,  131,    0,    0,  134,    0,  188,
    0,    0,  201,  132,  130,  131,    0,    0,    0,  128,
  126,    0,  127,  133,  129,    0,    0,    0,    0,    0,
    0,    0,    0,  134,    0,  194,  220,  132,    0,  131,
  130,    0,    0,    0,  134,  128,  126,    0,  127,  133,
  129,  130,   66,    0,    0,   66,  128,  126,    0,  127,
  133,  129,  221,  132,    0,  131,    0,    0,  134,   66,
   66,    0,   52,    0,  132,    0,  131,   52,   52,    0,
   52,   52,   52,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  134,   52,    0,   52,   65,    0,
    0,   65,  120,  121,   66,  134,  122,  123,  124,  125,
    0,    0,    0,  130,    0,   65,   65,    0,  128,  126,
    0,  127,  133,  129,    0,    0,   52,    0,  120,  121,
    0,    0,  122,  123,  124,  125,  132,  130,  131,    0,
    0,    0,  128,  126,    0,  127,  133,  129,    0,    0,
   65,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  132,    0,  131,    0,    0,    0,   55,  134,   55,   55,
   55,  120,  121,    0,    0,  122,  123,  124,  125,    0,
    0,    0,    0,   55,   55,   55,    0,   55,    0,    0,
   56,  134,   56,   56,   56,  120,  121,    0,   87,  122,
  123,  124,  125,    0,    0,    0,    0,   56,   56,   56,
    0,   56,   63,    0,    0,   63,    0,    0,   55,    0,
    0,  120,  121,    0,    0,  122,  123,  124,  125,   63,
   63,    0,  120,  121,    0,    0,  122,  123,  124,  125,
    0,    0,   56,   87,    0,    0,    0,    0,    0,   62,
    0,   60,   62,    0,   60,    0,  120,  121,    0,    0,
  122,  123,  124,  125,   63,    0,   62,   62,   60,   60,
    0,    0,    0,    0,    0,    0,    0,    0,   61,    0,
    0,   61,  120,  121,    0,    0,  122,  123,  124,  125,
   66,   66,    0,  120,  121,   61,   61,  122,  123,  124,
  125,   62,    0,   60,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   52,   52,    0,    0,   52,   52,
   52,   52,    0,    0,   87,    0,   87,    0,    0,    0,
   61,    0,    0,    0,    0,    0,   65,   65,   87,    0,
    0,    0,   65,   65,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   87,   87,  120,    0,    0,    0,  122,
  123,  124,  125,    0,    0,    0,   87,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  122,  123,  124,  125,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   55,   55,    0,    0,   55,   55,
   55,   55,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   56,   56,
   93,    0,   56,   56,   56,   56,    0,    0,    0,    0,
    0,    0,    0,    0,  107,  108,  109,  110,  111,  113,
   63,   63,    0,    0,    0,    0,   63,   63,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  137,    0,
  139,    0,    0,    0,    0,    0,  142,    0,    0,  142,
  147,  148,  149,  150,  153,    0,    0,   62,   62,   60,
   60,    0,    0,   62,   62,    0,    0,    0,  156,  157,
  158,  159,  160,  161,  162,  163,  164,  165,  166,  167,
  168,    0,  169,  170,    0,    0,   61,   61,    0,  176,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  142,
    0,  192,    0,    0,    0,  195,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  199,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  218,  219,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         33,
   59,   35,   36,   59,   37,   91,   40,  101,   91,   42,
   43,   45,   45,   46,   47,   41,   91,   91,   44,  125,
   39,   46,   41,   41,   30,   59,   32,   60,   11,   62,
   64,   41,   58,   59,   40,   18,   41,   33,   37,   35,
   36,   59,  262,   42,   40,   37,  277,   46,   47,   45,
   42,   43,  278,   45,   46,   47,   41,  288,   91,   44,
  172,   41,  174,  264,   44,  278,   91,   93,   64,   41,
  123,   54,   44,   33,  186,   35,   36,  171,   41,  278,
   40,   44,  293,  294,   59,   45,   40,   40,   44,  123,
  202,  125,   91,   93,   33,   41,   35,   36,   41,   91,
  123,   40,  214,   40,   64,   40,   45,  257,  258,  259,
  260,  261,  262,   40,   33,   40,   35,   36,  201,   40,
   40,   40,   40,   40,   40,   64,   45,  123,  278,  125,
   40,   40,   61,   59,   33,   59,   35,   36,  278,   40,
   91,   40,  278,   41,   59,   64,   45,   59,   59,   41,
   40,  257,  258,  259,  260,  261,  262,   59,   41,   59,
   41,  278,   37,  123,  123,   64,   41,   42,   43,   44,
   45,   46,   47,   41,   93,  281,  257,  258,  259,  260,
  261,  262,   44,   58,   59,   60,   61,   62,   41,   37,
  269,  125,  278,   41,   42,   43,   44,   45,   41,   47,
   58,   58,    0,  278,  278,   59,   41,   41,  278,  123,
   58,   59,   60,   59,   62,   41,   91,    3,   93,  278,
   11,   32,  278,  257,  258,  259,  260,  261,  262,  263,
   -1,  265,  266,  267,  268,   -1,  270,  271,  272,  273,
  274,  275,  276,  277,  278,   93,   -1,   -1,  282,   -1,
  283,  284,   -1,  287,  280,  289,  290,  291,  292,  293,
  294,  257,  258,  259,  260,  261,  262,  263,  278,  265,
  266,  267,  268,  278,  270,  271,  272,  273,  274,  275,
  276,  277,   -1,   -1,   -1,   -1,  282,   -1,   -1,   -1,
   -1,  287,   -1,  289,  290,  291,  292,  257,  258,  259,
  260,  261,  262,  263,   -1,  265,  266,  267,  268,   -1,
  270,  271,  272,  273,  274,  275,  276,  277,   -1,   -1,
   -1,   -1,  282,  262,  263,   -1,  265,  287,   -1,  289,
  290,  291,  292,  272,   -1,  274,  275,   -1,  277,   -1,
   -1,   -1,   -1,  282,  263,   -1,  265,   -1,  287,   -1,
  289,  290,  291,  272,   -1,  274,  275,   -1,  277,   -1,
   -1,   -1,   -1,  282,  263,   -1,  265,   -1,  287,   -1,
  289,  290,  291,  272,   -1,  274,  275,   -1,  277,   -1,
   -1,   -1,   -1,  282,   -1,   -1,   -1,   -1,  287,   -1,
  289,  290,  291,   37,   -1,   -1,   -1,   41,   42,   43,
   44,   45,   -1,   47,  279,  280,   -1,   -1,  283,  284,
  285,  286,   -1,   -1,   58,   59,   60,   -1,   62,   37,
   -1,   -1,   -1,   41,   42,   43,   44,   45,   -1,   47,
   -1,  279,  280,   -1,   -1,  283,  284,  285,  286,   -1,
   58,   59,   60,   -1,   62,   -1,   37,   -1,   -1,   93,
   41,   42,   43,   44,   45,   37,   47,   -1,   -1,   41,
   42,   43,   44,   45,   -1,   47,   -1,   58,   59,   60,
   -1,   62,   -1,   -1,   -1,   93,   58,   59,   60,   -1,
   62,   -1,   37,   -1,   -1,   -1,   41,   42,   43,   44,
   45,   37,   47,   -1,   -1,   41,   42,   43,   44,   45,
   -1,   47,   93,   58,   59,   60,   -1,   62,   -1,   -1,
   -1,   93,   58,   59,   60,   -1,   62,   -1,   37,   -1,
   -1,   -1,   41,   42,   43,   44,   45,   37,   47,   -1,
   -1,   41,   42,   43,   -1,   45,   46,   47,   93,   58,
   59,   60,   -1,   62,   -1,   -1,   -1,   93,   -1,   59,
   60,   -1,   62,   37,   -1,   -1,   -1,   41,   42,   43,
   -1,   45,   46,   47,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   93,   -1,   60,   -1,   62,   37,
   -1,   91,   -1,   41,   42,   43,   46,   45,   46,   47,
   37,   -1,   -1,   -1,   41,   42,   43,   -1,   45,   46,
   47,   -1,   60,   -1,   62,   -1,   41,   91,   -1,   44,
   -1,   -1,   -1,   60,   -1,   62,   -1,   -1,   -1,   -1,
   37,   -1,   -1,   58,   59,   42,   43,   44,   45,   46,
   47,   91,   -1,   91,   -1,  279,  280,   -1,   -1,  283,
  284,  285,  286,   60,   91,   62,   37,   -1,   -1,   -1,
   41,   42,   43,   -1,   45,   46,   47,   -1,   93,   -1,
   -1,  279,  280,   -1,   -1,  283,  284,  285,  286,   60,
   -1,   62,   -1,   -1,   91,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  279,  280,
   -1,   -1,  283,  284,  285,  286,   -1,  279,  280,   -1,
   91,  283,  284,  285,  286,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  172,   -1,  174,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  279,  280,  186,   -1,  283,  284,
  285,  286,   -1,  279,  280,   -1,   -1,  283,  284,  285,
  286,  201,  202,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  214,   -1,   -1,   -1,   -1,   -1,
  279,  280,   -1,   -1,  283,  284,  285,  286,   -1,  279,
  280,   -1,   -1,  283,  284,  285,  286,   -1,   -1,   -1,
   37,   -1,   -1,   -1,   41,   42,   43,   -1,   45,   46,
   47,   -1,   -1,   -1,   -1,  279,  280,   -1,   -1,  283,
  284,  285,  286,   60,   -1,   62,   37,   -1,   -1,   -1,
   41,   42,   43,   -1,   45,   46,   47,   -1,   -1,   -1,
   -1,  279,  280,   -1,   -1,  283,  284,  285,  286,   60,
   -1,   62,  279,  280,   91,   -1,  283,  284,  285,  286,
   -1,   -1,   -1,   -1,  279,  280,   -1,   -1,   -1,   37,
  285,  286,   -1,   -1,   42,   43,   -1,   45,   46,   47,
   91,   -1,  279,  280,   -1,   -1,  283,  284,  285,  286,
   58,   -1,   60,   37,   62,   -1,   -1,   -1,   42,   43,
   -1,   45,   46,   47,   -1,   -1,   -1,   -1,  279,  280,
   -1,   -1,  283,  284,  285,  286,   60,   -1,   62,   37,
   -1,   -1,   -1,   91,   42,   43,   -1,   45,   46,   47,
   37,   -1,   -1,   -1,   -1,   42,   43,   -1,   45,   46,
   47,   -1,   60,   -1,   62,   -1,   -1,   91,   -1,   93,
   -1,   -1,   59,   60,   37,   62,   -1,   -1,   -1,   42,
   43,   -1,   45,   46,   47,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   91,   -1,   93,   59,   60,   -1,   62,
   37,   -1,   -1,   -1,   91,   42,   43,   -1,   45,   46,
   47,   37,   41,   -1,   -1,   44,   42,   43,   -1,   45,
   46,   47,   59,   60,   -1,   62,   -1,   -1,   91,   58,
   59,   -1,   37,   -1,   60,   -1,   62,   42,   43,   -1,
   45,   46,   47,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   91,   60,   -1,   62,   41,   -1,
   -1,   44,  279,  280,   93,   91,  283,  284,  285,  286,
   -1,   -1,   -1,   37,   -1,   58,   59,   -1,   42,   43,
   -1,   45,   46,   47,   -1,   -1,   91,   -1,  279,  280,
   -1,   -1,  283,  284,  285,  286,   60,   37,   62,   -1,
   -1,   -1,   42,   43,   -1,   45,   46,   47,   -1,   -1,
   93,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   60,   -1,   62,   -1,   -1,   -1,   41,   91,   43,   44,
   45,  279,  280,   -1,   -1,  283,  284,  285,  286,   -1,
   -1,   -1,   -1,   58,   59,   60,   -1,   62,   -1,   -1,
   41,   91,   43,   44,   45,  279,  280,   -1,   46,  283,
  284,  285,  286,   -1,   -1,   -1,   -1,   58,   59,   60,
   -1,   62,   41,   -1,   -1,   44,   -1,   -1,   93,   -1,
   -1,  279,  280,   -1,   -1,  283,  284,  285,  286,   58,
   59,   -1,  279,  280,   -1,   -1,  283,  284,  285,  286,
   -1,   -1,   93,   91,   -1,   -1,   -1,   -1,   -1,   41,
   -1,   41,   44,   -1,   44,   -1,  279,  280,   -1,   -1,
  283,  284,  285,  286,   93,   -1,   58,   59,   58,   59,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   41,   -1,
   -1,   44,  279,  280,   -1,   -1,  283,  284,  285,  286,
  279,  280,   -1,  279,  280,   58,   59,  283,  284,  285,
  286,   93,   -1,   93,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  279,  280,   -1,   -1,  283,  284,
  285,  286,   -1,   -1,  172,   -1,  174,   -1,   -1,   -1,
   93,   -1,   -1,   -1,   -1,   -1,  279,  280,  186,   -1,
   -1,   -1,  285,  286,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  201,  202,  279,   -1,   -1,   -1,  283,
  284,  285,  286,   -1,   -1,   -1,  214,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  283,  284,  285,  286,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  279,  280,   -1,   -1,  283,  284,
  285,  286,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  279,  280,
   52,   -1,  283,  284,  285,  286,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   66,   67,   68,   69,   70,   71,
  279,  280,   -1,   -1,   -1,   -1,  285,  286,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   90,   -1,
   92,   -1,   -1,   -1,   -1,   -1,   98,   -1,   -1,  101,
  102,  103,  104,  105,  106,   -1,   -1,  279,  280,  279,
  280,   -1,   -1,  285,  286,   -1,   -1,   -1,  120,  121,
  122,  123,  124,  125,  126,  127,  128,  129,  130,  131,
  132,   -1,  134,  135,   -1,   -1,  279,  280,   -1,  141,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  171,
   -1,  173,   -1,   -1,   -1,  177,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  187,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  215,  216,
};
}
final static short YYFINAL=2;
final static short YYMAXTOKEN=296;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"'!'",null,"'#'","'$'","'%'",null,null,"'('","')'","'*'","'+'",
"','","'-'","'.'","'/'",null,null,null,null,null,null,null,null,null,null,"':'",
"';'","'<'","'='","'>'",null,"'@'",null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,"VOID","BOOL","INT","STRING",
"COMPLEX","CLASS","NULL","EXTENDS","THIS","WHILE","FOR","IF","ELSE","RETURN",
"BREAK","NEW","PRINT","READ_INTEGER","READ_LINE","PRINTCOMP","LITERAL",
"IDENTIFIER","AND","OR","STATIC","INSTANCEOF","LESS_EQUAL","GREATER_EQUAL",
"EQUAL","NOT_EQUAL","CASE","DEFAULT","SUPER","DCOPY","SCOPY","DO","OD","DOOR",
"UMINUS","EMPTY",
};
final static String yyrule[] = {
"$accept : Program",
"Program : ClassList",
"ClassList : ClassList ClassDef",
"ClassList : ClassDef",
"VariableDef : Variable ';'",
"Variable : Type IDENTIFIER",
"Type : INT",
"Type : VOID",
"Type : BOOL",
"Type : STRING",
"Type : COMPLEX",
"Type : CLASS IDENTIFIER",
"Type : Type '[' ']'",
"ClassDef : CLASS IDENTIFIER ExtendsClause '{' FieldList '}'",
"ExtendsClause : EXTENDS IDENTIFIER",
"ExtendsClause :",
"FieldList : FieldList VariableDef",
"FieldList : FieldList FunctionDef",
"FieldList :",
"Formals : VariableList",
"Formals :",
"VariableList : VariableList ',' Variable",
"VariableList : Variable",
"FunctionDef : STATIC Type IDENTIFIER '(' Formals ')' StmtBlock",
"FunctionDef : Type IDENTIFIER '(' Formals ')' StmtBlock",
"StmtBlock : '{' StmtList '}'",
"StmtList : StmtList Stmt",
"StmtList :",
"Stmt : VariableDef",
"Stmt : SimpleStmt ';'",
"Stmt : IfStmt",
"Stmt : WhileStmt",
"Stmt : ForStmt",
"Stmt : ReturnStmt ';'",
"Stmt : PrintStmt ';'",
"Stmt : PrintCompStmt ';'",
"Stmt : BreakStmt ';'",
"Stmt : StmtBlock",
"Stmt : DoStmt ';'",
"DoStmt : DO DoBranches DoSubStmt OD",
"DoBranches : DoBranches DoBranch",
"DoBranches :",
"DoBranch : DoSubStmt DOOR",
"DoSubStmt : Expr ':' Stmt",
"SimpleStmt : LValue '=' Expr",
"SimpleStmt : Call",
"SimpleStmt :",
"Receiver : Expr '.'",
"Receiver :",
"LValue : Receiver IDENTIFIER",
"LValue : Expr '[' Expr ']'",
"Call : Receiver IDENTIFIER '(' Actuals ')'",
"Expr : LValue",
"Expr : Call",
"Expr : Constant",
"Expr : Expr '+' Expr",
"Expr : Expr '-' Expr",
"Expr : Expr '*' Expr",
"Expr : Expr '/' Expr",
"Expr : Expr '%' Expr",
"Expr : Expr EQUAL Expr",
"Expr : Expr NOT_EQUAL Expr",
"Expr : Expr '<' Expr",
"Expr : Expr '>' Expr",
"Expr : Expr LESS_EQUAL Expr",
"Expr : Expr GREATER_EQUAL Expr",
"Expr : Expr AND Expr",
"Expr : Expr OR Expr",
"Expr : '(' Expr ')'",
"Expr : '-' Expr",
"Expr : '!' Expr",
"Expr : '@' Expr",
"Expr : '$' Expr",
"Expr : '#' Expr",
"Expr : READ_INTEGER '(' ')'",
"Expr : READ_LINE '(' ')'",
"Expr : THIS",
"Expr : SUPER",
"Expr : NEW IDENTIFIER '(' ')'",
"Expr : NEW Type '[' Expr ']'",
"Expr : INSTANCEOF '(' Expr ',' IDENTIFIER ')'",
"Expr : '(' CLASS IDENTIFIER ')' Expr",
"Expr : CASE '(' Expr ')' '{' CasesExpr '}'",
"Expr : DCOPY '(' Expr ')'",
"Expr : SCOPY '(' Expr ')'",
"CasesExpr : CaseExor DefaultExpr",
"CaseExor : CaseExor AcaseExor",
"CaseExor :",
"AcaseExor : LITERAL ':' Expr ';'",
"DefaultExpr : DEFAULT ':' Expr ';'",
"Constant : LITERAL",
"Constant : NULL",
"Actuals : ExprList",
"Actuals :",
"ExprList : ExprList ',' Expr",
"ExprList : Expr",
"WhileStmt : WHILE '(' Expr ')' Stmt",
"ForStmt : FOR '(' SimpleStmt ';' Expr ';' SimpleStmt ')' Stmt",
"BreakStmt : BREAK",
"IfStmt : IF '(' Expr ')' Stmt ElseClause",
"ElseClause : ELSE Stmt",
"ElseClause :",
"ReturnStmt : RETURN Expr",
"ReturnStmt : RETURN",
"PrintStmt : PRINT '(' ExprList ')'",
"PrintCompStmt : PRINTCOMP '(' ExprList ')'",
};

//#line 507 "Parser.y"
    
	/**
	 * 打印当前归约所用的语法规则<br>
	 * 请勿修改。
	 */
    public boolean onReduce(String rule) {
		if (rule.startsWith("$$"))
			return false;
		else
			rule = rule.replaceAll(" \\$\\$\\d+", "");

   	    if (rule.endsWith(":"))
    	    System.out.println(rule + " <empty>");
   	    else
			System.out.println(rule);
		return false;
    }
    
    public void diagnose() {
		addReduceListener(this);
		yyparse();
	}
//#line 733 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    //if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      //if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        //if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        //if (yychar < 0)    //it it didn't work/error
        //  {
        //  yychar = 0;      //change it to default string (no -1!)
          //if (yydebug)
          //  yylexdebug(yystate,yychar);
        //  }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        //if (yydebug)
          //debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      //if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0 || valptr<0)   //check for under & overflow here
            {
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            //if (yydebug)
              //debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            //if (yydebug)
              //debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0 || valptr<0)   //check for under & overflow here
              {
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        //if (yydebug)
          //{
          //yys = null;
          //if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          //if (yys == null) yys = "illegal-symbol";
          //debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          //}
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    //if (yydebug)
      //debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    if (reduceListener == null || reduceListener.onReduce(yyrule[yyn])) // if intercepted!
      switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 52 "Parser.y"
{
						tree = new Tree.TopLevel(val_peek(0).clist, val_peek(0).loc);
					}
break;
case 2:
//#line 58 "Parser.y"
{
						yyval.clist.add(val_peek(0).cdef);
					}
break;
case 3:
//#line 62 "Parser.y"
{
                		yyval.clist = new ArrayList<Tree.ClassDef>();
                		yyval.clist.add(val_peek(0).cdef);
                	}
break;
case 5:
//#line 72 "Parser.y"
{
						yyval.vdef = new Tree.VarDef(val_peek(0).ident, val_peek(1).type, val_peek(0).loc);
					}
break;
case 6:
//#line 78 "Parser.y"
{
						yyval.type = new Tree.TypeIdent(Tree.INT, val_peek(0).loc);
					}
break;
case 7:
//#line 82 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.VOID, val_peek(0).loc);
                	}
break;
case 8:
//#line 86 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.BOOL, val_peek(0).loc);
                	}
break;
case 9:
//#line 90 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.STRING, val_peek(0).loc);
                	}
break;
case 10:
//#line 94 "Parser.y"
{
                		yyval.type = new Tree.TypeIdent(Tree.COMPLEX, val_peek(0).loc);
                	}
break;
case 11:
//#line 98 "Parser.y"
{
                		yyval.type = new Tree.TypeClass(val_peek(0).ident, val_peek(1).loc);
                	}
break;
case 12:
//#line 102 "Parser.y"
{
                		yyval.type = new Tree.TypeArray(val_peek(2).type, val_peek(2).loc);
                	}
break;
case 13:
//#line 108 "Parser.y"
{
						yyval.cdef = new Tree.ClassDef(val_peek(4).ident, val_peek(3).ident, val_peek(1).flist, val_peek(5).loc);
					}
break;
case 14:
//#line 114 "Parser.y"
{
						yyval.ident = val_peek(0).ident;
					}
break;
case 15:
//#line 118 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 16:
//#line 124 "Parser.y"
{
						yyval.flist.add(val_peek(0).vdef);
					}
break;
case 17:
//#line 128 "Parser.y"
{
						yyval.flist.add(val_peek(0).fdef);
					}
break;
case 18:
//#line 132 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.flist = new ArrayList<Tree>();
                	}
break;
case 20:
//#line 140 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.vlist = new ArrayList<Tree.VarDef>(); 
                	}
break;
case 21:
//#line 147 "Parser.y"
{
						yyval.vlist.add(val_peek(0).vdef);
					}
break;
case 22:
//#line 151 "Parser.y"
{
                		yyval.vlist = new ArrayList<Tree.VarDef>();
						yyval.vlist.add(val_peek(0).vdef);
                	}
break;
case 23:
//#line 158 "Parser.y"
{
						yyval.fdef = new MethodDef(true, val_peek(4).ident, val_peek(5).type, val_peek(2).vlist, (Block) val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 24:
//#line 162 "Parser.y"
{
						yyval.fdef = new MethodDef(false, val_peek(4).ident, val_peek(5).type, val_peek(2).vlist, (Block) val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 25:
//#line 168 "Parser.y"
{
						yyval.stmt = new Block(val_peek(1).slist, val_peek(2).loc);
					}
break;
case 26:
//#line 174 "Parser.y"
{
						yyval.slist.add(val_peek(0).stmt);
					}
break;
case 27:
//#line 178 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.slist = new ArrayList<Tree>();
                	}
break;
case 28:
//#line 185 "Parser.y"
{
						yyval.stmt = val_peek(0).vdef;
					}
break;
case 29:
//#line 190 "Parser.y"
{
                		if (yyval.stmt == null) {
                			yyval.stmt = new Tree.Skip(val_peek(0).loc);
                		}
                	}
break;
case 39:
//#line 206 "Parser.y"
{
						yyval.stmt=new Tree.DoStmt(val_peek(2).dobranches,val_peek(1).dosubstmt,val_peek(3).loc);
					}
break;
case 40:
//#line 210 "Parser.y"
{
						yyval.dobranches.add(val_peek(0).dosubstmt);
					}
break;
case 41:
//#line 214 "Parser.y"
{
						yyval=new SemValue();
						yyval.dobranches=new ArrayList<DoSubStmt>();
					}
break;
case 42:
//#line 219 "Parser.y"
{
						yyval.dosubstmt=val_peek(1).dosubstmt;
					}
break;
case 43:
//#line 223 "Parser.y"
{
						yyval.dosubstmt=new Tree.DoSubStmt(val_peek(2).expr,val_peek(0).stmt,val_peek(2).loc);
					}
break;
case 44:
//#line 227 "Parser.y"
{
						yyval.stmt = new Tree.Assign(val_peek(2).lvalue, val_peek(0).expr, val_peek(1).loc);
					}
break;
case 45:
//#line 231 "Parser.y"
{
                		yyval.stmt = new Tree.Exec(val_peek(0).expr, val_peek(0).loc);
                	}
break;
case 46:
//#line 235 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 48:
//#line 242 "Parser.y"
{
                		yyval = new SemValue();
                	}
break;
case 49:
//#line 248 "Parser.y"
{
						yyval.lvalue = new Tree.Ident(val_peek(1).expr, val_peek(0).ident, val_peek(0).loc);
						if (val_peek(1).loc == null) {
							yyval.loc = val_peek(0).loc;
						}
					}
break;
case 50:
//#line 255 "Parser.y"
{
                		yyval.lvalue = new Tree.Indexed(val_peek(3).expr, val_peek(1).expr, val_peek(3).loc);
                	}
break;
case 51:
//#line 261 "Parser.y"
{
						yyval.expr = new Tree.CallExpr(val_peek(4).expr, val_peek(3).ident, val_peek(1).elist, val_peek(3).loc);
						if (val_peek(4).loc == null) {
							yyval.loc = val_peek(3).loc;
						}
					}
break;
case 52:
//#line 270 "Parser.y"
{
						yyval.expr = val_peek(0).lvalue;
					}
break;
case 55:
//#line 276 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.PLUS, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 56:
//#line 280 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.MINUS, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 57:
//#line 284 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.MUL, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 58:
//#line 288 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.DIV, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 59:
//#line 292 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.MOD, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 60:
//#line 296 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.EQ, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 61:
//#line 300 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.NE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 62:
//#line 304 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.LT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 63:
//#line 308 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.GT, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 64:
//#line 312 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.LE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 65:
//#line 316 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.GE, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 66:
//#line 320 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.AND, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 67:
//#line 324 "Parser.y"
{
                		yyval.expr = new Tree.Binary(Tree.OR, val_peek(2).expr, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 68:
//#line 328 "Parser.y"
{
                		yyval = val_peek(1);
                	}
break;
case 69:
//#line 332 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.NEG, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 70:
//#line 336 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.NOT, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 71:
//#line 340 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.RE, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 72:
//#line 344 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.IM, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 73:
//#line 348 "Parser.y"
{
                		yyval.expr = new Tree.Unary(Tree.COMPCAST, val_peek(0).expr, val_peek(1).loc);
                	}
break;
case 74:
//#line 352 "Parser.y"
{
                		yyval.expr = new Tree.ReadIntExpr(val_peek(2).loc);
                	}
break;
case 75:
//#line 356 "Parser.y"
{
                		yyval.expr = new Tree.ReadLineExpr(val_peek(2).loc);
                	}
break;
case 76:
//#line 360 "Parser.y"
{
                		yyval.expr = new Tree.ThisExpr(val_peek(0).loc);
                	}
break;
case 77:
//#line 364 "Parser.y"
{
                		yyval.expr = new Tree.SuperExpr(val_peek(0).loc);
                	}
break;
case 78:
//#line 368 "Parser.y"
{
                		yyval.expr = new Tree.NewClass(val_peek(2).ident, val_peek(3).loc);
                	}
break;
case 79:
//#line 372 "Parser.y"
{
                		yyval.expr = new Tree.NewArray(val_peek(3).type, val_peek(1).expr, val_peek(4).loc);
                	}
break;
case 80:
//#line 376 "Parser.y"
{
                		yyval.expr = new Tree.TypeTest(val_peek(3).expr, val_peek(1).ident, val_peek(5).loc);
                	}
break;
case 81:
//#line 380 "Parser.y"
{
                		yyval.expr = new Tree.TypeCast(val_peek(2).ident, val_peek(0).expr, val_peek(0).loc);
                	}
break;
case 82:
//#line 384 "Parser.y"
{
                		yyval.expr=new Tree.CaseExpr(val_peek(4).expr,val_peek(1).casesexpr,val_peek(6).loc);
                	}
break;
case 83:
//#line 388 "Parser.y"
{
						yyval.expr=new Tree.DeepCopy(val_peek(1).expr,val_peek(3).loc);
					}
break;
case 84:
//#line 392 "Parser.y"
{
						yyval.expr=new Tree.ShallowCopy(val_peek(1).expr,val_peek(3).loc);
					}
break;
case 85:
//#line 397 "Parser.y"
{
						yyval.casesexpr=new CasesExpr(val_peek(1).aclist,val_peek(0).defaultexpr,val_peek(1).loc);
					}
break;
case 86:
//#line 402 "Parser.y"
{
						yyval.aclist.add(val_peek(0).acaseexor);
					}
break;
case 87:
//#line 406 "Parser.y"
{
						yyval=new SemValue();
						yyval.aclist=new ArrayList<Tree.AcaseExor>();
					}
break;
case 88:
//#line 411 "Parser.y"
{
						yyval.acaseexor=new Tree.AcaseExor(new Tree.Literal(val_peek(3).typeTag, val_peek(3).literal, val_peek(3).loc),val_peek(1).expr,val_peek(3).loc);
					}
break;
case 89:
//#line 417 "Parser.y"
{
						yyval.defaultexpr=new Tree.DefaultExpr(val_peek(1).expr,val_peek(3).loc);
					}
break;
case 90:
//#line 423 "Parser.y"
{
						yyval.expr = new Tree.Literal(val_peek(0).typeTag, val_peek(0).literal, val_peek(0).loc);
					}
break;
case 91:
//#line 427 "Parser.y"
{
						yyval.expr = new Null(val_peek(0).loc);
					}
break;
case 93:
//#line 434 "Parser.y"
{
                		yyval = new SemValue();
                		yyval.elist = new ArrayList<Tree.Expr>();
                	}
break;
case 94:
//#line 441 "Parser.y"
{
						yyval.elist.add(val_peek(0).expr);
					}
break;
case 95:
//#line 445 "Parser.y"
{
                		yyval.elist = new ArrayList<Tree.Expr>();
						yyval.elist.add(val_peek(0).expr);
                	}
break;
case 96:
//#line 452 "Parser.y"
{
						yyval.stmt = new Tree.WhileLoop(val_peek(2).expr, val_peek(0).stmt, val_peek(4).loc);
					}
break;
case 97:
//#line 458 "Parser.y"
{
						yyval.stmt = new Tree.ForLoop(val_peek(6).stmt, val_peek(4).expr, val_peek(2).stmt, val_peek(0).stmt, val_peek(8).loc);
					}
break;
case 98:
//#line 464 "Parser.y"
{
						yyval.stmt = new Tree.Break(val_peek(0).loc);
					}
break;
case 99:
//#line 470 "Parser.y"
{
						yyval.stmt = new Tree.If(val_peek(3).expr, val_peek(1).stmt, val_peek(0).stmt, val_peek(5).loc);
					}
break;
case 100:
//#line 476 "Parser.y"
{
						yyval.stmt = val_peek(0).stmt;
					}
break;
case 101:
//#line 480 "Parser.y"
{
						yyval = new SemValue();
					}
break;
case 102:
//#line 486 "Parser.y"
{
						yyval.stmt = new Tree.Return(val_peek(0).expr, val_peek(1).loc);
					}
break;
case 103:
//#line 490 "Parser.y"
{
                		yyval.stmt = new Tree.Return(null, val_peek(0).loc);
                	}
break;
case 104:
//#line 496 "Parser.y"
{
						yyval.stmt = new Print(val_peek(1).elist, val_peek(3).loc);
					}
break;
case 105:
//#line 501 "Parser.y"
{
						yyval.stmt = new PrintComp(val_peek(1).elist, val_peek(3).loc);
					}
break;
//#line 1436 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    //if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      //if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        //if (yychar<0) yychar=0;  //clean, if necessary
        //if (yydebug)
          //yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      //if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
//## The -Jnorun option was used ##
//## end of method run() ########################################



//## Constructors ###############################################
//## The -Jnoconstruct option was used ##
//###############################################################



}
//################### END OF CLASS ##############################
