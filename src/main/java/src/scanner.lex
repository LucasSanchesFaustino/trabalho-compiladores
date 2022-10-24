package src;
%%
%{
	private void imprimir(String descricao, String lexema){

		System.out.println(lexema + "-" + descricao);
	}
%}

%class AnalisadorLexico
%type void

BRANCO = [\ \n\r\t\f]
ID = [_|a-z|A-Z][a-z|A-Z|0-9_]*
SOMA = "+"
SUBTRAI = "-"
MULTI = "*"
DIVID = "/"
INTEIRO = 0|[1-9][0-9]*
PARENTESES = [(|)]*


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
"if"			{imprimir("Palavra reservada", yytext());}
"then"			{imprimir("Palavra reservada", yytext());}
{BRANCO}		{imprimir("Espaço em branco ", yytext());}
{ID}			{imprimir("Identificador ", yytext());}
{SOMA}			{imprimir("Operador de soma ", yytext());}
{SUBTRAI}		{imprimir("Operador de subtração", yytext());}
{MULTI}			{imprimir("Operador de multiplicação", yytext());}
{DIVID}			{imprimir("Operador de divisão", yytext());} 
{INTEIRO}		{imprimir("Numero inteiro ", yytext());}
{PARENTESES}    {imprimir("Abertura/fechamento de parênteses", yytext());}

. { throw new RuntimeException("Caractere invalido" + yytext()); }