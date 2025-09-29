package sistemaCinema.model;

import java.time.LocalDateTime;

public class Sessao {
	private Filme filme;
	private Sala sala;
	private LocalDateTime horario;

	public Sessao(Filme filme, Sala sala, LocalDateTime horario) {
		this.filme = filme;
		this.sala = sala;
		this.horario = horario;
	}
	
	public Filme getFilme() {
		return filme;
	}
	public Sala getSala() {
		return sala;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	
	public String toString() {
		return "Sessão: " + filme.getTitulo() + " | Sala: " + sala.getNumeroId() + " | Horário: " + horario;  
	}
}
