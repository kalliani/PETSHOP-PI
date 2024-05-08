package resources;

public class Pet {
	private String nomePet;
	private int idadePet;
	private String portePet;
	private Double pesoPet;
	private String anotacoesPet;
	
	public Pet(String nomePet, int idadePet, String portePet, Double pesoPet, String anotacoesPet) {
		this.nomePet = nomePet;
		this.idadePet = idadePet;
		this.portePet = portePet;
		this.pesoPet = pesoPet;
		this.anotacoesPet = anotacoesPet;
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
				+ "\nObservações: "
				+ anotacoesPet;
	}
}
