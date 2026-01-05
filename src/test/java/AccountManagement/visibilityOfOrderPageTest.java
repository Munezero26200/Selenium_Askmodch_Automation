package AccountManagement;

import Pages.AccountPage;
import Pages.OrderPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class visibilityOfOrderPageTest extends BaseTest {
    @Test
    public void testVisibilityOfOrderPage(){
        var myAccountPage = homePage.clickAccountLink();

        String username = "alinemunezero462@gmail.com";
        String password = "munezero1";

        myAccountPage.enterLoggedUsername(username);
        myAccountPage.enterLoggedPassword(password);

        assertTrue(myAccountPage.isAllFieldsFilled(), "Username or password is empty");

         myAccountPage.ClickLoginButtonToBeLoggedIn();
        OrderPage order =myAccountPage.clickOrders();
        assertTrue(order.isOrderPageVisible().contains("No order has been made yet."),"wrong page");

    }
}
