package tests;

import core.SetUrlTestBase;
import core.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PageLinksTest extends SetUrlTestBase {

    //todo футер ссылки убрать системаут

    @Test(invocationTimeOut = 300000)
    public void ProductsLinkTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(Footer.class);

        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.ProductsLink.click();
        appLinks.WaitPage(4000);

        String URL = appLinks.GetCurrentUrl();

        Assert.assertEquals(URL, "https://vk.com/products");
    }

    @Test(invocationTimeOut = 300000)
    public void FooterLinkAboutTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(Footer.class);
        Footer footer = new Footer();
        footer.AboutLink.click();

        AboutPage aboutPage = new AboutPage();
        aboutPage.WaitPage(4000);

        String URL = aboutPage.GetCurrentUrl();

        Assert.assertEquals(URL, "https://vk.com/about");

//        aboutPage.CloseAllPageWithoutDefaultPage();

    }

    @Test(invocationTimeOut = 300000)
    public void FooterLinkTermsTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(Footer.class);
        Footer footer = new Footer();
        footer.RulesLink.click();

        RulesPage rulesPage = new RulesPage();
        rulesPage.WaitPage(4000);
        String URL = rulesPage.GetCurrentUrl();

        System.out.println(URL);

        Assert.assertEquals(URL, "https://vk.com/terms");

//        rulesPage.CloseAllPageWithoutDefaultPage();

    }

    @Test(invocationTimeOut = 300000)
    public void FooterLinkAdsTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(Footer.class);
        Footer footer = new Footer();
        footer.AdsLink.click();

        AdsPage adsPage = new AdsPage();
        adsPage.WaitPage(4000);
        String URL = adsPage.GetCurrentUrl();

        System.out.println(URL);

        Assert.assertEquals(URL, "https://vk.com/ads");

//        adsPage.CloseAllPageWithoutDefaultPage();
    }

    @Test(invocationTimeOut = 300000)
    public void FooterLinkDevTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(Footer.class);
        Footer footer = new Footer();
        footer.DevLink.click();

        DevPage devPage = new DevPage();
        devPage.WaitPage(4000);
        String URL = devPage.GetCurrentUrl();

        System.out.println(URL);

        Assert.assertEquals(URL, "https://vk.com/dev");

