package resources;

import java.time.LocalDateTime;

public class Daycare {
	
	private String localidade; 
	private LocalDateTime dataDaycare;
	private String animal;
	private String donoDoAnimal;

	public Daycare(String localidade, LocalDateTime dataDaycare, String animal, String donoDoAnimal) {
		this.localidade = localidade;
		this.dataDaycare = dataDaycare;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public LocalDateTime getDataDaycare() {
		return dataDaycare;
	}

	public void setDataDaycare(LocalDateTime dataDaycare) {
		this.dataDaycare = dataDaycare;
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
				+ "\nData: " 
				+ dataDaycare 
				+ "\nLocal da hospedagem: " 
				+ localidade;
	}
}
