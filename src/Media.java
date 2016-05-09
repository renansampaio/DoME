public abstract class Media {
	String nome;
	int id = 0;
	boolean got_it = false;
	String comment;
	int tempo_total;
	
	public Media(String nome, int id, boolean got_it, String comment, int tempo_total){
		this.nome = nome;
		this.id = id;
		this.got_it = got_it;
		this.comment = comment;
		this.tempo_total = tempo_total;
	}
	
	
	
}
