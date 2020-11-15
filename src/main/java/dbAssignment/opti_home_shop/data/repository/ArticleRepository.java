package dbAssignment.opti_home_shop.data.repository;

import dbAssignment.opti_home_shop.data.model.Article;

public class ArticleRepository extends GenericRep<Article, Integer> {

	public ArticleRepository() {
		super(Article.class);
	}
}
