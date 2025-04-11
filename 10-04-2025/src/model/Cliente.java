package model;

public class Cliente extends Pessoa {

	 // Atributos
    public String profissao;
    public double salario;

    // Construtor
    public Cliente(String nome) {
        super(nome);
    }
    public Cliente(String nome, int idade, String cpf,
                   String sexo, String profissao, double salario) {
        
    	super(nome, idade, cpf, sexo);
        this.profissao = profissao;
        this.salario = salario;
    }

    // Métodos
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Profissão: " + profissao);
        System.out.println("Salário: " + salario);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Profissão: " + profissao + "\n" +
                "Salário: " + salario + "\n";

    }
}
