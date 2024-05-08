package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoVendas {
	public static List<Vendas> vendas = new ArrayList<>();
	
	public static void adicionarHistoricoVendas(Vendas vendas) {
		HistoricoVendas.vendas.add(vendas);
	}
}
