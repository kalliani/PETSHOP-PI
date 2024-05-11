package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import resources.LerDados;

public class EventosPetshop {
	public static final DateTimeFormatter Data = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

		String local = "";
		String horario = "";
		LocalDate data = null;
		String evento = "";
		while (true) {
			System.out.println("Esses são os próximos eventos disponíveis no nosso Petshop:");
			System.out.println("|1. Evento de adoção.     |");
			System.out.println("|2. Campanha de vacinação.|");
			System.out.println("|3. Campanha de castração.|");
			System.out.println("|4. Aula de adestramento. |");
			System.out.println("|0. Voltar.               |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");

			if (escolha.equals(1)) {
				evento = "Evento de Adoção";
				local = "Petshop Pata Amiga";
				horario = "14h30";
				data = LocalDate.parse("03/05/2024", Data);
			} else if (escolha.equals(2)) {
				evento = "Campanha de vacinação";
				local = "Petshop Pata Amiga";
				horario = "13h30";
				data = LocalDate.parse("05/05/2024", Data);
			} else if (escolha.equals(3)) {
				evento = "Campanha de castração";
				local = "Petshop Pata Amiga";
				horario = "12h30";
				data = LocalDate.parse("07/05/2024", Data);
			} else if (escolha.equals(4)) {
				evento = "Aula de adestramento";
				local = "Petshop Pata Amiga";
				horario = "10h30";
				data = LocalDate.parse("09/05/2024", Data);
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Essa não é uma opção valida, tente novamente!");
				eventosDisponiveis();
			}
			System.out.println();
			System.out.println("O evento que você escolheu é o(a) " + evento + " que acontecerá no " + local
					+ " no dia " + data.format(Data) + " às " + horario);
			System.out.println("Esperamos você lá");
		}
	}
}
