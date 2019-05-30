package MecanicaDoJogo;

import Embaralhador.Embaralhador;

public abstract class MecanicaDoJogo {
	
	private Embaralhador embaralhador;
	
	//instancia da fabrica de embaralhador
	public MecanicaDoJogo() {
		
	}
	
	//Informa a pontuação do jogador
	public abstract int getPontuacao();
	//Informa se o jogo continua ou não
	public abstract boolean getSituacao();
	//Informa uma mensagem ao inicio de cada rodada
	public abstract String getMensagem();
	
}
