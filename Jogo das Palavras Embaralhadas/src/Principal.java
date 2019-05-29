import Embaralhador.*;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		BancoDePalavras banco = new BancoDePalavras();
		
		FabricaDeEmbaralhadores embaralhadores = FabricaDeEmbaralhadores.getInstancia(banco.getPalavraSelecionada());
		Embaralhador embaralhador = embaralhadores.getEmbaralhador();
		System.out.println(embaralhador.getPalavraCorreta());
		System.out.println(embaralhador.getPalavraEmbaralhada());
	}

}
