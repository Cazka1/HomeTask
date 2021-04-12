package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IPhone12ProPage extends BasePage {
private static final By PRODUCT_NAME = By.xpath("//h1[@class='product__title']");
private static final By BUY_BUTTON = By.xpath("//button[@aria-label='Купити']");
    public IPhone12ProPage(WebDriver driver) {
        super(driver);
    }
public String getProductName(){
     return driver.findElement(PRODUCT_NAME).getText();
}
public void clickOnBuyButton(){
        driver.findElement(BUY_BUTTON).click();
}

}
