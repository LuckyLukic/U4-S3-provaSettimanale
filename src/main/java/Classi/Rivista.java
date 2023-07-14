package Classi;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import Utilities.Periodicita;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Rivista extends ModelloBase{
	
	@Enumerated(EnumType.STRING)
	
	@Column(name = "PERIODICITA")
	private Periodicita periodicita;
	
	public Rivista ( String _titolo, int _annoPublicazione, int _numeroPagine, Periodicita _periodicita) {
		
		super( _titolo, _annoPublicazione, _numeroPagine);
		
		this.periodicita = _periodicita;
		
	}

	public Enum<Periodicita> getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", " + super.toString() + "]";
	} 
	
	

}
