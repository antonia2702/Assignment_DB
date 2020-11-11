package dbAssignment.opti_home_shop;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import javax.persistence.EntityManager;

/**
 * Unit test for simple App.
 */
@DisplayName("Connection tests")
public class AppTest {

    private static BankRepository rr;

    @Before
    public void setup(){
        rr = new BankRepository();
    }

    @Test
    @DisplayName("Successful Connection")
    public void testConnectionToDB() {
        EntityManager em = rr.getEntityManager();
        Assertions.assertNotNull( em );
        em.close();
    }

    @Test
    @DisplayName("Successful Connection")
    public void testCreate() {
        Bank r = new Bank();
        r.setBANK_Name("BankBank");
        rr.createEntity(r);
    }
}