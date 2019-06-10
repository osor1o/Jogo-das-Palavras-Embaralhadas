package Embaralhador;

public class FaltamDuasLetras implements Embaralhador {
	
	protected char[] letras;
	
	public String embaralhar(String palavra) {
		letras = palavra.toCharArray();
		Integer[] ocultar = new Integer[2];
		ocultar[0] = posicaoAleatoria();
		ocultar[1] = posicaoAleatoria(ocultar[0]);
		letras[ocultar[0]] = "_".charAt(0);
		letras[ocultar[1]] = "_".charAt(0);
		String palavraEmbaralhada = "";
		for(int i = 0; i < letras.length ;i++) {
			palavraEmbaralhada += letras[i];
		}
		return palavraEmbaralhada;
	}
	
	private int posicaoAleatoria() {
		return (int) (Math.random() * letras.length);
	}
	
	private int posicaoAleatoria(int ignore) {
		int result = (int) (Math.random() * letras.length);
		while(result == ignore) {
			result = (int) (Math.random() * letras.length);
		}
		return result;
	}

}
