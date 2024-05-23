package application;

import java.time.LocalDateTime;

import resources.Eventos;
import resources.HistoricoEventos;
import resources.LerDados;

public class CadastroEventos {
	
	public static void cadastroEventos() {
		System.out.print("Diga o nome do evento que será adicionado: ");
		String nome = LerDados.lerTexto();
		System.out.print("Diga o local do evento: ");
		String local = LerDados.lerTexto();
		System.out.print("Diga a data do evento: ");
		LocalDateTime data = LerDados.lerDataHora("Horario invalido, tente novamente!\n");
		
		CadastroEventos.adicionarEventos(new Eventos(data, nome, local));
		
		System.out.println();
		System.out.println("Evento adicionado!");
	}

	public static void adicionarEventos(Eventos eventos) {
		HistoricoEventos.eventos.add(eventos);
	}

	public static void eventosIniciais() {
		CadastroEventos.adicionarEventos(new Eventos(LocalDateTime.now().plusMonths(1), "Evento de adoção", "Petshop Pata Amiga"));
		CadastroEventos.adicionarEventos(new Eventos(LocalDateTime.now().plusMonths(2), "Campanha de vacinação", "Petshop Pata Amiga"));
		CadastroEventos.adicionarEventos(new Eventos(LocalDateTime.now().plusWeeks(2), "Campanha de castração", "Petshop Pata Amiga"));
		CadastroEventos.adicionarEventos(new Eventos(LocalDateTime.now().plusDays(10), "Aula de adestramento", "Petshop Pata Amiga"));
	}
}
