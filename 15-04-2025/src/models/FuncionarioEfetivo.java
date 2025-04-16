package models;

public class FuncionarioEfetivo extends Funcionario {

	private double bonificacao;
	
	public FuncionarioEfetivo(String nome, double salarioBase, double bonificacao) {
		super(nome, salarioBase);
		this.bonificacao = bonificacao;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + bonificacao;
	}

	@Override
	public String gerarContraCheque() {
		return """
				Relatório de Funcionário Efetivo
				Nome: %s
				Salário Base: %.2f
				Bonificação: %.2f
				Salário Total: %.2f
				""".formatted(getNome(), getSalarioBase(), bonificacao, calcularSalario());

//		return String.format(
//				"""
//				Relatório de Funcionário Efetivo
//				Nome: %s
//				Salário Base: %.2f
//				Bonificação: %.2f
//				Salário Total: %.2f
//				""", getNome(), getSalarioBase(), bonificacao, calcularSalario());
	}
	
}
