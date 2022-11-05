
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sat Nov 05 20:23:25 BRT 2022
//----------------------------------------------------

package src.parser;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Sat Nov 05 20:23:25 BRT 2022
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\003\006\000\002\004" +
    "\004\000\002\004\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003\000" +
    "\002\006\003\000\002\014\003\000\002\014\003\000\002" +
    "\013\003\000\002\013\003\000\002\013\003\000\002\013" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\010\003\000\002\007\006\000\002\011\007\000" +
    "\002\012\007\000\002\015\010\000\002\016\014" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\004\004\005\001\002\000\004\002\065\001" +
    "\002\000\012\006\016\007\015\011\006\014\014\001\002" +
    "\000\020\010\ufff8\013\ufff8\021\ufff8\022\ufff8\023\ufff8\024" +
    "\ufff8\025\ufff8\001\002\000\004\021\044\001\002\000\014" +
    "\005\ufffa\006\ufffa\007\ufffa\011\ufffa\014\ufffa\001\002\000" +
    "\014\005\042\006\016\007\015\011\006\014\014\001\002" +
    "\000\014\005\ufff9\006\ufff9\007\ufff9\011\ufff9\014\ufff9\001" +
    "\002\000\014\005\ufffe\006\ufffe\007\ufffe\011\ufffe\014\ufffe" +
    "\001\002\000\012\015\033\016\035\017\036\020\034\001" +
    "\002\000\004\012\026\001\002\000\004\012\022\001\002" +
    "\000\014\005\ufffc\006\ufffc\007\ufffc\011\ufffc\014\ufffc\001" +
    "\002\000\014\005\ufffd\006\ufffd\007\ufffd\011\ufffd\014\ufffd" +
    "\001\002\000\014\005\ufffb\006\ufffb\007\ufffb\011\ufffb\014" +
    "\ufffb\001\002\000\004\011\023\001\002\000\004\013\024" +
    "\001\002\000\004\010\025\001\002\000\014\005\uffec\006" +
    "\uffec\007\uffec\011\uffec\014\uffec\001\002\000\004\011\027" +
    "\001\002\000\004\013\030\001\002\000\004\010\031\001" +
    "\002\000\014\005\uffeb\006\uffeb\007\uffeb\011\uffeb\014\uffeb" +
    "\001\002\000\004\011\006\001\002\000\004\011\ufff1\001" +
    "\002\000\004\011\uffee\001\002\000\004\011\ufff0\001\002" +
    "\000\004\011\uffef\001\002\000\004\010\040\001\002\000" +
    "\014\005\uffed\006\uffed\007\uffed\011\uffed\014\uffed\001\002" +
    "\000\014\005\uffff\006\uffff\007\uffff\011\uffff\014\uffff\001" +
    "\002\000\004\010\043\001\002\000\004\002\000\001\002" +
    "\000\006\011\006\026\045\001\002\000\016\010\ufff6\013" +
    "\ufff6\022\ufff6\023\ufff6\024\ufff6\025\ufff6\001\002\000\016" +
    "\010\ufff7\013\ufff7\022\ufff7\023\ufff7\024\ufff7\025\ufff7\001" +
    "\002\000\012\022\050\023\051\024\052\025\053\001\002" +
    "\000\010\011\ufff5\012\ufff5\026\ufff5\001\002\000\010\011" +
    "\ufff4\012\ufff4\026\ufff4\001\002\000\010\011\ufff3\012\ufff3" +
    "\026\ufff3\001\002\000\010\011\ufff2\012\ufff2\026\ufff2\001" +
    "\002\000\010\011\006\012\055\026\045\001\002\000\006" +
    "\011\006\026\045\001\002\000\004\010\057\001\002\000" +
    "\014\005\uffea\006\uffea\007\uffea\011\uffea\014\uffea\001\002" +
    "\000\012\022\050\023\051\024\052\025\053\001\002\000" +
    "\006\011\006\026\045\001\002\000\004\013\063\001\002" +
    "\000\004\010\064\001\002\000\014\005\uffe9\006\uffe9\007" +
    "\uffe9\011\uffe9\014\uffe9\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\004\003\003\001\001\000\002\001\001\000" +
    "\022\004\010\005\012\006\006\007\017\011\016\012\020" +
    "\015\007\016\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\005\040\006\006\007\017" +
    "\011\016\012\020\015\007\016\011\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\031\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\036\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\006\045\014\046\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\053\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\006\045\014\055\001\001\000\006\006\045\014" +
    "\057\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\060\001\001\000\006\006\045\014\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public void syntax_error(Symbol cur_token)  {
        System.out.println("Erro de sintaxe: Linha: " + (cur_token.left + 1) + " Coluna: " + (cur_token.right + 1) + " Trecho que apresentou o problema: " + cur_token.value);  
    	throw new Error("Erro de s�ntaxe");
    } 	
	public void unrecovered_syntax_error(Symbol cur_token) {
	   System.out.println("Erro de sintaxe, por�m o parser n�o conseguiu se recuperar! Linha: " + (cur_token.left + 1) + " Coluna: " + (cur_token.right + 1) + " Trecho que apresentou o problema: " + cur_token.value);  
	   throw new Error("Erro de s�ntaxe");
	}

    public void printErroFatal(String message, Object info)  {
        System.out.println("Erro Fatal - " + message);
        System.exit(-1);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // mathematical_operations_multiple_operators ::= variable EQUALS mathematical_variables mathematical_operators OPEN mathematical_variables mathematical_operators mathematical_variables CLOSE CLOSE_SEQUENCE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*mathematical_operations_multiple_operators*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // mathematical_operations_single_operators ::= variable EQUALS mathematical_variables mathematical_operators mathematical_variables CLOSE_SEQUENCE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*mathematical_operations_single_operators*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // write_var ::= WRITE OPEN IDENT CLOSE CLOSE_SEQUENCE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*write_var*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // print_var ::= PRINT OPEN IDENT CLOSE CLOSE_SEQUENCE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*print_var*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // var_decl ::= TYPE_DECLARATION var_type variable CLOSE_SEQUENCE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*var_decl*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // var_type ::= TYPE_STRING 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*var_type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // var_type ::= TYPE_CHAR 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*var_type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // var_type ::= TYPE_INTEGER 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*var_type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // var_type ::= TYPE_FLOAT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*var_type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // mathematical_operators ::= DIVID 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*mathematical_operators*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // mathematical_operators ::= MULTI 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*mathematical_operators*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // mathematical_operators ::= SUB 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*mathematical_operators*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // mathematical_operators ::= SUM 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*mathematical_operators*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // mathematical_variables ::= NUM 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*mathematical_variables*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // mathematical_variables ::= variable 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*mathematical_variables*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // variable ::= IDENT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*variable*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // statement ::= mathematical_operations_multiple_operators 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // statement ::= mathematical_operations_single_operators 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // statement ::= write_var 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // statement ::= print_var 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // statement ::= var_decl 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*statement*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // statements ::= statement 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*statements*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // statements ::= statements statement 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*statements*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= START statements END CLOSE_SEQUENCE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

