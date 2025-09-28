package sistemaCinema.model;

public class Usuario {

    private String nome;
    private String email;
    private String cpf;
    private Credenciais credenciais;


    public Usuario(String nome, String email, String cpf, Credenciais credenciais) {
        super();
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.credenciais = credenciais;
    }
    public String getNome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public String getcpf() {
        return cpf;
    }

    public Credenciais getCredenciais() {
        return credenciais;
    }

    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", credenciais=" + credenciais + "]";
    }
}
