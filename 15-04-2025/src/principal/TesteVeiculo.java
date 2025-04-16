package principal;

import model.Carro;

public class TesteVeiculo {

	public static void main(String[] args) {

		Carro carro = new Carro("Fiat", "Uno", "Preto");
		Carro carro2 = new Carro("Fiat", "Palio", "Branco");
		
		carro.ligar();
		carro.desligar();
		System.out.println("-----------------");
		carro.exibirDados();
		
		Carro v1 = new Carro("Fiat", "Uno", "Vermelho");
		
		v1.ligar();
		v1.desligar();
		System.out.println("-----------------");
		v1.exibirDados();
	}

}
