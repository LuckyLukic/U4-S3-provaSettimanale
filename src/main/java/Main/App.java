package Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import Classi.Libro;
import Classi.ModelloBase;
import Classi.Rivista;
import Dao.LibroRivistaDao;
import Util.JpaUtil;
import Utilities.Periodicita;

public class App {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();
		LibroRivistaDao sd = new LibroRivistaDao(em);
		
	Set<ModelloBase> catalogo = new HashSet <>();	
	
	catalogo.add(new Libro("Titolo1", 1992, 328, "Autore1", "Fantasy"));
	catalogo.add(new Libro("Titolo2", 2000, 400, "Autore1", "Fantasy"));
	catalogo.add(new Libro("Titolo3", 2021, 289, "Autore1", "Fantasy"));
	catalogo.add(new Rivista("Titolo4", 1992, 40, Periodicita.MENSILE));
	catalogo.add(new Rivista("Titolo5", 1992, 37, Periodicita.SEMESTRALE));
	catalogo.add(new Rivista("Titolo6", 1992, 24, Periodicita.SETTIMANALE));
	
	System.out.println(catalogo);
	
	
	
	
	
	catalogo.forEach( elemento -> {
		
		sd.save(elemento);
	
	});
	
	System.out.println(" ");
	System.out.println("**********************");
	System.out.println(" ");
	
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Inserisci l'ISBN dell'elemento che vuoi rimuovere");
		long isbn = Long.parseLong(scanner.nextLine());
		
		sd.findByIdAndDelete(isbn);
		System.out.println(catalogo);
		
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	System.out.println(" ");
	System.out.println("**********************");
	System.out.println(" ");
		
		
	}

	
	

}
