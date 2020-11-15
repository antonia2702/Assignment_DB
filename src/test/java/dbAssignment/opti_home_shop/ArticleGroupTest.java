package dbAssignment.opti_home_shop;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.*;

public class ArticleGroupTest {

    private static ArticleGroupRepository articleGroupRepository;

    @BeforeClass
    public static void setup() {
        System.out.println("BeforeAll");
        articleGroupRepository = new ArticleGroupRepository();
        articleGroupRepository.reconnectToDatabase();
    }

    @AfterClass
    public static void done() {
        articleGroupRepository.closeConnection();
    }

    @Test
    @DisplayName("Create new Entity")
    public void testCreateArticleGroupEntity() {
        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setAG_Description("Luxusmöbel");

        articleGroupRepository.createEntity(articleGroup);
        Assertions.assertNotNull(articleGroupRepository.findById(articleGroup.getAG_Id()));
    }

    @Test
    @DisplayName("Update ArticleGroup without merge")
    public void testUpdateArticleGroupWithMerge() {
        List<ArticleGroup> articleGroupList = articleGroupRepository.findAll();
        int a = articleGroupList.size();
        ArticleGroup articleGroup = articleGroupList.get(a-1);
        articleGroup.setAG_Description("Luxury furniture");

        articleGroupRepository.updateWithoutMerge(articleGroup);

        Assertions.assertEquals("Luxury furniture", articleGroupRepository.findById(articleGroup.getAG_Id()).getAG_Description());

    }

    @Test
    @DisplayName("Delete ArticleGroup")
    public void testDeleteArticleGroupEntity () {

        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setAG_Description("Luxusmöbel");

        articleGroupRepository.createEntity(articleGroup);
        Assertions.assertNotNull(articleGroupRepository.findById(articleGroup.getAG_Id()));

        articleGroupRepository.deleteEntity(articleGroup);
        Assertions.assertNull(articleGroupRepository.findById(articleGroup.getAG_Id()));
    }

    @Test
    @DisplayName("Check if Article can be added to ArticleList")
    public void testArticleGroupNewArticle() {
        ArticleGroup articleGroup = new ArticleGroup();
        articleGroup.setAG_Description("Bambusmöbel");

        articleGroupRepository.createEntity(articleGroup);
        Assertions.assertNotNull(articleGroupRepository.findById(articleGroup.getAG_Id()));
        Assertions.assertNull(articleGroupRepository.findById(articleGroup.getAG_Id()).getArticles());

        ArrayList<Article> articleList = new ArrayList<Article>();
        articleList.add(new ArticleRepository().findById(1));
        articleGroup.setArticles(articleList);
        articleGroupRepository.updateWithMerge(articleGroup);

        Assertions.assertEquals(1,articleGroupRepository.findById(articleGroup.getAG_Id()).getArticles().size());
        Assertions.assertEquals(1, articleGroupRepository.findById(articleGroup.getAG_Id()).getArticles().get(0).getA_Id());
    }
}
