package dbAssignment.opti_home_shop;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@DisplayName("Connection tests")
public class AppTest {

    @Test
    @DisplayName("Successful Connection")
    public void testConnectionToDB() {
        EntityManager em = ConnectionHelper.getConnection();
        Assertions.assertNotNull( em );
        em.close();
    }
}