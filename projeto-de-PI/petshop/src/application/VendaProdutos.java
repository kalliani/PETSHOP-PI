package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import resources.HistoricoVendas;
import resources.LerDados;
import resources.ListaProdutos;
import resources.Produtos;
import resources.Vendas;

public class VendaProdutos {
	public static LocalDateTime data = LocalDateTime.now();
	public static double carrinho;

	public static void vendaProdutos() {
		carrinho = 0;
		System.out.println("Bem-vindo à loja do PetShop!");
		Boolean continuarComprando = true;
		while (continuarComprando) {
			System.out.println();
			for (int i = 1; i <= ListaProdutos.produtos.size(); i++) {
				System.out.println("|" + i + ". " + ListaProdutos.produtos.get(i - 1) + ".");
			}
			System.out.println("|0. Voltar.");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
			if (escolha >= 1 && escolha <= ListaProdutos.produtos.size()) {
                System.out.print("Quantas unidades? ");
                var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
                Produtos produto = ListaProdutos.produtos.get(escolha - 1);
                if (quantidade <=  produto.getQuantidade()) {
	                int subtracao = produto.getQuantidade() - quantidade;
	                produto.setQuantidade(subtracao);
	                carrinho += produto.getPreco() * quantidade;
	                System.out.print("Planeja comprar algo mais? (s/n) ");
	                continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
	                if (!continuarComprando) {
	                    carrinhoCompras();
	                    return;
	                }
                } else {
                	System.out.println("Não temos tantos itens assim no estoque.");
                }
            } else if (escolha.equals(0)) {
                return;
            } else {
                System.out.println("Essa não é uma opção válida, tente novamente!");
            }
		}
	}

	private static void carrinhoCompras() {
		String dia = data.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));

		System.out.println();
		System.out.println("O total foi de R$" + carrinho);
		System.out.print("Escreva seu nome completo: ");
		var nome = LerDados.lerTexto();
		System.out.print("Digite seu endereço para que possamos entrar seu pedido: ");
		var endereco = LerDados.lerTexto();
		HistoricoVendas.adicionarHistoricoVendas(new Vendas(carrinho, endereco, nome, dia));

		System.out.println();
		System.out.println("Perfeito! Seu pedido chega em breve.");
	}
}
