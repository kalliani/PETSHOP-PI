package resources;

import java.time.LocalDateTime;

public class BanhoTosa {
	private LocalDateTime dataBanhoTosa;

	public BanhoTosa(LocalDateTime dataBanhoTosa) {
		this.dataBanhoTosa = dataBanhoTosa;
	}

	public LocalDateTime getDataBanhoTosa() {
		return dataBanhoTosa;
	}

	public void setDataBanhoTosa(LocalDateTime dataBanhoTosa) {
		this.dataBanhoTosa = dataBanhoTosa;
	}
	
	public String toString() {
		return "Último banho e tosa marcado: "
				+ dataBanhoTosa;
	}
}
