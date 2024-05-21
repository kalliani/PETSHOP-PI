package application;

import resources.HistoricoProprietario;
import resources.LerDados;

public class RemoverCadastroProprietario {
	public static void removerCadastroProprietario() {
		System.out.print("Digite o numero de registro do cliente que deseja remover: ");
		int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
		System.out.println();
		
		 boolean encontrado = false;
	        for (int i = 0; i < HistoricoProprietario.proprietario.size(); i++) {
	            if (HistoricoProprietario.proprietario.get(i).getRegistro() == registro) {
	            	HistoricoProprietario.proprietario.remove(i);
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
