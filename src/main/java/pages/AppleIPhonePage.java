package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleIPhonePage extends BasePage {
private static final By APPLE_PRODUCTS_CHECKBOX = By.xpath("//*[@id='Apple']"); //"//*[@data-filter-name='producer']//input[@type='checkbox' and @id='Apple']"
//private static final By DELETE_ME = By.xpath("//button[@type='button']//span[text()=' Производитель ']"); //выбор производителя открыть
private static final By FIRST_IPHONE_PRODUCT = By.xpath("//span[@class='goods-tile__title']");
private static final By SORT_BUTTON = By.xpath("//select[@class='select-css ng-untouched ng-pristine ng-valid']");
private static final By FROM_EXPENSIVE_TO_CHEAP_BUTTON = By.xpath("//option[@value='2: expensive']");
private static final By FROM_CHEAP_TO_EXPANSIVE_BUTTON = By.xpath("//option[@value='1: cheap']");
private static final By PRODUCT_PRICE_LIST=By.xpath("//span[@class='goods-tile__price-value']");
    public AppleIPhonePage(WebDriver driver) {
        super(driver);
    }
//public void deleteClick(){driver.findElement(DELETE_ME).click();}

    public void clickOnAppleProductsButton() {
        driver.findElement(APPLE_PRODUCTS_CHECKBOX).click();
    }

public void clickOnFirstProduct(){
        driver.findElement(FIRST_IPHONE_PRODUCT).click();
}
public String ProductPriceList(){
return driver.findElement(PRODUCT_PRICE_LIST).getText();//текст першого ел?
}
public void clickOnSortButton(){
        driver.findElement(SORT_BUTTON).click();
}
public void clickOnExpensiveButton(){
        driver.findElement(FROM_CHEAP_TO_EXPANSIVE_BUTTON).click();
}
public void clickOnCheapButton(){
        driver.findElement(FROM_EXPENSIVE_TO_CHEAP_BUTTON).click();
}
}
