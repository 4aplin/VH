package tests;

import core.SetUrlTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import core.pages.*;


public class LoginTest extends SetUrlTestBase
{
/*    @Test (invocationTimeOut = 150000)
        public void SignInEmailTest() {
            LoginPage newPage = new LoginPage();
            newPage.LoginInput.SetValue("chaplin369@gmail.com");
            newPage.PasswordInput.SetValue("J02elt8699@#!");
            newPage.SignInButton.click();

            newPage.GoTo(PageLoggedIn.class);

        }*/

    @Test(invocationTimeOut = 150000)
        public void SignInEmailIncorrectEmailTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.LoginInput.SetValue("chaplin369@gmail.com4");
        loginPage.PasswordInput.SetValue("123123");
        loginPage.SignInButton.click();

        loginPage.GoTo(ErrorPage.class);
        ErrorPage errorPage = new ErrorPage();

        Assert.assertEquals(errorPage.H1.getText(), "Не удается войти.");

    }

    @Test(invocationTimeOut = 150000)
        public void SignInEmailIncorrectPassTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.LoginInput.SetValue("chaplin369@gmail.com");
        loginPage.PasswordInput.SetValue("123123");
        loginPage.SignInButton.click();

        loginPage.WaitPage(4000);
        loginPage.GoTo(ErrorPage.class);
        ErrorPage errorPage = new ErrorPage();

        Assert.assertEquals(errorPage.H1.getText(), "Не удается войти.");

    }

    @Test(invocationTimeOut = 150000)
        public void SignInEmailEmptyFieldsTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.LoginInput.SetValue("");
        loginPage.PasswordInput.SetValue("");
        loginPage.SignInButton.click();

        loginPage.LoginInput.getIsPresent();
    }

    @Test(invocationTimeOut = 150000)
    public void ForgotLinkTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.ForgotPasswordLink.click();

        loginPage.SwitchToDefaultWindows();
//        loginPage.SwitchToAnotherTab();

        ForgotPassPage forgotPassPage = new ForgotPassPage();
        forgotPassPage.WaitPage(4000);

        System.out.println(forgotPassPage.GetCurrentUrl());
        String URL = forgotPassPage.GetCurrentUrl();
        if (URL.equals("https://vk.com/")) {
            forgotPassPage.SwitchToAnotherTab();
            Assert.assertEquals(forgotPassPage.GetCurrentUrl().toString(), "https://vk.com/restore");
        }
        else {
            Assert.assertEquals(URL, "https://vk.com/restore");
        }

        forgotPassPage.CloseAllPageWithoutDefaultPage();
    }

}

