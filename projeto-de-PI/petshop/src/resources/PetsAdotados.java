package resources;

public class PetsAdotados {
	private String nome;
	private String animal;
	private String genero;
	private String idade;
	private String raca;
	private String pessoaQueAdotou;
	
	public PetsAdotados(String nome, String animal, String genero, String idade, String raca, String pessoaQueAdotou) {
		this.nome = nome;
		this.animal = animal;
		this.genero = genero;
		this.idade = idade;
		this.pessoaQueAdotou = pessoaQueAdotou;
		this.raca = raca;
	}

	public PetsAdotados(String nome, String animal, String genero, String idade, String pessoaQueAdotou) {
		super();
		this.nome = nome;
		this.animal = animal;
		this.genero = genero;
		this.idade = idade;
		this.pessoaQueAdotou = pessoaQueAdotou;
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

	public String getPessoaQueAdotou() {
		return pessoaQueAdotou;
	}

	public void setPessoaQueAdotou(String pessoaQueAdotou) {
		this.pessoaQueAdotou = pessoaQueAdotou;
	}

	public String toString() {
		if (raca == null) {
		return  "Quem adotou: "
				+ pessoaQueAdotou
				+ "\nAnimal adotado: "
				+ nome
				+ " - "
				+ animal
				+ " ("
				+ idade
				+ ", "
				+ genero
				+ ").";
		} else {
			return  "Quem adotou: "
					+ pessoaQueAdotou
					+ "\nAnimal adotado: "
					+ nome
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
