package sistemaCinema.repository;

import java.util.List;
import java.util.ArrayList;
import sistemaCinema.model.Filme;

public class MemoriaRepositorioFilme implements RepositorioFilmes {
	
	private List<Filme> filmes = new ArrayList<>();
	
	public void salvar (Filme filme) {
		filmes.add(filme);
	}
	
	public void remover(Filme filme) {
        filmes.remove(filme);
    } 
	
	public List<Filme> listar() {
		return filmes;
	}
	
	public Filme buscarPorTitulo (String titulo) {
		for (Filme f : filmes) {
			if (f.getTitulo().equalsIgnoreCase(titulo)) {
				return f;
			}
		}
		return null;
		}
}
