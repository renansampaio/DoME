
public class CD extends Media {
	String artista;
	int num_faixas;
	
	public CD(String nome, int id, boolean got_it, String comment, int tempo_total, String artista, int num_faixas){
		super(nome, id, got_it, comment, tempo_total);
		this.artista = artista;
		this.num_faixas = num_faixas;
		
		
	}
}
