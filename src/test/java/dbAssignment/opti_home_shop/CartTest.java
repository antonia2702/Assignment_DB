package dbAssignment.opti_home_shop;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.List;

public class CartTest {

    private static CartRepository cartRepository;

    @BeforeClass
    public static void setup() {
        System.out.println("BeforeAll");
        cartRepository = new CartRepository();
        cartRepository.reconnectToDatabase();
    }

    @AfterClass
    public static void done() {
        cartRepository.closeConnection();
    }

    @Test
    @DisplayName("Create new Cart")
    public void createCart () {
        Cart cart = new Cart(1, new ArticleRepository().findById(2),
                new CustomeraccountRepository().findById(1));

        cartRepository.createEntity(cart);

        Assertions.assertNotNull(cartRepository.findById(cart.getCART_Id()));
    }

    @Test
    @DisplayName("Delete ArticleGroup")
    public void deleteCartEntity () {
        Cart cart = new Cart(1, new ArticleRepository().findById(2),
                new CustomeraccountRepository().findById(1));

        cartRepository.createEntity(cart);
        Assertions.assertNotNull(cartRepository.findById(cart.getCART_Id()));

        cartRepository.deleteEntity(cart);
        Assertions.assertNull(cartRepository.findById(cart.getCART_Id()));
    }
}
