package revisao_continuacao;

import java.util.Scanner;

public class SistemaBanco {

	public static void main(String[] args) {
		/*
		 * O usuário começa com um saldo inicial e pode escolher entre as opções: 1 -
		 * Depositar 2 - Transferir 3 - Sacar 4 - Sair O programa deve validar que não é
		 * possível transferir ou sacar mais do que o saldo disponível. Após cada
		 * operação, o saldo atualizado deve ser exibido. O programa só deve encerrar
		 * quando o usuário escolher a opção 4 - Sair.
		 */

		Scanner scan = new Scanner(System.in);

		double saldo = 1000.0;

		String menu = """
				Escolha uma das opções:
				1 - Depositar
				2 - Transferir
				3 - Sacar
				4 - Sair
				""";
		System.out.print(menu);
		int opcao = scan.nextInt();

		switch(opcao) {
		case 1:
			System.out.println("Informe o valor para o deposito: ");
			double deposito = scan.nextDouble();
			
			if (deposito > 0) {
				saldo += deposito;
				System.out.println("Depósito efetuado!");
			} else {
				System.out.println("Valor inválido!");
			}
		break;
		case 2:
			System.out.println("Informe o valor para a transferência: ");
			double transferir = scan.nextDouble();
			
			if(transferir > 0 && transferir <= saldo) {
				saldo -= transferir;
				System.out.println("Transferência realizada com sucesso!");
			} else {
				System.out.println("Valor inválido.");
			}
		break;
		case 3:
			System.out.println("Informe o valor para o saque: ");
			double saque = scan.nextDouble();
			
			if(saque > 0 && saque <= saldo) {
				saldo -= saque;
				System.out.println("Transferência realizada com sucesso!");
			} else {
				System.out.println("Valor inválido para saque!");
			}
		break;
		case 4:
			System.out.println("Obrigado por usar no banco!");
		break;
		default:
			System.out.println("Opção inválida.");
		}
		


//		saldo = switch (opcao) {
//			case 1 -> {
//				System.out.println("Informe o valor para o deposito: ");
//				double deposito = scan.nextDouble();
//	
//				if (deposito > 0) {
//					System.out.println("Depósito efetuado!");
//					yield saldo + deposito;
//	
//				} else {
//					System.out.println("Valor inválido!");
//					yield saldo;
//				}
//			}
//			case 2 -> {
//				System.out.println("Informe o valor para a transferência: ");
//				double transferir = scan.nextDouble();
//				
//				if(transferir > 0 && transferir <= saldo) {
//					System.out.println("Transferência realizada com sucesso!");
//					yield saldo - transferir;
//				} else {
//					System.out.println("Valor inválido.");
//					yield saldo;
//				}
//			}
//			// FALTAM OS CASES 3 E 4
//			default -> {
//				System.out.println("Opção inválida");
//				yield saldo;
//			}
//		};

		System.out.println("Saldo atual: " + saldo);
	}
}
