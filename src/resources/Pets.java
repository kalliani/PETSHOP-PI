package resources;

public class Pets {
	private String nomePet;
	private String endereco;
	
	public Pets(String nomePet, String endereco) {
		this.nomePet = nomePet;
		this.endereco = endereco;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return "Nome: "
				+ nomePet
				+ "\nEndereço onde ele está: "
				+ endereco;
	}
}
