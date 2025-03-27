package laco_repeticao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite um valor para inicio");
//		int inicio = scan.nextInt();
//		
//		System.out.println("Digite um valor para inicio");
//		int fim = scan.nextInt();
//		
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
//		for(int i = 1; i <= 10; i++) {
//			if(i == 5) {
//				break;
//			}
//			System.out.print(i + " ");
//		}
//		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("Número ímpar: " + i);
		}
		
	}

}
