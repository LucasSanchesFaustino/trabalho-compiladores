package src;

public class Token {

	public void tokenInfo() {
		System.out.println("Token [tipoToken=" + tipoToken + "]");
	}

	public Token(String tipoToken) {
		this.tipoToken = tipoToken;
	}
	
	public Token(String tipoToken, String Lexema) {
		this.tipoToken = tipoToken + " " + Lexema;
	}

	private String tipoToken;

	public String getTipoToken() {
		return tipoToken;
	}

	public void setTipoToken(String tipoToken) {
		this.tipoToken = tipoToken;
	}
}