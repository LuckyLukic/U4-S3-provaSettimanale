package Classi;

import Utilities.Periodicita;

public class Rivista extends ModelloBase{
	
	private Enum<Periodicita> periodicita;
	
	public Rivista ( String _titolo, int _annoPublicazione, int _numeroPagine, Enum<Periodicita> _periodicita) {
		
		super( _titolo, _annoPublicazione, _numeroPagine);
		
		this.periodicita = _periodicita;
		
	}

	public Enum<Periodicita> getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Enum<Periodicita> periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", " + super.toString() + "]";
	} 
	
	

}
