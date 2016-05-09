
public class DVD extends Media {
	String diretor;
	
	public DVD(String nome, int id, boolean got_it, String comment, int tempo_total, String diretor){
		super(nome, id, got_it, comment, tempo_total);
		this.diretor = diretor;
		
	}
	
}
