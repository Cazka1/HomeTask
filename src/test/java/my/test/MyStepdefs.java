package my.test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.test.Manager;
import my.test.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    private static final long DEFAULT_TIMEOUT = 40;
    private static final By FROM_EXPENSIVE_TO_CHEAP_BUTTON = By.xpath("//option[@value='2: expensive']");
    private static final By FROM_CHEAP_TO_EXPANSIVE_BUTTON = By.xpath("//option[@value='1: cheap']");
    private static final By BUY_BUTTON = By.xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted']");
    WebDriver driver;
    private HomePage homePage;
    private AppleIPhonePage appleIPhonePage;
    private CartPage cartPage;
    private IPhone12ProPage iPhone12ProPage;
    private LogInPage logInPage;
    private RegistrationPage registrationPage;
    private Manager manager;
    private String ROZETKA_URL = "https://rozetka.com.ua/";

    @Before
    public void profileSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        manager = new Manager(driver);
        driver.get(ROZETKA_URL);

    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @When("User click on 'UA' button")
    public void userClickOnUAButton() {
        homePage = manager.getHomePage();
        homePage.clickOnSelectLanguageUA();
    }

    @When("User clicks on 'Search Field'")
    public void userClicksOnSearchField() {
        homePage = manager.getHomePage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickOnSearchField();
    }

    @And("User write {string} and click Enter button")
    public void userWriteSearchWordAndClickEnterButton(final String word) {
        homePage.searchByKeyword(word);
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);

    }

    @And("User choose 'Apple' producer")
    public void userChooseAppleProducer() {
        appleIPhonePage = manager.getAppleIPhonePage();
        appleIPhonePage.clickOnAppleProductsButton();

    }

    @And("User click on first product")
    public void userClickOnFirstProduct() {
        appleIPhonePage.clickOnFirstProduct();

    }

    @And("user check that product name contains {string}")
    public void userCheckThatSearchWordContainsProductName(final String prodName) {
        iPhone12ProPage = manager.getIPhone12ProPage();
        homePage.implicitWait(DEFAULT_TIMEOUT);
        assertTrue(iPhone12ProPage.getProductName().contains(prodName));
    }

    @And("user click buy button")
    public void userClickBuyButton() {
        WebElement myElement = driver.findElement(BUY_BUTTON);
        Actions builder = new Actions(driver);
        builder.moveToElement(myElement).build().perform();
        iPhone12ProPage.clickOnBuyButton();
    }

    @Then("User see cart window")
    public void userSeeCartWindow() {
        cartPage = manager.getCartPage();
        homePage.implicitWait(DEFAULT_TIMEOUT);
        assertTrue(cartPage.cartPageVisible());
    }

    @When("User clicks on 'Log In' button")
    public void userClicksOnLogInButton() {
        homePage.clickOnSignInButton();
        homePage.implicitWait(DEFAULT_TIMEOUT);
    }

    @And("User click 'Registration' button")
    public void userClickRegistrationButton() {
        logInPage = manager.getLogInPage();
        logInPage.clickOnRegistrationButton();
    }

    @And("User clicks on 'Name' field")
    public void userClicksOnNameField() {
        registrationPage = manager.getRegistrationPage();
        registrationPage.clickOnNameField();
    }

    @And("User enter name {string}")
    public void userEnterName(final String word) {
        homePage.implicitWait(DEFAULT_TIMEOUT);
        registrationPage.enterName(word);
    }


    @And("User clicks on 'Surname' field")
    public void userClicksOnSurnameField() {
        registrationPage.clickOnSurnameField();
    }

    @And("User enter surname {string}")
    public void userWriteWord(final String surname) {
        registrationPage.enterSurname(surname);
    }


    @And("User click on 'Phone Number' field")
    public void userClickOnPhoneNumberField() {
        registrationPage.clickOnPhoneNumberField();
    }

    @And("User enter phone number {string}")
    public void userWrPhoneNumber(final String phoneNumber) {
        registrationPage.enterPhoneNumber(phoneNumber);
    }

    @And("User clicks on 'Password' field'")
    public void userClicksOnPasswordField() {
        registrationPage.clickOnPasswordField();
    }

    @And("User enter password {string}")
    public void userWriPassword(final String password) {
        registrationPage.enterPassword(password);
    }

    @And("user click on 'registration' button")
    public void userClickOnRegistrationButton() {
        registrationPage.clickOnRegistrationButton();
    }

    @Then("User see 'Write e-mail' message")
    public void userSeeWriteEMailMessage() {
        assertTrue(registrationPage.mailErrorMessage());
    }

    @And("User Write {string}")
    public void userWriteSearchWord(final String word) {
        homePage.clickOnSearchField();
        homePage.writeWordInSearchField(word);
    }

    @Then("User see 'Message'")
    public void userSeeMessage() {
        homePage.implicitWait(DEFAULT_TIMEOUT);
        assertTrue(homePage.noResult());

    }

    @And("User click 'Sort Button'")
    public void userClickSortButton() {
        appleIPhonePage.clickOnSortButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User click 'From Cheap to Expensive' button")
    public void userClickFromCheapToExpensiveButton() {
        appleIPhonePage.clickOnCheapButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User check that first product cheaper than last")
    public void userCheckThatFirstProductCheaperThanLast() {

        List<WebElement> list = appleIPhonePage.getProductPriceList();
        for (int i = 1; i < list.size(); i++) {
            String string = list.get(i).getText().replaceAll(" ", "");
            String string1 = list.get(i - 1).getText().replaceAll(" ", "");
            int value = Integer.parseInt(string);
            int value1 = Integer.parseInt(string1);
            assertTrue(value1 <= value);
        }
    }

    @And("User click 'From Expensive to Cheap' button")
    public void userClickFromExpensiveToCheapButton() {
        appleIPhonePage.clickOnExpensiveButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @Then("User check that first product more expensive than last")
    public void userCheckThatFirstProductMoreExpensiveThanLast() {
        List<WebElement> list = appleIPhonePage.getProductPriceList();
        for (int i = 1; i < list.size(); i++) {
            String string = list.get(i).getText().replaceAll(" ", "");
            String string1 = list.get(i - 1).getText().replaceAll(" ", "");
            int value = Integer.parseInt(string);
            int value1 = Integer.parseInt(string1);
            assertTrue(value <= value1);
        }
    }


    @And("User click 'Small tiles'")
    public void userClickSmallTiles() {
        appleIPhonePage.clickOnSmallTilesButton();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User click 'Large tiles'")
    public void userClickLargeTiles() {
appleIPhonePage.clickOnLargeTilesButton();
homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }
}
