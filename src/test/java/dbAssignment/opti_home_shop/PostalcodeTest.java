package dbAssignment.opti_home_shop;

import dbAssignment.opti_home_shop.data.model.Postalcode;
import dbAssignment.opti_home_shop.data.repository.PostalcodeRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class PostalcodeTest {
    private static PostalcodeRepository postalcodeRepository;

    @Before
    public void setup(){
        postalcodeRepository = new PostalcodeRepository();
    }

    @After
    public void shutdown(){
        postalcodeRepository.closeConnection();
    }

    @Test
    @DisplayName("Find specific Postalcode")
    public void testFindById(){
        Postalcode postalcode = postalcodeRepository.findById(75175);

        Assertions.assertNotNull(postalcode);
        Assertions.assertEquals(75175,postalcode.getPC_Id());
    }

    @Test
    @DisplayName("Save new Postalcode to existing data - executable only once")
    public void testNewRole() {
        Postalcode postalcode = new Postalcode(76187, "Karlsruhe - Nordweststadt","Baden-Württemberg");
        postalcodeRepository.createEntity( postalcode );

        Assertions.assertEquals( postalcode, postalcodeRepository.findById( 76187 ) );
    }

    @Test
    @DisplayName("Create and Delete a Role")
    public void testDeleteRole() {
        Postalcode postalcode = new Postalcode(2,"delete","me");
        postalcodeRepository.createEntity(postalcode);
        for (Postalcode p : postalcodeRepository.findAll()) {
            if (p.getPC_Id() == 2) {
                postalcode = p;
                break;
            }
        }

        postalcodeRepository.deleteEntity( postalcode );

        postalcode = postalcodeRepository.findById( 2 );
        Assertions.assertNull( postalcode );
    }

    @Test
    @DisplayName("Update role without merge")
    public void testUpdatingWithoutMergeRole() {
        Postalcode postalcode = postalcodeRepository.findAll().get(0);
        int id = postalcode.getPC_Id();
        String place = postalcode.getPC_Place();
        postalcode.setPC_Place(place+"i");

        postalcodeRepository.updateWithoutMerge(postalcode);

        postalcode = postalcodeRepository.findById(id);

        Assertions.assertNotEquals(place, postalcode.getPC_Place());
    }
}
