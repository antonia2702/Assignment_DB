package dbAssignment.opti_home_shop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class BillingadressTest {
    private static BillingadressRepository billingadressRepository;

    @Before
    public void setup(){
        billingadressRepository = new BillingadressRepository();
    }

    @After
    public void shutdown(){
        billingadressRepository.closeConnection();
    }

    @Test
    @DisplayName("Find specific Billingadress")
    public void testFindById(){
        Billingadress billingadress = billingadressRepository.findById(1);

        Assertions.assertNotNull(billingadress);
        Assertions.assertEquals("Hans ",billingadress.getBA_FirstName());
    }

    @Test
    @DisplayName("Save new Billingadress with dependencies to existing data - executable only once")
    public void testNewBillingadress() {
        Billingadress billingadress = new Billingadress("Tom","Kaulitz","Monsunstr.", "7", new PostalcodeRepository().findAll().get(0), new CountriesRepository().findById(1));
        billingadressRepository.createEntity( billingadress );
        int id = 0;
        for (Billingadress b : billingadressRepository.findAll()) {
            if (b.getBA_FirstName().equals("Tom") && b.getBA_LastName().equals("Kaulitz")) {
                id = b.getBA_Id();
                break;
            }
        }
        Assertions.assertEquals( billingadress, billingadressRepository.findById( id ) );
    }

    @Test
    @DisplayName("Update billingadress with merge")
    public void testUpdatingWithMergeBillingadress() {
        Countries countries = new CountriesRepository().findById(1);
        countries.setCOUNTRY_Name(countries.getCOUNTRY_Name()+"a");

        Billingadress billingadress = new BillingadressRepository().findById(2);
        billingadress.setCOUNTRY(countries);

        billingadressRepository.updateWithMerge(billingadress);

        billingadress = billingadressRepository.findById(2);

        Assertions.assertEquals(countries.getCOUNTRY_Name(), billingadress.getCOUNTRY().getCOUNTRY_Name());
    }

    @Test
    @DisplayName("Update billingadress without merge")
    public void testUpdatingWithoutMergeBillingadress() {
        Countries countries = new CountriesRepository().findById(1);
        countries.setCOUNTRY_Name(countries.getCOUNTRY_Name()+"a");

        Billingadress billingadress = new BillingadressRepository().findById(2);
        billingadress.setCOUNTRY(countries);

        billingadressRepository.updateWithoutMerge(billingadress);

        billingadress = billingadressRepository.findById(2);

        Assertions.assertNotEquals(countries.getCOUNTRY_Name(), billingadress.getCOUNTRY().getCOUNTRY_Name());
    }
}
