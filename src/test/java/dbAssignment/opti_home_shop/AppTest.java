package dbAssignment.opti_home_shop;

import dbAssignment.opti_home_shop.connection.ConnectionHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import javax.persistence.EntityManager;

/**
 * Unit test: Testing connection to db
 */
@DisplayName("Connection tests")
public class AppTest {

    private static EntityManager em;

    @Before
    public void setup(){
         em = ConnectionHelper.getConnection();
    }

    @Test
    @DisplayName("Successful Connection")
    public void testConnectionToDB() {
        Assertions.assertNotNull( em );
        em.close();
    }
}