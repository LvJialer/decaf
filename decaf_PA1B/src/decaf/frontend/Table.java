/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /home/jialelv/decaf/decaf_PA1B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Fri Feb 02 20:49:01 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;
import javafx.util.Pair;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 14
    public static final int BOOL = 258; //# line 14
    public static final int INT = 259; //# line 14
    public static final int STRING = 260; //# line 14
    public static final int COMPLEX = 261; //# line 14
    public static final int CLASS = 262; //# line 14
    public static final int NULL = 263; //# line 15
    public static final int EXTENDS = 264; //# line 15
    public static final int THIS = 265; //# line 15
    public static final int WHILE = 266; //# line 15
    public static final int FOR = 267; //# line 15
    public static final int IF = 268; //# line 16
    public static final int ELSE = 269; //# line 16
    public static final int RETURN = 270; //# line 16
    public static final int BREAK = 271; //# line 16
    public static final int NEW = 272; //# line 16
    public static final int PRINT = 273; //# line 17
    public static final int READ_INTEGER = 274; //# line 17
    public static final int READ_LINE = 275; //# line 17
    public static final int PRINTCOMP = 276; //# line 17
    public static final int LITERAL = 277; //# line 18
    public static final int IDENTIFIER = 278; //# line 19
    public static final int AND = 279; //# line 19
    public static final int OR = 280; //# line 19
    public static final int STATIC = 281; //# line 19
    public static final int INSTANCEOF = 282; //# line 19
    public static final int LESS_EQUAL = 283; //# line 20
    public static final int GREATER_EQUAL = 284; //# line 20
    public static final int EQUAL = 285; //# line 20
    public static final int NOT_EQUAL = 286; //# line 20
    public static final int CASE = 287; //# line 20
    public static final int DEFAULT = 288; //# line 20
    public static final int SUPER = 289; //# line 20
    public static final int DCOPY = 290; //# line 20
    public static final int SCOPY = 291; //# line 20
    public static final int DO = 292; //# line 20
    public static final int OD = 293; //# line 20
    public static final int DOOR = 294; //# line 20
    
    public static final int VariableDef = 295;
    public static final int ExprT5 = 296;
    public static final int Oper3 = 297;
    public static final int Oper6 = 298;
    public static final int VariableList = 299;
    public static final int Formals = 300;
    public static final int Oper7 = 301;
    public static final int Expr8 = 302;
    public static final int AfterSimpleTypeExpr = 303;
    public static final int Expr2 = 304;
    public static final int Oper2 = 305;
    public static final int Expr6 = 306;
    public static final int BreakStmt = 307;
    public static final int ExprT2 = 308;
    public static final int StmtList = 309;
    public static final int Constant = 310;
    public static final int SubVariableList = 311;
    public static final int PrintStmt = 312;
    public static final int ForStmt = 313;
    public static final int Expr9 = 314;
    public static final int Expr1 = 315;
    public static final int Oper1 = 316;
    public static final int ElseClause = 317;
    public static final int FieldList = 318;
    public static final int SubExprList = 319;
    public static final int AfterParenExpr = 320;
    public static final int ClassDef = 321;
    public static final int ReturnStmt = 322;
    public static final int ExprList = 323;
    public static final int StmtBlock = 324;
    public static final int FunctionField = 325;
    public static final int AfterIdentExpr = 326;
    public static final int Program = 327;
    public static final int Expr = 328;
    public static final int Type = 329;
    public static final int Expr5 = 330;
    public static final int AfterNewExpr = 331;
    public static final int Assignment = 332;
    public static final int ExtendsClause = 333;
    public static final int Oper5 = 334;
    public static final int ArrayType = 335;
    public static final int Expr3 = 336;
    public static final int Actuals = 337;
    public static final int Variable = 338;
    public static final int ExprT3 = 339;
    public static final int Stmt = 340;
    public static final int SimpleStmt = 341;
    public static final int SimpleType = 342;
    public static final int WhileStmt = 343;
    public static final int ExprT1 = 344;
    public static final int Expr4 = 345;
    public static final int ExprT4 = 346;
    public static final int ReturnExpr = 347;
    public static final int IfStmt = 348;
    public static final int ExprT6 = 349;
    public static final int ExprT8 = 350;
    public static final int Expr7 = 351;
    public static final int ClassList = 352;
    public static final int Oper4 = 353;
    public static final int Field = 354;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 295;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "COMPLEX",
        "CLASS", "NULL", "EXTENDS", "THIS", "WHILE",
        "FOR", "IF", "ELSE", "RETURN", "BREAK",
        "NEW", "PRINT", "READ_INTEGER", "READ_LINE", "PRINTCOMP",
        "LITERAL", "IDENTIFIER", "AND", "OR", "STATIC",
        "INSTANCEOF", "LESS_EQUAL", "GREATER_EQUAL", "EQUAL", "NOT_EQUAL",
        "CASE", "DEFAULT", "SUPER", "DCOPY", "SCOPY",
        "DO", "OD", "DOOR", "VariableDef", "ExprT5",
        "Oper3", "Oper6", "VariableList", "Formals", "Oper7",
        "Expr8", "AfterSimpleTypeExpr", "Expr2", "Oper2", "Expr6",
        "BreakStmt", "ExprT2", "StmtList", "Constant", "SubVariableList",
        "PrintStmt", "ForStmt", "Expr9", "Expr1", "Oper1",
        "ElseClause", "FieldList", "SubExprList", "AfterParenExpr", "ClassDef",
        "ReturnStmt", "ExprList", "StmtBlock", "FunctionField", "AfterIdentExpr",
        "Program", "Expr", "Type", "Expr5", "AfterNewExpr",
        "Assignment", "ExtendsClause", "Oper5", "ArrayType", "Expr3",
        "Actuals", "Variable", "ExprT3", "Stmt", "SimpleStmt",
        "SimpleType", "WhileStmt", "ExprT1", "Expr4", "ExprT4",
        "ReturnExpr", "IfStmt", "ExprT6", "ExprT8", "Expr7",
        "ClassList", "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {AND},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER, CLASS},
        {CLASS},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER, Integer.valueOf(';')},
        {IF},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 295);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 295);
    }
    
    public Table() {
        for (int i = 0; i < 60; i++) {
            begin.add(new HashSet(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Pair<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 48
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 485
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new Pair<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 275
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new Pair<>(3, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new Pair<>(4, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 321
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new Pair<>(5, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new Pair<>(6, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new Pair<>(7, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 164
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(8, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 154
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(9, Arrays.asList(VariableList));
                    case ')':
                        return new Pair<>(10, Arrays.asList());
                    default: return null;
                }
            }
            //# line 338
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new Pair<>(11, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new Pair<>(12, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 541
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(13, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 649
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new Pair<>(14, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(15, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 386
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(16, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 268
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(17, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 502
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(18, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 726
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new Pair<>(19, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 398
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(20, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 191
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(22, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 673
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new Pair<>(24, Arrays.asList(LITERAL));
                    case NULL:
                        return new Pair<>(25, Arrays.asList(NULL));
                    default: return null;
                }
            }
            //# line 174
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(26, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 758
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new Pair<>(28, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 720
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new Pair<>(29, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 593
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(30, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new Pair<>(31, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new Pair<>(32, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new Pair<>(33, Arrays.asList(THIS));
                    case NEW:
                        return new Pair<>(34, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new Pair<>(35, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new Pair<>(36, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new Pair<>(37, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 357
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(38, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 261
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(39, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 738
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new Pair<>(40, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 114
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new Pair<>(42, Arrays.asList(Field, FieldList));
                    case '}':
                        return new Pair<>(43, Arrays.asList());
                    default: return null;
                }
            }
            //# line 701
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(44, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new Pair<>(45, Arrays.asList());
                    default: return null;
                }
            }
            //# line 661
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(46, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new Pair<>(47, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 101
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(48, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 745
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new Pair<>(49, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 693
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(50, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 185
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new Pair<>(51, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 146
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(52, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new Pair<>(109, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 586
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(54, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 26
            case Program: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(56, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 351
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(57, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 82
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(58, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 473
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(59, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 635
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new Pair<>(60, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(61, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 252
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new Pair<>(62, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 107
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new Pair<>(64, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 309
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new Pair<>(66, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new Pair<>(67, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 91
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(68, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new Pair<>(69, Arrays.asList());
                    default: return null;
                }
            }
            //# line 415
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(70, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 683
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(71, Arrays.asList(ExprList));
                    case ')':
                        return new Pair<>(72, Arrays.asList());
                    default: return null;
                }
            }
            //# line 54
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(73, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 427
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new Pair<>(74, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 199
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(76, Arrays.asList(VariableDef));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case READ_INTEGER:
                        return new Pair<>(77, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new Pair<>(78, Arrays.asList(IfStmt));
                    case WHILE:
                        return new Pair<>(79, Arrays.asList(WhileStmt));
                    case FOR:
                        return new Pair<>(80, Arrays.asList(ForStmt));
                    case RETURN:
                        return new Pair<>(81, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new Pair<>(82, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new Pair<>(83, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new Pair<>(84, Arrays.asList(StmtBlock));
                    default: return null;
                }
            }
            //# line 241
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(85, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 60
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new Pair<>(87, Arrays.asList(INT));
                    case VOID:
                        return new Pair<>(88, Arrays.asList(VOID));
                    case BOOL:
                        return new Pair<>(89, Arrays.asList(BOOL));
                    case STRING:
                        return new Pair<>(90, Arrays.asList(STRING));
                    case CLASS:
                        return new Pair<>(91, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 714
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new Pair<>(92, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 369
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(93, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 444
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(95, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 456
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new Pair<>(96, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 751
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(98, Arrays.asList(Expr));
                    case ';':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 732
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new Pair<>(100, Arrays.asList(IF, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 514
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new Pair<>(101, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 561
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(103, Arrays.asList(Integer.valueOf('['), Expr, Integer.valueOf(']'), ExprT8));
                    case '.':
                        return new Pair<>(104, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 531
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new Pair<>(106, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case READ_INTEGER:
                        return new Pair<>(107, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 37
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(108, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new Pair<>(109, Arrays.asList());
                    default: return null;
                }
            }
            //# line 287
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new Pair<>(110, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new Pair<>(111, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new Pair<>(112, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new Pair<>(113, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 130
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new Pair<>(114, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(115, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 49
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 486
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 276
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 4: {
                //# line 281
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 5: {
                //# line 322
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 327
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 332
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 165
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 9: {
                //# line 155
                params[0].vlist = params[1].vlist;
                return;
            }
            case 10: {
                //# line 159
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 11: {
                //# line 339
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 344
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 13: {
                //# line 542
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 14: {
                //# line 650
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 15: {
                //# line 655
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 16: {
                //# line 387
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 17: {
                //# line 269
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 503
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 19: {
                //# line 727
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 20: {
                //# line 399
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 21: {
                /* no action */
                return;
            }
            case 22: {
                //# line 192
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 23: {
                /* no action */
                return;
            }
            case 24: {
                //# line 674
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 25: {
                //# line 678
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 26: {
                //# line 175
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 27: {
                /* no action */
                return;
            }
            case 28: {
                //# line 759
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 29: {
                //# line 721
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 30: {
                //# line 594
                params[0].expr = params[1].expr;
                return;
            }
            case 31: {
                //# line 598
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 32: {
                //# line 602
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 33: {
                //# line 606
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 34: {
                //# line 610
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 35: {
                //# line 618
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 36: {
                //# line 622
                params[0].expr = params[2].expr;
                return;
            }
            case 37: {
                //# line 626
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 38: {
                //# line 358
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 39: {
                //# line 262
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 40: {
                //# line 739
                params[0].stmt = params[2].stmt;
                return;
            }
            case 41: {
                /* no action */
                return;
            }
            case 42: {
                //# line 115
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 43: {
                //# line 125
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 44: {
                //# line 702
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 45: {
                //# line 708
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 46: {
                //# line 662
                params[0].expr = params[1].expr;
                return;
            }
            case 47: {
                //# line 666
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 48: {
                //# line 102
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 49: {
                //# line 746
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 50: {
                //# line 694
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 51: {
                //# line 186
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 52: {
                //# line 147
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 53: {
                /* no action */
                return;
            }
            case 54: {
                //# line 587
                params[0].elist = params[2].elist;
                return;
            }
            case 55: {
                /* no action */
                return;
            }
            case 56: {
                //# line 27
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 57: {
                //# line 352
                params[0].expr = params[1].expr;
                return;
            }
            case 58: {
                //# line 83
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 59: {
                //# line 474
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 60: {
                //# line 636
                params[0].ident = params[1].ident;
                return;
            }
            case 61: {
                //# line 640
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 62: {
                //# line 253
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 63: {
                /* no action */
                return;
            }
            case 64: {
                //# line 108
                params[0].ident = params[2].ident;
                return;
            }
            case 65: {
                /* no action */
                return;
            }
            case 66: {
                //# line 310
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 67: {
                //# line 315
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 68: {
                //# line 92
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 69: {
                //# line 96
                params[0].counter = 0;
                return;
            }
            case 70: {
                //# line 416
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 71: {
                //# line 684
                params[0].elist = params[1].elist;
                return;
            }
            case 72: {
                //# line 688
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 73: {
                //# line 55
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 74: {
                //# line 428
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 75: {
                /* no action */
                return;
            }
            case 76: {
                //# line 200
                params[0].stmt = params[1].vdef;
                return;
            }
            case 77: {
                //# line 204
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 78: {
                //# line 212
                params[0].stmt = params[1].stmt;
                return;
            }
            case 79: {
                //# line 216
                params[0].stmt = params[1].stmt;
                return;
            }
            case 80: {
                //# line 220
                params[0].stmt = params[1].stmt;
                return;
            }
            case 81: {
                //# line 224
                params[0].stmt = params[1].stmt;
                return;
            }
            case 82: {
                //# line 228
                params[0].stmt = params[1].stmt;
                return;
            }
            case 83: {
                //# line 232
                params[0].stmt = params[1].stmt;
                return;
            }
            case 84: {
                //# line 236
                params[0].stmt = params[1].stmt;
                return;
            }
            case 85: {
                //# line 242
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 86: {
                /* no action */
                return;
            }
            case 87: {
                //# line 61
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 88: {
                //# line 65
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 89: {
                //# line 69
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 90: {
                //# line 73
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 91: {
                //# line 77
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 92: {
                //# line 715
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 93: {
                //# line 370
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 94: {
                /* no action */
                return;
            }
            case 95: {
                //# line 445
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 96: {
                //# line 457
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 97: {
                /* no action */
                return;
            }
            case 98: {
                //# line 752
                params[0].expr = params[1].expr;
                return;
            }
            case 99: {
                /* no action */
                return;
            }
            case 100: {
                //# line 733
                params[0].stmt = new Tree.If(params[3].expr, params[5].stmt, params[6].stmt, params[1].loc);
                return;
            }
            case 101: {
                //# line 515
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 102: {
                /* no action */
                return;
            }
            case 103: {
                //# line 562
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 104: {
                //# line 572
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 105: {
                /* no action */
                return;
            }
            case 106: {
                //# line 532
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 107: {
                //# line 536
                params[0].expr = params[1].expr;
                return;
            }
            case 108: {
                //# line 38
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 109: {
                /* no action */
                return;
            }
            case 110: {
                //# line 288
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 111: {
                //# line 293
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 112: {
                //# line 298
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 113: {
                //# line 303
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 114: {
                //# line 131
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 115: {
                //# line 136
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
