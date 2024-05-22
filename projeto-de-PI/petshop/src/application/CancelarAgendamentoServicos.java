package application;

import resources.HistoricoBanhoTosa;
import resources.HistoricoConsulta;
import resources.HistoricoDaycare;
import resources.LerDados;

public class CancelarAgendamentoServicos {
	public static void cancelarAgendamentoServicos() {
		System.out.println("Serviços");
		System.out.println();
		System.out.println("|1. Consulta com veterinario.   |");
		System.out.println("|2. Banho e/ou tosa.            |");
		System.out.println("|3. Daycare.                    |");
		System.out.println("|0. Voltar.                     |");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!");

		if (escolha.equals(1)) {
			cancelarConsulta();
		} else if (escolha.equals(2)) {
			cancelarBanhos();
		} else if (escolha.equals(3)) {
			cancelarDaycare();
		} else if (escolha.equals(0)) {
			return;
		} else {
			System.out.println("Opção invalida.");
			cancelarAgendamentoServicos();
		}
	}

	public static void cancelarConsulta() {
		System.out.println();
		System.out.println("Qual tipo de consulta?");
		System.out.println("|1. Consulta de rotina.    |");
		System.out.println("|2. Consulta de emergência.|");
		System.out.println("|0. Voltar.                |");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Opção inválida! Tente novamente.\n");

		if (escolha.equals(1)) {
			System.out.println("Digite o numero de registro da consulta: ");
			int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();

			boolean encontrado = false;
			for (int i = 0; i < HistoricoConsulta.consultaRotina.size(); i++) {
				if (HistoricoConsulta.consultaRotina.get(i).getRegistro() == registro) {
					HistoricoConsulta.consultaRotina.remove(i);
					encontrado = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Registro não encontrado. Tente novamente.");
			}
		} else if (escolha.equals(2)) {
			System.out.println("Digite o numero de registro da consulta: ");
			int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();

			boolean encontrado = false;
			for (int i = 0; i < HistoricoConsulta.consultaEmergencia.size(); i++) {
				if (HistoricoConsulta.consultaEmergencia.get(i).getRegistro() == registro) {
					HistoricoConsulta.consultaEmergencia.remove(i);
					encontrado = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Registro não encontrado. Tente novamente.");
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Opção invalida.");
				cancelarConsulta();
			}
		}
	}

	public static void cancelarBanhos() {
		System.out.println();
		System.out.println("Qual dos banhos?");
		System.out.println("|1. Banho.                 |");
		System.out.println("|2. Banho e Tosa.          |");
		System.out.println("|3. Banho e Hidratação.    |");
		System.out.println("|4. Banho e Tosa Higiênica.|");
		System.out.println("|0. Voltar.                |");
		System.out.print("Digite aqui: ");
		Integer escolha = LerDados.lerInt("Opção inválida! Tente novamente.\n");

		if (escolha.equals(1)) {
			System.out.println("Digite o numero de registro do banho: ");
			int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();

			boolean encontrado = false;
			for (int i = 0; i < HistoricoBanhoTosa.banho.size(); i++) {
				if (HistoricoBanhoTosa.banho.get(i).getRegistro() == registro) {
					HistoricoBanhoTosa.banho.remove(i);
					encontrado = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Registro não encontrado. Tente novamente.");
			}
		} else if (escolha.equals(2)) {
			System.out.println("Digite o numero de registro do banho e tosa: ");
			int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();

			boolean encontrado = false;
			for (int i = 0; i < HistoricoBanhoTosa.banhoTosa.size(); i++) {
				if (HistoricoBanhoTosa.banhoTosa.get(i).getRegistro() == registro) {
					HistoricoBanhoTosa.banhoTosa.remove(i);
					encontrado = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Registro não encontrado. Tente novamente.");
			}
		} else if (escolha.equals(3)) {
			System.out.println("Digite o numero de registro do banho: ");
			int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();

			boolean encontrado = false;
			for (int i = 0; i < HistoricoBanhoTosa.banhoHidratacao.size(); i++) {
				if (HistoricoBanhoTosa.banhoHidratacao.get(i).getRegistro() == registro) {
					HistoricoBanhoTosa.banhoHidratacao.remove(i);
					encontrado = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Registro não encontrado. Tente novamente.");
			} 
		} else if (escolha.equals(4)) {
			System.out.println("Digite o numero de registro do banho e tosa: ");
			int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();

			boolean encontrado = false;
			for (int i = 0; i < HistoricoBanhoTosa.banhoTosaHigienica.size(); i++) {
				if (HistoricoBanhoTosa.banhoTosaHigienica.get(i).getRegistro() == registro) {
					HistoricoBanhoTosa.banhoTosaHigienica.remove(i);
					encontrado = true;
					System.out.println("Cadastro removido com sucesso!");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Registro não encontrado. Tente novamente.");
			} 
		} else if (escolha.equals(0)) {
			return;
		} else {
			System.out.println("Opção invalida.");
			cancelarBanhos();
		}
	}
	
	public static void cancelarDaycare() {
		System.out.print("Digite o registro da hospedagem: ");
		int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
		System.out.println();
		
		boolean encontrado = false;
		for (int i = 0; i < HistoricoDaycare.daycare.size(); i++) {
			if (HistoricoDaycare.daycare.get(i).getRegistro() == registro) {
				HistoricoDaycare.daycare.remove(i);
				encontrado = true;
				System.out.println("Cadastro removido com sucesso!");
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Registro não encontrado. Tente novamente.");
		} 
	}
}
