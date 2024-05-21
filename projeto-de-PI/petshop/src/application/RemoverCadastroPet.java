package application;

import resources.HistoricoPet;
import resources.LerDados;

public class RemoverCadastroPet {
	public static void removerCadastroPet() {
		 System.out.print("Digite o código de registro do pet que deseja remover: ");
	        int registro = LerDados.lerInt("Parece que você digitou errado, tente novamente!\n");
	        System.out.println();

	        boolean encontrado = false;
	        for (int i = 0; i < HistoricoPet.pet.size(); i++) {
	            if (HistoricoPet.pet.get(i).getNumeroRegistro() == registro) {
	                HistoricoPet.pet.remove(i);
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
