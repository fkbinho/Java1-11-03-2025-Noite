package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;
import model.ProdutoImportado;
import model.ProdutoUsado;

public class solucao01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Lista de produtos
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int numeroProdutos = scan.nextInt();
		scan.nextLine(); // Limpa o buffer
		
		for(int i = 1; i <= numeroProdutos; i++) {
			
			System.out.println("Produto #" + i + " dados:");
			System.out.print("Comum, usado, ou importado (c/u/i)? ");
			char tipo = scan.next().charAt(0);
			scan.nextLine(); // Limpa o buffer
			
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			
			System.out.print("Preço: ");
			double preco = scan.nextDouble();
			scan.nextLine(); // Limpa o buffer
			
			if(tipo == 'i') {
				System.out.println("Taxa de alfândega: ");	
				double taxa = scan.nextDouble();
				
//				ProdutoImportado produto = new ProdutoImportado(nome, preco, taxa);
//				lista.add(produto);
				
				lista.add(new ProdutoImportado(nome, preco, taxa));
			} else if (tipo == 'u') {  
				System.out.println("Data de fabricação (DD/MM/YYYY): ");
				String data = scan.nextLine();
				
				// Converte a string para LocalDate
				LocalDate dataConvertida = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				lista.add(new ProdutoUsado(nome, preco, dataConvertida));
			} else {
				lista.add(new Produto(nome, preco));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇO:");
		for(Produto produto : lista) {
			System.out.println(produto.etiquetaPreco());
		}
	
	}

}
