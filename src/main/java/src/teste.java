package src;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class teste {
	public static void main(String[] args) throws IOException, NullPointerException {

		String path = Paths.get("").toAbsolutePath().toString() + "/src/main/java/src/" + "teste.txt";
		
		TokenFactory tokenFactory = new TokenFactory();

		AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(Files.readString(Path.of(path))));

		while (!lexical.yyatEOF()) {
			tokenFactory.addTokenToList(lexical.getToken());
		}
		
		tokenFactory.printListOfTokens();
	}
}