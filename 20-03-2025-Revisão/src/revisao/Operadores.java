package revisao;

public class Operadores {
	public static void main(String[] args) {
		
		// -> comentário de linha
		/*
		 * -> Bloco de comentário
		 * */
		
		// Operadores
		/*
		   + soma
		   - subtração
		   * multiplicação
		   / divisão
		   % resto
		 *  */
		
		int valor1 = 25;
		int valor2 = 12;
		int valor3 = -5;
		double valor4 = Math.PI;
		
		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicacao = valor1 * valor2;
		double divisao = (double) valor1 / valor2; //casting
		int resto = valor1 % valor2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto: " + resto);
		
		// Classe Math
		// Exibir no console em formatação
		System.out.printf("Raiz quadrada: %.2f%n", Math.sqrt(valor1));
		System.out.printf("Potência: %.2f%n", Math.pow(valor2,2));
		System.out.println("Valor absoluto: " + Math.abs(valor3));
		System.out.println("Valor absoluto: " + Math.abs(valor3));
		System.out.println("Arredondado: " + Math.round(valor4));
		System.out.println("Arredondado para cima: " + Math.ceil(valor4));
		System.out.println("Arredondado para baixo: " + Math.floor(valor4));
		
		//operador unário
		int x = 1;
	
		// x++ -> x = x + 1;
		System.out.println(x++); // -> x=2;
		System.out.println(x);
		System.out.println(++x);
		System.out.println();

		int y = 2;
		// y-- -> y = y - 1;
		System.out.println(--y);
		System.out.println(y);
		System.out.println(y--);
		System.out.println(y);
		
		System.out.println();
		
		//operador de atribuição
		
		valor1 += 3; //  valor1 = valor1 + 3;
		System.out.println(valor1); //28
		
		valor1 -= 3; //  valor1 = valor1 - 3;
		System.out.println(valor1); // 25
		
		valor1 *= 3; //  valor1 = valor1 * 3;
		System.out.println(valor1); // 75
		
		valor1 /= 3; //  valor1 = valor1 / 3;
		System.out.println(valor1); // 25
		
		valor1 %= 3;
		System.out.println(valor1);
		System.out.println();
		
		// operadores relacionais
		int numero = 7;
		int numero2 = 4;
		
		boolean resultado = numero == numero2;
		System.out.println(resultado);
		
		System.out.println(numero < numero2);
		System.out.println(numero > numero2);
		System.out.println(numero <= numero2);
		System.out.println(numero >= numero2);
		System.out.println(numero != numero2);
		System.out.println();
		
						//     falso        verdadeiro
		boolean resultado2 = numero < 3 || numero > 2;

		boolean resultado3 = numero > 3 && numero != 2;
		
		System.out.println(resultado2);
		System.out.println(resultado3);
	}
}
