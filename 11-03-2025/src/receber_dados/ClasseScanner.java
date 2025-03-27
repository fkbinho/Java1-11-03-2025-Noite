package receber_dados;

import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		scan.nextLine(); // limpar o buffer
		
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		
		System.out.println("Seu nome é: " + nome);
		
		System.out.println("Digite seu sobrenome:");
		String sobreNome = scan.nextLine();
		
		System.out.println("Seu nome é: " + sobreNome);
		
		System.out.println("Digite seu ultimo nome:");
		String ultimoNome = scan.nextLine();
		
		System.out.println("Seu nome é: " + ultimoNome);
		
		System.out.println("Digite seu peso:");
		double peso = scan.nextDouble();
		
		System.out.println("Seu peso é: " + peso);
		
		
		
		scan.close();
	}
	
}
