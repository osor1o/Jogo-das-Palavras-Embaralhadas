package MecanicaDoJogo;
import java.util.ArrayList;

import Embaralhador.*;

public class FabricaDeEmbaralhadores {
	
	private ArrayList<Embaralhador> embaralhadores;
	
	public void Embaralhador() {
		embaralhadores.add(new Invertido());
		embaralhadores.add(new FaltamDuasLetras());
	}
	
	public Embaralhador getEmbaralhador() {
		// sortear um embaralhador aleatoriamente
		return null;
	}

}
