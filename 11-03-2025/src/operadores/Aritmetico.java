package operadores;

public class Aritmetico {
	public static void main(String[] args) {
		
		// Operadores Aritiméticos
		/*
		   + -> soma
		   - -> subtracao
		   * -> multiplicacao
		   / -> divisao
		   % -> resto
		 */
		
		int valor1 = 8;
		int valor2 = 3;
		
		// soma
		int soma = valor1 + valor2;
		System.out.println("Soma: " + soma); // concatenação
		
		// subtracao
		int subtracao = valor1 - valor2;
		System.out.println("Subtração: " + subtracao);
		
		// multiplicacao 
		int multiplicacao = valor1 * valor2;
		
		System.out.println("Multiplicação: " + multiplicacao);
		
		// divisao
		double divisao = (double) valor1 / valor2; // casting
		System.out.printf("Divisão: %.2f%n", divisao);
		
		// resto
		int resto = valor1 % valor2;
		System.out.println("Resto: " + resto);
		
		
		
		
	}
	
}
