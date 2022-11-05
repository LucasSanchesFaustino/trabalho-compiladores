package src.lexer;

import java.nio.file.Paths;

public class GeraAnalisadorLexico {

	public static void main(String[] args) {
	
		String path = Paths.get("").toAbsolutePath().toString() + "/src/main/java/src/";

		String file[] = {path + "Lexer.lex"};

		jflex.Main.main(file);
		
	}

}
