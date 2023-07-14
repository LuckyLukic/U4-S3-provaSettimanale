package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import Classi.ModelloBase;




public class LibroRivistaDao {
	
	private final EntityManager em;

    public LibroRivistaDao(EntityManager em) {
        this.em = em;
    }

    public void save(ModelloBase s) {
        EntityTransaction t = em.getTransaction();
        t.begin();

        em.persist(s);

        t.commit();

        System.out.println("Elemento salvato correttamente");
        
    }
    
    public void findByIdAndDelete(long isbn) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		Query q = em.createQuery("DELETE FROM ModelloBase WHERE isbn = :isbn");
		q.setParameter("isbn", isbn);

		int numeroCancellati = q.executeUpdate();

		t.commit();
		if (numeroCancellati > 0) {
			System.out.println("Elemento cancellato");
		} else {
			System.out.println("Elemento con id " + isbn + " non trovato");
		}
	}
    
    public ModelloBase findById(long isbn) {
		ModelloBase found = em.find(ModelloBase.class, isbn);
		return found;
	}
    
    public ModelloBase findByYear(long anno) {
		ModelloBase found = em.find(ModelloBase.class, anno);
		
		return found;
		
    
    }   
    
    public ModelloBase findByAuthor(String autore) {
		ModelloBase found = em.find(ModelloBase.class, autore);
		return found;
    
    }   
 

}
