package model;

import java.util.Random;

public class Conta {

	private static int sequencial = 1000;

    // Atributos
    private String agencia;
    private int numero;
    private Cliente titular;
    private double saldo;

//    // Construtor
//    public Conta() {
//
//    }

    public Conta(Cliente titular){
        this.titular = titular;
        this.agencia = gerarAgencia();
        this.saldo = 0.0;
        this.numero = sequencial++;
    }
    
    public Conta(Cliente titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = gerarAgencia();
        this.numero = sequencial++;
    }
    
    public Conta(String agencia, int numero, Cliente titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Métodos
    
    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido para depósito.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }
    
    public boolean sacar(double valor){
        if(valor <= 0 || valor > saldo){
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }
    
    public void transferir(double valor, Conta suaConta){
        if(sacar(valor)){
            suaConta.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para a conta " + suaConta.numero);
        } else {
            System.out.println("Transferência falhou. Verifique o valor e o saldo.");
        }
    }

    public void exibirDados(){
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: " + saldo);
    }

    private String gerarAgencia(){
        Random random = new Random();
        int numero = random.nextInt(10000); // Gera um número aleatório entre 0 e 9999
        return String.format("%04d", numero);
    }

    // Getters e Setters
    public static int getSequencial() {
        return sequencial;
    }

    public static void setSequencial(int sequencial) {
        Conta.sequencial = sequencial;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString(){
        return "Agência: " + agencia + "\n" +
                "Número: " + numero + "\n" +
                "Titular: " + titular.getNome() + "\n" +
                "Saldo: " + saldo + "\n";
    }
}
