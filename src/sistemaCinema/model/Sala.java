package sistemaCinema.model;

public class Sala {
		private String numeroId;
		private int capacidadeTotal;
		
		 public Sala(String numeroId, int capacidadeTotal) {
		        this.numeroId = numeroId;
		        this.capacidadeTotal = capacidadeTotal;
		    }
		 
		 	public String getNumeroId() { 
		 		return numeroId; }
		    public int getCapacidadeTotal() { 
		    	return capacidadeTotal; }
		    
		    public String toString() {
		    	return "Sala " + numeroId + " - Capacidade: " + capacidadeTotal + " assentos.";
		    }
}
