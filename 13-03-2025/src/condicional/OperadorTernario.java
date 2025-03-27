package condicional;

public class OperadorTernario {

	public static void main(String[] args) {

		int numero = 13;

		String situacao = (numero % 2 == 0) ? "É par" : "É impar";

		System.out.println(situacao);
	}

}
