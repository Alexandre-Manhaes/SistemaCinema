package sistemaCinema.controller;

import sistemaCinema.model.Filme;
import sistemaCinema.service.FilmeService;

public class ControllerCadastroFilme {
    
    private FilmeService service;
	
	public ControllerCadastroFilme( FilmeService service) {
		this.service = service;
	}
	
	 public FilmeService getService() {
	        return service;
	        
	 }
	
	public void cadastrarFilme (String titulo, String genero, int duracao, int classificacaoEtaria, String status) {
		service.cadastrarFilme(titulo, genero, duracao, classificacaoEtaria, status);
		System.out.println("Filme " + titulo + " cadastrado com sucesso.");
	}
	
	public void removerFilme (String titulo) {
		try {
			service.removerFilme(titulo);
		} catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
	}
	
	public void atualizarStatus (String titulo, String novoStatus) {
		try {
			service.atualizarStatus(titulo, novoStatus);
			System.out.println("Status atualizado com sucesso para: " + novoStatus);
		} catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
	}
	}
	
	public void listarFilmes() {
		service.listarFilmes();
	}
	
	public void buscarFilme (String titulo) {
		Filme f = service.buscarPorTitulo(titulo);
		if (f != null ) {
			System.out.println("Encontrado: " + f);
		} else {
			System.out.println("Filme não encontrado.");
		}
	}

}
