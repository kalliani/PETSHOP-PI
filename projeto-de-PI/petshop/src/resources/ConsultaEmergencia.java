package resources;

import java.time.LocalDateTime;

public class ConsultaEmergencia {
	private LocalDateTime dataEmergencia;
	private String animal;
    private String donoDoAnimal;
    private String doutor;

	public ConsultaEmergencia(LocalDateTime dataEmergencia, String animal, String donoDoAnimal, String doutor) {
		this.dataEmergencia = dataEmergencia;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.doutor = doutor;
	}

	public LocalDateTime getDataEmergencia() {
		return dataEmergencia;
	}

	public void setDataEmergencia(LocalDateTime dataEmergencia) {
		this.dataEmergencia = dataEmergencia;
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

	public String getDoutor() {
		return doutor;
	}

	public void setDoutor(String doutor) {
		this.doutor = doutor;
	}

	public String toString() {
		return "Doutor da consulta: "
        		+ doutor
        		+ "\nPet: "
        		+ animal
        		+ "\nDono do animal: "
        		+ donoDoAnimal
        		+ "\nDia da consulta: "
				+ dataEmergencia;
	}
}
