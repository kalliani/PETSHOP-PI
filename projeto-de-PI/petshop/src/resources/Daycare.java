package resources;

import java.time.LocalDateTime;

public class Daycare {
	
	private String localidade; 
	private LocalDateTime dataDaycare;
	private String animal;
	private String donoDoAnimal;
	private int registro;
	
	public Daycare(String localidade, LocalDateTime dataDaycare, String animal, String donoDoAnimal, int registro) {
		this.localidade = localidade;
		this.dataDaycare = dataDaycare;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public LocalDateTime getDataDaycare() {
		return dataDaycare;
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
				+ "\nData: " 
				+ dataDaycare 
				+ "\nLocal da hospedagem: " 
				+ localidade
				+ "\nNumero de registro: "
				+ registro;
	}
}
