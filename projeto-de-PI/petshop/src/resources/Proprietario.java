package resources;

import java.math.BigDecimal;

public class Proprietario {
	private String nomeProprietario;
	private BigDecimal cpf;
	private BigDecimal telefone;
	private String email;
	
	public Proprietario(String nomeProprietario, BigDecimal cpf, BigDecimal telefone, String email) {
		this.nomeProprietario = nomeProprietario;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public BigDecimal getCpf() {
		return cpf;
	}

	public BigDecimal getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
	
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
