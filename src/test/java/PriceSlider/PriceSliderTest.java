package PriceSlider;

import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PriceSliderTest extends BaseTest {

    @Test
    public void testPriceSliderJs(){
        var setPrice = homePage.clickShopNowButton();
    int [] princeRanges=setPrice.setPriceRangeJs(50,100);
    assertTrue(princeRanges[0]<=princeRanges[1], "Something went wrong");


    }
}
