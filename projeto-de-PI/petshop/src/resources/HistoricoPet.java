package resources;

import java.util.ArrayList;
import java.util.List;

public class HistoricoPet {
	 public static List<Pet> pet = new ArrayList<>();
	 
	 public static void adicionarPet(Pet pet) {
		 HistoricoPet.pet.add(pet);
	 }
}