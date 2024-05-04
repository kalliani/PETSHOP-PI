package resources;

public record HistoricoProprietario (
	String nomeProprietario,
	long cpf,
	long telefone,
	String email
	) {
	public String toString() {
		return "Nome do proprietario: "
				+ nomeProprietario
				+ "\nCPF: "
				+ cpf
				+ "\nNumero de telefone: "
				+ telefone
				+ "\nEmail: "
				+ email;
	}
}
	