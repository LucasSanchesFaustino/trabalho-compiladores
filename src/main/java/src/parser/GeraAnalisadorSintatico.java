package src.parser;

import java.io.IOException;
import java.nio.file.Paths;
import java_cup.internal_error;

public class GeraAnalisadorSintatico {

	public static void main(String[] args) throws internal_error, IOException, Exception {
		String path = Paths.get("").toAbsolutePath().toString() + "/src/main/java/src/";

		String file[] = {path + "Parser.cup"};

		java_cup.Main.main(file);

	}
}
