package exercicio;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {

		/*
		 * Crie um jogo simples de Pedra, Papel e Tesoura. O jogador escolhe uma opção
		 * (Pedra, Papel, Tesoura), o computador escolhe aleatoriamente uma opção e o
		 * programa determina o vencedor.
		 * 
		 * Regras:
		 * 
		 * Pedra ganha da Tesoura Tesoura ganha do Papel Papel ganha da Pedra
		 */
		
		// 1º - Instância Scanner
		Scanner scan = new Scanner(System.in);
		
		// 2º - Instância Random
		Random r = new Random();

		int opcaoComputador = r.nextInt(3);

		String jogadaComputador;

		if (opcaoComputador == 0) {
			jogadaComputador = "Pedra";
		} else if (opcaoComputador == 1) {
			jogadaComputador = "Papel";
		} else {
			jogadaComputador = "Tesoura";
		}

		String menu = """
				Escolha uma opção:
				----------------------------
				Pedra
				Papel
				Tesoura
				""";

		System.out.println(menu);
		String jogadaUsuario = scan.nextLine();
		
		if(!(jogadaUsuario.equalsIgnoreCase("Pedra") || jogadaUsuario.equalsIgnoreCase("Papel") 
				|| jogadaUsuario.equalsIgnoreCase("Tesoura"))) {
			System.out.println("Opção inválida");
		} else {

			if (jogadaUsuario.equalsIgnoreCase(jogadaComputador)) {
				System.out.println("O usuário escolheu: " + jogadaUsuario);
				System.out.println("O computador escolheu: " + jogadaComputador);
				System.out.println("Empate");
			} else if (
					(jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaComputador.equalsIgnoreCase("Tesoura"))
					|| 
					(jogadaUsuario.equalsIgnoreCase("Papel") && jogadaComputador.equalsIgnoreCase("Pedra"))
					|| 
					(jogadaUsuario.equalsIgnoreCase("Tesoura") && jogadaComputador.equalsIgnoreCase("Papel"))
				) {
				System.out.println("O usuário escolheu: " + jogadaUsuario);
				System.out.println("O computador escolheu: " + jogadaComputador);
				System.out.println("Você ganhou!");
			} else {
				System.out.println("O usuário escolheu: " + jogadaUsuario);
				System.out.println("O computador escolheu: " + jogadaComputador);
				System.out.println("Você Perdeu! ='( ");
			}
		}
	
	}
}
