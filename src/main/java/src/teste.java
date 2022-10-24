package src;

import java.io.IOException;
import java.io.StringReader;

public class teste {
	public static void main(String[] args) throws IOException{
		
		String expr = "Float teste; Integer teste1; Start Print(teste); End;";
		
		AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(expr));
		
		lexical.yylex();
	}
}