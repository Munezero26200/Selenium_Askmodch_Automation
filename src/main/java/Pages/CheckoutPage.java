package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage {

    private WebDriver driver;
    private By firstNameField = By.id("billing_first_name");
    private By lastNameField = By.id("billing_last_name");
    private By countryDropdown= By.id("billing_country");
    private By streetAddressField = By.id("billing_address_1");
    private By cityAddressField = By.id("billing_city");
    private By stateField = By.id("billing_state");
    private By postCodeField = By.id("billing_postcode");
    private By emailField = By.id("billing_email");
    private By radioLabel = By.cssSelector("ul[class='wc_payment_methods payment_methods methods'] label");
    private By placeOrderBtn = By.id("place_order");



    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    //First name
public void enterFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
}
public String getFirstName(){
  return driver.findElement(firstNameField).getAttribute("value");
}
//Last name
public void enterLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
}
public String getLastName(){
        return driver.findElement(lastNameField).getAttribute("value");
}
//country/region
public void selectFromDropdown(String countryName){
        Select options = new Select(driver.findElement(countryDropdown));
        options.selectByVisibleText(countryName);
}
//street address
public void enterStreetAddress(String streetAddress){
        driver.findElement(streetAddressField).sendKeys(streetAddress);
}
public String getStreetAddress(){
        return driver.findElement(streetAddressField).getAttribute("value");
}
//city
public void enterNameOfCity(String cityName){
        driver.findElement(cityAddressField).sendKeys(cityName);
}
public String getCityName(){
        return driver.findElement(cityAddressField).getAttribute("value");
}
//state
public void enterStateName(String stateName){
        driver.findElement(stateField).sendKeys(stateName);
}
public String getStateName(){
        return driver.findElement(stateField).getAttribute("value");
}
//postCode
public void enterPostCode(int postCode){
        String pcode = String.valueOf(postCode);
        driver.findElement(postCodeField).sendKeys(pcode);
}
public String getPostCode(){
        return driver.findElement(postCodeField).getAttribute("value");
}
//Email
public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
}
public String getEmailAddress(){
        return driver.findElement(emailField).getAttribute("value");
}
//Payment methods
public void checkWayOfPayment(String paymentMethod){

    List<WebElement>labels = driver.findElements(radioLabel);
       for (WebElement label : labels){
           System.out.println(label.getText());
           if(label.getText().contains(paymentMethod)){
              String forId =  label.getAttribute("for");
              driver.findElement(By.id(forId)).click();
           }
       }
}

//payment Method
public void clickPlaceOrderButton(){
 driver.findElement(placeOrderBtn).click();
}




}
