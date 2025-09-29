package sistemaCinema.service;

import sistemaCinema.model.ItemSecundario;
import sistemaCinema.repository.MemorialRepositorioItensSecundarios;
import java.util.ArrayList;
import java.util.List;

public class ServicoVendaItensSecundarios {
    private MemorialRepositorioItensSecundarios repositorioItens;
    private List<ItemSecundario> itensVendidos = new ArrayList<>();

    public ServicoVendaItensSecundarios(MemorialRepositorioItensSecundarios repositorioItens) {
        this.repositorioItens = repositorioItens;
    }

    public boolean venderItem(String nomeItem) {
        ItemSecundario item = repositorioItens.buscarPorNome(nomeItem);
        if (item != null) {
            itensVendidos.add(item);
            System.out.println("Item vendido: " + item.getNome() + " - R$" + item.getPreco());
            return true;
        } else {
            System.out.println("Item não encontrado no repositório!");
            return false;
        }
    }

    public List<ItemSecundario> getItensVendidos() {
        return new ArrayList<>(itensVendidos);
    }
}