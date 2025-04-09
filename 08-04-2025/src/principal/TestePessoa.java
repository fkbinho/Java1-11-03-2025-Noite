package principal;

import model.Pessoa;

public class TestePessoa {

	// Método principal (main)
	public static void main(String[] args) {

		// Instanciando um objeto da classe Pessoa
        Pessoa p1 = new Pessoa();

        p1.nome = "João";
        p1.idade = 30;
        p1.sexo = 'M';
        p1.profissao = "Engenheiro";
        // Exibindo os dados da pessoa
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Sexo: " + p1.sexo);
        System.out.println("Profissão: " + p1.profissao);
        // Chamando o métodos
        p1.andar();
        System.out.println(p1.correr());

        // Instanciando outro objeto da classe Pessoa
        // Exibindo os dados da pessoa
        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 25;
        p2.sexo = 'F';
        p2.profissao = "Médica";

        System.out.println("---------------------");

        // Exibindo os dados da pessoa
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        System.out.println("Sexo: " + p2.sexo);
        System.out.println("Profissão: " + p2.profissao);

        // Chamando o métodos
        p2.andar();
        System.out.println(p2.correr());
	}

}
