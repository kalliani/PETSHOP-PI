package application;

import resources.HistoricoAdocaoPets;
import resources.HistoricoPet;
import resources.LerDados;
import resources.Pet;
import resources.Pets;

public class CadastroPet {
	public static void cadastroOuAdocao() {
		System.out.println("O que você deseja fazer?");
		System.out.println("|1. Cadastrar meu pet.            |");
		System.out.println("|2. Colocar um animal para adoção.|");
		System.out.println("|0. Voltar.                       |");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Parece que você escreveu errado, tente novamente!\n");
		
		if (escolha.equals(1)) {
			cadastroPet();
		} else if (escolha.equals(2)) {
			adicionarPetParaAdocao();
		} else if (escolha.equals(0)) {
			return;
		} else {
			System.out.println("Opção inválida, tente novamente.");
			cadastroOuAdocao();
		}
	}
	
	public static void adicionarPetParaAdocao() {
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
		System.out.print("Digite a chave para esse pet (de 7 em diante): ");
		var chave = LerDados.lerInt("A chave deve ser um número maior que 7.\n");
		if (raca == null) {
			HistoricoAdocaoPets.adicionarPets(chave, new Pets(nomePet, tipoAnimal, genero, idade));
			System.out.println();
			System.out.println("Perfeito! Pet adicionado à lista de adoção.");
		} else {
			HistoricoAdocaoPets.adicionarPets(chave, new Pets(nomePet, tipoAnimal, genero, idade, raca));
			System.out.println("Perfeito! Pet adicionado à lista de adoção.");
		}
	}
	
	public static void cadastroPet() {
		System.out.println();
		System.out.print("Digite o nome do seu pet: ");
		var nomePet = LerDados.lerTexto();
		System.out.print("Digite a idade do seu pet: ");
		var idadePet = LerDados.lerInt("Por favor, digite somente a idade de seu pet. ");
		System.out.print("Digite o porte de seu pet (pequeno, medio ou grande): ");
		var portePet = LerDados.lerTexto();
		System.out.print("Digite o peso de seu pet: ");
		var pesoPet = LerDados.lerDouble("Por favor, digite somente o peso de seu pet. ");
		System.out.println("Nome do responsavel do animal: ");
		var proprietario = LerDados.lerTexto();
		System.out.println("Adicione neste campo informações extras sobre restrições/alergias do seu pet.");
		var anotacoesPet = LerDados.lerTexto();

		System.out.println();
		System.out.println("Perfeito! Seu pet foi registrado com sucesso.");

		HistoricoPet.adicionarPet(new Pet(nomePet, idadePet, portePet, pesoPet, anotacoesPet, proprietario));
	}
}
