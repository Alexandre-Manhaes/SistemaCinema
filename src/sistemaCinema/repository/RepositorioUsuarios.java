package sistemaCinema.repository;

import sistemaCinema.model.Usuario;
import java.util.List;

public interface RepositorioUsuarios {
    public void adicionarUsuario(Usuario usuario);

    public Usuario buscarPorLoginSenha(String login, String senha);   

}
