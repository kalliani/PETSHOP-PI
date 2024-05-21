package application;

import resources.LerDados;
import resources.ListaProdutos;
import resources.Produtos;

public class EstoqueDeProdutos {
	public static void estoqueDeProdutos() {
		System.out.println("Qual a necessidade?");
		System.out.println("|1. Adicionar um produto novo.    |");
		System.out.println("|2. Mudar a quantidade no estoque.|");
		System.out.println("|0. Voltar                        |");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
		
		if (escolha.equals(1)) {
			System.out.print("Digite o nome do produto: ");
			var nome = LerDados.lerTexto();
			System.out.print("Digite a quantidade no estoque: ");
			var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
			System.out.print("Digite o preço do produto: ");
			var preco = LerDados.lerDouble("Essa não é uma opção válida, tente novamente!");
			
			ListaProdutos.adicionarProdutos(new Produtos (nome, quantidade, preco));
			
			System.out.println();
			System.out.println("Produto adicionado!");
		} else if (escolha.equals(2)) {
			System.out.print("Digite o nome do produto que deseja mudar o estoque: ");
			var nome = LerDados.lerTexto();
			 boolean produtoEncontrado = false;
			for (Produtos produto: ListaProdutos.produtos) {
				if (produto.getNome().equals(nome)) {
					System.out.print("Digite quantos produtos serão adicionados: ");
					var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
					int adicao = produto.getQuantidade() + quantidade;
					produto.setQuantidade(adicao);
					
					System.out.println();
					System.out.println("Estoque atualizado!");
					produtoEncontrado = true;
					break;
				}
			}
			if (produtoEncontrado == false) {
				System.out.println();
				System.out.println("O produto não está na lista.");
			}
		} else if (escolha.equals(0)) {
			return;
		} else {
			System.out.println("Essa opção não existe, tente novamente.");
		}
	}	
}
