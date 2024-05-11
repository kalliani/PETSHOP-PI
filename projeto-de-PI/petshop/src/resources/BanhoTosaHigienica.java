package resources;

import java.time.LocalDateTime;

public class BanhoTosaHigienica {
	private LocalDateTime dataBanhoTosaHigienica;
	private String animal;
	private String donoDoAnimal;

	public BanhoTosaHigienica(LocalDateTime dataBanhoTosaHigienica, String animal, String donoDoAnimal) {
		this.dataBanhoTosaHigienica = dataBanhoTosaHigienica;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
	}

	public LocalDateTime getDataBanhoTosaHigienica() {
		return dataBanhoTosaHigienica;
	}

	public void setDataBanhoTosaHigienica(LocalDateTime dataBanhoTosaHigienica) {
		this.dataBanhoTosaHigienica = dataBanhoTosaHigienica;
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
				+ dataBanhoTosaHigienica;
	}
}
