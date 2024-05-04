package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoBanhoTosa {
	public static List<Banho> banho = new ArrayList<>();
	public static List<BanhoTosa> banhoTosa = new ArrayList<>();
	public static List<BanhoHidratacao> banhoHidratacao = new ArrayList<>();
	public static List<BanhoTosaHigienica> banhoTosaHigienica = new ArrayList<>();
	
	public static void adicionarBanho(Banho banho) {
        HistoricoBanhoTosa.banho.add(banho);
    }
	
	public static void adicionarBanhoTosa(BanhoTosa banhoTosa) {
        HistoricoBanhoTosa.banhoTosa.add(banhoTosa);
    }
	
	public static void adicionarBanhoHidratacao(BanhoHidratacao banhoHidratacao) {
        HistoricoBanhoTosa.banhoHidratacao.add(banhoHidratacao);
    }
	
	public static void adicionarBanhoTosaHigienica(BanhoTosaHigienica banhoTosaHigienica) {
        HistoricoBanhoTosa.banhoTosaHigienica.add(banhoTosaHigienica);
    }
}
