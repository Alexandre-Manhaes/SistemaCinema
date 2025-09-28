package sistemaCinema.repository;

import sistemaCinema.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarPorLoginSenha(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.getCredenciais().getLogin().equals(login) &&
                u.getCredenciais().getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }
}