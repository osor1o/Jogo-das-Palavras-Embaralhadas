package Embaralhador;

public class FaltamDuasLetras extends Embaralhador {

	public FaltamDuasLetras(String palavra) {
		super(palavra);
	}

	protected String embaralhar() {
		char[] palavras = palavraCorreta.toCharArray();
		Integer[] ocultar = new Integer[2];
		ocultar[0] = posicaoAleatoria(palavras.length);
		ocultar[1] = posicaoAleatoria(palavras.length, ocultar[0]);
		palavras[ocultar[0]] = "_".charAt(0);
		palavras[ocultar[1]] = "_".charAt(0);
		String palavra = "";
		for(int i = 0; i < palavras.length ;i++) {
			palavra += palavras[i];
		}
		return palavra;
	}
	
	private int posicaoAleatoria(int length) {
		return (int) (Math.random() * length);
	}
	
	private int posicaoAleatoria(int length, int ignore) {
		int result = (int) (Math.random() * length);
		while(result == ignore) {
			result = (int) (Math.random() * length);
		}
		return result;
	}

}
