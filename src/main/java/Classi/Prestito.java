package Classi;

import java.time.LocalDate;

public class Prestito {
	
	Utente utente;
	ModelloBase modello;
	LocalDate inizioPrestito;
	LocalDate ritornoPrevisto;
	LocalDate finePrestito;
	
	public Prestito(Utente utente, ModelloBase modello, LocalDate inizioPrestito, LocalDate ritornoPrevisto,
			LocalDate finePrestito) {
		
		this.utente = utente;
		this.modello = modello;
		this.inizioPrestito = inizioPrestito;
		this.ritornoPrevisto = ritornoPrevisto;
		this.finePrestito = finePrestito;
		
	}
	
	

}
