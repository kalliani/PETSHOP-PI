package application;

import resources.HistoricoAdocaoPets;
import resources.LerDados;
import resources.Pets;

public class AdocaoPets {
	public static void adocaoPets() {
		while (true) {
			System.out.println("Você já tem cadastro em nosso Petshop? (s/n) ");
			Boolean cadastro = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
			if (cadastro.equals(true)) {
				petsDisponiveis();
			} else if (cadastro.equals(false)) {
				CadastroProprietario.cadastroProprietario();
				petsDisponiveis();
			} else {
				System.out.println("Essa não é uma opção válida, tente novamente!");
			}
		}
	}

	public static void petsDisponiveis() {
		String nomePet = ""; 
		String enderecoPetshop = "";
		System.out.println();
		System.out.println("Pets Disponíveis para Adoção:");
		System.out.println("|1. Luna - Gato (Fêmea).                    |");
		System.out.println("|2. Max - Cachorro (Filhote, Macho).        |");
		System.out.println("|3. Tweety - Pássaro (Canário, Macho).      |");
		System.out.println("|4. Mia - Gato (Fêmea).                     |");
		System.out.println("|5. Nemo - Peixe (Peixe-palhaço, Masculino).|");
		System.out.println("|6. Charlie - Cachorro (Beagle, Macho).     |");
		System.out.println("|0. Voltar.                                 |");
		System.out.print("Escolha o número correspondente ao pet desejado: ");
		Integer escolha = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");

		if (escolha.equals(1)) {
			enderecoPetshop = "Petshop \"Amor de Quatro Patas\", Rua das Flores, nº 123, Cidade Nova";
			nomePet = "Luna";
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, enderecoPetshop));
		} else if (escolha.equals(2)) {
			enderecoPetshop = "Petshop \"Patas Felizes\", Avenida dos Animais, nº 456, Bairro Alegria";
			nomePet = "Max";
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, enderecoPetshop));
		} else if (escolha.equals(3)) {
			enderecoPetshop = "Petshop \"Cantinho das Aves\", Rua das Canções, nº 789, Centro";
			nomePet = "Tweety";
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, enderecoPetshop));
		} else if (escolha.equals(4)) {
			enderecoPetshop = "Petshop \"Laços de Amizade\", Praça dos Peludos, nº 789, Centro";
			nomePet = "Mia";
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, enderecoPetshop));
		} else if (escolha.equals(5)) {
			enderecoPetshop = "Petshop \"Aquário Encantado\", Avenida dos Corais, nº 10, Vila Marinha";
			nomePet = "Nemo";
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, enderecoPetshop));
		} else if (escolha.equals(6)) {
			enderecoPetshop = "Petshop \"Patitas Felizes\", Avenida dos Animais, nº 456, Bairro Alegria";
			nomePet = "Charlie";
			HistoricoAdocaoPets.adicionarPets(new Pets(nomePet, enderecoPetshop));
		} else if (escolha.equals(0)) {
			return;
		} else {
			System.out.println("Essa não é uma opção válida, tente novamente.");
			petsDisponiveis();
		}
		System.out.println();
		System.out.println("Obrigado por preencher o formulário!");
		System.out.println("Você escolheu adotar o pet " + nomePet + ".");
		System.out.println("O pet se encontra no endereço: " + enderecoPetshop);
		System.out.println("Entraremos em contato em breve para discutir os detalhes da adoção.");
		Petshop.menuPrincipal();
	}
}
