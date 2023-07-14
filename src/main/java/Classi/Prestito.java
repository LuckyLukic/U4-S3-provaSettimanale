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
@Table(name = "Prestiti")
@Getter
@Setter
@NoArgsConstructor


public class Prestito {
	
	@Id
	@SequenceGenerator(name = "My_Sequence", sequenceName = "My_Sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "My_Sequence")
	long id;
	private Utente utente;
	private ModelloBase modello;
	private LocalDate inizioPrestito;
	private LocalDate ritornoPrevisto;
	private LocalDate finePrestito;
	
	public Prestito(Utente utente, ModelloBase modello, LocalDate inizioPrestito, LocalDate ritornoPrevisto,
			LocalDate finePrestito) {
		
		this.utente = utente;
		this.modello = modello;
		this.inizioPrestito = inizioPrestito;
		this.ritornoPrevisto = ritornoPrevisto;
		this.finePrestito = finePrestito;
		
	}
	
	

}
