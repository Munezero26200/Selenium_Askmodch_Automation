package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LostPasswordPage {

    private WebDriver driver;
    private By userOrEmailField = By.cssSelector("#user_login");
    private By resetButton = By.cssSelector("button[value='Reset password']");

    public LostPasswordPage(WebDriver driver){
      this.driver = driver;
    }
    //enter email or username
    public void enterUsernameOrEmail(String text){
        driver.findElement(userOrEmailField).sendKeys(text);
    }
    public String getUsernameOrEmail(){
        return driver.findElement(userOrEmailField).getAttribute("value");
    }
    //Reset password
    public void clickResetPasswordButton(){
        driver.findElement(resetButton).click();
    }
}
