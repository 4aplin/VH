package core.pages;

import core.systemControls.Button;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class IosPage extends PageBase {
    public IosPage() {
        Logo = new Button(By.cssSelector("#ac-gn-firstfocus"));
    }

    public Button Logo;

    @Override
    public void BrowseWaitVisible() {
        Logo.WaitVisibleWithRetries();

    }
}
