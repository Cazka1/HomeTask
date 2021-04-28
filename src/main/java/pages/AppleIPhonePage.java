package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@Slf4j

public class AppleIPhonePage extends BasePage {
    private static final By APPLE_PRODUCTS_CHECKBOX = By.xpath("//label[@for='Apple']");
    private static final By FIRST_IPHONE_PRODUCT = By.xpath("//span[@class='goods-tile__title' and text()=' Мобільний телефон Apple iPhone 12 Pro Max 256 GB Gold Офіційна гарантія ']");
    private static final By SORT_BUTTON = By.xpath("//option[text()=' За релевантністю ']");
    private static final By FROM_EXPENSIVE_TO_CHEAP_BUTTON = By.xpath("//option[@value='2: expensive']");
    private static final By FROM_CHEAP_TO_EXPANSIVE_BUTTON = By.xpath("//option[@value='1: cheap']");
    private static final By PRODUCT_PRICE_LIST = By.xpath("//span[@class='goods-tile__price-value']");

    public AppleIPhonePage(WebDriver driver) {
        super(driver);
    }


    public void clickOnAppleProductsButton() {
        driver.findElement(APPLE_PRODUCTS_CHECKBOX).click();
    }

    public void clickOnFirstProduct() {
        driver.findElement(FIRST_IPHONE_PRODUCT).click();

    }

    public List<WebElement> getProductPriceList() {
        return driver.findElements(PRODUCT_PRICE_LIST);
    }

    public void clickOnSortButton() {
        driver.findElement(SORT_BUTTON).click();
    }

    public void clickOnExpensiveButton() {
        driver.findElement(FROM_EXPENSIVE_TO_CHEAP_BUTTON).click();
    }

    public void clickOnCheapButton() {
        driver.findElement(FROM_CHEAP_TO_EXPANSIVE_BUTTON).click();
    }
}
