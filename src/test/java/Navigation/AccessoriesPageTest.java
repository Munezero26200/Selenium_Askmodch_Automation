package Navigation;

import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccessoriesPageTest extends BaseTest {
    @Test
    public void testAccessorieslink(){
        var accessoriesPage=  homePage.clickAccessoriesLink();
        accessoriesPage.getAccessoriesHeading();
        assertEquals(accessoriesPage.getAccessoriesHeading(),"Accessories","Wrong page");

    }
}
