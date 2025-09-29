package sistemaCinema.repository;

import sistemaCinema.model.ItemSecundario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioItensSecundarios {
    private List<ItemSecundario> itens = new ArrayList<>();

    public void adicionarItem(ItemSecundario item) {
        itens.add(item);
    }

    public List<ItemSecundario> listarItens() {
        return new ArrayList<>(itens);
    }

    public ItemSecundario buscarPorNome(String nome) {
        for (ItemSecundario item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }
}