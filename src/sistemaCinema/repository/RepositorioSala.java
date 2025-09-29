package sistemaCinema.repository;

import java.util.List;
import sistemaCinema.model.Sala;

public interface RepositorioSala {
		void salvar (Sala sala);
		void remover (Sala sala);
		List <Sala> listar();
		Sala buscarPorID(String numeroId);
}
