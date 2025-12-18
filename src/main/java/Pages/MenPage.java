package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage {
    private WebDriver driver;
    private By heading = By.linkText("Men");

    public MenPage(WebDriver driver){
        this.driver = driver;
    }
    public String getMenHeading(){
        return driver.findElement(heading).getText().trim();

    }
}
