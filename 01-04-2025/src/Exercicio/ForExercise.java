package Exercicio;

import java.util.Scanner;

public class ForExercise {

	public static void main(String[] args) {

		/*
		   Crie um programa que peça uma palavra ao usuário e 
		   conte quantas vogais (a, e, i, o, u) existem na palavra.
		 * */
		
		Scanner scan = new Scanner(System.in);
		int contVogal = 0;
		int contConsoante = 0;
		
		System.out.println("Digite uma palavra:");
		String palavra = scan.nextLine().trim();
		
//				0 1 2 3 4 5
//				B A N A N A
		for(int i = 0; i < palavra.length(); i++) { // i = i + 1;
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' 
					|| palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o'
					|| palavra.charAt(i) == 'u') {
				
				contVogal++;
			} else {
				contConsoante++;
			}
		}
		
		System.out.println("A palavra\" "+ palavra +"\" tem " + contVogal + " vogais.");
		System.out.println("A palavra\" "+ palavra +"\" tem " + contConsoante + " consoantes.");
	}

}
