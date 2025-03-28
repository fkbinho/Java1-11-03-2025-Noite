package revisao_continuacao;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		String resultado = (numero % 2 == 0) ? "É par" : "É ímpar";
		
		System.out.println(resultado);

	}

}
