package sistemaCinema.repository;

import sistemaCinema.model.ItemSecundario;
import java.util.List;

public interface RepositorioItensSecundarios {

    public void adicionarItem(ItemSecundario item);

    public List<ItemSecundario> listarItens();

    public ItemSecundario buscarPorNome(String nome);
}
