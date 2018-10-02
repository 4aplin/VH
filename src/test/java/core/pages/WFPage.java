package core.pages;

import core.systemControls.Button;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class WFPage extends PageBase {
    public WFPage() {
        Logo = new Button(By.cssSelector("#uhfLogo > img"));
    }

    public Button Logo;

    @Override
    public void BrowseWaitVisible() {
        Logo.WaitVisibleWithRetries();

    }
}
