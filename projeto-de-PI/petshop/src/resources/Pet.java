package resources;

public class Pet {
	private String nomePet;
	private Double idadePet;
	private String portePet;
	private Double pesoPet;
	private String anotacoesPet;
	private String nomeDoDono;
	private int numeroRegistro;

	public Pet(String nomePet, Double idadePet, String portePet, Double pesoPet, String anotacoesPet, String nomeDoDono, int numeroRegistro) {
		this.nomePet = nomePet;
		this.idadePet = idadePet;
		this.portePet = portePet;
		this.pesoPet = pesoPet;
		this.anotacoesPet = anotacoesPet;
		this.nomeDoDono = nomeDoDono;
		this.numeroRegistro = numeroRegistro;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public Double getIdadePet() {
		return idadePet;
	}

	public void setIdadePet(Double idadePet) {
		this.idadePet = idadePet;
	}

	public String getPortePet() {
		return portePet;
	}

	public void setPortePet(String portePet) {
		this.portePet = portePet;
	}

	public Double getPesoPet() {
		return pesoPet;
	}

	public void setPesoPet(Double pesoPet) {
		this.pesoPet = pesoPet;
	}

	public String getAnotacoesPet() {
		return anotacoesPet;
	}

	public void setAnotacoesPet(String anotacoesPet) {
		this.anotacoesPet = anotacoesPet;
	}
	
	public String getNomeDoDono() {
		return nomeDoDono;
	}

	public void setNomeDoDono(String nomeDoDono) {
		this.nomeDoDono = nomeDoDono;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String toString() {
		return "Nome: "
				+ nomePet
				+ "\nIdade: "
				+ String.format("%.0f", idadePet)
				+ " anos "
				+ "\nPorte: "
				+ portePet
				+ "\nPeso: "
				+ pesoPet
				+ "Kg "
				+ "\nNome do proprietario: "
				+ nomeDoDono
				+ "\nObservações: "
				+ anotacoesPet
				+ "\nNumero de registro: "
				+ numeroRegistro;
	}
}
