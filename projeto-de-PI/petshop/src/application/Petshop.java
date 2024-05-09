package application;

import resources.LerDados;

public class Petshop {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao nosso petshop! Insira o dígito correspondente a sua necessidade de hoje:");
		menuPrincipal();
	}

	public static void menuPrincipal() {
		while (true) {
			System.out.println();
			System.out.println("|1. Cadastro do pet         |");
			System.out.println("|2. Cadastro do proprietario|");
			System.out.println("|3. Agendamento de serviços |");
			System.out.println("|4. Historico de serviços   |");
			System.out.println("|5. Venda de produtos       |");
			System.out.println("|6. Adoção de pets          |");
			System.out.println("|7. Eventos do petshop      |");
			System.out.println("|0. Sair                    |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");

			if (escolha.equals(1)) {
				CadastroPet.cadastroPet();
			} else if (escolha.equals(2)) {
				CadastroProprietario.cadastroProprietario();
			} else if (escolha.equals(3)) {
				AgendamentoServicos.agendamentoServicos();
			} else if (escolha.equals(4)) {
				HistoricoServicos.historicoServicos();
			} else if (escolha.equals(5)) {
				VendaProdutos.vendaProdutos();
			} else if (escolha.equals(6)) {
				AdocaoPets.adocaoPets();
			} else if (escolha.equals(7)) {
				EventosPetshop.eventosPetshop();
			} else if (escolha.equals(0)) {
				return;
			} 
		}
	}
}
