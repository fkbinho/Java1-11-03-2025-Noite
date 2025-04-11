package model;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public ContaCorrente(Cliente titular, double saldo) {
        super(titular, saldo);
    }

    public ContaCorrente(String agencia, int numero, Cliente titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }
	
}
