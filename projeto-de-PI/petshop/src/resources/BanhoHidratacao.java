package resources;

import java.time.LocalDateTime;

public class BanhoHidratacao {
	private LocalDateTime dataBanhoHidratacao;
	private String animal;
	private String donoDoAnimal;
	private int registro;

	public BanhoHidratacao(LocalDateTime dataBanhoHidratacao, String animal, String donoDoAnimal, int registro) {
		this.dataBanhoHidratacao = dataBanhoHidratacao;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public LocalDateTime getDataBanhoHidratacao() {
		return dataBanhoHidratacao;
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
				+ dataBanhoHidratacao
				+ "\nNumero de registro: "
				+ registro;
	}
}
