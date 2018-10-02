package core.pages;

import core.systemControls.Button;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class AdsPage extends PageBase {
    public AdsPage() {
       Logo = new Button(By.cssSelector("#ads_page_simple > div > div.landing_ads_main_slider_wrap > div.landing_ads_header > div > a.landing_ads_header_logo.fl_l"));
    }

    public Button Logo;


    @Override
    public void BrowseWaitVisible() {
        Logo.WaitVisibleWithRetries();

    }
}
