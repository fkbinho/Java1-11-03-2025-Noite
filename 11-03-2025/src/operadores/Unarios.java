package operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int x = 1; // 2 - 3
		
		System.out.println(x++); // 1
		System.out.println(x);   // 2 
		System.out.println(++x); // 3 

		int y = 2;
		
		System.out.println(--y);  // 1
		System.out.println(y);    // 1
		System.out.println(y--);  // 1
		System.out.println(y);    // 0
	}

}
