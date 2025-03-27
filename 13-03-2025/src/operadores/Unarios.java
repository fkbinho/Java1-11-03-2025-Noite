package operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
//							10 + 19  + 12 - 19
		System.out.println(a++ + --b + ++a - b--);
							//a++ => a = a + 1
		/*
		 * 9
		 * 19
		 * 20 1
		 * 21
		 * */
	}

}
