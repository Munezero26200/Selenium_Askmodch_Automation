package Search;

import Tests.BaseTest;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {
    @Test
    public void testSearchFeature(){

        var search = homePage.clickShopNowButton();
        search.searchProductWithItsName("Anchor");
        search.getEnteredProductName();
        search.isSearchFieldContainProductName();
        search.clickSearchButton();
    }
}
