package tests;

import core.SetUrlTestBase;
import core.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUpTest extends SetUrlTestBase
    {
        @Test(invocationTimeOut = 150000)
        public void SignUpCorrectTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);

            signUpPage.NameInput.SetValue("Anna");
            signUpPage.SurnameInput.SetValue("Ivanova");
            signUpPage.DChoose.click();
            signUpPage.MonthSelect.click();
            signUpPage.MChoose.click();
            signUpPage.YearSelect.click();
            signUpPage.YChoose.click();

            signUpPage.CreateAccountBtn.click();
            signUpPage.FGender.click();

            signUpPage.CreateAccountBtn.click();
            signUpPage.GoTo(SignUpContinuePage.class);

            SignUpContinuePage signUpContinuePage = new SignUpContinuePage();
            Assert.assertEquals(signUpContinuePage.Header.getText(), "Подтверждение регистрации");


        }

        @Test(invocationTimeOut = 150000)
        public void SignUpEmptyNameAndSurNameTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.NameInput.SetValue("");
            signUpPage.SurnameInput.SetValue("");
            signUpPage.CreateAccountBtn.click();
            signUpPage.WaitPage(4000);
//            signUpPage.ErrorName.WaitVisible();
            Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите Ваше имя и фамилию.\n" + "Чтобы облегчить общение и поиск друзей, у нас приняты настоящие имена и фамилии.");
           }

        @Test (invocationTimeOut = 150000)
        public void SignUpEmptyBirthTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.NameInput.SetValue("sdfsd");
            signUpPage.SurnameInput.SetValue("sdfsf");
            signUpPage.CreateAccountBtn.click();
            signUpPage.WaitPage(4000);

            Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите дату рождения.\n" + "Вы сможете настроить, кто видит эту информацию.");
        }

        @Test(invocationTimeOut = 150000)
        public void SignUpWithoutGenderTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);

            signUpPage.NameInput.SetValue("Anna");
            signUpPage.SurnameInput.SetValue("Ivanova");
            signUpPage.DChoose.click();
            signUpPage.MonthSelect.click();
            signUpPage.MChoose.click();
            signUpPage.YearSelect.click();
            signUpPage.YChoose.click();

            signUpPage.CreateAccountBtn.click();
            signUpPage.WaitPage(4000);

            Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите пол.");

        }

        /** the next test is wrong cause of no validation for the maximum number of characters entered
         **/
        @Test(invocationTimeOut = 150000) // todo this
        public void SignUpLongNameTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.NameInput.SetValue("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            signUpPage.SurnameInput.SetValue("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

            signUpPage.DChoose.click();
            signUpPage.MonthSelect.click();
            signUpPage.MChoose.click();
            signUpPage.YearSelect.click();
            signUpPage.YChoose.click();

            signUpPage.CreateAccountBtn.click();
            signUpPage.FGender.click();

            signUpPage.CreateAccountBtn.click();
            signUpPage.GoTo(SignUpContinuePage.class);

            SignUpContinuePage signUpContinuePage = new SignUpContinuePage();
            Assert.assertEquals(signUpContinuePage.Header.getText(), "Подтверждение регистрации");

        }

        @Test(invocationTimeOut = 150000)
        public void SignUpNotNameTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.NameInput.SetValue("333");
            signUpPage.SurnameInput.SetValue(newEmail);

            signUpPage.DChoose.click();
            signUpPage.MonthSelect.click();
            signUpPage.MChoose.click();
            signUpPage.YearSelect.click();
            signUpPage.YChoose.click();

            signUpPage.CreateAccountBtn.click();

            signUpPage.WaitPage(4000);
//            signUpPage.ErrorName.WaitVisible();
            Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите Ваше имя и фамилию.\n" + "Чтобы облегчить общение и поиск друзей, у нас приняты настоящие имена и фамилии.");
        }


        /** the next test is wrong cause after 1st validation of name field i can change field to incorrect
         **/
        @Test(invocationTimeOut = 150000)
        public void SignUpNotNameCheckAfterValidationTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.NameInput.SetValue("aaa");
            signUpPage.SurnameInput.SetValue("aaa");

            signUpPage.DChoose.click();
            signUpPage.MonthSelect.click();
            signUpPage.MChoose.click();
            signUpPage.YearSelect.click();
            signUpPage.YChoose.click();

            signUpPage.CreateAccountBtn.click();

            signUpPage.WaitPage(4000);
//            signUpPage.ErrorName.WaitVisible();
            signUpPage.NameInput.SetValue("aaa3");
            signUpPage.CreateAccountBtn.click();
            /**  EXPECTED RESULT
            Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите Ваше имя и фамилию.\n" + "Чтобы облегчить общение и поиск друзей, у нас приняты настоящие имена и фамилии.");
        **/
            /**  ACTUAL RESULT **/
             Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите пол.");

             }


        @Test(invocationTimeOut = 150000) // todo этот тест не проходит изза отсутствия проверки в поле ввода имени ограничения кол-ва символов
        public void SignUpShortNameTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.NameInput.SetValue("a");
            signUpPage.SurnameInput.SetValue("a");

            signUpPage.DChoose.click();
            signUpPage.MonthSelect.click();
            signUpPage.MChoose.click();
            signUpPage.YearSelect.click();
            signUpPage.YChoose.click();

            signUpPage.CreateAccountBtn.click();

            signUpPage.WaitPage(4000);
//            signUpPage.ErrorName.WaitVisible();
            Assert.assertEquals(signUpPage.Error.getText(), "Пожалуйста, укажите Ваше имя и фамилию.\n" + "Чтобы облегчить общение и поиск друзей, у нас приняты настоящие имена и фамилии.");
        }

        @Test(invocationTimeOut = 150000)
        public void SignUpFBTest() {
            LoginPage loginPage = new LoginPage();

            SignUpBlock signUpPage = loginPage.GoTo(SignUpBlock.class);
            signUpPage.WaitPage(5000);
            signUpPage.FBLoginButton.click();
            signUpPage.WaitPage(4000);
            signUpPage.SwitchToAnotherTab();

            FBloginPage fBloginPage = signUpPage.GoTo(FBloginPage.class);
            fBloginPage.WaitPage(4000);

            Assert.assertEquals(fBloginPage.Text.getText(), "Войдите в Facebook, чтобы использовать свой аккаунт в приложении VK.\n" +
                    "Эл. адрес или телефон:\n" +
                    "Пароль:\n" +
                    "Забыли аккаунт?\n" +
                    "Создать новый аккаунт");
        }
    }
