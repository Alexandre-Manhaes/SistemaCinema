package sistemaCinema.repository;

import java.util.List;
import sistemaCinema.model.Filme;

public interface RepositorioFilmes {
	void salvar (Filme filme);
	void remover (Filme filme);
	List<Filme> listar ();
	Filme buscarPorTitulo (String titulo);
}
