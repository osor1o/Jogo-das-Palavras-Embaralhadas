import java.util.ArrayList;

import Embaralhador.*;

public class FabricaDeEmbaralhadores {
	
	private Embaralhador embaralhador;
	private static FabricaDeEmbaralhadores instancia = null;
	
	private FabricaDeEmbaralhadores(String palavra) {
		ArrayList<Embaralhador> embaralhadores = new ArrayList<Embaralhador>();
		
		embaralhadores.add(new FaltamDuasLetras(palavra));
		embaralhadores.add(new Invertido(palavra));
		
		int random = (int) (Math.random() * embaralhadores.size());
		this.embaralhador = embaralhadores.get(random);
	}
	
	public static FabricaDeEmbaralhadores getInstancia(String palavra) {
		if(instancia == null) {
			instancia = new FabricaDeEmbaralhadores(palavra);
		}
		return instancia;
	}

	public Embaralhador getEmbaralhador() {
		return embaralhador;
	}
	
}
