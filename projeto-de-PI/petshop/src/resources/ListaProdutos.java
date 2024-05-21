package resources;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {
	public static List<Produtos> produtos = new ArrayList<>();
	
	public static void adicionarProdutos(Produtos produtos) {
		ListaProdutos.produtos.add(produtos);
	}
	
	public static void produtosIniciais() {
		ListaProdutos.adicionarProdutos(new Produtos("Ração para Cães", 20, 30.0));
		ListaProdutos.adicionarProdutos(new Produtos("Ração para Gatos", 20, 20.0));
		ListaProdutos.adicionarProdutos(new Produtos("Brinquedo para Gatos", 20, 15.0));
		ListaProdutos.adicionarProdutos(new Produtos("Brinquedo para Cães", 20, 20.0));
		ListaProdutos.adicionarProdutos(new Produtos("Shampoo para Cães", 20, 18.0));
		ListaProdutos.adicionarProdutos(new Produtos("Shampoo para Cães", 20, 18.0));
		ListaProdutos.adicionarProdutos(new Produtos("Casinha para Cães", 20, 100.0));
	}
}
