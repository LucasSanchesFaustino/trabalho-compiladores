package src.lexer;
%%
%{
	private void imprimir(String descricao, String lexema){

		System.out.println(lexema + "-" + descricao);
	}
%}

%class AnalisadorLexicoTeste
%type void

BRANCO = [\ \n\r\t\f]
ID = [_|a-z|A-Z][a-z|A-Z|0-9_]*
SOMA = "+"
SUBTRAI = "-"
MULTI = "*"
DIVID = "/"
INTEIRO = 0|[1-9][0-9]*

%%

"Start"			{imprimir("Identificador de inicio da classe main", yytext());}
"End"			{imprimir("Identificador de encerramento da classe main", yytext());}
"Print"   		{imprimir("Função de leitura de identificador", yytext());}
"Write"   		{imprimir("Função de escrita de identificador", yytext());}
";"             {imprimir("Caractere de encerramento de instrução", yytext());}
"Declare"		{imprimir("Identificador de declaração de variáveis", yytext());}
"Float"   		{imprimir("Tipo float", yytext());}
"Integer"       {imprimir("Tipo integer", yytext());}
"Char"          {imprimir("Tipo char", yytext());}
"String"        {imprimir("Tipo string", yytext());}
{ID}			{imprimir("Identificador ", yytext());}
{SOMA}			{imprimir("Operador de soma ", yytext());}
{SUBTRAI}		{imprimir("Operador de subtração", yytext());}
{MULTI}			{imprimir("Operador de multiplicação", yytext());}
{DIVID}			{imprimir("Operador de divisão", yytext());} 
{INTEIRO}		{imprimir("Numero inteiro ", yytext());}
"("    			{imprimir("Abertura de parênteses", yytext());}
")"    			{imprimir("Fechamento de parênteses", yytext());}
{BRANCO}		{imprimir("Espaço em branco ", yytext());}

. { imprimir("Erro léxico", yytext()); }