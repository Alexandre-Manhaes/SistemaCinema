package sistemaCinema.service;

import sistemaCinema.model.Usuario;
import sistemaCinema.repository.RepositorioUsuarios;

public class ServicoAutenticacao {
    private RepositorioUsuarios repositorioUsuarios;

    public ServicoAutenticacao(RepositorioUsuarios repositorioUsuarios) {
        this.repositorioUsuarios = repositorioUsuarios;
    }

    public Usuario autenticar(String login, String senha, String tipo) {
        Usuario usuario = repositorioUsuarios.buscarPorLoginSenha(login, senha);
        if (usuario != null && usuario.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
            return usuario;
        }
        return null;
    }
}