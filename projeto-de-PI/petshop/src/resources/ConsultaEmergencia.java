package resources;

import java.time.LocalDateTime;

public class ConsultaEmergencia {
	private LocalDateTime dataEmergencia;
	private String animal;
    private String donoDoAnimal;
    private int registro;

	public ConsultaEmergencia(LocalDateTime dataEmergencia, String animal, String donoDoAnimal, int registro) {
		this.dataEmergencia = dataEmergencia;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public LocalDateTime getDataEmergencia() {
		return dataEmergencia;
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
		return "\nPet: "
        		+ animal
        		+ "\nDono do animal: "
        		+ donoDoAnimal
        		+ "\nDia da consulta: "
				+ dataEmergencia
				+ "\nNumero de registro: "
				+ registro;
	}
}
