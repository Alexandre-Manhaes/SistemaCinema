package sistemaCinema.model;

public class Assento {
	
	private final int numero;
	private boolean disponivel;
	
	public Assento (int numero) {
		this.numero = numero;
		this.disponivel = true;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean estaDisponivel() {
		return disponivel;
	}
	
	public void reservar () {
		if (!disponivel) {
			throw new IllegalStateException("Assento já está reservado.");
		}
		this.disponivel = false;
	}
	
	public void liberar() {
        this.disponivel = true;
    }

	public String toString() {
        return "Assento " + numero + " - " + (disponivel ? "Disponível" : "Indisponível");
    }
}
