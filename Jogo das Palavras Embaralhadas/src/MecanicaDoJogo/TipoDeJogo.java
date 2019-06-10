package MecanicaDoJogo;

public abstract class TipoDeJogo implements MecanicaDoJogo {
	
	protected FabricaDeEmbaralhadores fabrica;
	protected BancoDePalavras banco;

	abstract public String getPalavraEmbaralhahda();
	abstract public int getPontuacao();
	abstract public boolean getAcertou();
	abstract public boolean getPerdeu();
	abstract public boolean getVenceu();
	abstract public String setResposta();

}
