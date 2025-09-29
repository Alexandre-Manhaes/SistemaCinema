package sistemaCinema.controller;

import sistemaCinema.model.Usuario;
import sistemaCinema.repository.MemorialRepositorioUsuarios;
import sistemaCinema.service.ServicoAutenticacao;

public class FacadeAutenticacao {
    private ServicoAutenticacao servicoAutenticacao;

    public FacadeAutenticacao(MemorialRepositorioUsuarios repositorioUsuarios) {
        this.servicoAutenticacao = new ServicoAutenticacao(repositorioUsuarios);
    }

    public Usuario login(String login, String senha, String tipo) {
        return servicoAutenticacao.autenticar(login, senha, tipo);
    }
}