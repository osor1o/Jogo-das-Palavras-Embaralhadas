package MecanicaDoJogo;

public class MorteSubita extends MecanicaDoJogo {

	public MorteSubita() {
		nome = "Morte Súbita";
		regras = "Errou perdeu!";
		novaRodada();
	}
	
	public void responder(String resposta) {
		if(resposta.equalsIgnoreCase(palavraCorreta)) {
			pontuacao += 1;
			acabou = false;
			novaRodada();
		} else {
			acabou = true;
		}
	}

}
