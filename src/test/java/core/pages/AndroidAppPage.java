package core.pages;

import core.systemControls.Button;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class AndroidAppPage extends PageBase {
    public AndroidAppPage() {
        Logo = new Button(By.cssSelector("#gbq1 > div > a > img"));
    }

    public Button Logo;

    @Override
    public void BrowseWaitVisible() {
        Logo.WaitVisibleWithRetries();

    }
}
