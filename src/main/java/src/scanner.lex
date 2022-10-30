package src;
%%
%{
	private Token token(String tipoToken){

		return new Token(tipoToken);
	}
%}

%class AnalisadorLexico
%function getToken 
%type Token


BRANCO = [\ \n\r\t\f]
ID = [_|a-z|A-Z][a-z|A-Z|0-9_]*
SOMA = "+"
SUBTRAI = "-"
MULTI = "*"
DIVID = "/"
EQUALS = "="
INTEIRO = 0|[1-9][0-9]*


%%

"Start"			{return token("START");}
"End"			{return token("END");}
"Print"   		{return token("FUNC_PRINT");}
"Write"   		{return token("FUNC_WRITE");}
";"             {return token("CLOSE_SEQUENCE");}
"Declare"		{return token("TYPE_DECLARE");}
"Float"   		{return token("TYPE_FLOAT");}
"Integer"       {return token("TYPE_INTEGER");}
"Char"          {return token("TYPE_CHAR");}
"String"        {return token("TYPE_STRING");}
"if"			{return token("IF");}
"then"			{return token("THEN");}
{ID}			{return token("IDENT");}
{EQUALS}		{return token("EQUALS");}
{SOMA}			{return token("SUM");}
{SUBTRAI}		{return token("SUB");}
{MULTI}			{return token("MULT");}
{DIVID}			{return token("DIVID");} 
{INTEIRO}		{return token("NUM");}
"("    			{return token("OPEN");}
")"    			{return token("CLOSE");}
{BRANCO}		{return token("BLANKSPACE");}

. {return token("INVALID");}