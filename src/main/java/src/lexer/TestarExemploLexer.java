package src.lexer;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class TestarExemploLexer {

	public static void main(String[] args) throws IOException {
		String path = Paths.get("").toAbsolutePath().toString() + "/src/main/java/src/";

		String sourcecode = path + "teste.txt";

		AnalisadorLexicoTeste lexical = new AnalisadorLexicoTeste(new FileReader(sourcecode));
		
		lexical.yylex();
		
		
	}
}