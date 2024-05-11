package resources;

public class Pets {
	private String nome;
	private String animal;
	private String genero;
	private String idade;
	private String raca;
	
	public Pets(String nome, String animal, String genero, String idade, String raca) {
		this.nome = nome;
		this.animal = animal;
		this.genero = genero;
		this.idade = idade;
		this.raca = raca;
	}

	public Pets(String nome, String animal, String genero, String idade) {
		super();
		this.nome = nome;
		this.animal = animal;
		this.genero = genero;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String toString() {
		if (raca == null) {
		return nome
				+ " - "
				+ animal
				+ " ("
				+ idade
				+ ", "
				+ genero
				+ ").";
		} else {
			return nome
					+ " - "
					+ animal
					+ " ("
					+ idade
					+ ", "
					+ genero
					+ ", "
					+ raca
					+ ").";
		}
	}
}
