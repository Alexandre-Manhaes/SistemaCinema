package sistemaCinema.repository;

import sistemaCinema.model.ItemSecundario;
import java.util.ArrayList;
import java.util.List;

public class MemorialRepositorioItensSecundarios implements RepositorioItensSecundarios {
    private List<ItemSecundario> itens = new ArrayList<>();

    @Override
    public void adicionarItem(ItemSecundario item) {
        itens.add(item);
    }

    @Override
    public List<ItemSecundario> listarItens() {
        return new ArrayList<>(itens);
    }

    @Override
    public ItemSecundario buscarPorNome(String nome) {
        for (ItemSecundario item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }
}