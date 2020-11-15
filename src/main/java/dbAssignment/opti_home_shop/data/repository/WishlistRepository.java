package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.Wishlist;

public class WishlistRepository extends GenericRep<Wishlist, Integer> {

	public WishlistRepository() {
		super(Wishlist.class);
	}

}
