package src;

import java.nio.file.Paths;

// Classe responsável por gerar a classe AnalisadorLéxico
public class Gerador {
	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/main/java/src/";
		String file[] = {rootPath + subPath + "scanner.lex"};
		jflex.Main.main(file);
	}
}
