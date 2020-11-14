package dbAssignment.opti_home_shop;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.sql.Timestamp;
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
	@DisplayName("Finding Article Entity")
	public void testFindingArticleEntity() {
		Article article = articleRepository.findById(1);
		//System.out.println(article.getA_Name());
		Assertions.assertEquals("Büro Stuhl Comfort", article.getA_Name());
	}

	@Test
	@DisplayName("Updating Entity with merge")
	public void updateEntityWithMerge() {
		//Create necessary repositories and establish connection
		DangerousGoodsRepository dangerousGoodsRepository = new DangerousGoodsRepository();
		dangerousGoodsRepository.reconnectToDatabase();

		SupplierRepository supplierRepository = new SupplierRepository();
		supplierRepository.reconnectToDatabase();

		ArticleInventoryRepository articleInventoryRepository = new ArticleInventoryRepository();
		articleInventoryRepository.reconnectToDatabase();

		ArticleGroupRepository articleGroupRepository = new ArticleGroupRepository();
		articleGroupRepository.reconnectToDatabase();

		CustomTariffNumbersRepository customTariffNumbersRepository = new CustomTariffNumbersRepository();
		customTariffNumbersRepository.reconnectToDatabase();

		StorageRepository storageRepository = new StorageRepository();
		storageRepository.reconnectToDatabase();

		//Create and set Entities to update Article with
		DangerousGoods dangerousGood = dangerousGoodsRepository.findById(1);
		Supplier supplier = supplierRepository.findById(1);
		ArticleInventory articleInventory = articleInventoryRepository.findById(2);
		Storage storage = storageRepository.findById(4);

		ArticleGroup articleGroup = new ArticleGroup();
		articleGroup.setAG_Description("Plastik Stühle");
		articleGroupRepository.createEntity(articleGroup);

		CustomTariffNumbers customTariffNumber = new CustomTariffNumbers();
		customTariffNumber.setCTN_Code("1647389022");
		customTariffNumber.setCTN_Description("Plastik Möbel");
		customTariffNumbersRepository.createEntity(customTariffNumber);

		Article article = new Article("Chair_Plastic_Black", "A234BLK_001", (byte) 0,
				"Plastikstuhl ohne Armlehnen", "Schwarzer Plastikklappstuhl ohne Armlehnen",
				"1 week",28.96F, 34.99F, dangerousGood,supplier, articleInventory,
				articleGroup, customTariffNumber, storage);

		articleRepository.updateWithMerge(article);

		dangerousGoodsRepository.closeConnection();
		supplierRepository.closeConnection();
		articleInventoryRepository.closeConnection();
		storageRepository.closeConnection();
		customTariffNumbersRepository.closeConnection();
		articleGroupRepository.closeConnection();

		List<Article> articleList = articleRepository.findAll();
		int a = articleList.size();
		Article storedArticle = articleList.get(a-1);

		Assertions.assertEquals(article.getA_Name(), storedArticle.getA_Name());
	}


}



