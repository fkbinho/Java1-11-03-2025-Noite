package principal;

import java.util.ArrayList;
import java.util.List;

import models.Funcionario;
import models.FuncionarioEfetivo;
import models.FuncionarioTerceirizado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(new FuncionarioEfetivo("João", 3000, 500));
		funcionarios.add(new FuncionarioEfetivo("Maria", 3500, 700));
		funcionarios.add(new FuncionarioTerceirizado("Carlos", 2000, 10, 20));
		funcionarios.add(new FuncionarioTerceirizado("Ana", 2500, 15, 25));
		

		for (Funcionario f : funcionarios) {
			f.registrarEntrada();
			f.registrarSaida();
			System.out.println(f.gerarContraCheque());
			System.out.println("-------------------------------------------------");
		}
	}

}
