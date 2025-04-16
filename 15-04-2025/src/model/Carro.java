package model;

public class Carro extends Veiculo implements Checagem {

	private String cor;
	
	public Carro(String marca, String modelo, String cor) {
		super(marca, modelo);
		this.cor = cor;
	}

	@Override
	public void exibirDados() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cor: " + cor);
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando o carro.");
	}

	@Override
	public void chegar() {
		// TODO Auto-generated method stub
		
	}

	
	
}
