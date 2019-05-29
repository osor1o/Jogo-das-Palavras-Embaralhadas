
public class FabricaMecanicaDoJogo {

	private static FabricaMecanicaDoJogo instancia = null;
	
	private FabricaMecanicaDoJogo() {
		
	}

	public static FabricaMecanicaDoJogo getInstancia(String palavra) {
		if(instancia == null) {
			instancia = new FabricaMecanicaDoJogo();
		}
		return instancia;
	}
	
}
