package Classi;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Libro extends ModelloBase {
	
	@Column(name = "AUTORE")
	private String autore;
	@Column(name = "GENERE")
	private String genere;
	
	public Libro (String _titolo, int _annoPubblicazione, int _numeroPagine, String _autore,String _genere) {
		
		super(_titolo, _annoPubblicazione, _numeroPagine);
		
		this.autore = _autore;
		this.genere = _genere;
		
	}
	
	
	

}
