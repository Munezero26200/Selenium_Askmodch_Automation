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
     @Test
    public void testFormfields(){
         var storePage = homePage.clickShopNowButton();
         storePage.clickProductCard(1);
         var cartPage = storePage.AddProductTOCart();
         var checkoutForm= cartPage.clickProceedToCheckout();
         //First name
         checkoutForm.enterFirstName("Aline");
         checkoutForm.getFirstName();
         //last name
         checkoutForm.enterLastName("Munezero");
         checkoutForm.getLastName();
         //country
         checkoutForm.selectFromDropdown("Rwanda");
         //street address
         checkoutForm.enterStreetAddress("kg1234");
         checkoutForm.getStreetAddress();
         //city name
         checkoutForm.enterNameOfCity("Kigali");
         checkoutForm.getCityName();
         //state name
         checkoutForm.enterStateName("Gasabo");
         checkoutForm.getStateName();
         //postcode
         checkoutForm.enterPostCode(00);
         checkoutForm.getPostCode();
         //email
         checkoutForm.enterEmail("alinemunezero920@gmail.com");
         checkoutForm.getEmailAddress();
         //payment methods
         String paymentMethod ="Cash on delivery";
         checkoutForm.checkWayOfPayment(paymentMethod);
         //place order
         checkoutForm.clickPlaceOrderButton();



     }

}
