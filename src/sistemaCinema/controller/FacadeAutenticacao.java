package sistemaCinema.controller;

import sistemaCinema.model.Usuario;
import sistemaCinema.repository.RepositorioUsuarios;
import sistemaCinema.service.ServicoAutenticacao;

public class FacadeAutenticacao {
    private ServicoAutenticacao servicoAutenticacao;

    public FacadeAutenticacao(RepositorioUsuarios repositorioUsuarios) {
        this.servicoAutenticacao = new ServicoAutenticacao(repositorioUsuarios);
    }

    public Usuario login(String login, String senha, String tipo) {
        return servicoAutenticacao.autenticar(login, senha, tipo);
    }
}