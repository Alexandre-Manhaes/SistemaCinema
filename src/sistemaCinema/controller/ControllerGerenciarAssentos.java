package sistemaCinema.controller;

import sistemaCinema.model.Assento;
import sistemaCinema.service.ServicoAssento;

public class ControllerGerenciarAssentos {
    
    private final ServicoAssento servicoAssento;
	
	public ControllerGerenciarAssentos(ServicoAssento servicoAssento) {
        this.servicoAssento = servicoAssento;
	}
	
	 public void listarAssentos(String numeroSala) {
	        Assento[] assentos = servicoAssento.listarAssentos(numeroSala);
	        if (assentos == null) {
	            System.out.println("Sala não encontrada.");
	            return;
	        }
	        for (Assento a : assentos) {
	            System.out.println(a);
	        }
	 }
	        public void reservarAssento(String numeroSala, int numeroAssento) {
	            try {
	                servicoAssento.reservarAssento(numeroSala, numeroAssento);
	                System.out.println("Assento " + numeroAssento + " reservado com sucesso!");
	            } catch (IllegalArgumentException | IllegalStateException e) {
	                System.out.println("Erro: " + e.getMessage());
	            }
	        }
	        
	        public boolean verificarDisponibilidade(String numeroSala, int numeroAssento) {
	            return servicoAssento.verificarDisponibilidade(numeroSala, numeroAssento);
	        }

}
