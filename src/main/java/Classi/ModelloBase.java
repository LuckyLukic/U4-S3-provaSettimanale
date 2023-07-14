package Classi;

import java.util.Random;

public abstract class ModelloBase {
	
		
		Random random = new Random();
		
		
		private long randomisbn = 1_000_000_000l + new Random().nextLong(9_000_000_000l);
		private String titolo;
		private int annoPubblicazione;
		private int numeroPagine;
		
		public ModelloBase (String _titolo, int _annoPubblicazione, int _numeroPagine) {
			
			
			this.titolo = _titolo;
			this.annoPubblicazione = _annoPubblicazione;
			this.numeroPagine = _numeroPagine;
			
		}


		public int getAnnoPubblicazione() {
			return annoPubblicazione;
		}

		public void setAnnoPublicazione(int annoPubblicazione) {
			this.annoPubblicazione = annoPubblicazione;
		}

		public String getTitolo() {
			return titolo;
		}

		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}

		public int getNumeroPagine() {
			return numeroPagine;
		}

		public void setNumeroPagine(int numeroPagine) {
			this.numeroPagine = numeroPagine;
		}

		public long getRandomisbn() {
			return randomisbn;
		}

		public void setRandomisbn(long randomisbn) {
			this.randomisbn = randomisbn;
		}


		@Override
		public String toString() {
			return "randomisbn=" + randomisbn + ", titolo=" + titolo + ", annoPublicazione=" + annoPubblicazione
					+ ", numeroPagine=" + numeroPagine + "";
		}

}

