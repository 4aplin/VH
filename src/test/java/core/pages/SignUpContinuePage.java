package core.pages;

import core.systemControls.StaticText;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class SignUpContinuePage extends PageBase {
    public SignUpContinuePage() {
        Header = new StaticText(By.xpath("//*[@id=\"content\"]/div[1]/h2"));
    }

    public StaticText Header;

    @Override
    public void BrowseWaitVisible() {
        Header.WaitVisibleWithRetries();
    }

}
