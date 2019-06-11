import MecanicaDoJogo.*;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		
		while(continuar) {
			FabricaMecanicaDoJogo jogo = new FabricaMecanicaDoJogo();
			
			System.out.println("Bem Vindo ao jogo das palavras embaralhadas. Selecione um modo de jogo:");
			System.out.println(jogo.getMenu());
			
			System.out.print("> ");
			int mecanicaSelecionada = s.nextInt();
			
			//
			
			MecanicaDoJogo mecanica = jogo.getMecanica(mecanicaSelecionada);
			
			while(!mecanica.getAcabou()) {
				
				System.out.println(mecanica.getPalavraEmbaralhahda());
				
				System.out.print("> ");
				String resposta = s.next();
				mecanica.responder(resposta);
			}
			
			//informar que o jogo acabou e a pontuação
			System.out.println("----------------");
			System.out.println("Jogo Finalizado!");
			System.out.println("pontuação: " + mecanica.getPontuacao());
			System.out.println("----------------");
			
			//
			
			System.out.println("Deseja Jogar Novamente? (S/N)");
			System.out.println("> ");
			String desejaContinuar = s.next();
			System.out.println(desejaContinuar);
			
			if(!desejaContinuar.equalsIgnoreCase("S")) {
				continuar = false;
			}
		}
		
	}

}
