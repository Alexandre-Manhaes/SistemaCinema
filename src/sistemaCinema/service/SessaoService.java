package sistemaCinema.service;

import java.time.LocalDateTime;
import java.util.List;
import sistemaCinema.model.Sessao;
import sistemaCinema.model.Filme;
import sistemaCinema.model.Sala;
import sistemaCinema.repository.RepositorioSessao;

public class SessaoService {
	private RepositorioSessao repository;
	
	public SessaoService (RepositorioSessao repository) {
		this.repository = repository;
	}

	public void cadastrarSessao (Filme filme, Sala sala, LocalDateTime horario) {
		for (Sessao s : repository.listar()) {
			if (s.getSala().getNumeroId().equalsIgnoreCase(sala.getNumeroId()) && s.getHorario().equals(horario)) {
				throw new IllegalArgumentException("Já existe uma sessão nesta sala e horário. ");
			}
		}
		Sessao novaSessao = new Sessao(filme, sala, horario);
		repository.salvar(novaSessao);
	}
	
	public void removerSessao (Sessao sessao) {
		repository.remover(sessao);
	}
	
	public List<Sessao> listarSessoes() {
		return repository.listar();
	}
}