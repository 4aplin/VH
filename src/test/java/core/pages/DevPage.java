package core.pages;

import core.systemControls.Button;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class DevPage extends PageBase{

    public DevPage() {
            Logo = new Button(By.cssSelector("#dev_top_nav > div.dev_home_wrap.fl_l > a"));
        }

        public Button Logo;

        @Override
        public void BrowseWaitVisible() {
            Logo.WaitVisibleWithRetries();

        }
    }


