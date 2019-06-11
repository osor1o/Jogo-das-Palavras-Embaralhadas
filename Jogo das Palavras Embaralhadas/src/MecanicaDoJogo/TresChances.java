package MecanicaDoJogo;

public class TresChances extends MecanicaDoJogo {

	private int nChances = 3;
	
	public TresChances() {
		nome = "Três Chances";
		regras = "Pode errar apenas 3 vezes!";
		novaRodada();
	}
	
	public void responder(String resposta) {
		if(resposta.equalsIgnoreCase(palavraCorreta)) {
			pontuacao += 1;
			acabou = false;
			novaRodada();
		} else {
			nChances -= 1;
			acabou = (nChances < 1);
		}
	}

}
