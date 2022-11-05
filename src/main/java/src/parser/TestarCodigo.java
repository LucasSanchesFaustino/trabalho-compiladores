package src.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;

import src.lexer.AnalisadorLexico;

public class TestarCodigo {

	public static void main(String[] args) throws FileNotFoundException {
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/main/java/src/";

		String sourcecode = rootPath + subPath + "Teste.txt";
		parser p = new parser(new AnalisadorLexico(new FileReader(sourcecode)));

		
		try {
			Object result = p.parse().value;
			System.out.println("Código compilado com sucesso!");
		} catch (Exception e) {
				System.out.println(); 
				e.printStackTrace();

		}

	}

}
