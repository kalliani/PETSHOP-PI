package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoProprietario {
	public static List<Proprietario> proprietario = new ArrayList<>();
	
	public static void adicionarProprietario(Proprietario proprietario) {
		HistoricoProprietario.proprietario.add(proprietario);
	}
}