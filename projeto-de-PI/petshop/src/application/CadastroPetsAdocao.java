package application;

import resources.HistoricoAdocaoPets;
import resources.LerDados;
import resources.Pets;

public class CadastroPetsAdocao {
	public static void cadastroPetsAdocao() {
		System.out.println();
		System.out.print("Digite o nome do animal: ");
		var nomePet = LerDados.lerTexto();
		System.out.print("Digite que tipo de animal ele é: ");
		var tipoAnimal = LerDados.lerTexto();
		System.out.print("Digite o genero do animal: ");
		var genero = LerDados.lerTexto();
		System.out.print("Digite a idade do animal: ");
		var idade = LerDados.lerTexto();
		System.out.print("Digite a raça do animal (se não souber, só aperte enter): ");
		var raca = LerDados.lerTexto();
		if (raca == null) {
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, tipoAnimal, genero, idade));
			System.out.println();
			System.out.println("Perfeito! Pet adicionado à lista de adoção.");
		} else {
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, tipoAnimal, genero, idade, raca));
			System.out.println();
			System.out.println("Perfeito! Pet adicionado à lista de adoção.");
		}
	}
}
