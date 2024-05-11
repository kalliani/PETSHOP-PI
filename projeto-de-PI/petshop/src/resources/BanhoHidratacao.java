package resources;

import java.time.LocalDateTime;

public class BanhoHidratacao {
	private LocalDateTime dataBanhoHidratacao;
	private String animal;
	private String donoDoAnimal;
	
	public BanhoHidratacao(LocalDateTime dataBanhoHidratacao, String animal, String donoDoAnimal) {
		this.dataBanhoHidratacao = dataBanhoHidratacao;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
	}

	public LocalDateTime getDataBanhoHidratacao() {
		return dataBanhoHidratacao;
	}

	public void setDataBanhoHidratacao(LocalDateTime dataBanhoHidratacao) {
		this.dataBanhoHidratacao = dataBanhoHidratacao;
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getDonoDoAnimal() {
		return donoDoAnimal;
	}

	public void setDonoDoAnimal(String donoDoAnimal) {
		this.donoDoAnimal = donoDoAnimal;
	}

	public String toString() {
		return "Animal: "
				+ animal 
				+ "\nProprietario do pet: "
				+ donoDoAnimal
				+ "\nDia do banho: "
				+ dataBanhoHidratacao;
	}
}
