package application;

import java.util.Random;
import java.util.Scanner;

import resources.HistoricoPet;
import resources.LerDados;
import resources.Pet;

public class CadastroPet {
	public static Scanner sc = new Scanner(System.in);
	public static Random rd = new Random();
	
	public static void cadastroPet() {
		System.out.println();
		System.out.print("Digite o nome do seu pet: ");
		var nomePet = LerDados.lerTexto();
		System.out.print("Digite a idade do seu pet: ");
		var idadePet = LerDados.lerDouble("Por favor, digite somente a idade de seu pet. ");
		System.out.print("Digite o porte de seu pet (pequeno, medio ou grande): ");
		var portePet = LerDados.lerTexto();
		System.out.print("Digite o peso de seu pet: ");
		var pesoPet = LerDados.lerDouble("Por favor, digite somente o peso de seu pet. ");
		System.out.print("Nome do responsavel do animal: ");
		var proprietario = LerDados.lerTexto();
		System.out.println("Adicione neste campo informações extras sobre restrições/alergias do seu pet.");
		var anotacoesPet = LerDados.lerTexto();
		
		int numeroRegistro = 1 + rd.nextInt(1000);
		for (int i = 0; i < HistoricoPet.pet.size(); i++) {
			if (HistoricoPet.pet.get(i).getNumeroRegistro() == numeroRegistro) {
				numeroRegistro = 1 + rd.nextInt(1000);
			}
			else {
				break;
			}
		}

		System.out.println();
		System.out.println("Perfeito! Seu pet foi registrado com sucesso.");

		HistoricoPet.adicionarPet(new Pet(nomePet, idadePet, portePet, pesoPet, anotacoesPet, proprietario, numeroRegistro));
	}
}
