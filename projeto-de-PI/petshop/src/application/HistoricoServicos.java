package application;

import java.util.List;

import resources.Banho;
import resources.BanhoHidratacao;
import resources.BanhoTosa;
import resources.BanhoTosaHigienica;
import resources.ConsultaEmergencia;
import resources.ConsultaRotina;
import resources.Daycare;
import resources.HistoricoAdocaoPets;
import resources.HistoricoBanhoTosa;
import resources.HistoricoConsulta;
import resources.HistoricoDaycare;
import resources.HistoricoPet;
import resources.HistoricoProprietario;
import resources.HistoricoVendas;
import resources.LerDados;
import resources.Pet;
import resources.Pets;
import resources.Proprietario;
import resources.Vendas;

public class HistoricoServicos {
	public static void historicoServicos() {
		System.out.println();
		System.out.println("Historicos");
		while (true) {
			System.out.println();
			System.out.println("|1. Historico de registros de pets.        |");
			System.out.println("|2. Historico de registros de proprietario.|");
			System.out.println("|3. Registro de serviços.                  |");
			System.out.println("|4. Historico de vendas.                   |");
			System.out.println("|5. Historico de adoções.                  |");
			System.out.println("|0. Voltar.                                |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");

			if (escolha.equals(1)) {
				imprimirListaPet(HistoricoPet.pet);
			} else if (escolha.equals(2)) {
				imprimirListaProp(HistoricoProprietario.proprietario);
			} else if (escolha.equals(3)) {
				menuHistoricoServicos();
			} else if (escolha.equals(4)) {
				imprimirListaVendas(HistoricoVendas.vendas);
			} else if (escolha.equals(5)) {
				imprimirListaPets(HistoricoAdocaoPets.pet);
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Essa não é uma opção válida.");
			}
		}
	}

	public static void imprimirListaPet(List<Pet> pet) {
		if (pet != null && !pet.isEmpty()) {
			System.out.println("Últimos registro de pet:");
			for (Pet histoPet : pet) {
				System.out.println();
				System.out.println(histoPet);
			}
		} else {
			System.out.println();
			System.out.println("A lista de histórico de pets está vazia.");
		}
	}

	public static void imprimirListaProp(List<Proprietario> proprietario) {
		if (proprietario != null && !proprietario.isEmpty()) {
			System.out.println("Últimos registro de proprietario:");
			for (Proprietario histoProp : proprietario) {
				System.out.println();
				System.out.println(histoProp);
			}
		} else {
			System.out.println();
			System.out.println("A lista de histórico de proprietários está vazia.");
		}
	}

	public static void menuHistoricoServicos() {
		while (true) {
			System.out.println();
			System.out.println("|1. Historico de consultas.    |");
			System.out.println("|2. Historico de banho e tosa. |");
			System.out.println("|3. Historico da Daycare.      |");
			System.out.println("|0. Voltar.                    ");
			System.out.print("Digite aqui: ");
			Integer escolha2 = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");

			if (escolha2.equals(1)) {
				imprimirListaConsulta(HistoricoConsulta.consultaRotina, HistoricoConsulta.consultaEmergencia);
			} else if (escolha2.equals(2)) {
				imprimirListaBanhoTosa(HistoricoBanhoTosa.banho, HistoricoBanhoTosa.banhoTosa,
						HistoricoBanhoTosa.banhoHidratacao, HistoricoBanhoTosa.banhoTosaHigienica);
			} else if (escolha2.equals(3)) {
				imprimirListaDaycare(HistoricoDaycare.daycare);
			} else if (escolha2.equals(0)) {
				return;
			} else {
				System.out.println("Essa não é uma opção válida.");
			}
		}
	}

	public static void imprimirListaConsulta(List<ConsultaRotina> consultaRotina,
			List<ConsultaEmergencia> consultaEmergencia) {
		if (consultaRotina != null && !consultaRotina.isEmpty()) {
			System.out.println("Últimas consultas de rotina marcadas:");
			for (ConsultaRotina histoConsultaRo : consultaRotina) {
				System.out.println(histoConsultaRo);
			}
		} else {
			System.out.println();
			System.out.println("A lista de consultas de rotina está vazia.");
		}
		if (consultaEmergencia != null && !consultaEmergencia.isEmpty()) {
			System.out.println("Últimas consultas de emergencia marcadas:");
			for (ConsultaEmergencia histoConsultaEmer : consultaEmergencia) {
				System.out.println();
				System.out.println(histoConsultaEmer);
			}
		} else {
			System.out.println();
			System.out.println("A lista de consultas de emergência está vazia.");
		}
	}

	public static void imprimirListaBanhoTosa(List<Banho> banho, 
			                                  List<BanhoTosa> banhoTosa,
			                                  List<BanhoHidratacao> banhoHidratacao, 
			                                  List<BanhoTosaHigienica> banhoTosaHigienica) {
		if (banho != null && !banho.isEmpty()) {
			for (Banho banhos : banho) {
				System.out.println();
				System.out.println(banhos);
			}
		} else {
			System.out.println();
			System.out.println("A lista de banhos marcados está vazia.");
		}
		if (banhoTosa != null && !banhoTosa.isEmpty()) {
			for (BanhoTosa banhotosa : banhoTosa) {
				System.out.println();
				System.out.println(banhotosa);
			}
		} else {
			System.out.println();
			System.out.println("A lista de banho e tosas marcados está vazia.");
		}
		if (banhoHidratacao != null && !banhoHidratacao.isEmpty()) {
			for (BanhoHidratacao banhohidratacao : banhoHidratacao) {
				System.out.println();
				System.out.println(banhohidratacao);
			}
		} else {
			System.out.println();
			System.out.println("A lista de banho e hidratações marcados está vazia.");
		}
		if (banhoTosaHigienica != null && !banhoTosaHigienica.isEmpty()) {
			for (BanhoTosaHigienica banhotosahigienica : banhoTosaHigienica) {
				System.out.println();
				System.out.println(banhotosahigienica);
			}
		} else {
			System.out.println();
			System.out.println("A lista de banho e tosa higiênica está vazia.");
		}
	}

	public static void imprimirListaDaycare(List<Daycare> daycare) {
		if (daycare != null && !daycare.isEmpty()) {
			System.out.println("Últimos registros de daycare:");
			for (Daycare dayCare : daycare) {
				System.out.println();
				System.out.println(dayCare);
			}
		} else {
			System.out.println();
			System.out.println("A lista de historico da daycare está vazia.");
		}
	}

	public static void imprimirListaVendas(List<Vendas> vendas) {
		if (vendas != null && !vendas.isEmpty()) {
			for (Vendas histovendas : vendas) {
				System.out.println();
				System.out.println(histovendas);
			}
		} else {
			System.out.println();
			System.out.println("A lista de historico de vendas está vazia.");
		}
	}

	public static void imprimirListaPets(List<Pets> pet) {
		if (pet != null && !pet.isEmpty()) {
			System.out.println("Pets adotados:");
			for (Pets pets : pet) {
				System.out.println();
				System.out.println(pets);
			}
		} else {
			System.out.println();
			System.out.println("A lista de pets adotados está vazia.");
		}
	}
}