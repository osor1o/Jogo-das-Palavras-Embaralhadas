package MecanicaDoJogo;

import Embaralhador.Embaralhador;;

public abstract class MecanicaDoJogo {
	
	protected String nome;
	protected String regras;
	protected int pontuacao = 0;
	protected String palavraEmaralhada;
	protected String palavraCorreta;
	protected boolean acabou;
	protected FabricaDeEmbaralhadores fabrica;
	protected BancoDePalavras banco;
	
	public abstract void responder(String resposta);
	
	public MecanicaDoJogo() {
		fabrica = new FabricaDeEmbaralhadores();
		banco = new BancoDePalavras();
	}
	
	protected String embaralhar(String palavra) {
		Embaralhador embaralhador = fabrica.getEmbaralhador();
		return embaralhador.embaralhar(palavra);
	}
	
	protected void novaRodada() {
		String palavraSorteada = banco.getPalavra();
		palavraCorreta = palavraSorteada;
		palavraEmaralhada = embaralhar(palavraSorteada);
	}
	
	public boolean getAcabou() {
		return acabou;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRegras() {
		return regras;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
	
	public String getPalavraEmbaralhahda() {
		return palavraEmaralhada;
	}

}
