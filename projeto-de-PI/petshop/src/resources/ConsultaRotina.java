package resources;

import java.time.LocalDateTime;

public class ConsultaRotina {
    private LocalDateTime dataRotina;

    public ConsultaRotina(LocalDateTime dataRotina) {
        this.dataRotina = dataRotina;
    }

    public LocalDateTime getDataRotina() {
        return dataRotina;
    }

    public void setDataRotina(LocalDateTime dataRotina) {
        this.dataRotina = dataRotina;
    }

    public String toString() {
        return "\n" 
        		+ dataRotina;
    }
}
