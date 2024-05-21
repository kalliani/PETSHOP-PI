package application;

import resources.LerDados;
import resources.ListaProdutos;

public class Petshop {
	public static void main(String[] args) {
		ListaProdutos.produtosIniciais();
		while (true) {
			System.out.println("Bem-vindo ao nosso petshop! Identifique-se antes de acessar.");
			System.out.println("|1. Sou cliente.    |");
			System.out.println("|2. Sou funcionario.|");
			System.out.println("|0. Sair.           |");
			System.out.print("Digite aqui: ");
			Integer identidade = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");

			if (identidade.equals(1)) {
				menuPrincipalCliente();
			} else if (identidade.equals(2)) {
				System.out.print("Digite a senha: ");
				Integer senha = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
				if (senha.equals(123)) {
					menuPrincipalFuncionario();
				} else {
					System.out.println("Senha errada! Tente novamente.");
				}
			} else if (identidade.equals(0)) {
				return;
			} else {
				System.out.println("Opção invalida.");
			}
		}
	}

	public static void menuPrincipalFuncionario() {
		while (true) {
			System.out.println();
			System.out.println("|1. Remover cadastro pet             |");
			System.out.println("|2. Remover cadastro do proprietario |");
			System.out.println("|3. Cancelar agendamento de serviços |");
			System.out.println("|4. Historico de serviços            |");
			System.out.println("|5. Estoque de produtos              |");
			System.out.println("|6. Cadastro de Pets para Adoção     |");
			System.out.println("|7. Cadastro de Eventos              |");
			System.out.println("|0. Voltar                           |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();
			
			if (escolha.equals(1)) {
				RemoverCadastroPet.removerCadastroPet();
			} else if (escolha.equals(2)) {
				RemoverCadastroProprietario.removerCadastroProprietario();
			} else if (escolha.equals(3)) {
				CancelarAgendamentoServicos.cancelarAgendamentoServicos();
			} else if (escolha.equals(4)) {
				HistoricoServicos.historicoServicos();
			} else if (escolha.equals(5)) {
				EstoqueDeProdutos.estoqueDeProdutos();
			} else if (escolha.equals(6)) {
				CadastroPetsAdocao.cadastroPetsAdocao();
			} else if (escolha.equals(7)) {
				CadastroEventos.cadastroEventos();
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Opção invalida, tente novamente!");
			}
		}
	}

	public static void menuPrincipalCliente() {
		while (true) {
			System.out.println();
			System.out.println("|1. Cadastro do pet         |");
			System.out.println("|2. Cadastro do proprietario|");
			System.out.println("|3. Agendamento de serviços |");
			System.out.println("|4. Venda de produtos       |");
			System.out.println("|5. Adoção de pets          |");
			System.out.println("|6. Eventos do petshop      |");
			System.out.println("|0. Voltar                  |");
			System.out.print("Digite aqui: ");
			Integer escolha = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
			System.out.println();
			
			if (escolha.equals(1)) {
				CadastroPet.cadastroPet();
			} else if (escolha.equals(2)) {
				CadastroProprietario.cadastroProprietario();
			} else if (escolha.equals(3)) {
				AgendamentoServicos.agendamentoServicos();
			} else if (escolha.equals(4)) {
				VendaProdutos.vendaProdutos();
			} else if (escolha.equals(5)) {
				AdocaoPets.adocaoPets();
			} else if (escolha.equals(6)) {
				EventosPetshop.eventosPetshop();
			} else if (escolha.equals(0)) {
				return;
			} else {
				System.out.println("Opção invalida, tente novamente!");
			}
		}
	}
}
