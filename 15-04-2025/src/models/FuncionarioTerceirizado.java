package models;

public class FuncionarioTerceirizado extends Funcionario {

	private int horasExtras;
	private double valorPorHora;
	
	public FuncionarioTerceirizado(String nome, double salarioBase, int horasExtras, double valorPorHora) {
		super(nome, salarioBase);
		this.horasExtras = horasExtras;
		this.valorPorHora = valorPorHora;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + (horasExtras * valorPorHora);
	}

	@Override
	public String gerarContraCheque() {
		return	"""
				Relatório de Funcionário Terceirizado
				Nome: %s
				Salário Base: %.2f
				Horas Extras: %d
				Valor por Hora: %.2f
				Salário Total: %.2f
				""".formatted(getNome(), getSalarioBase(), horasExtras, valorPorHora, calcularSalario());
	}

}
