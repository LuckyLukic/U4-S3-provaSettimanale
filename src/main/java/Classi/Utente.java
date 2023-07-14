package Classi;

import java.time.LocalDate;

public class Utente {
	
	String nome;
	String cognome;
	LocalDate dataNascita;
	Long numeroTessera;
	
	public Utente(String nome, String cognome, LocalDate dataNascita, Long numeroTessera) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}
	
	
	

}
