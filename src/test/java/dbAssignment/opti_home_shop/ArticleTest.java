package dbAssignment.opti_home_shop;

import dbAssignment.opti_home_shop.data.model.Article;
import dbAssignment.opti_home_shop.data.model.ArticleGroup;
import dbAssignment.opti_home_shop.data.model.CustomTariffNumbers;
import dbAssignment.opti_home_shop.data.repository.*;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.List;

public class ArticleTest {

	private static ArticleRepository articleRepository;

	@BeforeClass
	public static void setup() {
		System.out.println("BeforeAll");
		articleRepository = new ArticleRepository();
		articleRepository.reconnectToDatabase();
	}

	@AfterClass
	public static void done() {
		articleRepository.closeConnection();
	}

	@Test
	@DisplayName("Find specific Article Entity")
	public void testFindingArticleEntity() {
		Article article = articleRepository.findById(1);

		Assertions.assertNotNull(article);
		Assertions.assertEquals(1, article.getA_Id());
	}

	@Test
	@DisplayName("Update Article with merge")
	public void testUpdateEntityWithMerge() {
		//Create necessary repositories and establish connection
		ArticleGroupRepository articleGroupRepository = new ArticleGroupRepository();
		articleGroupRepository.reconnectToDatabase();

		CustomTariffNumbersRepository customTariffNumbersRepository = new CustomTariffNumbersRepository();
		customTariffNumbersRepository.reconnectToDatabase();

		//Create ArticleGroup Entity and CustomTariffNumbers Entity
		ArticleGroup articleGroup = new ArticleGroup();
		articleGroup.setAG_Description("Plastik Stühle");
		articleGroupRepository.createEntity(articleGroup);

		CustomTariffNumbers customTariffNumber = new CustomTariffNumbers();
		customTariffNumber.setCTN_Code("1647389022");
		customTariffNumber.setCTN_Description("Plastik Möbel");
		customTariffNumbersRepository.createEntity(customTariffNumber);

		Article article = new Article("Chair_Plastic_Black", "A234BLK_001", (byte) 0,
				"Plastikstuhl ohne Armlehnen", "Schwarzer Plastikklappstuhl ohne Armlehnen",
				"1 week",28.96F, 34.99F, new DangerousGoodsRepository().findById(1),
				new SupplierRepository().findById(1), new ArticleInventoryRepository().findById(2),
				articleGroup, customTariffNumber, new StorageRepository().findById(4));

		articleRepository.updateWithMerge(article);

		customTariffNumbersRepository.closeConnection();
		articleGroupRepository.closeConnection();

		List<Article> articleList = articleRepository.findAll();
		int a = articleList.size();
		Article storedArticle = articleList.get(a-1);

		Assertions.assertEquals(article.getA_Name(), storedArticle.getA_Name());
	}

	@Test
	@DisplayName("Update Article without merge")
	public void testUpdateEntityWithoutMerge() {
		//Create necessary repositories and establish connection
		CustomTariffNumbersRepository customTariffNumbersRepository = new CustomTariffNumbersRepository();
		customTariffNumbersRepository.reconnectToDatabase();

		CustomTariffNumbers customTariffNumber = new CustomTariffNumbers();
		customTariffNumber.setCTN_Code("1647389022");
		customTariffNumber.setCTN_Description("Plastik Möbel");
		customTariffNumbersRepository.createEntity(customTariffNumber);

		Article article = new Article("Chair_Plastic_Black", "A234BLK_001", (byte) 0,
				"Plastikstuhl ohne Armlehnen", "Schwarzer Plastikklappstuhl ohne Armlehnen",
				"1 week",28.96F, 34.99F, new DangerousGoodsRepository().findById(1),
				new SupplierRepository().findById(1), new ArticleInventoryRepository().findById(2),
				new ArticleGroupRepository().findById(1), customTariffNumber, new StorageRepository().findById(4));

		articleRepository.updateWithoutMerge(article);

		customTariffNumbersRepository.closeConnection();

		List<Article> articleList = articleRepository.findAll();
		int a = articleList.size();
		Article storedArticle = articleList.get(a-1);

		Assertions.assertNotEquals(article.getA_UpdateDate(), storedArticle.getA_UpdateDate());
		Assertions.assertNotEquals(article.getCustomTariffNumber().getCTN_UpdateDate(),
				storedArticle.getCustomTariffNumber().getCTN_UpdateDate());
	}

	@Test
	@DisplayName("Delete Article")
	public void testDeleteArticle(){
		Article article = new Article("Stool_Wood_3", "A234BLK_001", (byte) 0,
				"Holzhocker", "Holzhocker mit drei Stuhlbeinen, Farbe: naturbelassen",
				"1 week",28.96F, 34.99F, new DangerousGoodsRepository().findById(1),
				new SupplierRepository().findById(1), new ArticleInventoryRepository().findById(2),
				new ArticleGroupRepository().findById(1), new CustomTariffNumbersRepository().findById(1),
				new StorageRepository().findById(4));

		articleRepository.createEntity(article);
		Assertions.assertNotNull(articleRepository.findById(article.getA_Id()));

		articleRepository.deleteEntity(article);
		Assertions.assertNull(articleRepository.findById(article.getA_Id()));
	}

}



