package Exercicio;

import java.util.Random;
import java.util.Scanner;

public class WhileExercise {

	public static void main(String[] args) {
		
		/* Crie um programa que gere um número aleatório entre 1 e 100. 
		   O usuário deve tentar adivinhar esse número.
		   O programa deve dizer se o número digitado é 
		   maior ou menor do que o correto.
		   O jogador tem apenas 7 tentativas.
		   Se errar todas, o programa exibe: 
		   "Você perdeu! O número correto era X".
		*/
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int limiteTentativas = 7;
		int tentativas = 0;
		boolean acertou = false;
		
		int numeroSecreto = random.nextInt(100) + 1;
		
		System.out.println("Bem vindo ao jogo de advinhação!");
		System.out.println("Tente adivinhar o numero secreto!");
		System.out.println("Você tem " + limiteTentativas + " tentativas");
		System.out.println(numeroSecreto);
		while (tentativas < limiteTentativas) {
			
			System.out.println("Digite seu palpite:");
			int palpite = scan.nextInt();
			
			tentativas += 1;
//			tentativas = tentativas + 1;
			
			if (palpite == numeroSecreto) {
				System.out.println("Parabéns! Você acertou o número secreto!");
				acertou = true;
				break;
			} else if (palpite < numeroSecreto) {
				System.out.println("Tente um número maior.\n");
			} else {
				System.out.println("Tente um número menor.\n");
			}
			
			System.out.println("Você tem " + 
					(limiteTentativas - tentativas) + " tentativas restantes");
		}
				
		if (!acertou) {
			System.out.println("Você perdeu! O número secreto é: " + numeroSecreto);
		}
		
	}

}
