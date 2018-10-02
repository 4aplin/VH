package tests;

import core.SetUrlTestBase;
import core.pages.Footer;
import core.pages.LanguagesModal;
import core.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwitchLanguageTest extends SetUrlTestBase
{
    @Test(invocationTimeOut = 150000)
    public void SwitchLanguageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.WaitPage(5000);

        loginPage.SwitchToEnglish.click();
        loginPage.WaitPage(3000);

        Assert.assertEquals(loginPage.HeaderText.getText(), "First time on VK?");

        Footer footer = new Footer();
        footer.SwitchToRus.click();
        footer.WaitPage(5000);

        Assert.assertEquals(loginPage.Text.getText(), "Моментальная регистрация");

    }

    @Test(invocationTimeOut = 150000)
    public void SwitchLanguageByModalTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.WaitPage(3000);

        Footer footer = new Footer();
        footer.AllLanguagesLink.click();

        LanguagesModal languagesModal = new LanguagesModal();
        Assert.assertEquals(languagesModal.Header.getText(), "Выберите Ваш язык");

        languagesModal.SomeLanguageLink.click();

        footer.WaitPage(4000);

        Assert.assertEquals(footer.LangLink.getText(), "alle talen »");

        footer.LangLink.click();

        languagesModal.RusLink.click();
        loginPage.WaitPage(4000);

        Assert.assertEquals(loginPage.Text.getText(), "Моментальная регистрация");

    }

}
