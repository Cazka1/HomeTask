package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Slf4j
public class IPhone12ProPage extends BasePage {
private static final By PRODUCT_NAME = By.xpath("//h1[text()=' Мобільний телефон Apple iPhone 12 Pro Max 256 GB Gold Офіційна гарантія ']");
private static final By BUY_BUTTON = By.xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted']");
    public IPhone12ProPage(WebDriver driver) {
        super(driver);
    }
public String getProductName(){
       String productName=driver.findElement(PRODUCT_NAME).getText();
    log.info("product name:{}",productName);
     return productName;

}
public void clickOnBuyButton(){
        driver.findElement(BUY_BUTTON).click();
}

}
