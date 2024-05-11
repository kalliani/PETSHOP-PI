package application;

import java.util.Map;

import resources.HistoricoAdocaoPets;
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
		Map<Integer, Pets> pet = HistoricoAdocaoPets.getInstance().getPet();
		Map<Integer, PetsAdotados> petsAdotados = HistoricoAdocaoPets.getInstance().getPetsAdotados();
		for (Integer key : pet.keySet()) {
			System.out.println(key + ". " + pet.get(key));
		}
		System.out.println("Aperte 0 caso queira voltar.");
		System.out.println("Qual animalzinho você planeja adotar?");
		System.out.print("Digite aqui: ");
		Integer key = LerDados.lerInt("Essa não é uma opção válida, tente novamente!\n");
		
		if (key.equals(0)) {
			return;
		}

		Pets petEscolhido = pet.get(key);
		if (petEscolhido != null) {
			System.out.print("Diga o seu nome: ");
			String pessoaQueAdotou = LerDados.lerTexto();
			petsAdotados.put(key, new PetsAdotados(petEscolhido.getNome(), petEscolhido.getAnimal(), petEscolhido.getGenero(), petEscolhido.getIdade(), petEscolhido.getRaca(), pessoaQueAdotou));
			pet.remove(key);
		} else {
			System.out.println("Essa não é uma opção válida, tente novamente.");
			petsDisponiveis();
		}
		System.out.println();
		System.out.println("Obrigado e parabens pela ação! Entraremos em contato em breve. Até la.");
	}
}
