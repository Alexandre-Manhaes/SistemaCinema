package sistemaCinema.controller;

import java.time.LocalDateTime;
import java.util.Scanner;

import sistemaCinema.model.Filme;
import sistemaCinema.model.Sala;
import sistemaCinema.model.Sessao;
import sistemaCinema.repository.MemoriaRepositorioFilme;
import sistemaCinema.repository.MemorialRepositorioSala;
import sistemaCinema.repository.MemorialRepositorioSessao;
import sistemaCinema.repository.RepositorioFilmes;
import sistemaCinema.repository.RepositorioSala;
import sistemaCinema.repository.RepositorioSessao;
import sistemaCinema.service.FilmeService;
import sistemaCinema.service.SalaService;
import sistemaCinema.service.ServicoAssento;
import sistemaCinema.service.SessaoService;

public class Facade {

    private ControllerCadastroFilme CadastroFilme;
	private ControllerCadastroSala CadastroSala;
	private ControllerCadastroSessao CadastroSessao;
	private ControllerGerenciarAssentos GerenciarAssentos;
    private ServicoAssento servicoAssento;
    private Sala salaRecente;

	Scanner digitar_horario = new Scanner(System.in);
	
	public Facade() {
		RepositorioFilmes repository_filme = new MemoriaRepositorioFilme();
		FilmeService service_filme = new FilmeService(repository_filme);
		this.CadastroFilme = new ControllerCadastroFilme(service_filme);
		
		RepositorioSala repository_sala = new MemorialRepositorioSala();
		SalaService service_sala = new SalaService(repository_sala);
		this.CadastroSala = new ControllerCadastroSala(service_sala);
		
		RepositorioSessao repository_sessao = new MemorialRepositorioSessao();
		SessaoService service_sessao = new SessaoService(repository_sessao);
		this.CadastroSessao = new ControllerCadastroSessao (service_sessao);
		
		this.servicoAssento = new ServicoAssento();
		this.GerenciarAssentos = new ControllerGerenciarAssentos(servicoAssento);
		
		
	}
	// ==OPERAÇÕES FILME==//
	public void cadastrarFilme (String titulo, String genero, int duracao, int classificacao, String status) {
		CadastroFilme.cadastrarFilme(titulo, genero, duracao, classificacao,  status);
	}
	
	public void listarFilmes() {
		CadastroFilme.listarFilmes();
	}
	
	public Filme buscarFilmes(String titulo) {
		return CadastroFilme.getService().buscarPorTitulo(titulo);
	}
	
	public void removerFilme(String titulo) {
		CadastroFilme.removerFilme(titulo);
	}
	
	public void atualizarStatus(String titulo, String novoStatus) {
		CadastroFilme.atualizarStatus(titulo, novoStatus);
	}
	//==OPERAÇÕES SALA==//
	public void cadastrarSala(String numeroId, int capacidadeTotal) {
		CadastroSala.cadastrarSala(numeroId, capacidadeTotal);
		salaRecente = new Sala(numeroId, capacidadeTotal);
	}
	
	public void removerSala(String numeroId) {
		CadastroSala.removerSala(numeroId);
	}
	
	public void listarSalas () {
		CadastroSala.listarSalas();
	}
	
	public Sala buscarSala(String numeroId) {
		return CadastroSala.getService().buscarSala(numeroId);
	}
	//==OPERAÇÕES SESSÃO==//
	public void cadastrarSessao (String titulo, String numeroId, LocalDateTime horario) {
		Filme filme = buscarFilmes(titulo);
        Sala sala = buscarSala(numeroId);
        if (filme == null) {
            System.out.println("Erro: Filme não encontrado.");
            return;
        }
        if (sala == null) {
            System.out.println("Erro: Sala não encontrada.");
            return;
        }
		CadastroSessao.cadastrarSessao(filme, sala, horario);
	}
	
	public void removerSessao(Sessao sessao) {
		CadastroSessao.removerSessao(sessao);;
	}
	
	public void listarSessao () {
		CadastroSessao.listarSessao();
	}
	//==OPERAÇÃOES ASSENTOS==//
	public void listarAssentos(String numeroSala) {
		GerenciarAssentos.listarAssentos(numeroSala);
}

	public void reservarAssento(String numeroSala, int numeroAssento) {
		GerenciarAssentos.reservarAssento(numeroSala, numeroAssento);
}

	public boolean verificarDisponibilidadeAssento(String numeroSala, int numeroAssento) {
		return GerenciarAssentos.verificarDisponibilidade(numeroSala, numeroAssento);
}
	
	public void criarAssentosParaSalaRecente() {
        if (salaRecente == null) {
            System.out.println("Nenhuma sala recente cadastrada para criar assentos.");
            return;
        }
        servicoAssento.criarAssentos(salaRecente);
        System.out.println("Assentos criados para a sala " + salaRecente.getNumeroId());
    }

}
