package src.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;

import src.lexer.AnalisadorLexico;

public class TestarCodigo {

	public static void main(String[] args) {
		String path = Paths.get("").toAbsolutePath().toString() + "/src/main/java/src/";

		String sourcecode = path + "teste.txt";
		parser p;
		try {
			p = new parser(new AnalisadorLexico(new FileReader(sourcecode)));
			Object result = p.parse().value;
			System.out.println("Código compilado com sucesso!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}