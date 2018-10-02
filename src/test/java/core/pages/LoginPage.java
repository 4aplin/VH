package core.pages;

import core.systemControls.*;
import core.systemPages.PageBase;
import org.openqa.selenium.By;


public class LoginPage extends PageBase {

    public LoginPage() {
        LoginInput = new TextInput(By.cssSelector("#index_email"));
        PasswordInput = new TextInput(By.cssSelector("#index_pass"));
        SignInButton = new Button(By.cssSelector("#index_login_button"));
        ForgotPasswordLink = new Link(By.cssSelector("#index_forgot"));
        SwitchToEnglish = new Link(By.cssSelector("#top_switch_lang"));
        HeaderText = new StaticText(By.cssSelector("#ij_form > h2"));
        Text = new StaticText(By.cssSelector("#ij_form > div.ij_subheader"));
        SearchInput = new TextInput(By.cssSelector("#ts_input"));

    }

    public TextInput LoginInput;
    public TextInput PasswordInput;
    public Button SignInButton;
    public Link ForgotPasswordLink;
    public Link SwitchToEnglish;
    public TextInput SearchInput;
    public StaticText HeaderText;
    public StaticText Text;

    @Override
    public void BrowseWaitVisible() {
        LoginInput.WaitVisibleWithRetries();
        PasswordInput.WaitVisibleWithRetries();
        SignInButton.WaitVisibleWithRetries();
//        ForgotPasswordLink.WaitVisibleWithRetries();
    }

}
