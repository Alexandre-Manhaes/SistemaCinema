package sistemaCinema.repository;

import java.util.ArrayList;
import java.util.List;
import sistemaCinema.model.Sessao;

public class MemorialRepositorioSessao implements RepositorioSessao {
	private List <Sessao> sessoes = new ArrayList<>();

	public void salvar (Sessao sessao) {
		sessoes.add(sessao);
	}
	
	public void remover (Sessao sessao) {
		sessoes.remove(sessao);
	}
	
	public List<Sessao> listar(){
		return sessoes;
	}
}