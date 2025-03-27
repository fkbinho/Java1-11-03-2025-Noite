package revisao;

public class EstruturaIf {

	public static void main(String[] args) {

//		int idade = 5;
//		
//		if (idade >= 18) {
//			System.out.println("É adulto.");
//		} else if (idade >=12) {
//			System.out.println("Adolescente.");
//		} else {
//			System.out.println("Criança");
//		}
//		
//		System.out.println();
//		
//		if(idade % 2 == 0) {
//			System.out.println("É par!");
//		} else {
//			System.out.println("É ímpar!");
//		}
//		
//		System.out.println();
		int num = 25;
		
		if (num <=1) {
			System.out.println("Não é primo");
		} else if (num == 2 || num == 3 || num == 5 || num == 7) {
			System.out.println("É primo");
		} else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0){
			System.out.println("Não é primo");
		} else {
			System.out.println("É primo");
		}
	}

}