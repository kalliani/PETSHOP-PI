package resources;

import java.time.LocalDateTime;

public class Banho {
	private LocalDateTime dataBanho;
	private String animal;
	private String donoDoAnimal;
	private int registro;

	public Banho(LocalDateTime dataBanho, String animal, String donoDoAnimal, int registro) {
		super();
		this.dataBanho = dataBanho;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public LocalDateTime getDataBanho() {
		return dataBanho;
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
				+ dataBanho
				+ "\nNumero de registro: "
				+ registro;
	}
}
