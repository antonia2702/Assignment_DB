package dbAssignment.opti_home_shop;

import dbAssignment.opti_home_shop.data.model.Cart;
import dbAssignment.opti_home_shop.data.repository.ArticleRepository;
import dbAssignment.opti_home_shop.data.repository.CartRepository;
import dbAssignment.opti_home_shop.data.repository.CustomeraccountRepository;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

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
    @DisplayName("Find specific Cart Entity")
    public void testFindCart() {
        Cart cart = cartRepository.findById(1);

        Assertions.assertNotNull(cart);
        Assertions.assertEquals(1, cart.getCART_Id());
    }

    @Test
    @DisplayName("Create new Cart Entity")
    public void testCreateCart () {
        Cart cart = new Cart(1, new ArticleRepository().findById(2),
                new CustomeraccountRepository().findById(1));

        cartRepository.createEntity(cart);

        Assertions.assertNotNull(cartRepository.findById(cart.getCART_Id()));
    }

    @Test
    @DisplayName("Delete Cart entity")
    public void testDeleteCartEntity () {
        Cart cart = new Cart(1, new ArticleRepository().findById(2),
                new CustomeraccountRepository().findById(1));

        cartRepository.createEntity(cart);
        Assertions.assertNotNull(cartRepository.findById(cart.getCART_Id()));

        cartRepository.deleteEntity(cart);
        Assertions.assertNull(cartRepository.findById(cart.getCART_Id()));
    }

    @Test
    @DisplayName("Change Article in Cart Entity")
    public void testChangeArticleInCart() {
        Cart cart = new Cart(1, new ArticleRepository().findById(2),
                new CustomeraccountRepository().findById(1));

        cartRepository.createEntity(cart);
        Assertions.assertEquals(2,cartRepository.findById(cart.getCART_Id()).getArticle().getA_Id());

        cart.setArticle(new ArticleRepository().findById(3));
        cartRepository.updateWithMerge(cart);
        Assertions.assertEquals(3, cartRepository.findById(cart.getCART_Id()).getArticle().getA_Id());
    }
}
