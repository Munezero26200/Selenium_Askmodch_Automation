package Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class StorePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By AvailableProduct = By.className("woocommerce-loop-product__title");


    public StorePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void clickProductCard(int index){
        WebElement product = driver.findElements(AvailableProduct).get(index);
        product.click();

    }

    //cartPage
    private By addToCartBtn = By.name("add-to-cart");
    private By viewCartBtn = By.cssSelector("div.woocommerce-notices-wrapper div a[class='button wc-forward']");

    public CartPage AddProductTOCart(){
        driver.findElement(addToCartBtn).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewCartBtn)));
        driver.findElement(viewCartBtn).click();
        return new CartPage(driver);
    }
    //Search feature
    private By searchField = By.cssSelector("#woocommerce-product-search-field-0");
    private By searchButton = By.cssSelector("button[value='Search']");

    public void searchProductWithItsName(String productName){
        driver.findElement(searchField).sendKeys(productName);
    }
    public String getEnteredProductName(){
        return driver.findElement(searchField).getAttribute("value");
    }
    public boolean isSearchFieldContainProductName(){
        return !getEnteredProductName().isEmpty();
    }
    public void clickSearchButton(){
        if(isSearchFieldContainProductName()){

            driver.findElement(searchButton).click();
        }else{
            System.out.println("Enter a product name");
        }
    }
    //Browser by category
    private By categoryDropdown = By.cssSelector("#product_cat");

    public void clickCategoryDropdown(){

        driver.findElement(categoryDropdown).click();
    }

    public void selectCategory(String categoryName){

        Select categories = new Select(driver.findElement(categoryDropdown));
        categories.selectByVisibleText(categoryName);

    }
    //Price slider

    private By filterButton = By.cssSelector("button[type='submit'].button");

    private By sliderForm = By.className("price_slider_wrapper");
    private By minValue = By.id("min_price");
    private By maxValue = By.id("max_price");

    public int [] setPriceRangeJs(int minV, int maxV){
        WebElement sliderPriceFrom = driver.findElement(sliderForm);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});"
                +"document.getElementById('min_price').value=arguments[1];"
                +"document.getElementById('max_price').value=arguments[2];",sliderPriceFrom,minV,maxV);
        int min = Integer.parseInt(driver.findElement(minValue).getAttribute("value"));
        int max = Integer.parseInt(driver.findElement(maxValue).getAttribute("value"));
        driver.findElement(filterButton).click();
        return new int[]{min,max};
    }
    //Product sorting

    private By sortContainer = By.cssSelector("select.orderby");

    public void clickSortingField(){
        driver.findElement(sortContainer).click();
    }
    public void sortProducts(String category){
        Select options = new Select(driver.findElement(sortContainer));
        options.selectByVisibleText(category);
    }




}
