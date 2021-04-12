package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHomePage() {
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
