package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoAdocaoPets {
	public static List<Pets> pet = new ArrayList<>();
	public static List<PetsAdotados> petsAdotados = new ArrayList<>();
	
	public List<Pets> getPet() {
        return pet;
    }

    public List<PetsAdotados> getPetsAdotados() {
        return petsAdotados;
    }
	
	public static void adicionarPetsIniciais() {
		HistoricoAdocaoPets.adicionarPets(new Pets("Luna", "Gato", "Femea", "4 anos"));
		HistoricoAdocaoPets.adicionarPets(new Pets("Max", "Cachorro", "Macho", "3 meses"));
		HistoricoAdocaoPets.adicionarPets(new Pets("Twetty", "Pássaro", "Macho", "1 ano", "Cánario"));
		HistoricoAdocaoPets.adicionarPets(new Pets("Mia", "Gato", "Fêmea", "2 anos"));
		HistoricoAdocaoPets.adicionarPets(new Pets("Nemo", "Peixe", "Macho", "8 meses", "Peixe-Palhaço"));
		HistoricoAdocaoPets.adicionarPets(new Pets("Charlie", "Cachorro", "Macho", "6 anos", "Beagle"));
	}
	
	public static void adicionarPets(Pets pet) {
        HistoricoAdocaoPets.pet.add(pet);
    }
	
	public static void petsAdotados(PetsAdotados petsAdotados) {
		 HistoricoAdocaoPets.petsAdotados.add(petsAdotados);
	}
}
