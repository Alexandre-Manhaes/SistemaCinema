package sistemaCinema.service;

import java.util.HashMap;
import java.util.Map;
import sistemaCinema.model.Assento;
import sistemaCinema.model.Sala;

public class ServicoAssento {
	 private final Map<String, Assento[]> assentosPorSala = new HashMap<>();
	 
	 public void criarAssentos(Sala sala) {
	        if (sala == null) {
	            throw new IllegalArgumentException("Sala inválida.");
	        }

	        Assento[] assentos = new Assento[sala.getCapacidadeTotal()];
	        for (int i = 0; i < sala.getCapacidadeTotal(); i++) {
	            assentos[i] = new Assento(i + 1);
	        }
	        assentosPorSala.put(sala.getNumeroId(), assentos);
	    }
	 
	 public boolean verificarDisponibilidade(String numeroSala, int numeroAssento) {
	        Assento[] assentos = assentosPorSala.get(numeroSala);
	        if (assentos == null || numeroAssento < 1 || numeroAssento > assentos.length)
	            throw new IllegalArgumentException("Sala ou assento inválido.");
	        return assentos[numeroAssento - 1].estaDisponivel();
	    }
	 
	 public void reservarAssento(String numeroSala, int numeroAssento) {
	        Assento[] assentos = assentosPorSala.get(numeroSala);
	        if (assentos == null || numeroAssento < 1 || numeroAssento > assentos.length)
	            throw new IllegalArgumentException("Sala ou assento inválido.");
	        assentos[numeroAssento - 1].reservar();
	    }
	
	 public Assento[] listarAssentos(String numeroSala) {
	        return assentosPorSala.get(numeroSala);
	    }
	}
