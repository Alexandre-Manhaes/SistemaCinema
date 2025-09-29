package sistemaCinema.controller;

import java.time.LocalDateTime;
import sistemaCinema.model.Filme;
import sistemaCinema.model.Sala;
import sistemaCinema.model.Sessao;
import sistemaCinema.service.SessaoService;

public class ControllerCadastroSessao {
    
    private SessaoService service;
	
	public ControllerCadastroSessao(SessaoService service) {
		this.service = service;
	}
	
	public void cadastrarSessao(Filme filme, Sala sala, LocalDateTime horario) {
        try {
            service.cadastrarSessao(filme, sala, horario);
            System.out.println("Sessão cadastrada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
	
	public void removerSessao(Sessao sessao) {
        service.removerSessao(sessao);
        System.out.println("Sessão removida com sucesso!");
    }
	
	public void listarSessao() {
		for (Sessao s : service.listarSessoes()) {
			System.out.println(s);
		}
	}

}
