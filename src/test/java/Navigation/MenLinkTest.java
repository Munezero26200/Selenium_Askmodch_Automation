package Navigation;

import Tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MenLinkTest extends BaseTest {
    @Test
    public void testMenlink(){

        var menPage=  homePage.clickMenLink();
        menPage.getMenHeading();
        assertEquals(menPage.getMenHeading(),"Men","Wrong");

    }
}
