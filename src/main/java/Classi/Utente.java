package Classi;

import java.time.LocalDate;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	LocalDate data_nascita;
	@Id
	@SequenceGenerator(name = "My_New_Sequence", sequenceName = "My_New_Sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "My_New_Sequence")
	long numero_tessera;
	
	@OneToMany(mappedBy = "utente")
	private List<Prestito> prestito;
	
	
	public Utente(String nome, String cognome, LocalDate data_nascita, long numero_tessera) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.numero_tessera = numero_tessera;
	}
	
	
	

}
