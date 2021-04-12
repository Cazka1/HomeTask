package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage {
    private static final By REGISTRATION_BUTTON = By.xpath("//a[@class='auth-modal__register-link']");
    public LogInPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnRegistrationButton(){
        driver.findElement(REGISTRATION_BUTTON).click();
    }

}
