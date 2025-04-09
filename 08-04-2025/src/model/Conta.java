package model;

import java.util.Random;

public class Conta {

	// Atributos
    public String agencia;
    public int numero;
    public String titular;
    public double saldo;

    // Construtor
    public Conta() {

    }

    public Conta(String nome){
        this.titular = nome;
        this.saldo = 0.0;
        this.agencia = gerarAgencia();
    }
    
    public Conta(String nome, double saldo){
    	this.agencia = gerarAgencia();
    	this.titular = nome;
        this.saldo = saldo;
        
    }
    
    public Conta(String agencia, int numero, String titular, double saldo) {
        this.agencia = gerarAgencia();
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
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public String gerarAgencia(){
        Random random = new Random();
        int numero = random.nextInt(10000); // Gera um número aleatório entre 0 e 9999
        return String.format("%04d", numero);
    }
}
