package application;

import resources.HistoricoAdocaoPets;
import resources.HistoricoProprietario;
import resources.LerDados;
import resources.Pets;
import resources.PetsAdotados;

public class AdocaoPets {

	public static void adocaoPets() {

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

	public static void petsDisponiveis() {
		while (true) {
			if (HistoricoProprietario.proprietario.isEmpty()) {
				System.out.println(
						"Você ainda não fez o registro em nosso petshop! Faça o cadastro antes de prosseguir.");
				CadastroProprietario.cadastroProprietario();
			}
			for (int i = 1; i <= HistoricoAdocaoPets.pet.size(); i++) {
				System.out.println("|" + i + ". " + HistoricoAdocaoPets.pet.get(i - 1));
			}
			System.out.println("Aperte 0 caso queira voltar.");
			System.out.println();
			System.out.println("Qual animalzinho você planeja adotar?");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
			
			HistoricoAdocaoPets.pet.remove(escolha - 1);
			if (escolha >= 1 && escolha <= HistoricoAdocaoPets.pet.size()) {
				Pets petEscolhido = HistoricoAdocaoPets.pet.get(escolha - 1);
				System.out.print("Digite seu nome: ");
				String nome = LerDados.lerTexto();
				boolean encontrado = false;
				for (int i = 0; i < HistoricoProprietario.proprietario.size(); i++) {
					if (nome.equals(HistoricoProprietario.proprietario.get(i).getNomeProprietario())) {
						encontrado = true;
						var perfil = HistoricoProprietario.proprietario.get(i);
						System.out.println();
						System.out.println(perfil);
						System.out.println();
						System.out.print("Você confirma que esse é o seu cadastro (s/n)? ");
						Boolean confirmacao = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
						if (confirmacao.equals(true)) {
							System.out.print("Digite seu endereço para que possamos entregar-lo a você: ");
							var endereco = LerDados.lerTexto();
							HistoricoAdocaoPets.petsAdotados(new PetsAdotados(petEscolhido.getNome(), petEscolhido.getAnimal(),
									petEscolhido.getGenero(),  petEscolhido.getIdade(),
									petEscolhido.getRaca(), nome, endereco));
							System.out.println();
							System.out.println("Obrigado e parabens pela ação! Entraremos em contato em breve. Até la.");
							return;
						} else {
							System.out.println();
							System.out.print("Ops! Parece que puxamos o perfil errado, tente novamente!\n");
							System.out.println();
							break;
						}
					}
				}
				if (!encontrado) {
					System.out.println("Parece que não encontramos seu nome em nosso registro, tente novamente!");
				}
			} else {
				System.out.println("Essa não é uma opção válida, tente novamente!");
			}

			if (escolha.equals(0)) {
				return;
			}
		}
	}
}
