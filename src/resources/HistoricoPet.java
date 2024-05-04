package resources;

public record HistoricoPet ( 
	 String nomePet,
	 int idadePet,
	 String portePet,
	 Double pesoPet,
	 String anotacoesPet
	) {
	public String toString() {
		return "Nome: "
				+ nomePet
				+ "\nIdade: "
				+ idadePet
				+ "\nPorte: "
				+ portePet
				+ "\nPeso: "
				+ pesoPet
				+ "\nObservações: "
				+ anotacoesPet;
	}
}

