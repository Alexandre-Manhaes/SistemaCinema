package sistemaCinema.service;

import sistemaCinema.model.Usuario; // Importa a classe Usuario
import sistemaCinema.repository.MemorialRepositorioUsuarios; // Importa o repositório de usuários

public class ServicoAutenticacao { 
    private MemorialRepositorioUsuarios repositorioUsuarios; // Declara o atributo para acessar os usuários

    public ServicoAutenticacao(MemorialRepositorioUsuarios repositorioUsuarios) { // Construtor que recebe o repositório de usuários
        this.repositorioUsuarios = repositorioUsuarios; // Inicializa o atributo com o repositório recebido
    }

    public Usuario autenticar(String login, String senha, String tipo) { // Método para autenticar um usuário
        Usuario usuario = repositorioUsuarios.buscarPorLoginSenha(login, senha); // Busca usuário pelo login e senha
        if (usuario != null && usuario.getClass().getSimpleName().equalsIgnoreCase(tipo)) { // Verifica se usuário existe e se o tipo confere
            return usuario; // Retorna o usuário autenticado
        }
        return null; // Retorna null se autenticação falhar
    }
}