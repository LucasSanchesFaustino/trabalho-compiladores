package src.lexer;

import java.nio.file.Paths;
import java.util.Scanner;

public class GeraAnalisadorLexico {

	public static void main(String[] args) {

		String path = Paths.get("").toAbsolutePath().toString() + "/src/main/java/src/";
		
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Digite 1 para gerar o analisador l�xico da classe a ser usada pelo Parser \n"
				+ "Digite 2 para gerar o analisador l�xico para testes \n"
				+ "Digite qualquer outro caractere para encerrar o programa");
		
		
		String option = Leitor.nextLine();
		
		System.out.println(option);
		
		if(Integer.valueOf(option) == 1) {
			String file[] = { path + "Lexer.lex" };
			jflex.Main.main(file);
		} else if (Integer.valueOf(option) == 2) {
			String file[] = { path + "LexerTeste.lex" };
			jflex.Main.main(file);
		} else {
			System.out.println("O caractere digitado n�o corresponde a nenhuma op��o v�lida");
			System.exit(-1);
		}
		
	}

}
