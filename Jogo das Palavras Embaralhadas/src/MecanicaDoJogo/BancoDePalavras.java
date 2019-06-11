package MecanicaDoJogo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BancoDePalavras {
	
	private String nomeDoArquivo;
	private String palavra;
	
	public BancoDePalavras() {
		nomeDoArquivo = System.getProperty("user.dir")+"/src/bancoDePalavras.txt";
	}

	public String getPalavra() {
		encontrarPalavra();
		return palavra;
	}
	
	private void encontrarPalavra() {
		ArrayList<String> palavras = new ArrayList<String>();
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader(this.nomeDoArquivo));
			while(scanner.hasNext()) {
				palavras.add(scanner.next());
			}
		} catch (FileNotFoundException e) {
			e.getMessage();
		} finally {
			scanner.close();
			int random = (int) (Math.random() * palavras.size());
			palavra = palavras.get(random);
		}
	}
	
}
