package src.lexer;

import java_cup.runtime.Symbol;

%%

%cup
%public
%class AnalisadorLexico
%line
%column

BRANCO = [\ \n\r\t\f]
IDENT = [_|a-z|A-Z][a-z|A-Z|0-9_]*
SOMA = "+"
SUBTRAI = "-"
MULTI = "*"
DIVID = "/"
EQUALS = "="
INTEIRO = 0|[1-9][0-9]*


%%

<YYINITIAL> {
"Start"			{return new Symbol(sym.START, yyline, yycolumn, yytext());}
"End"			{return new Symbol(sym.END, yyline, yycolumn, yytext());}
"Print"   		{return new Symbol(sym.PRINT, yyline, yycolumn, yytext());}
"Write"   		{return new Symbol(sym.WRITE, yyline, yycolumn, yytext());}
";"             {return new Symbol(sym.CLOSE_SEQUENCE, yyline, yycolumn, yytext());}
"Declare"		{return new Symbol(sym.TYPE_DECLARATION, yyline, yycolumn, yytext());}
"Float"   		{return new Symbol(sym.TYPE_FLOAT, yyline, yycolumn, yytext());}
"Integer"       {return new Symbol(sym.TYPE_INTEGER, yyline, yycolumn, yytext());}
"Char"          {return new Symbol(sym.TYPE_CHAR, yyline, yycolumn, yytext());}
"String"        {return new Symbol(sym.TYPE_STRING, yyline, yycolumn, yytext());}
{EQUALS}		{return new Symbol(sym.EQUALS, yyline, yycolumn, yytext());}
{SOMA}			{return new Symbol(sym.SUM, yyline, yycolumn, yytext());}
{SUBTRAI}		{return new Symbol(sym.SUB, yyline, yycolumn, yytext());}
{MULTI}			{return new Symbol(sym.MULTI, yyline, yycolumn, yytext());}
{DIVID}			{return new Symbol(sym.DIVID, yyline, yycolumn, yytext());} 
{INTEIRO}		{return new Symbol(sym.NUM, yyline, yycolumn, yytext());}
"("    			{return new Symbol(sym.OPEN, yyline, yycolumn, yytext());}
")"    			{return new Symbol(sym.CLOSE, yyline, yycolumn, yytext());}
{BRANCO}		{}
{IDENT}			{return new Symbol(sym.IDENT, yyline, yycolumn, yytext());}

. {throw new Error("Erro léxico: " + yytext() +" at line " + (yyline+1)+ ", column " + (yycolumn+1)); } }