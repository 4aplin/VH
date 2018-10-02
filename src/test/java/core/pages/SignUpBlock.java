package core.pages;

import core.systemControls.*;
import core.systemPages.PageBase;
import org.openqa.selenium.By;

public class SignUpBlock extends PageBase {

    public SignUpBlock() {
        NameInput = new TextInput(By.cssSelector("#ij_first_name"));
        SurnameInput = new TextInput(By.cssSelector("#ij_last_name"));
        DaySelect = new Select(By.xpath("//*[@id=\"dropdown1\"]"));
        CreateAccountBtn = new Button(By.cssSelector("#ij_submit"));
        MonthSelect = new Select(By.xpath("//*[@id=\"dropdown2\"]"));
        YearSelect = new Select(By.xpath("//*[@id=\"dropdown3\"]"));//#option_list_options_container_3_2 #option_list_options_container_3_3
        MChoose = new Button(By.xpath("//*[@id=\"option_list_options_container_2_2\"]"));
        YChoose = new Button(By.xpath("//*[@id=\"option_list_options_container_3_2\"]"));
        DChoose = new Button(By.xpath("//*[@id=\"option_list_options_container_1_2\"]"));
        FGender = new RadioButton(By.xpath("//*[@id=\"ij_sex_row\"]/div[2]"));

        Error = new StaticText(By.cssSelector("#ij_form > div.tt_w.ij_tt.tt_right"));
        FBLoginButton = new Button(By.cssSelector("#index_fbcontinuewithsign > div"));

    }

    public TextInput NameInput;
    public TextInput SurnameInput;
    public Button CreateAccountBtn;
    public Select DaySelect;
    public Button DChoose;
    public Button MChoose;
    public Button YChoose;
    public Select MonthSelect;
    public Select YearSelect;
    public RadioButton FGender;
    public StaticText Error;
    public Button FBLoginButton;

    @Override
    public void BrowseWaitVisible() {
        SurnameInput.WaitVisibleWithRetries();
        NameInput.WaitVisibleWithRetries();
        CreateAccountBtn.WaitVisibleWithRetries();
    }
}
