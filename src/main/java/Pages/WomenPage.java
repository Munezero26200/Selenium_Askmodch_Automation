package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenPage {
    private WebDriver driver;
    private By womenTitle = By.cssSelector(".woocommerce-products-header__title.page-title");
    public WomenPage(WebDriver driver){
        this.driver = driver;
    }
    public String getWomenHeading(){
        return driver.findElement(womenTitle).getText();

    }
}
