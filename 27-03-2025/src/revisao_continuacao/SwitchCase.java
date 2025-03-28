package revisao_continuacao;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digie o sinal:");
		String sinal = scan.nextLine().toUpperCase().trim();
		
		// switch case moderno
		String resultado = switch(sinal) {
					case "VERDE" -> "Siga em frente!";
					case "AMARELO"-> "Atenção!";
					case "VERMELHO" -> "Aguarde abrir o sinal!";
					default -> "Condição inválida!";
					};

		System.out.println(resultado);
	}

}
