package core.pages;

import core.systemControls.Button;
import core.systemControls.StaticText;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class RulesPage extends PageBase {
    public RulesPage(){
        Header = new StaticText(By.cssSelector("#terms_box_content > div:nth-child(2)"));
        Logo = new Button(By.cssSelector("#top_nav > div:nth-child(1) > a > div"));
    }

    public StaticText Header;
    public Button Logo;

    @Override
    public void BrowseWaitVisible() {
        Header.WaitVisibleWithRetries();
        Logo.WaitVisibleWithRetries();
    }

}

