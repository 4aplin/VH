package core.pages;

import core.systemControls.Link;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class Footer extends PageBase {
    public Footer() {
        AboutLink = new Link(By.cssSelector("#bottom_nav > div.footer_links > a:nth-child(1)"));
        RulesLink = new Link(By.cssSelector("#bottom_nav > div.footer_links > a:nth-child(3)"));
        AdsLink = new Link(By.cssSelector("#bottom_nav > div.footer_links > a:nth-child(4)"));
        DevLink = new Link(By.cssSelector("#bottom_nav > div.footer_links > a:nth-child(5)"));
        AllLanguagesLink = new Link(By.cssSelector("#bottom_nav > div.footer_lang.fl_r > a:nth-child(4)"));
        SwitchToRus = new Link(By.cssSelector("#bottom_nav > div.footer_lang.fl_r > a:nth-child(2)"));
        LangLink = new Link(By.cssSelector("#bottom_nav > div.footer_lang.fl_r > a:nth-child(5)"));
    }

    public Link AboutLink;
    public Link RulesLink;
    public Link AdsLink;
    public Link DevLink;
    public Link AllLanguagesLink;
    public Link SwitchToRus;
    public Link LangLink;

    @Override
    public void BrowseWaitVisible() {
        AboutLink.WaitVisibleWithRetries();
    }

}
