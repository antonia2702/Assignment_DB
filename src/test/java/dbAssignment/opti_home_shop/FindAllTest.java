package dbAssignment.opti_home_shop;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


/**
 * Unit test: Gets all data from DB and prints on console
 */
@DisplayName("Connection tests")
@RunWith(Parameterized.class)
public class FindAllTest {

    private  GenericRep rr;

    public FindAllTest(GenericRep genericRep, int i){
        rr = genericRep;
    }

    @Parameterized.Parameters
    public static Collection objects() {
        return Arrays.asList(new Object[][] {
                {new BankRepository(), 1},
                {new BankdetailsRepository(), 1},
                {new BillingadressRepository(), 1},
                {new CountriesRepository(), 1},
                {new CustomeraccountRepository(), 1},
                {new DeliveryadressRepository(), 1},
                {new PostalcodeRepository(), 1},
                {new RoleRepository(), 1},
                {new SupplierRepository(), 1},
                {new WishlistRepository(), 1},
                {new ArticleRepository(), 1},
                {new ArticleGroupRepository(), 1},
                {new ArticleInventoryRepository(), 1},
                {new ArticleRatingRepository(), 1},
                {new CartRepository(), 1},
                {new CustomTariffNumbersRepository(), 1},
                {new DangerousGoodsRepository(), 1},
                {new InquiryRepository(), 1},
                {new OrderTableRepository(), 1},
                {new StorageRepository(), 1},
                {new ShippingRepository(), 1}
        });
    }

    @Test
    @DisplayName("Find All Successful")
    public void testFindAll() {
        System.out.println(rr.getClass().toString() + ": ");
        for (Object o : rr.findAll()) {
            System.out.println(o.toString());
        }
        System.out.println();
    }
}