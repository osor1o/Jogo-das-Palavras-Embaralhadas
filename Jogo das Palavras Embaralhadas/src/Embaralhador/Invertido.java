package Embaralhador;

public class Invertido extends Embaralhador {
	
	public Invertido(String palavra) {
		super(palavra);
	}

	protected String embaralhar() {
		StringBuffer sb = new StringBuffer(palavraCorreta);
		sb.reverse();
		return sb.toString();
	}
	
}
