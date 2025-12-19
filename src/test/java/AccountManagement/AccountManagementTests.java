package AccountManagement;

import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class AccountManagementTests extends BaseTest {
    @Test
    public void testRegistration() {
        var myAccountPage = homePage.clickAccountLink();

        String username = "Aline";
        String email = "munezero095@gmail.com";
        String password = "Munezero123!";


        myAccountPage.enterUsername(username);
        myAccountPage.enterEmail(email);
        myAccountPage.enterPassword(password);

        // assertions on input values
        assertEquals(username, myAccountPage.getUsername(), "Username is incorrect");
        assertEquals(email, myAccountPage.getEmail(), "Email is incorrect");
        assertEquals(password, myAccountPage.getPassword(), "Password is incorrect");

        // assert required fields are filled
        assertTrue(myAccountPage.isRequiredInputFilled(), "Required fields are not filled");

        // click register
        myAccountPage.ClickRegisterButtonToRegister();
    }

    @Test
    public void testLogin() {
        var myAccountPage = homePage.clickAccountLink();

        String username = "Aline";
        String password = "Munezero123!";

        myAccountPage.enterLoggedUsername(username);
        myAccountPage.enterLoggedPassword(password);

        assertTrue(myAccountPage.isAllFieldsFilled(), "Username or password is empty");

        myAccountPage.ClickLoginButtonToBeLoggedIn();

        assertEquals(
                "Hello " + username + " (not " + username + "? Log out)",
                myAccountPage.loginConfirmation()
        );
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