//        devPage.CloseAllPageWithoutDefaultPage();
    }

    @Test(invocationTimeOut = 300000)
    public void AndroidPageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(AppLinksBlock.class);
        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.AndroidLink.click();

        appLinks.SwitchToDefaultWindows();
        appLinks.SwitchToAnotherTab();

        AndroidAppPage androidAppPage = new AndroidAppPage();
        androidAppPage.WaitPage(4000);
        String URL = androidAppPage.GetCurrentUrl().toString();


        System.out.println(URL);

        if (URL.equals("https://vk.com/")) {
            androidAppPage.SwitchToAnotherTab();
            androidAppPage.WaitPage(300);
            Assert.assertEquals(androidAppPage.GetCurrentUrl().toString(), "https://play.google.com/store/apps/details?id=com.vkontakte.android");
            System.out.println(androidAppPage.GetCurrentUrl());
        } else {

            Assert.assertEquals(URL, "https://play.google.com/store/apps/details?id=com.vkontakte.android");
        }
        androidAppPage.CloseAllPageWithoutDefaultPage();

    }

    @Test(invocationTimeOut = 300000)
    public void IOsPageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(AppLinksBlock.class);
        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.IosLink.click();

        appLinks.SwitchToDefaultWindows();
        appLinks.SwitchToAnotherTab();

        IosPage iosPage = new IosPage();
        iosPage.WaitPage(4000);
        String URL = iosPage.GetCurrentUrl();

        System.out.println(URL);

        if (URL.equals("https://vk.com/")) {
            iosPage.SwitchToAnotherTab();
            Assert.assertEquals(iosPage.GetCurrentUrl().toString(), "https://itunes.apple.com/ru/app/id564177498");
        }
        else {
            Assert.assertEquals(URL, "https://itunes.apple.com/ru/app/id564177498");
        }
        iosPage.CloseAllPageWithoutDefaultPage();

    }
    @Test(invocationTimeOut = 300000)
    public void WFPageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(AppLinksBlock.class);
        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.WFLink.click();

        appLinks.SwitchToDefaultWindows();
        appLinks.SwitchToAnotherTab();

        WFPage wfPage = new WFPage();
        wfPage.WaitPage(4000);

        System.out.println(wfPage.GetCurrentUrl());
        String URL = wfPage.GetCurrentUrl();
        if (URL.equals("https://vk.com/")) {
            wfPage.SwitchToAnotherTab();
            Assert.assertTrue(wfPage.GetCurrentUrl().toString().contains("https://www.microsoft.com/ru-ru/p/%d0%92%d0%9a%d0%be%d0%bd%d1%82%d0%b0%d0%ba%d1%82%d0%b5"));
        }
        else {
            Assert.assertTrue(URL.contains("https://www.microsoft.com/ru-ru/p/%d0%92%d0%9a%d0%be%d0%bd%d1%82%d0%b0%d0%ba%d1%82%d0%b5"));
        }
        wfPage.CloseAllPageWithoutDefaultPage();
    }

    @Test(invocationTimeOut = 300000)
    public void IOsPageByImageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(AppLinksBlock.class);
        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.IosImageLink.click();

        appLinks.SwitchToDefaultWindows();
        appLinks.SwitchToAnotherTab();

        IosPage iosPage = new IosPage();
        iosPage.WaitPage(4000);
        String URL = iosPage.GetCurrentUrl();

        System.out.println(URL);

        if (URL.equals("https://vk.com/")) {
            iosPage.SwitchToAnotherTab();
            Assert.assertEquals(iosPage.GetCurrentUrl().toString(), "https://itunes.apple.com/ru/app/id564177498");
        }
        else {
            Assert.assertEquals(URL, "https://itunes.apple.com/ru/app/id564177498");
        }
        iosPage.CloseAllPageWithoutDefaultPage();

    }

    @Test(invocationTimeOut = 300000)
    public void AndroidPageByImageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(AppLinksBlock.class);
        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.AndroidImageLink.click();

        appLinks.SwitchToDefaultWindows();
        appLinks.SwitchToAnotherTab();

        AndroidAppPage androidAppPage = new AndroidAppPage();
        androidAppPage.WaitPage(4000);
        String URL = androidAppPage.GetCurrentUrl().toString();

        System.out.println(URL);

        if (URL.equals("https://vk.com/")) {
            androidAppPage.SwitchToAnotherTab();
            androidAppPage.WaitPage(3000);
            Assert.assertEquals(androidAppPage.GetCurrentUrl().toString(), "https://play.google.com/store/apps/details?id=com.vkontakte.android");
            System.out.println(androidAppPage.GetCurrentUrl());
        } else {

            Assert.assertEquals(URL, "https://play.google.com/store/apps/details?id=com.vkontakte.android");
        }
        androidAppPage.CloseAllPageWithoutDefaultPage();

    }

    @Test(invocationTimeOut = 300000)
    public void WFPageByImageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.CloseAllPageWithoutDefaultPage();
        loginPage.GoTo(AppLinksBlock.class);
        AppLinksBlock appLinks = new AppLinksBlock();
        appLinks.WFImageLink.click();

        appLinks.SwitchToDefaultWindows();
        appLinks.SwitchToAnotherTab();

        WFPage wfPage = new WFPage();
        wfPage.WaitPage(4000);

        System.out.println(wfPage.GetCurrentUrl());
        String URL = wfPage.GetCurrentUrl();
        if (URL.equals("https://vk.com/")) {
            wfPage.SwitchToAnotherTab();
            Assert.assertTrue(wfPage.GetCurrentUrl().toString().contains("https://www.microsoft.com/ru-ru/p/%d0%92%d0%9a%d0%be%d0%bd%d1%82%d0%b0%d0%ba%d1%82%d0%b5"));
        }
        else {
            Assert.assertTrue(URL.contains("https://www.microsoft.com/ru-ru/p/%d0%92%d0%9a%d0%be%d0%bd%d1%82%d0%b0%d0%ba%d1%82%d0%b5"));
        }
        wfPage.CloseAllPageWithoutDefaultPage();
    }
}
