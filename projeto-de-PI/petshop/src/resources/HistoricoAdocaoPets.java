package resources;

import java.util.HashMap;
import java.util.Map;

public class HistoricoAdocaoPets {
	public static Map<Integer, Pets> pet = new HashMap<>();
	public static Map<Integer, PetsAdotados> petsAdotados = new HashMap<>();
	
	public Map<Integer, Pets> getPet() {
        return pet;
    }

    public Map<Integer, PetsAdotados> getPetsAdotados() {
        return petsAdotados;
    }
	
	static {
        adicionarPetsIniciais();
    }
	
	public static void adicionarPetsIniciais() {
		HistoricoAdocaoPets.adicionarPets(1, new Pets("Luna", "Gato", "Femea", "4 anos"));
		HistoricoAdocaoPets.adicionarPets(2, new Pets("Max", "Cachorro", "Macho", "3 meses"));
		HistoricoAdocaoPets.adicionarPets(3, new Pets("Twetty", "Pássaro", "Macho", "1 ano", "Cánario"));
		HistoricoAdocaoPets.adicionarPets(4, new Pets("Mia", "Gato", "Fêmea", "2 anos"));
		HistoricoAdocaoPets.adicionarPets(5, new Pets("Nemo", "Peixe", "Macho", "8 meses", "Peixe-Palhaço"));
		HistoricoAdocaoPets.adicionarPets(6, new Pets("Charlie", "Cachorro", "Macho", "6 anos", "Beagle"));
	}
	
	public static void adicionarPets(Integer x, Pets pet) {
        HistoricoAdocaoPets.getInstance().getPet().put(x, pet);
    }
	
	public static void petsAdotados(Integer key, PetsAdotados petsAdotados) {
		 HistoricoAdocaoPets.getInstance().getPetsAdotados().put(key, petsAdotados);
	}
	
	private static HistoricoAdocaoPets instance;

    public static HistoricoAdocaoPets getInstance() {
        if (instance == null) {
            instance = new HistoricoAdocaoPets();
        }
        return instance;
    }
}
