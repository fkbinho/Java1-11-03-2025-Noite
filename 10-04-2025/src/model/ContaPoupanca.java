package model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    public ContaPoupanca(Cliente titular, double saldo) {
        super(titular, saldo);
    }

    public ContaPoupanca(String agencia, int numero, Cliente titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }
	
}
