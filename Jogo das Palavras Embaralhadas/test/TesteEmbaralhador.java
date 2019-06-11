import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Embaralhador.*;

class TesteEmbaralhador {
	
	private static String[] palavras;
	
	@BeforeAll
	static void teste() {
		palavras = new String[3];
		palavras[0] = "Alvíssaras";
		palavras[1] = "Agnóstico";
		palavras[2] = "Cuntatório";
	}
	
	@Test
	void faltamDuasLetras() {
		
		Embaralhador faltamDuasLetras = new FaltamDuasLetras();
		for(String palavraCorreta : palavras) {
			
			StringBuilder palavraEmbaralhada = new StringBuilder(faltamDuasLetras.embaralhar(palavraCorreta));
			
			Integer[] posicoes = new Integer[2];
			String[] letrasCorretas = new String[2];
			
			posicoes[0] = palavraEmbaralhada.indexOf("_");
			posicoes[1] = palavraEmbaralhada.indexOf("_", posicoes[0]+1);
			
			letrasCorretas[0] = Character.toString(palavraCorreta.charAt(posicoes[0]));
			letrasCorretas[1] = Character.toString(palavraCorreta.charAt(posicoes[1]));
			
			palavraEmbaralhada.replace(posicoes[0], posicoes[0]+1, letrasCorretas[0]);
			palavraEmbaralhada.replace(posicoes[1], posicoes[1]+1, letrasCorretas[1]);

			assertEquals(palavraCorreta, palavraEmbaralhada.toString());
			
		}
	}
	
	@Test
	void invertido() {
		Embaralhador invertido = new Invertido();
		
		assertEquals("sarassívlA", invertido.embaralhar(palavras[0]));
		assertEquals("ocitsóngA", invertido.embaralhar(palavras[1]));
		assertEquals("oirótatnuC", invertido.embaralhar(palavras[2]));
	}

}
