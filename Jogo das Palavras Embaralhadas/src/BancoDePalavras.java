
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BancoDePalavras {

	private String nomeDoArquivo;
	private String palavraSelecionada;
	
	public BancoDePalavras() {
		this.nomeDoArquivo = System.getProperty("user.dir")+"/src/bancoDePalavras.txt";
		this.encontrarPalavra();
	}

	public String getPalavraSelecionada() {
		return palavraSelecionada;
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
			this.palavraSelecionada = palavras.get(random);
		}
	}
	
}
