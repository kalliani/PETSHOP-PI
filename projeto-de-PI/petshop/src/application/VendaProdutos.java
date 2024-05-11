package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import resources.HistoricoVendas;
import resources.LerDados;
import resources.Vendas;

public class VendaProdutos {
	public static SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/aaaa HH:mm");
	public static double carrinho;
	public static Date data = new Date();
	public static void vendaProdutos() {
		carrinho = 0;
		System.out.println("Bem-vindo à loja do PetShop!");
		Boolean continuarComprando = true;
		while (continuarComprando) {
			System.out.println();
			System.out.println("|1. Ração para Cães.       (R$30.00) |");
			System.out.println("|2. Ração para Gatos.      (R$20.00) |");
			System.out.println("|3. Brinquedo para Gatos.  (R$15.00) |");
			System.out.println("|4. Brinquedo para Cães.   (R$20.00) |");
			System.out.println("|5. Shampoo para Cães .    (R$18.00) |");
			System.out.println("|6. Shampoo para Gatos.    (R$18.00) |");
			System.out.println("|7. Casinha para Cachorro. (R$100.00)|");
			System.out.println("|0. Voltar.                          |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
			if (escolha.equals(1)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
				carrinho += 30.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(2)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
				carrinho += 20.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(3)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
				carrinho += 15.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(4)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
				carrinho += 20.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(5)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
				carrinho += 18.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(6)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
				carrinho += 18.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(7)) {
				System.out.print("Quantas unidades? ");
				var quantidade = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
				carrinho += 100.0 * quantidade;
				System.out.print("Planeja comprar algo mais? (s/n) ");
				continuarComprando = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
				if (!continuarComprando) {
			        carrinhoCompras();
			        return; 
			    }
			} else if (escolha.equals(0)) {
				Petshop.main(null);
			} else {
				System.out.println("Essa não é uma opção válida, tente novamente!");
				vendaProdutos();
			}
		}
	}

	private static void carrinhoCompras() {
		String dia = mascara.format(data);
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
