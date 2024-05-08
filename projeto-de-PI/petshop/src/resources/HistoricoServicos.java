package resources;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HistoricoServicos {
    //Histórico veterinario
	  private LocalDate diaConsulta;
	  private LocalDateTime hrConsulta;
	
	  public HistoricoServicos(LocalDate diaConsulta, LocalDateTime hrConsulta) {
		    this.diaConsulta = diaConsulta;
		    this.hrConsulta = hrConsulta;
	  }
	
	  public LocalDate getDiaConsulta() {
		    return diaConsulta;
	  }

	  public LocalDateTime getHrConsulta() {
		    return hrConsulta;
	  }
	  //
	
	  //Histórico do banho.
	  private LocalDateTime diaHrBanho;
	  private String restricoesPet;

	  public HistoricoServicos(LocalDateTime diaHrBanho, String restricoesPet) {
		    this.diaHrBanho = diaHrBanho;
		    this.restricoesPet = restricoesPet;
	  }
	
	  public LocalDateTime getDiaHrBanho() {
		    return diaHrBanho;
	  }
	
	  public String getRestricoesPet() {
		    return restricoesPet;
	  }
	  //
	
	  //Histórico da tosa
	  private LocalDateTime diaHrTosa;

	  public HistoricoServicos(LocalDateTime diaHrTosa) {
		    this.diaHrTosa = diaHrTosa;
	  }

	  public LocalDateTime getDiaHrTosa() {
		    return diaHrTosa;
	  }
	  //
	
	  /*Histórico do banho e tosa
	  private LocalDateTime diaHrBanhoTosa;
	  private String restricoes;

	  public HistoricoServicos(LocalDateTime diaHrBanhoTosa, String restricoes) {
		    this.diaHrBanhoTosa = diaHrBanhoTosa;
		    this.restricoes = restricoes;
	  }
	
	  public LocalDateTime getDiaHrBanhoTosa() {
		    return diaHrBanhoTosa;
	  }
	
	  public String getRestricoes() {
		    return restricoes;
	  }
	  */
	
	  //Histórico daycare
	  private LocalDate diaDaycare;
	  private LocalDateTime hrDaycare;
	  private LocalDateTime retirada;

	  public HistoricoServicos(LocalDate diaDaycare, LocalDateTime hrDaycare, LocalDateTime retirada) {
		    this.diaDaycare = diaDaycare;
		    this.hrDaycare = hrDaycare;
		    this.retirada = retirada;
	  }

	  public LocalDate getDiaDaycare() {
		    return diaDaycare;
	  }

	  public LocalDateTime getHrDaycare() {
		    return hrDaycare;
	  }

	  public LocalDateTime getRetirada() {
		    return retirada;
	  }
	  //
	  public String toString() {
		    return "Consulta: "
				    + diaConsulta 
				    + hrConsulta
				    + "\nBanho: "
				    + diaHrBanho
				    + "\nTosa: "
				    + diaHrTosa
				    + "Banho e tosa: "
				    + getDiaHrBanho();
	  }
}
