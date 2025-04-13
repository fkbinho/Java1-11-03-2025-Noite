package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {

	private LocalDate dataFabricacao;
	
	public ProdutoUsado(String nome, double preco ,LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	} 
	
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() + 
				" R$ " + String.format("%.2f", getPreco()) +
				" (Data de fabricação: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + ")";
	}
}
