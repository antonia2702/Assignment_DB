package dbAssignment.opti_home_shop;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Iterator;

public class CustomerAccountTest {
    private static CustomeraccountRepository customeraccountRepository;

    @Before
    public void setup(){
        customeraccountRepository = new CustomeraccountRepository();
    }

    @After
    public void shutdown(){
        customeraccountRepository.closeConnection();
    }

    @Test
    @DisplayName("Find specific Customeraccount")
    public void testFindById(){
        Customeraccount customeraccount = customeraccountRepository.findById(1);

        Assertions.assertNotNull(customeraccount);
    }

    @Test
    @DisplayName("Save new Customeraccount with dependencies to existing data - executable only once")
    public void testNewCustomerAccount() {
        Customeraccount customeraccount = new Customeraccount("user","user", new RoleRepository().findById(4), new DeliveryadressRepository().findById(1), new BillingadressRepository().findById(1), new BankdetailsRepository().findById(4));
        customeraccountRepository.createEntity( customeraccount );
        int id = 0;
        Iterator<Customeraccount> iterator = customeraccountRepository.findAll().iterator();
        while(iterator.hasNext()){
            Customeraccount c = iterator.next();
            if(c.getCA_UserName() == "user"){
                id = c.getCA_Id();
                break;
            }
        }
        Assertions.assertEquals( customeraccount, customeraccountRepository.findById( id ) );
    }

    @Test
    @DisplayName("Update customeraccount with merge")
    public void testUpdatingWithMergeCustomeraccount() {
        Billingadress billingadress = new BillingadressRepository().findById(2);
        billingadress.setBA_FirstName(billingadress.getBA_FirstName()+"a");

        Customeraccount customeraccount = customeraccountRepository.findById(2);
        customeraccount.setBA(billingadress);

        customeraccountRepository.updateWithMerge(customeraccount);

        customeraccount = customeraccountRepository.findById(2);

        Assertions.assertEquals(billingadress.getBA_FirstName(), customeraccount.getBA().getBA_FirstName());
    }
}
