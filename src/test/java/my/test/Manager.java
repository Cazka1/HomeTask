package my.test;

import my.test.pages.*;
import org.openqa.selenium.WebDriver;


public class Manager {

    WebDriver driver;

    public Manager(WebDriver driver) {
            this.driver = driver;
        }
        public HomePage getHomePage()    {

            return new HomePage(driver);
    }

    public AppleIPhonePage getAppleIPhonePage() {
        return new AppleIPhonePage(driver);
    }
    public CartPage getCartPage() {
        return new CartPage(driver);
    }
    public IPhone12ProPage getIPhone12ProPage() {
        return new IPhone12ProPage(driver);
    }
    public LogInPage getLogInPage() {
        return new LogInPage(driver);
    }
    public RegistrationPage getRegistrationPage() {
        return new RegistrationPage(driver);
    }

}

