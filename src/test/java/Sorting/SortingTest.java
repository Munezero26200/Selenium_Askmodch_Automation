package Sorting;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class SortingTest extends BaseTest {
    @Test
    public void testSortingProductbyPopularity(){
        var sortProd = homePage.clickShopNowButton();
        sortProd.clickSortingField();
        sortProd.sortProducts("Sort by popularity");
    }
    @Test
    public void testSortingProductbyAverageRating(){

        var sortProd = homePage.clickShopNowButton();
        sortProd.clickSortingField();
        sortProd.sortProducts("Sort by average rating");
    }
    @Test
    public void testSortingProductbylatest(){
        var sortProd = homePage.clickShopNowButton();
        sortProd.clickSortingField();
        sortProd.sortProducts("Sort by latest");
    }
    @Test
    public void testSortingProductbyprice(){
        var sortProd = homePage.clickShopNowButton();
        sortProd.clickSortingField();
        sortProd.sortProducts("Sort by price: low to high");
    }
    @Test
    public void testSortingProductbypriceHighToLow(){
        var sortProd = homePage.clickShopNowButton();
        sortProd.clickSortingField();
        sortProd.sortProducts("Sort by price: high to low");
    }

}
