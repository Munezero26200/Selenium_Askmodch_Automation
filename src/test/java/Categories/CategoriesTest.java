package Categories;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class CategoriesTest extends BaseTest {
    @Test
    public void testSelectionOfAnyCategory(){
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        //productCatalog.selectCategory("Accessories  (3)");
        //productCatalog.selectCategory("Men  (7)");
        //productCatalog.selectCategory("Men’s Jeans  (4)");
        //productCatalog.selectCategory("Men’s Shirts  (1)");
        //productCatalog.selectCategory("Men’s Shoes  (1)");
        //productCatalog.selectCategory("Purses And Handbags  (1)");
        //productCatalog.selectCategory("Women  (7)");
        //productCatalog.selectCategory("Women’s Jeans  (2)");
        //productCatalog.selectCategory("Women’s Shirts  (1)");
        productCatalog.selectCategory("Women’s Shoes  (1)");



    }

}
