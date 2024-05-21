package resources;

import java.math.BigDecimal;

public class Proprietario {
	private String nomeProprietario;
	private BigDecimal cpf;
	private BigDecimal telefone;
	private String email;
	private int registro;

	public Proprietario(String nomeProprietario, BigDecimal cpf, BigDecimal telefone, String email, int registro) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.registro = registro;
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
	
	public int getRegistro() {
		return registro;
	}

	public String toString() {
		return "Nome do proprietario: "
				+ nomeProprietario
				+ "\nCPF: "
				+ String.format("%.0f", cpf)
				+ "\nNumero de telefone: "
				+ String.format("%.0f", telefone)
				+ "\nEmail: "
				+ email
				+ "\nNumero de registro: "
				+ registro;
	}
}
