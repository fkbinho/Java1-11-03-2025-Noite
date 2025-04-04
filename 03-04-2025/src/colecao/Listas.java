package colecao;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		
		List<String> nomes = new ArrayList<>();
		nomes.add("Tadeu");
		nomes.add("Bianca");
		nomes.add("Pedro");
		nomes.add("Arthur");
		nomes.add("Kleber");
		nomes.add("João");
		
		System.out.println(nomes);
		System.out.println(nomes.size());
		
		nomes.remove(2);
		
		System.out.println(nomes);
		System.out.println(nomes.size());
		
		boolean contem = nomes.contains("Kleber");
		
		System.out.println(nomes);
		System.out.println("Contem kleber?" + contem);
		
		System.out.println(nomes.get(4));
		
		nomes.set(3, "Fabiana");
		System.out.println(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println();
		
		// for each
		for(String a : nomes) {
			System.out.println(a);
		}
		
		System.out.println(nomes.indexOf("Fabiana")); 
		
		nomes.add(1, "Bambu");
		System.out.println(nomes);
	}

}
