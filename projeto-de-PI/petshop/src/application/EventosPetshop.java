package application;

import java.time.format.DateTimeFormatter;

import resources.HistoricoEventos;
import resources.LerDados;

public class EventosPetshop {
	public static final DateTimeFormatter Data = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss");

	public static void eventosPetshop() {
		System.out.println("Você já tem cadastro em nosso Petshop? (s/n) ");
		Boolean cadastro = LerDados.lerSimNao("Essa não é uma opção válida, tente novamente!\n");
		if (cadastro.equals(true)) {
			eventosDisponiveis();
		} else if (cadastro.equals(false)) {
			CadastroProprietario.cadastroProprietario();
			eventosDisponiveis();
		} else {
			System.out.println("Essa não é uma opção válida, tente novamente!");
		}
	}

	public static void eventosDisponiveis() {
		System.out.println("Eventos disponiveis:");
		for (int i = 1; i <= HistoricoEventos.eventos.size(); i++) {
			System.out.println();
			System.out.println("|" + i + ". " + HistoricoEventos.eventos.get(i - 1) + ".");
		}
		System.out.println();
		System.out.println("|0. Voltar.");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Essa não é uma opção válida, tente novamente!");
		
		if (escolha >= 1 && escolha <= HistoricoEventos.eventos.size()) {
			System.out.println();
			System.out.println("Feito! Nos vemos lá!");
		}
	}
}
