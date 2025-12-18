package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By shopNowButton = By.cssSelector(".wp-block-button .wp-block-button__link[href='/store']");
    private By accountLink = By.cssSelector("li#menu-item-1237 a.menu-link");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Store page
    public StorePage clickShopNowButton(){
        driver.findElement(shopNowButton).click();
        return  new StorePage(driver);
    }
    //Account page
    public AccountPage clickAccountLink(){
        driver.findElement(accountLink).click();
        return new AccountPage(driver);
    }
    //Men page
    private By menlink = By.linkText("Men");
    public MenPage clickMenLink(){
        driver.findElement(menlink).click();
        return new MenPage(driver);
    }
    // Women Page
    private By womenLink = By.linkText("Women");

    public WomenPage clickWomenLink(){
        driver.findElement(womenLink).click();
        return new WomenPage(driver);
    }
    //Accessories
    private By accessoriesLink = By.linkText("Accessories");

    public AccessoriesPage clickAccessoriesLink() {

        driver.findElement(accessoriesLink).click();
        return new AccessoriesPage(driver);

    }



}
