package Classi;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Utenti")
@Getter
@Setter
@NoArgsConstructor


public class Utente {
	
	String nome;
	String cognome;
	LocalDate dataNascita;
	@Id
	@SequenceGenerator(name = "My_New_Sequence", sequenceName = "My_New_Sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "My_New_Sequence")
	long numeroTessera;
	
	public Utente(String nome, String cognome, LocalDate dataNascita, long numeroTessera) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.numeroTessera = numeroTessera;
	}
	
	
	

}
