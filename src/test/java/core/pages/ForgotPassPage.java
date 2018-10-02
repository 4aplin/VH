package core.pages;

import core.systemControls.Button;
import core.systemControls.StaticText;
import core.systemControls.TextInput;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class ForgotPassPage extends PageBase {

    public ForgotPassPage() {
        Header = new StaticText(By.cssSelector("#forgot_panel > h2 > div > div.page_block_header_inner._header_inner > div"));
        EmailInput = new TextInput(By.cssSelector("#login_input"));
        Button = new Button(By.cssSelector("#submitBtn"));
    }

    public TextInput EmailInput;
    public StaticText Header;
    public Button Button;

    @Override
    public void BrowseWaitVisible() {
        EmailInput.WaitVisibleWithRetries();
        Header.WaitVisibleWithRetries();
        Button.WaitVisibleWithRetries();
    }

}
