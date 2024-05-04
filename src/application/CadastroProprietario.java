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
		Long cpf = LerDados.scan.nextLong();
		System.out.print("Digite seu telefone: ");
		Long telefone = LerDados.scan.nextLong();
		System.out.print("Digite seu e-mail: ");
		LerDados.scan.nextLine();
		var email = LerDados.lerTexto();

		System.out.println();
		System.out.println("Perfeito! Você foi registrado em nosso sistema.");
		System.out.println();

		listProp.add(new HistoricoProprietario(nomeProprietario, cpf, telefone, email));
	}
}
