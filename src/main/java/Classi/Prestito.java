package Classi;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prestiti")
@Getter
@Setter
@NoArgsConstructor


public class Prestito {
	
	@Id
	@SequenceGenerator(name = "my_sequence", sequenceName = "my_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence")
	long id;
	
	private LocalDate inizioPrestito;
	private LocalDate ritornoPrevisto;
	private LocalDate finePrestito;
	
	@ManyToOne
	@JoinColumn(name = "tessera_utente", referencedColumnName = "numero_tessera", nullable=false)
	private Utente utente;
	
	@OneToMany(mappedBy = "prestito")
	private Set<ModelloBase> catalogo;
	
	
	public Prestito(Utente utente, LocalDate inizioPrestito, LocalDate ritornoPrevisto,
			LocalDate finePrestito) {
		
		this.utente = utente;
		
		this.inizioPrestito = inizioPrestito;
		this.ritornoPrevisto = ritornoPrevisto;
		this.finePrestito = finePrestito;
		
	}
	
	

}
