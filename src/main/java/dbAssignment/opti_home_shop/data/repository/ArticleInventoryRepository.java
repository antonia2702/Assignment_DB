package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.ArticleInventory;

public class ArticleInventoryRepository extends GenericRep<ArticleInventory, Integer> {

	public ArticleInventoryRepository() {
		super(ArticleInventory.class);
	}

}
