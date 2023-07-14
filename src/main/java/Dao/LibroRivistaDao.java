package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Classi.Libro;
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
    
    public void findById(long isbn) {
		ModelloBase found = em.find(ModelloBase.class, isbn);
		
		if (found != null) {
			System.out.println(found);
		} else {
			System.out.println("Elemento con id " + isbn + " non trovato");
		}
		
	}
    
    public void findByYear(long anno) {
		ModelloBase found = em.find(ModelloBase.class, anno);
		
		if (found != null) {
			System.out.println(found);
		} else {
			System.out.println("Elemento con anno " + anno + " non trovato");
		}
		
    
    }   
    
    public List<Libro> findByAuthor(String autore) {
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autore = :autore", Libro.class);
        query.setParameter("autore", autore);
        List<Libro> found = query.getResultList();

        if (!found.isEmpty()) {
            System.out.println(found);
        } else {
            System.out.println("Elemento con autore " + autore + " non trovato");
        }
        
        return found;
    }
   
	public List<ModelloBase> findByTitle(String titolo) {	
		
		TypedQuery<ModelloBase> query = em.createQuery("SELECT a FROM ModelloBase a WHERE a.title like :title",
                ModelloBase.class);
		List <ModelloBase> found = query.getResultList();
		
		if (!found.isEmpty()) {
            System.out.println(found);
        } else {
            System.out.println("Non ci sono elementi con questo titolo");
        }
		
		return found;
		
	}

    
    }   
 


