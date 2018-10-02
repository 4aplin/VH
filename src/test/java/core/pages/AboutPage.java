package core.pages;

import core.systemControls.Button;
import core.systemControls.StaticText;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class AboutPage extends PageBase {
    public AboutPage() {
        About = new StaticText(By.cssSelector("#content > div:nth-child(2) > h2 > ul > li:nth-child(1) > a"));
        Logo = new Button(By.cssSelector("#top_nav > div:nth-child(1) > a > div"));
    }

    public StaticText About;
    public Button Logo;

    @Override
    public void BrowseWaitVisible() {
        About.WaitVisibleWithRetries();
    }

}
