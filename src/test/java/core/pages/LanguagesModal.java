package core.pages;

import core.systemControls.Link;
import core.systemControls.StaticText;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class LanguagesModal extends PageBase {

    public LanguagesModal() {
        Header = new StaticText(By.cssSelector("#box_layer > div.popup_box_container > div > div.box_title_wrap > div.box_title"));
        SomeLanguageLink = new Link(By.cssSelector("#all_languages_list > div:nth-child(1) > div:nth-child(21) > a > span"));
        RusLink = new Link(By.cssSelector("#all_languages_list > div:nth-child(3) > div:nth-child(10) > a > span"));
    }

    public StaticText Header;
    public Link SomeLanguageLink;
    public Link RusLink;

    @Override
    public void BrowseWaitVisible() {
        Header.WaitVisibleWithRetries();
    }
}
