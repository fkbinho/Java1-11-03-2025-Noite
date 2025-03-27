package condicional;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o mês:");
		int mes = scan.nextInt();
		
		switch(mes) {
		case 1, 2, 3:
			System.out.println("Primeiro trimestre");
			break;
		case 4, 5, 6:
			System.out.println("Segundo trimestre");
			break;
		case 7, 8, 9:
			System.out.println("Terceiro trimestre");
			break;
		case 10, 11, 12:
			System.out.println("Quarto trimestre");
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		
		scan.close();
	}

}
