package resources;

import java.time.LocalDateTime;

public class BanhoTosaHigienica {
	private LocalDateTime dataBanhoTosaHigienica;
	private String animal;
	private String donoDoAnimal;
	private int registro;

	public BanhoTosaHigienica(LocalDateTime dataBanhoTosaHigienica, String animal, String donoDoAnimal, int registro) {
		this.dataBanhoTosaHigienica = dataBanhoTosaHigienica;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public LocalDateTime getDataBanhoTosaHigienica() {
		return dataBanhoTosaHigienica;
	}
	
	public String getAnimal() {
		return animal;
	}

	public String getDonoDoAnimal() {
		return donoDoAnimal;
	}
	
	public int getRegistro() {
		return registro;
	}

	public String toString() {
		return "Animal: "
				+ animal 
				+ "\nProprietario do pet: "
				+ donoDoAnimal
				+ "\nDia do banho: "
				+ dataBanhoTosaHigienica
				+ "\nNumero de registro: "
				+ registro;
	}
}
