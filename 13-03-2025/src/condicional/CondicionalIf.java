package condicional;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		/*
		 * operadores lógicos
		 * 
		 * || - ou && - e ! - not
		 * 
		 */

		/*
		 * Solicite ao usuário 3 notas e solicite o seu nome faça a média e imprima o
		 * nome e se o usuario está aprovado, reprovado ou em recuperação media <= 3 ->
		 * reprovador media >= 7 -> aprovado media > 3 e media < 7 -> recuperação
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();

		System.out.println("Informe a terceira nota: ");
		double nota3 = scan.nextDouble();
		scan.nextLine(); // limpar o buffer

		System.out.println("Informe o nome do aluno: ");
		String nome = scan.nextLine();

		double media = (nota1 + nota2 + nota3) / 3;

		String situacao = (media >= 7) ? 
				(media == 10) ? "Aprovado com Louvor": "Aprovado"
					: (media <= 3) ? "Reprovado":"recuperação";

		System.out.println(nome + " está " + situacao);
		
//		if (media >= 7) {
//			if (media == 10) {
//				situacao = "Aprovado com Louvor";
//			} else {
//				situacao = "Aprovado";
//			}
//		} else if (media <= 3) {
//			situacao = "Reprovado";
//		} else {
//			situacao = "Em recuperação";
//		}

//		System.out.printf("%s está %s", nome, situacao);

//		int num = 3;
//		
//		if (num % 2 ==0) {
//			System.out.println("É par");
//		} else {
//			System.out.println("É impar");
//		}

//		int idade = 70;
//		
//		if(idade >= 18 && idade < 70) {
//			System.out.println("Pode votar");
//		} else if (idade < 16) {
//			System.out.println("Não pode votar");
//		} else {
//			System.out.println("voto facultativo");
//		}

//		int x = 4;
//		int y = 7;
//		
//		boolean relacao;
//					
//		relacao = x >= y || y < 7;
//		System.out.println(relacao);
//		
//		relacao = !(x < y) && y > x;
//		System.out.println(relacao);

		scan.close();
	}
}
