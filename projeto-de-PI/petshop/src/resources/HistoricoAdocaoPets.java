package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoAdocaoPets {
	public static List<Pets> pet = new ArrayList<>();
	
	public static void adicionarPets(Pets pet) {
		HistoricoAdocaoPets.pet.add(pet);
	}
}
