package resources;

import java.time.LocalDateTime;

public class ConsultaRotina {
    private LocalDateTime dataRotina;
    private String animal;
    private String donoDoAnimal;
    private int registro;

	public ConsultaRotina(LocalDateTime dataRotina, String animal, String donoDoAnimal, int registro) {
		this.dataRotina = dataRotina;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.registro = registro;
	}

	public LocalDateTime getDataRotina() {
        return dataRotina;
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
        		+ dataRotina
        		+ "\nNumero de registro: "
        		+ registro;
    }
}
