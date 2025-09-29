package sistemaCinema.service;

import java.util.List;

import sistemaCinema.model.Sala;
import sistemaCinema.repository.RepositorioSala;

public class SalaService {
	private RepositorioSala repository;
	
	public SalaService(RepositorioSala repository) {
		this.repository = repository;
	}
	
	public void cadastrarSala(String numeroId, int capacidadeTotal) {
		if (repository.buscarPorID(numeroId) != null) {
			throw new IllegalArgumentException("Já existe uma sala com esse número de identificação.");
		}
		Sala novaSala = new Sala (numeroId, capacidadeTotal);
		repository.salvar(novaSala);
	}
	
	public void removerSala(String numeroId) {
		Sala s = repository.buscarPorID(numeroId);
		if (s == null) {
			throw new IllegalArgumentException("Sala não encontrada.");	
		}
		repository.remover(s);
	}
	
	public Sala buscarSala(String numeroId) {
		return repository.buscarPorID(numeroId);
	}
	
	public List <Sala> listarSalas() {
		return repository.listar();
	}
}

