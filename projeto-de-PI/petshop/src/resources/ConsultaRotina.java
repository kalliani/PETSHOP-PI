package resources;

import java.time.LocalDateTime;

public class ConsultaRotina {
    private LocalDateTime dataRotina;
    private String animal;
    private String donoDoAnimal;
    private String doutor;

	public ConsultaRotina(LocalDateTime dataRotina, String animal, String donoDoAnimal, String doutor) {
		this.dataRotina = dataRotina;
		this.animal = animal;
		this.donoDoAnimal = donoDoAnimal;
		this.doutor = doutor;
	}

	public LocalDateTime getDataRotina() {
        return dataRotina;
    }

    public void setDataRotina(LocalDateTime dataRotina) {
        this.dataRotina = dataRotina;
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
        		+ dataRotina;
    }
}
