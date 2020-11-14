package dbAssignment.opti_home_shop;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Iterator;

public class RoleTest {
    private static RoleRepository roleRepository;

    @Before
    public void setup(){
        roleRepository = new RoleRepository();
    }

    @After
    public void shutdown(){
        roleRepository.closeConnection();
    }

    @Test
    @DisplayName("Find specific Role")
    public void testFindById(){
        Role role = roleRepository.findById(3);

        Assertions.assertNotNull(role);
        Assertions.assertEquals(3,role.getR_Id());
    }

    @Test
    @DisplayName("Save new Role to existing data - executable only once")
    public void testNewRole() {
        Role role = new Role("FAG");
        roleRepository.createEntity( role );
        int id = 0;
        Iterator<Role> iterator = roleRepository.findAll().iterator();
        while(iterator.hasNext()){
            Role r = iterator.next();
            if(r.getR_Group() == "FAG"){
                id = r.getR_Id();
                break;
            }
        }
        Assertions.assertEquals( role, roleRepository.findById( id ) );
    }

    @Test
    @DisplayName("Create and Delete a Role")
    public void testDeleteRole() {
        Role role = new Role("deletable");
        roleRepository.createEntity(role);
        Iterator<Role> iterator = roleRepository.findAll().iterator();
        while(iterator.hasNext()){
            Role r = iterator.next();
            if(r.getR_Group() == "deletable"){
                role = r;
                break;
            }
        }

        roleRepository.deleteEntity( role );

        role = roleRepository.findById( role.getR_Id() );
        Assertions.assertNull( role );
    }

    @Test
    @DisplayName("Update role without merge")
    public void testUpdatingWithoutMergeRole() {
        Role role = roleRepository.findAll().get(0);
        int id = role.getR_Id();
        String group = role.getR_Group();
        role.setR_Group(group+"i");

        roleRepository.updateWithoutMerge(role);

        role = roleRepository.findById(id);

        Assertions.assertNotEquals(group, role.getR_Group());
    }
}
