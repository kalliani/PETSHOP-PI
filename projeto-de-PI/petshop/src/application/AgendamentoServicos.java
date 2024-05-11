package application;

import resources.Banho;
import resources.BanhoHidratacao;
import resources.BanhoTosa;
import resources.BanhoTosaHigienica;
import resources.ConsultaEmergencia;
import resources.ConsultaRotina;
import resources.Daycare;
import resources.HistoricoBanhoTosa;
import resources.HistoricoConsulta;
import resources.HistoricoDaycare;
import resources.LerDados;

public class AgendamentoServicos {
	public static void agendamentoServicos() {
		System.out.println();
		System.out.println("Qual serviço você esta buscando?");
		while (true) {
			System.out.println();
			System.out.println("|1. Consulta com veterinario.   |");
			System.out.println("|2. Banho e/ou tosa.            |");
			System.out.println("|3. Daycare.                    |");
			System.out.println("|0. Voltar.                     |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!");

			if (escolha.equals(1)) {
				consultaVeterinario();
			} else if (escolha.equals(2)) {
				banhoTosa();
			} else if (escolha.equals(3)) {
				dayCare();
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Parece que você digitou errado, tente novamente!");
				agendamentoServicos();
			}
		}
	}

	private static void consultaVeterinario() {
		System.out.println();
		System.out.println("Você escolheu marcar uma consulta.");
		System.out.println("Escolha o tipo de consulta:");
		System.out.println("|1. Consulta de rotina.    |");
		System.out.println("|2. Consulta de emergência.|");
		System.out.println("|0. Voltar.                |");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Opção inválida! Tente novamente.\n");

		if (escolha.equals(1)) {
			var doutor = "Hugo";
			System.out.println();
			System.out.println("Você escolheu consulta de rotina.");
			System.out.print("Diga o dia, mês e horario que deseja para a consulta de rotina (dd/mm/aaaa HH:mm): ");
			var dia = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
			System.out.print("Nome do pet que será atendido: ");
			var nome = LerDados.lerTexto();
			System.out.print("Nome do dono do pet: ");
			var dono = LerDados.lerTexto();
			HistoricoConsulta.adicionarConsultaRotina(new ConsultaRotina(dia, nome, dono, doutor));

			System.out.println();
			System.out.println("Perfeito! Consulta de rotina marcada. Nos vemos em breve.");
		} else if (escolha.equals(2)) {
			var doutor = "Otávio";
			System.out.println();
			System.out.println("Você escolheu consulta de emergência.");
			System.out.print("Diga o dia, mês e horario que deseja para a consulta de emergência (dd/mm/aaaa HH:mm): ");
			var dia = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
			System.out.print("Nome do pet que será atendido: ");
			var nome = LerDados.lerTexto();
			System.out.print("Nome do dono do pet: ");
			var dono = LerDados.lerTexto();
			HistoricoConsulta.adicionarConsultaEmergencia(new ConsultaEmergencia(dia, nome, dono, doutor));
			
			System.out.println();
			System.out.println("Perfeito! Consulta de emergencia marcada. Nos vemos em breve.");
		} else if (escolha.equals(0)) {
			return;
		} else {
			System.out.println("Parece que você digitou errado, tente novamente!");
			consultaVeterinario();
		}
	}

	private static void banhoTosa() {
		System.out.println();
		while (true) {
			System.out.println("Qual das opções mais o agrada?");
			System.out.println("|1. Banho.                 |");
			System.out.println("|2. Banho e Tosa.          |");
			System.out.println("|3. Banho e Hidratação.    |");
			System.out.println("|4. Banho e Tosa Higiênica.|");
			System.out.println("|0. Voltar.                |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Opção inválida! Tente novamente.\n");

			if (escolha.equals(1)) {
				System.out.println();
				System.out.print("Me informe o dia e o horario para o banho (dd/mm/aaaa HH:mm): ");
				var dia = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
				System.out.print("Nome do pet que tomará banho: ");
				var animal = LerDados.lerTexto();
				System.out.print("Nome do dono do pet: ");
				var dono = LerDados.lerTexto();
				HistoricoBanhoTosa.adicionarBanho(new Banho(dia, animal, dono));

				System.out.println();
				System.out.println("Perfeito! Banho marcado.");
			} else if (escolha.equals(2)) {
				System.out.println();
				System.out.print("Me informe o dia e o horario para o banho e tosa (dd/mm/aaaa HH:mm): ");
				var dia = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
				System.out.print("Nome do pet: ");
				var animal = LerDados.lerTexto();
				System.out.print("Nome do dono do pet: ");
				var dono = LerDados.lerTexto();
				HistoricoBanhoTosa.adicionarBanhoTosa(new BanhoTosa(dia, animal, dono));

				System.out.println();
				System.out.println("Perfeito! Tosa marcada.");
			} else if (escolha.equals(3)) {
				System.out.println();
				System.out.print("Me informe o dia e o horario para o banho e a hidratação (dd/mm/aaaa HH:mm): ");
				var dia = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
				System.out.print("Nome do pet: ");
				var animal = LerDados.lerTexto();
				System.out.print("Nome do dono do pet: ");
				var dono = LerDados.lerTexto();
				HistoricoBanhoTosa.adicionarBanhoHidratacao(new BanhoHidratacao(dia, animal, dono));
				
				System.out.println();
				System.out.println("Perfeito! Banho e tosa marcado.");
			} else if (escolha.equals(4)) {
				System.out.println();
				System.out.print("Me informe o dia e o horario para o banho e tosa higiênica (dd/mm/aaaa HH:mm): ");
				var dia = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
				System.out.print("Nome do pet: ");
				var animal = LerDados.lerTexto();
				System.out.print("Nome do dono do pet: ");
				var dono = LerDados.lerTexto();
				HistoricoBanhoTosa.adicionarBanhoTosaHigienica(new BanhoTosaHigienica(dia, animal, dono));
				
				System.out.println();
				System.out.println("Perfeito! Banho e tosa higiênica marcada.");
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Essa não é uma opção, tente novamente!");
				banhoTosa();
			}
		}
	}

	private static void dayCare() {
		System.out.println();
		System.out.println("Você escolheu deixar seu animal na daycare.");
		System.out.println();
		System.out.print("Diga o nome do pet que ficará conosco: ");
		var animal = LerDados.lerTexto();
		System.out.print("Nome do dono do pet: ");
		var dono = LerDados.lerTexto();
		System.out.print("Digite a data de hospedagem do seu pet (dd/mm/aaaa HH:mm): ");
		var dataDaycare = LerDados.lerDataHora("Parece que você digitou errado, tente novamente!\n");
		System.out.println("Escolha a localidade para a hospedagem do seu pet:");
	    System.out.println("|Centro Pet.     |");
	    System.out.println("|Pet Paradise.   |");
	    System.out.println("|Happy Pet House.|");
	    System.out.print("Digite aqui: ");
	    String localidade = LerDados.lerTexto();
	    HistoricoDaycare.adicionarDaycare(new Daycare(localidade, dataDaycare, animal, dono));
		
		System.out.println();
		System.out.println("Perfeito! Nos vemos em breve!");
	}
}
