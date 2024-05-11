package resources;

import java.time.LocalDateTime;

public class Banho {
	private LocalDateTime dataBanho;
	private String animal;
	private String donoDoAnimal;

	public Banho(LocalDateTime dataBanho, String animal, String donoDoAnimal) {
		this.dataBanho = dataBanho;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
	}

	public LocalDateTime getDataBanho() {
		return dataBanho;
	}

	public void setDataBanho(LocalDateTime dataBanho) {
		this.dataBanho = dataBanho;
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
				+ dataBanho;
	}
}
