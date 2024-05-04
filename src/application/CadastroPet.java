package application;

import java.util.ArrayList;
import java.util.List;

import resources.HistoricoPet;
import resources.LerDados;

public class CadastroPet {
	public static List<HistoricoPet> listPet = new ArrayList<>();
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
		System.out.println("Adicione neste campo informações extras sobre restrições/alergias do seu pet");
		var anotacoesPet = LerDados.lerTexto();

		System.out.println();
		System.out.println("Perfeito! Seu pet foi registrado com sucesso.");
		System.out.println("Mais alguma necessidade?");
		System.out.println();

		listPet.add(new HistoricoPet(nomePet, idadePet, portePet, pesoPet, anotacoesPet));
	}
}
