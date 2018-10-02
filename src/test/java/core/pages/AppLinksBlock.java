package core.pages;

import core.systemControls.Button;
import core.systemControls.Link;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class AppLinksBlock extends PageBase {
    public AppLinksBlock() {
        AndroidLink = new Link(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_android > div.login_app_download_wrap > button"));
        IosLink = new Link(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_ios > div.login_app_download_wrap > button"));
        WFLink = new Link(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_wp > div.login_app_download_wrap > button"));
        ProductsLink = new Link(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > a"));
        IosImageLink = new Button(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_ios"));
        AndroidImageLink = new Button(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_android"));
        WFImageLink = new Button(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix > div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_wp"));
    }

    public Link AndroidLink;
    public Link IosLink;
    public Link WFLink;
    public Link ProductsLink;
    public Button IosImageLink;
    public Button AndroidImageLink;
    public Button WFImageLink;

    @Override
    public void BrowseWaitVisible() {
        AndroidLink.WaitVisibleWithRetries();
        IosLink.WaitVisibleWithRetries();
        WFLink.WaitVisibleWithRetries();
        ProductsLink.WaitVisibleWithRetries();
    }

}
