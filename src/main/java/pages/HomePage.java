package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private static final By SEARCH_INPUT = By.xpath("//input[@name='search']");
    private static final By SIGN_IN_BUTTON = By.xpath("//button[@class='button button--navy button--small main-auth__button']");
    private static final By NO_RESULT_POP_UP = By.xpath("//p[@class='search-suggest__item search-suggest__item-content search-suggest__item-content_type_no-results search-suggest__item-text']");
private static final By SELECT_LANGUAGE_UA = By.xpath("//a[text()=' UA ']");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void clickOnSearchField() {
        driver.findElement(SEARCH_INPUT).click();
    }

    public void searchByKeyword(final String keyword) {
        driver.findElement(SEARCH_INPUT).sendKeys(keyword, Keys.ENTER);
    }
    public void writeWordInSearchField(final String keyword){
        driver.findElement(SEARCH_INPUT).sendKeys(keyword);
    }

    public void clickOnSignInButton() {
        driver.findElement(SIGN_IN_BUTTON).click();
    }

    public boolean noResult() {
        return driver.findElement(NO_RESULT_POP_UP).isDisplayed();
    }
public void clickOnSelectLanguageUA(){
        driver.findElement(SELECT_LANGUAGE_UA).click();
}

}
