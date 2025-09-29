package sistemaCinema.repository;

import sistemaCinema.model.Sala;
import java.util.ArrayList;
import java.util.List;

public class MemorialRepositorioSala implements RepositorioSala {
	private List <Sala> salas = new ArrayList<>();
	
	public void salvar (Sala sala) {
		salas.add(sala);
	}
	
	public void remover (Sala sala) {
		salas.remove(sala);
	}
	
	public List <Sala> listar () {
		return salas;
	}
	
	public Sala buscarPorID (String numeroId) {
		for (Sala s : salas) {
			if  (s.getNumeroId().equalsIgnoreCase(numeroId)) {
				return s;
			}
		}
		return null;
	}
}