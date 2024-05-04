package resources;

import java.time.LocalDateTime;

public class Banho {
	private LocalDateTime dataBanho;

	public Banho(LocalDateTime dataBanho) {
		this.dataBanho = dataBanho;
	}

	public LocalDateTime getDataBanho() {
		return dataBanho;
	}

	public void setDataBanho(LocalDateTime dataBanho) {
		this.dataBanho = dataBanho;
	}
	
	public String toString() {
		return "Último banho marcado: "
				+ dataBanho;
	}
}
