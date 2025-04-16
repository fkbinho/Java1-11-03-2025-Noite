package model;

public class Moto extends Veiculo implements Checagem{

	private int cilindrada;
	
	public Moto(String marca, String modelo, int cilindrada) {
		super(marca, modelo);
		this.cilindrada = cilindrada;
	}

	@Override
	public void exibirDados() {
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Modelo: " + super.getModelo());
		System.out.println("Cilindrada: " + this.cilindrada);
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando a moto.");
		
	}

	@Override
	public void chegar() {
		// TODO Auto-generated method stub
		
	}

}
