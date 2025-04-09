package principal;

import model.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		// Instanciando um objeto da classe Conta
        Conta minhaConta = new Conta("1234", 56789, "João Silva", 1000.00);

        // Exibindo os dados da conta
        minhaConta.exibirDados();

        minhaConta.depositar(-500.00);
        minhaConta.sacar(1200.00);
        System.out.println("Saldo após operações: " + minhaConta.saldo);

        System.out.println("-------------------------");

        Conta suaConta = new Conta("5678", 98765, "Maria Oliveira", 500.00);

        suaConta.exibirDados();
        
        minhaConta.transferir(200.00, suaConta);
        System.out.println("Saldo após operações: " + suaConta.saldo);

        Conta contaBruno = new Conta("Bruno", 100.00);
        contaBruno.exibirDados();

	}

}
