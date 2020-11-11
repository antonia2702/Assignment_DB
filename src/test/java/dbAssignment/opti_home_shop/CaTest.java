package dbAssignment.opti_home_shop;

import static org.junit.jupiter.api.Assertions.*;
import javax.persistence.EntityManager;
import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@DisplayName("Test Customeraccount")
public class CaTest {
	
	private static GenericRep g;
	
	@BeforeClass
    public static void setup() {
        g = new CustomeraccountRepository();
    }
	
	@AfterClass
    public static void done() {
        g.closeConnection();
    }

	@Test
    @DisplayName("Successful Connection")
    public void testConnectionToDB() {
        Assertions.assertNotNull( g.getEntityManager() );
    }

}
