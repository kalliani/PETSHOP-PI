package application;

import java.util.ArrayList;
import java.util.List;

import resources.HistoricoProprietario;
import resources.LerDados;

public class CadastroProprietario {
	static List<HistoricoProprietario> listProp = new ArrayList<>();
	public static void cadastroProprietario() {
		System.out.println();
		System.out.print("Digite o seu nome completo: ");
		var nomeProprietario = LerDados.lerTexto();
		System.out.print("Digite seu cpf: ");
		var cpf = LerDados.lerInt("Parece que você digitou errado, digite seu cpf novamente.");
		System.out.print("Digite seu telefone: ");
		var telefone = LerDados.lerInt("Parece que você digitou errado, digite seu telefone novamente");
		System.out.print("Digite seu e-mail: ");
		var email = LerDados.lerTexto();

		System.out.println();
		System.out.println("Perfeito! Você foi registrado em nosso sistema.");
		System.out.println();

		listProp.add(new HistoricoProprietario(nomeProprietario, cpf, telefone, email));
	}
}
