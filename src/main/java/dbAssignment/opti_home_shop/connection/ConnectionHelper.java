package dbAssignment.opti_home_shop.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionHelper {

    public static EntityManager getConnection() {
    	String s = "opti_home_shop";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(s);
        EntityManager em = entityManagerFactory.createEntityManager();
        return em;
    }

}
