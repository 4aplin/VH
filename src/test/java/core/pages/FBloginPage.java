package core.pages;

import core.systemControls.StaticText;
import core.systemControls.TextInput;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class FBloginPage extends PageBase {
    public FBloginPage() {
        EmailField = new TextInput(By.cssSelector("#email"));
        Text = new StaticText(By.cssSelector("#content"));
    }

    public TextInput EmailField;
    public StaticText Text;

    @Override
    public void BrowseWaitVisible() {
        EmailField.WaitVisibleWithRetries();
    }
}
