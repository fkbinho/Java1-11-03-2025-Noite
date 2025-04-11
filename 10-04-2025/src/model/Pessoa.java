package model;

public class Pessoa {
	
	// Atributos
    private String nome;
    private int idade;
    private String cpf;
    private String sexo;

//    // Construtor
//    public Pessoa() {
//    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade, String cpf, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
    }

    // Getters e Setters
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
    
    
    @Override
    public String toString() {
        return "Nome:" + nome + "\n" +
                "Idade: " + idade + "\n" +
                "CPF: " + cpf + "\n" +
                "Sexo: " + sexo + "\n";
    }

}
