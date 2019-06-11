package MecanicaDoJogo;
import java.util.ArrayList;

import Embaralhador.*;

public class FabricaDeEmbaralhadores {
	
	private ArrayList<Embaralhador> embaralhadores;
	
	public FabricaDeEmbaralhadores() {
		embaralhadores = new ArrayList<Embaralhador>();
		embaralhadores.add(new Invertido());
		embaralhadores.add(new FaltamDuasLetras());
	}
	
	public Embaralhador getEmbaralhador() {
		int random = (int) (Math.random() * embaralhadores.size());
		return embaralhadores.get(random);
	}

}
