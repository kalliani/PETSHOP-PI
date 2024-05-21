package resources;

import java.time.LocalDateTime;

public class BanhoTosa {
	private LocalDateTime dataBanhoTosa;
	private String animal;
	private String donoDoAnimal;
	private int registro;
	
	public BanhoTosa(LocalDateTime dataBanhoTosa, String animal, String donoDoAnimal, int registro) {
		this.dataBanhoTosa = dataBanhoTosa;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public LocalDateTime getDataBanhoTosa() {
		return dataBanhoTosa;
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
				+ dataBanhoTosa
				+ "\nNumero de registro"
				+ registro;
	}
}
