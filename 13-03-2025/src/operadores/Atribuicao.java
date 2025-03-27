package operadores;

import java.util.Scanner;

public class Atribuicao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.print("Informe o produto: \n");
		String produto = scan.nextLine();
		
		System.out.print("Informe o estoque: \n");
		int estoque = scan.nextInt();
		// estoque += 8;
		estoque = estoque + 8;
		
		System.out.printf("O produto %s está com o estoque atual de %d", produto, estoque);
		
		scan.close();
	}

}
