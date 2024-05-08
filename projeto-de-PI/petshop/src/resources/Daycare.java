package resources;

import java.time.LocalDateTime;

public class Daycare {
	
	private String localidade; 
	private LocalDateTime dataDaycare;

	public Daycare( LocalDateTime dataDaycare, String localidade) {
		this.localidade = localidade;
		this.dataDaycare = dataDaycare;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public LocalDateTime getDataDaycare() {
		return dataDaycare;
	}

	public void setDataDaycare(LocalDateTime dataDaycare) {
		this.dataDaycare = dataDaycare;
	}

	public String toString() {
		return "Data: " 
				+ dataDaycare 
				+ "\nLocal da hospedagem: " 
				+ localidade;
	}
}
