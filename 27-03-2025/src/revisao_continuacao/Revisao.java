package revisao_continuacao;

import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {

		/*
		 * Variável e Tipo de dados
		 * Operdores
		 * Estrutura condicional IF
		 *  ------------------------------------
		 * Exercício
		 * Switch Case
		 * Laço de repetição
		 *  ------------------------------------
		 * -> Se houver tempo iremos ver Arrays <-
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas vezes quer repetir: ");
		int vezes = scan.nextInt();
		
		int contador = 0;
		do {
			System.out.println("Digite um número(ou -1 para encerrar): ");
			int numero = scan.nextInt();
			contador = contador + 1;
			
			if(numero <= 1) {
				System.out.println("O número " + numero + " não é PRIMO!");
			} else if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
				System.out.println("O número " + numero + " é PRIMO!");
			} else if (numero % 2 == 0 || numero % 3 == 0 || 
					numero % 5 == 0 || numero % 7 == 0) {
				System.out.println("O número " + numero + " não é PRIMO!");
			} else if (numero % Math.sqrt(numero) == 0) {
				System.out.println("O número " + numero + " não é PRIMO!");
			} else {
				System.out.println("O número " + numero + " é PRIMO!");
			}
		} while(contador < vezes);
		
	}

}
