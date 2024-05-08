package resources;

import java.time.LocalDateTime;

public class BanhoTosaHigienica {
	private LocalDateTime dataBanhoTosaHigienica;

	public BanhoTosaHigienica(LocalDateTime dataBanhoTosaHigienica) {
		this.dataBanhoTosaHigienica = dataBanhoTosaHigienica;
	}

	public LocalDateTime getDataBanhoTosaHigienica() {
		return dataBanhoTosaHigienica;
	}

	public void setDataBanhoTosaHigienica(LocalDateTime dataBanhoTosaHigienica) {
		this.dataBanhoTosaHigienica = dataBanhoTosaHigienica;
	}
	
	public String toString() {
		return "Último banho com tosa higiênica marcado: "
				+ dataBanhoTosaHigienica;
	}
}
