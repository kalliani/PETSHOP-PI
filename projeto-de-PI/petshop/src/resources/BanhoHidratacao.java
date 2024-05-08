package resources;

import java.time.LocalDateTime;

public class BanhoHidratacao {
	private LocalDateTime dataBanhoHidratacao;
	
	public BanhoHidratacao(LocalDateTime dataBanhoHidratacao) {
		this.dataBanhoHidratacao = dataBanhoHidratacao;
	}

	public LocalDateTime getDataBanhoHidratacao() {
		return dataBanhoHidratacao;
	}

	public void setDataBanhoHidratacao(LocalDateTime dataBanhoHidratacao) {
		this.dataBanhoHidratacao = dataBanhoHidratacao;
	}
	
	public String toString() {
		return "Último banho com hidratação marcado: "
				+ dataBanhoHidratacao;
	}
}
