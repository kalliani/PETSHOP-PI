package resources;

import java.time.LocalDateTime;

public class ConsultaEmergencia {
	private LocalDateTime dataEmergencia;

	public ConsultaEmergencia(LocalDateTime dataEmergencia) {
		this.dataEmergencia = dataEmergencia;
	}

	public LocalDateTime getDataEmergencia() {
		return dataEmergencia;
	}

	public void setDataEmergencia(LocalDateTime dataEmergencia) {
		this.dataEmergencia = dataEmergencia;
	}

	public String toString() {
		return "\n"
				+ dataEmergencia;
	}
}
