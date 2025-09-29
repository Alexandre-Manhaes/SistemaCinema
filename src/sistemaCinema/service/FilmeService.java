package sistemaCinema.service;

import sistemaCinema.model.Filme;
import sistemaCinema.repository.RepositorioFilmes;

public class FilmeService {
	private RepositorioFilmes repository;
	
	public FilmeService(RepositorioFilmes repository) {
		this.repository = repository;
}
	
	public void cadastrarFilme (String titulo, String genero, int duracao, int classificacaoEtaria, String status) {
		Filme novo = new Filme(titulo, genero, duracao, classificacaoEtaria, status);
		repository.salvar(novo);
	}
	
	public void removerFilme (String titulo) {
		String filmeRemovido = titulo;
		Filme f = repository.buscarPorTitulo(titulo);
		if (f != null) {
			repository.remover(f);
			System.out.println("Filme " + filmeRemovido + "foi removido.");
		} else {
			throw new IllegalArgumentException("Filme não encontrado para remoção.");
		}
	}
	
	public void atualizarStatus (String titulo, String novoStatus) {
		Filme f = repository.buscarPorTitulo(titulo);
		if (f != null) {
			f.atualizarStatus(novoStatus);
		} else {
			throw new IllegalArgumentException("Filme não encontrado para atualização de status.");
		}
	}
	public Filme buscarPorTitulo(String titulo) {
		return repository.buscarPorTitulo(titulo);
	}
	
	public void listarFilmes() {
		for (Filme f : repository.listar()) {
			System.out.println(f);
		}
	}
}
