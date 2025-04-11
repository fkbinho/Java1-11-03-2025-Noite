package principal;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		
        Cliente bruno = new Cliente("Bruno Gusmão");

		Cliente marcos = new Cliente("Marcos Camilo");

        System.out.println(bruno);

        System.out.println("------------------------------");
        ContaCorrente cc = new ContaCorrente(bruno);
        ContaCorrente cc2 = new ContaCorrente(marcos);

        ContaPoupanca cp = new ContaPoupanca(bruno);
        ContaPoupanca cp2 = new ContaPoupanca(marcos);

        cc.exibirDados();
        System.out.println("------------------------------");
        cc2.exibirDados();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println(cc);
        System.out.println("------------------------------");

        cc.depositar(10000);
        cc.transferir(9999,cp2);

        System.out.println("-------------------------------");
        System.out.println("Agência de Bruno " + cc.getAgencia());
        System.out.println("Agência de Marcos " + cc2.getAgencia());
        System.out.println("Número da conta de Bruno " + cc.getNumero());
        System.out.println("Número da conta de Marcos " + cc2.getNumero());

        System.out.println("Saldo Bruno CC: " + cc.getSaldo());
        System.out.println("Saldo Marcos CC: " + cc2.getSaldo());
        System.out.println("Saldo Bruno CP: " + cp.getSaldo());
        System.out.println("Saldo Marcos CP: " + cp2.getSaldo());
        System.out.println("-------------------------------");
        
        // Usando setters
        cc.setTitular(new Cliente("Tadeu Silva"));
        cc.setNumero(115359);
        
        System.out.println("Novo titular da conta: " + cc.getTitular().getNome());
        System.out.println("Novo número da conta: " + cc.getNumero());
        
	}

}
