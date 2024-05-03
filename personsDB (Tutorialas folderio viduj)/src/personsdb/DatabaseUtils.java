package personsdb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseUtils {
   
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("personsDBPU");
    
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
