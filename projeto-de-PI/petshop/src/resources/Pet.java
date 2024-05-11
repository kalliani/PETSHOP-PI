package resources;

public class Pet {
	private String nomePet;
	private int idadePet;
	private String portePet;
	private Double pesoPet;
	private String anotacoesPet;
	private String nomeDoDono;
	
	public Pet(String nomePet, int idadePet, String portePet, Double pesoPet, String anotacoesPet, String nomeDoDono) {
		this.nomePet = nomePet;
		this.idadePet = idadePet;
		this.portePet = portePet;
		this.pesoPet = pesoPet;
		this.anotacoesPet = anotacoesPet;
		this.nomeDoDono = nomeDoDono;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public int getIdadePet() {
		return idadePet;
	}

	public void setIdadePet(int idadePet) {
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

	public String toString() {
		return "Nome: "
				+ nomePet
				+ "\nIdade: "
				+ idadePet
				+ " anos "
				+ "\nPorte: "
				+ portePet
				+ "\nPeso: "
				+ pesoPet
				+ "Kg "
				+ "\nNome do proprietario: "
				+ nomeDoDono
				+ "\nObservações: "
				+ anotacoesPet;
	}
}
