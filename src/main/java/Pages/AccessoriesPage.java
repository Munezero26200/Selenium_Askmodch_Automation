package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessoriesPage {

    private WebDriver driver;
    private By accessoriesTitle = By.xpath("//*[@id='main']/div/header/h1");

    public AccessoriesPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAccessoriesHeading(){
        return driver.findElement(accessoriesTitle).getText();
    }
}
