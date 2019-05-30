import java.util.ArrayList;

import Embaralhador.*;

public class FabricaDeEmbaralhadores {
	
	private Embaralhador embaralhador;
	private static FabricaDeEmbaralhadores instancia = null;
	
	private FabricaDeEmbaralhadores() {}
	
	public static FabricaDeEmbaralhadores getInstancia() {
		if(instancia == null) {
			instancia = new FabricaDeEmbaralhadores();
		}
		return instancia;
	}
	
	public Embaralhador getEmbaralhador(String palavra) {
		setEmbaralhador(palavra);
		return embaralhador;
	}
	
	private void setEmbaralhador(String palavra) {
		ArrayList<Embaralhador> embaralhadores = new ArrayList<Embaralhador>();
		
		embaralhadores.add(new FaltamDuasLetras(palavra));
		embaralhadores.add(new Invertido(palavra));
		
		int random = (int) (Math.random() * embaralhadores.size());
		this.embaralhador = embaralhadores.get(random);
	}

}
