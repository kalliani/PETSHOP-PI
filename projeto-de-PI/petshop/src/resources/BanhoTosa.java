package resources;

import java.time.LocalDateTime;

public class BanhoTosa {
	private LocalDateTime dataBanhoTosa;
	private String animal;
	private String donoDoAnimal;

	public BanhoTosa(LocalDateTime dataBanhoTosa, String animal, String donoDoAnimal) {
		this.dataBanhoTosa = dataBanhoTosa;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
	}

	public LocalDateTime getDataBanhoTosa() {
		return dataBanhoTosa;
	}

	public void setDataBanhoTosa(LocalDateTime dataBanhoTosa) {
		this.dataBanhoTosa = dataBanhoTosa;
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
				+ dataBanhoTosa;
	}
}
