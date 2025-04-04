package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio {

	public static void main(String[] args) {
		// 1) Crie uma Lista com vinte números aleatórios.
		List<Integer> numeros = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 0; i < 20; i++) {
			numeros.add(r.nextInt(100) + 1);
		}
		System.out.println(numeros);
		// 2) Adicione o número 11 à Lista criada no exercício 
		// anterior.
		numeros.add(11);
		System.out.println(numeros);
		// 3) Remova o número na 5ª posição da Lista.
		numeros.remove(4); // indice é de 0, 1, 2 ....
		// 4) Concatene a Lista atual com uma nova Lista 
		// contendo os números de 12 a 15.
//		List<Integer> novaLista = new ArrayList<>(Arrays.asList(12, 13, 14, 15));
		List<Integer> novaLista = new ArrayList<>();
		novaLista.add(12);
		novaLista.add(13);
		novaLista.add(14);
		novaLista.add(15);
		
		numeros.addAll(novaLista);
		System.out.println(numeros);
		// 5) Encontre o comprimento da Lista resultante.
		System.out.println("O tamanho da lista atual é: " + numeros.size());
		// 6) Verifique se o número 8 está presente na Lista.
		System.out.println("Contem 8? " + numeros.contains(8));
		// 7) Inverta a ordem dos elementos na Lista.
//		for(int i = 0; i < numeros.size(); i++) {
//			int valor = numeros.getLast();
//			numeros.removeLast();
//			numeros.add(i, valor);
//		}
		Collections.reverse(numeros);
		System.out.println(numeros);
		// 8) Remova todos os números pares da Lista.
//		List<Integer> impares = new ArrayList<>();
//			
//		for(int i = 0; i < numeros.size(); i++) {
//			if(numeros.get(i) % 2 != 0) {
//				impares.add(numeros.get(i));
//			}
//		}
//		numeros.removeAll(numeros);
//		numeros.addAll(impares);

		numeros.removeIf((numero -> numero % 2 == 0));
		System.out.println(numeros);
		// 9) Substitua o valor da 3ª posição por 30.
		numeros.set(2, 30);
		System.out.println(numeros);
		
		// 10) Ordene a Lista de forma crescente.
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}
