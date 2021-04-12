package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    private static final By NAME_FIELD = By.xpath("//input[@formcontrolname='name']");
    private static final By SURNAME_FIELD = By.xpath("//input[@formcontrolname='surname']");
    private static final By PHONE_NUMBER_FIELD = By.xpath("//input[@formcontrolname='phone']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@formcontrolname='password']");
    private static final By ENTER_EMAIL_MESSAGE = By.xpath("//p[text()=' Введіть свою ел. пошту ']");
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
public void enterName(final String name){
        driver.findElement(NAME_FIELD).sendKeys(name);
}
public void enterSurname(final String surname){
        driver.findElement(SURNAME_FIELD).sendKeys(surname);
}
public void enterPhoneNumber(final String phoneNamber){
        driver.findElement(PHONE_NUMBER_FIELD).sendKeys(phoneNamber);
}
public void enterPassword(final String password){
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
}
public boolean enterYourMailMessage(){
        return driver.findElement(ENTER_EMAIL_MESSAGE).isDisplayed();
}

}
