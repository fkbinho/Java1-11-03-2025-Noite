package principal;

import model.Cliente;

public class TestePessoa {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("João", 30, "12345678900", "Masculino", "Engenheiro", 5000.0);

		cliente.exibirDados();

	}

}
