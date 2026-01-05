package Categories;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class CategoriesTest extends BaseTest {
    @Test
    public void testSelectionOfAccessories() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Accessories  (3)");
    }
    @Test
    public void testSelectionOfMen() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Men  (7)");
    }
    @Test
    public void testSelectionOfMenShoes() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Men’s Jeans  (4)");
    }
    @Test
    public void testSelectionOfMenShirt() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Men’s Shirts  (1)");
    }
    @Test
    public void testSelectionOfPursesAndHandbags() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Purses And Handbags  (1)");
    }
    @Test
    public void testSelectionOfWomen() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Women  (7)");
    }
    @Test
    public void testSelectionOfWomenJeans() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Women’s Jeans  (2)");
    }
    @Test
    public void testSelectionOfWomenShirts() {
        var productCatalog = homePage.clickShopNowButton();
        productCatalog.clickCategoryDropdown();
        productCatalog.selectCategory("Women’s Shirts  (1)");
    }


}
