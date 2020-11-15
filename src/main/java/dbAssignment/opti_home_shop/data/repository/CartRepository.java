package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.Cart;

public class CartRepository extends GenericRep<Cart, Integer> {

	public CartRepository() {
		super(Cart.class);
	}

}
