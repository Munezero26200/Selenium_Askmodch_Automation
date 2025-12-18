package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    protected WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    private By proceedToCheckoutBtn = By.cssSelector(".checkout-button.button.alt.wc-forward");
    public CheckoutPage clickProceedToCheckout(){
        driver.findElement(proceedToCheckoutBtn).click();
        return new CheckoutPage(driver);
    }
}
