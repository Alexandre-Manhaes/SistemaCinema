package sistemaCinema.controller;

import sistemaCinema.model.Sala;
import sistemaCinema.service.SalaService;

public class ControllerCadastroSala {
    
    private SalaService service;

	public ControllerCadastroSala (SalaService service) {
		this.service = service;
	}
	
	  public SalaService getService() {
	        return service;
	    }

	public void cadastrarSala (String numeroId, int capacidadeTotal) {
		try {
			service.cadastrarSala(numeroId, capacidadeTotal);
			System.out.println("Sala " + numeroId + " cadastrada.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void removerSala (String numeroId) {
		try {
			service.removerSala(numeroId);
			System.out.println("Sala removida.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listarSalas() {
		for (Sala s : service.listarSalas()) {
			System.out.println(s);
		}
	}
	
	public void buscarSala (String numeroId) {
		Sala s = service.buscarSala(numeroId);
		if (s != null) {
			System.out.println("Encontrada: " + s);
		} else {
			System.out.println("Sala não encontrada.");;
		}
	}

}
