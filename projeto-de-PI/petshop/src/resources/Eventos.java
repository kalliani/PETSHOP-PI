package resources;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Eventos {
	private LocalDateTime data;
	private String nome;
	private String local;
	
	public Eventos(LocalDateTime data, String nome, String local) {
		this.data = data;
		this.nome = nome;
		this.local = local;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public String toString() {
		return nome
				+ "\nLocal: "
				+ local
				+ "\nData: "
				+ data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss"));
	}
}
