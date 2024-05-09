package application;

import resources.HistoricoProprietario;
import resources.LerDados;
import resources.Proprietario;

public class CadastroProprietario {
	public static void cadastroProprietario() {
		System.out.println();
		System.out.print("Digite o seu nome completo: ");
		var nomeProprietario = LerDados.lerTexto();
		System.out.print("Digite seu cpf: ");
		var cpf = LerDados.lerBigDecimal(11, "Por favor, digite apenas o seu cpf nesse campo.\n");
		System.out.print("Digite seu telefone: ");
		var telefone = LerDados.lerBigDecimal(9, "Por favor, digite apenas o seu numero de telefone nesse campo.\n");
		System.out.print("Digite seu e-mail: ");
		var email = LerDados.lerTexto();

		System.out.println();
		System.out.println("Perfeito! Você foi registrado em nosso sistema.");

		HistoricoProprietario.adicionarProprietario(new Proprietario(nomeProprietario, cpf, telefone, email));
	}
}
