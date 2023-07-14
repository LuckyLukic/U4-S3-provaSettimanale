package Classi;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipologia")
@Table(name = "Catalogo")
@Getter
@Setter
@NoArgsConstructor

public abstract class ModelloBase {
	
		
		Random random = new Random();
		
		@Id
		@Column(name = "ISBN")
		private long randomisbn = 1_000_000_000l + new Random().nextLong(9_000_000_000l);
		@Column(name = "TITOLO")
		private String titolo;
		@Column(name = "PUBBLICAZIONE")
		private int annoPubblicazione;
		@Column(name = "PAGINE")
		private int numeroPagine;
		
		public ModelloBase (String _titolo, int _annoPubblicazione, int _numeroPagine) {
			
			
			this.titolo = _titolo;
			this.annoPubblicazione = _annoPubblicazione;
			this.numeroPagine = _numeroPagine;
			
		}


		@Override
		public String toString() {
			return "randomisbn=" + randomisbn + ", titolo=" + titolo + ", annoPublicazione=" + annoPubblicazione
					+ ", numeroPagine=" + numeroPagine + "";
		}

}

