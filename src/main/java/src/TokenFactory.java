package src;

import java.util.ArrayList;
import java.util.List;

public class TokenFactory {

	private List<Token> listOfTokens = new ArrayList<Token>();
	
	public void printListOfTokens() {
		listOfTokens.forEach(token -> token.tokenInfo());
	}

	public List<Token> getListOfTokens() {
		return listOfTokens;
	}

	public void addTokenToList(Token token) {
		this.listOfTokens.add(token);
	}			
	
	public void getTipoToken(String tipoToken) {
		System.out.println(tipoToken);
	}
}