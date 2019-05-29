package Embaralhador;

public abstract class Embaralhador {
	
	protected String palavraEmbaralhada;
	protected String palavraCorreta;
	
	protected Embaralhador(String palavra) {
		this.palavraCorreta = palavra;
		this.palavraEmbaralhada = embaralhar();
	}
	
	protected abstract String embaralhar();
	
	public String getPalavraCorreta() {
		return palavraCorreta;
	}
	
	public String getPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}
	
}
