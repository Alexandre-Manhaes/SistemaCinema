package sistemaCinema.model;

public class ItemSecundario {

    private String nome;
    private double preco;       

    public ItemSecundario(String nome, double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return "ItemSecundario [nome=" + nome + ", preco=" + preco + "]";
    }
}
