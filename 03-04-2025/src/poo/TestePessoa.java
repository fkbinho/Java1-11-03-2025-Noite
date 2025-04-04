package poo;

import colecao.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
        // Criando uma instância da classe Pessoa - objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 30;
        pessoa1.sexo = 'M';
        pessoa1.profissao = "Engenheiro";
        pessoa1.exibirInformacoes();
        
        System.out.println();
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 25;
        pessoa2.sexo = 'F';
        pessoa2.profissao = "Médica";
        pessoa2.exibirInformacoes();
	}

}
