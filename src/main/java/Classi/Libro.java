package Classi;

public class Libro extends ModelloBase {
	
	private String autore;
	private String genere;
	
	public Libro (String _titolo, int _annoPubblicazione, int _numeroPagine, String _autore,String _genere) {
		
		super(_titolo, _annoPubblicazione, _numeroPagine);
		
		this.autore = _autore;
		this.genere = _genere;
		
	}
	
	
	

}
