package resources;

public class PetsAdotados {
	private String nome;
	private String animal;
	private String genero;
	private String idade;
	private String raca;
	private String pessoaQueAdotou;
	private String endereco;
	
	public PetsAdotados(String nome, String animal, String genero, String idade, String raca, String pessoaQueAdotou, String endereco) {
		this.nome = nome;
		this.animal = animal;
		this.genero = genero;
		this.idade = idade;
		this.pessoaQueAdotou = pessoaQueAdotou;
		this.raca = raca;
		this.endereco = endereco;
	}

	public PetsAdotados(String nome, String animal, String genero, String idade, String pessoaQueAdotou, String endereco) {
		super();
		this.nome = nome;
		this.animal = animal;
		this.genero = genero;
		this.idade = idade;
		this.pessoaQueAdotou = pessoaQueAdotou;
		this.endereco = endereco;
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

	public String getIdade() {
		return idade;
	}

	public String getRaca() {
		return raca;
	}

	public String getPessoaQueAdotou() {
		return pessoaQueAdotou;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public String toString() {
		if (raca == null) {
		return  "Quem adotou: "
				+ pessoaQueAdotou
				+ "\nEndereço de quem adotou: "
				+ endereco
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
					+ "\nEndereço de quem adotou: "
					+ endereco
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
