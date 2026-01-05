package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private WebDriver driver;
    protected WebDriverWait wait;
    private By browseProductBtnBeforeOderProduct = By.cssSelector("div[class^='woocommerce-message']");

    public OrderPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }
    public String isOrderPageVisible(){
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(browseProductBtnBeforeOderProduct));
    return button.getText();
    }

}
