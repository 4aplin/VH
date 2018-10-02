package tests;

import core.SetUrlTestBase;
import core.pages.LoginPage;
import org.testng.annotations.Test;

import static java.awt.Event.ENTER;


/** this is not a completed test because search functional is not working on page
 **/

public class SearchTest extends SetUrlTestBase {


    @Test(invocationTimeOut = 150000)
    public void SearchTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.WaitPage(4000);
//        loginPage.SearchInput.SetValue("Anna");
        loginPage.SearchInput.sendKeys("Anna" + ENTER);
    }
}
