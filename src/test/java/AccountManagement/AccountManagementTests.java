package AccountManagement;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class AccountManagementTests extends BaseTest {
    @Test

    public void testRegistration(){
        var myAccountPage = homePage.clickAccountLink();
        myAccountPage.enterUsername("Aline");
        myAccountPage.getUsername();
        myAccountPage.enterEmail("munezero095@gmail.com");
        myAccountPage.getEmail();
        myAccountPage.enterPassword("Munezero123!");
        myAccountPage.getPassword();
        myAccountPage.isRequiredInputFilled();
        myAccountPage.ClickRegisterButtonToRegister();
    }
    @Test
    public void testLogin(){
        var myAccountPage = homePage.clickAccountLink();
        myAccountPage.enterLoggedUsername("Aline");
        myAccountPage.getLoggedUsername();
        myAccountPage.enterLoggedPassword("Munezero123!");
        myAccountPage.getLoggedPassword();
        myAccountPage.isAllFieldsFilled();
        myAccountPage.ClickLoginButtonToBeLoggedIn();
    }
    @Test
    public void testForgotPasswordLink(){
        var myAccountPage = homePage.clickAccountLink();
       var lostPasswordPage = myAccountPage. clickLostYourPasswordLink();
       lostPasswordPage.enterUsernameOrEmail("Aline");
       lostPasswordPage.getUsernameOrEmail();
       lostPasswordPage.clickResetPasswordButton();


    }
}
