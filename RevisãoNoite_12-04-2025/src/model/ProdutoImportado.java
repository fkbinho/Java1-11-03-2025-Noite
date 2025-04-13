 package model;

public class ProdutoImportado extends Produto {

	private double taxaAlfandega;
	
	public ProdutoImportado(String nome, double preco, double taxaImportacao) {
		super(nome, preco);
		this.taxaAlfandega = taxaImportacao;
	}
	
	public double getTaxaImportacao() {
		return taxaAlfandega;
	}
	
	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaAlfandega = taxaImportacao;
	}
	
	public double precoTotal() {
		return getPreco() + taxaAlfandega;
	}
	
	@Override
	public String etiquetaPreco() {
		return getNome() + 
				" R$ " + String.format("%.2f", precoTotal()) +
				" (Taxa de importação: R$ " + String.format("%.2f", taxaAlfandega) + ")";
	}
}
