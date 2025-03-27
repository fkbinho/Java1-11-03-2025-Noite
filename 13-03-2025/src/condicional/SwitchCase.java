package condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 1 e 7");
		int dia = scan.nextInt();

		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		if(dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda");
		} else if (dia == 3) {
			System.out.println("Terça");
		} else if (dia == 4) {
			System.out.println("Quarta");
		} else if (dia == 5 ) {
			System.out.println("Quinta");
		} else if (dia == 6) {
			System.out.println("Sexta");
		} else if (dia == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Dia inválido");
		}
		
//		String nome = "Kleber";
//		
//		switch(nome) {
//		case "Kleber":
//			System.out.println("Diogo está presente");
//			break;
//		case "Diogo":
//			System.out.println("Kleber está presente");
//			break;
//		case "Aline":
//			System.out.println("Aline está presente");
//			break;
//		default:
//			System.out.println("Opção inválida");
//		}
		
		scan.close();
	
	}

}
