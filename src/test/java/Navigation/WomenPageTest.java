package Navigation;

import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WomenPageTest extends BaseTest {
    @Test
    public void testWomenpageHeading(){
        var womenPage = homePage.clickWomenLink();
        womenPage.getWomenHeading();
        assertEquals(womenPage.getWomenHeading(),"Women","Wrong title");
    }

}
