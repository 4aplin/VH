package core.pages;

import core.systemControls.StaticText;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class ErrorPage extends PageBase {
    public ErrorPage() {
        ErrorMessage = new StaticText(By.cssSelector("#login_message > div > div"));
        H1 = new StaticText(By.cssSelector("#login_message > div > div > b:nth-child(1)"));
    }

    public StaticText ErrorMessage;
    public StaticText H1;

    @Override
    public void BrowseWaitVisible() {
        ErrorMessage.WaitVisibleWithRetries();
        H1.WaitVisibleWithRetries();
    }
}
