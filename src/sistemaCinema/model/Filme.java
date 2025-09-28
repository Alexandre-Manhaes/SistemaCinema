package sistemaCinema.model;

public class Filme {
	private String titulo;
	private String genero;
	private int duracao;
	private int classificacaoEtaria;
	private String status;

	public Filme (String titulo, String genero, int duracao, int classificacaoEtaria, String status) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.classificacaoEtaria = classificacaoEtaria;
		this.status = status;
		
	} //Getters de Filme. Não é necessário Setters, pois a única forma de criar/alterar um Filme é no construtor para garantir encapsulamento real.
	public String getTitulo() { 
		return titulo; }
	
    public String getGenero() { 
    	return genero; }
    
    public int getDuracao() { 
    	return duracao; }
    
    public int getClassificacaoEtaria() {
    	return classificacaoEtaria; }
    
    public String getStatus() {
    	return status; }
    
   public void atualizarStatus(String novoStatus) {
	   this.status = novoStatus;
   }
   
   public String toString() {
    	return titulo + " (" + genero + ") - " + duracao + " minutos, Classificação Etária: " + classificacaoEtaria + " anos " + " | Status: " + status; 
    }

}
