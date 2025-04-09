package model;

public class Pessoa{
	
	// Atributos / variáveis de instância
    // public: acessível de qualquer lugar (modificador de acesso)
    public String nome = "Jane Doe";
    public int idade;
    public char sexo;
    public String profissao;

    // Métodos
    // Tipo de retorno:
    // void (não retorna nada)
    public void andar(){
        System.out.println(nome + " está andando.");
    }

    // String (retorna uma string)
    public String correr(){
      return nome + " está correndo.";
    }
	
}
