package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    private WebDriver driver;
    private By userNameField = By.cssSelector("#reg_username");
    private By emailField = By.cssSelector("#reg_email");
    private By passwordField = By.cssSelector("#reg_password");
    private By registerButton = By.cssSelector("button[name='register']");
    private By loggedUsername = By.cssSelector("#username");
    private By loggedPassword = By.cssSelector("#password");
    private By loginButton = By.cssSelector("button[name='login']");
    private By forgotPasswordLink = By.cssSelector("p.woocommerce-LostPassword a");
    //private By logoutButton = By.cssSelector(".woocommerce-MyAccount-navigation-link--customer-logout a");
    private By orderLink = By.linkText("Orders");

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }
    //username
    public void enterUsername(String username){
        driver.findElement(userNameField).sendKeys(username);
    }
    public String getUsername(){
        return driver.findElement(userNameField).getAttribute("value");
    }
    //email
    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public String getEmail(){
        return driver.findElement(emailField).getAttribute("value");
    }
    //password
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public String getPassword(){
        return driver.findElement(passwordField).getAttribute("value");
    }
    public boolean isRequiredInputFilled(){
        return !getUsername().isEmpty() && !getEmail().isEmpty() && !getPassword().isEmpty();
    }
    public void ClickRegisterButtonToRegister(){
        if(isRequiredInputFilled()){
            driver.findElement(registerButton).click();
        }else{
            System.out.println("Please provide a valid email address.");
        }
    }
    //enter username in login form
    public void enterLoggedUsername(String username){
        driver.findElement(loggedUsername).sendKeys(username);
    }
    public String getLoggedUsername(){
        return driver.findElement(loggedUsername).getAttribute("value");
    }
    //enter password in login form
    public void enterLoggedPassword(String password){
        driver.findElement(loggedPassword).sendKeys(password);
    }
    public String getLoggedPassword(){
        return driver.findElement(loggedPassword).getAttribute("value");
    }
    //login
    public boolean isAllFieldsFilled(){
        return !getLoggedUsername().isEmpty() && !getLoggedPassword().isEmpty();
    }
    public void ClickLoginButtonToBeLoggedIn(){
        if(isAllFieldsFilled()){
            driver.findElement(loginButton).click();
        }else{
            System.out.println("username and password are required!");
        }
    }

    //forgot password

    public LostPasswordPage clickLostYourPasswordLink(){
        driver.findElement(forgotPasswordLink).click();
        return new LostPasswordPage(driver);
    }
    //Orders
    public void clickOrdersLink(){
        driver.findElement(orderLink).click();
    }

}
