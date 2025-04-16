package models;

public abstract class Funcionario {
	
	private String nome;
	private double salarioBase;
	
	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public void registrarEntrada() {
		System.out.println("Entrada registrada para " + nome + " as 8:00.");
	}
	
	public void registrarSaida() {
		System.out.println("Saída registrada para " + nome + " as 17:00.");
	}
	
	public abstract double calcularSalario();
	
	public abstract String gerarContraCheque();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	

}
