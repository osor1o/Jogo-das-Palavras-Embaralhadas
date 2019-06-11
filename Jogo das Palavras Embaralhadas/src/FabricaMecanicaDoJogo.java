import java.util.ArrayList;

import MecanicaDoJogo.*;

public class FabricaMecanicaDoJogo {
	
	private ArrayList<MecanicaDoJogo> mecanicas;
	
	public FabricaMecanicaDoJogo() {
		mecanicas = new ArrayList<MecanicaDoJogo>();
		mecanicas.add(new MorteSubita());
		mecanicas.add(new TresChances());
	}
	
	public MecanicaDoJogo getMecanica(int i) {
		int size = mecanicas.size() - 1;
		if(i > size)
			return mecanicas.get(size);
		if(i < 0)
			return mecanicas.get(0);
		return mecanicas.get(i);
	}
	
	public String getMenu() {
		String menu = "";
		int i = 0;
		for (MecanicaDoJogo mecanicaDoJogo : mecanicas) {
			menu += i+" - ";
			menu += mecanicaDoJogo.getNome();
			menu += " ("+ mecanicaDoJogo.getRegras() +")";
			menu += "\n";
			i++;
		}
		return menu;
	}
	
}
