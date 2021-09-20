
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.*;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dacPU");
        EntityManager em = emf.createEntityManager();
        
        Volume volume1 = new Volume(
                "v1",
                1,
                "Niterói",
                "2021-06-11",
                "Lorem ipsum",
                "Lorem ipsum dolor"
        );
        
        Artigo artigo1 = new Artigo(1, Artigo.IdiomasEnum.PT, "TituloPT", "TituloEN", "ResumoPT", "ResumoEN", "keywordsPT", "keywordsEN", 42);
        artigo1.setVolume(volume1);
        Autor autor1 = new Autor(1, "email@email.com", "Fulano", "da Silva", "", "UFF", "FFU", Autor.PaisesEnum.BR, "0000-1111-2222-3333");
        autor1.setArtigo(artigo1);
        
        em.getTransaction().begin();
        em.persist(volume1);
        em.getTransaction().commit();
        
        Volume volume = em.find(Volume.class, 1);
        System.out.println(volume);
        
        em.getTransaction().begin();
        em.persist(artigo1);
        em.persist(autor1);
        em.getTransaction().commit();
        
        Autor autor = em.find(Autor.class, 1);
        System.out.println("Autor: " + autor);
        Artigo artigo = em.find(Artigo.class, 1);
        System.out.println(artigo);
        
    }
}
