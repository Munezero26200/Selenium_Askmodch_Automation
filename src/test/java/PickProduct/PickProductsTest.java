package PickProduct;

import Pages.HomePage;
import Tests.BaseTest;
import org.testng.annotations.Test;

public class PickProductsTest extends BaseTest {
     @Test
    public void testPickProductsFromStore(){
         var storage = homePage.clickShopNowButton();
         storage.clickProductCard(1);
     }

     @Test
    public void testAddProductToCart(){
          var storePage = homePage.clickShopNowButton();
          storePage.clickProductCard(1);
          var cartPage = storePage.AddProductTOCart();
          cartPage.clickProceedToCheckout();
     }


}
