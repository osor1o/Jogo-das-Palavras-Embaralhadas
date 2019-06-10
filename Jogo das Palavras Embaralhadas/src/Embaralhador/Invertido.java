package Embaralhador;

public class Invertido implements Embaralhador {

	public String embaralhar(String palavra) {
		StringBuffer sb = new StringBuffer(palavra);
		sb.reverse();
		return sb.toString();
	}
	
}
