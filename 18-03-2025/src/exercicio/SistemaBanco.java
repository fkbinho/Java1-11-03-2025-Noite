package exercicio;

import java.util.Scanner;

public class SistemaBanco {

	public static void main(String[] args) {
		/* O usuário começa com um saldo inicial e pode escolher entre as opções:
		   1 - Depositar
		   2 - Transferir
		   3 - Sacar
		   4 - Sair
		   O programa deve validar que não é possível transferir ou sacar mais do 
		   que o saldo disponível.
		   Após cada operação, o saldo atualizado deve ser exibido.
		   O programa só deve encerrar quando o usuário escolher a opção 4 - Sair.
		   */
		
		Scanner scan = new Scanner(System.in);
		
		double saldo = 1000.0;
		
		String menu = """
				Escolha uma das opções:
				1- Depositar
				2- Sacar
				3- Transferir
				4- Sair
				""";
		System.out.println(menu);
		int opcao = scan.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Informe o valor para depósito:");
			double valor = scan.nextDouble();
			if (valor <= 0) {
				System.out.println("Valor inválido para depósito!");
			} else {
				saldo += valor;
				System.out.println("Depósito realizado com sucesso!");
			}
		break;
		case 2:
			
		}
		
		System.out.println("Saldo atual: " + saldo);
	}

}
