package model;

public abstract class Veiculo {
	
	private String marca;
	private String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void ligar() {
		System.out.println("Ligando o veículo. ");
	}
	
	public void desligar() {
		System.out.println("Desligando o veículo. ");
	}
	
	public abstract void exibirDados();
	
	public abstract void acelerar();
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
