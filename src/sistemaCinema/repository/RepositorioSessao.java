package sistemaCinema.repository;

import java.util.List;

import sistemaCinema.model.Sessao;

public interface RepositorioSessao {
	void salvar (Sessao sessao);
	void remover (Sessao sessao);
	List<Sessao> listar();
}
