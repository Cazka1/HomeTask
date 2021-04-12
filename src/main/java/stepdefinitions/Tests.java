package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests {
    private static final long DEFAULT_TIMEOUT = 120;
    private WebDriver driver;
    private HomePage homePage;
    private AppleIPhonePage appleIPhonePage;
    private CartPage cartPage;
    private IPhone12ProPage iPhone12ProPage;
    private LogInPage logInPage;
    private RegistrationPage registrationPage;
    private PageFactoryManager pageFactoryManager;
    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @Given("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @When("User clicks on 'Search Field'")
    public void userClicksOnSearchField() {
        homePage.clickOnSearchField();
    }

    @And("User write {string} and click Enter button")
    public void userWriteSearchWordAndClickEnterButton(final String word) {
        homePage.searchByKeyword(word);

    }

    @And("User choose 'Apple' producer")
    public void userChooseAppleProducer() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
      //  homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT,By.xpath("//a[@href='/ua/search/?producer=69&text=Apple+iPhone+12+Pro+Max+256GB']"));
        appleIPhonePage.clickOnAppleProductsButton();
    }

    @And("User click on first product")
    public void userClickOnFirstProduct() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT,By.xpath("//span[text()=' Мобільний телефон Apple iPhone 12 Pro Max 256 GB Gold Офіційна гарантія ']"));
        appleIPhonePage.clickOnFirstProduct();
    }

    @And("user check that {string} contains {string}")
    public void userCheckThatSearchWordContainsProductName() {
  assertTrue(iPhone12ProPage.getProductName().contains(appleIPhonePage.ProductPriceList()));
    }

    @Then("User see cart window")
    public void userSeeCartWindow() {
        homePage.implicitWait(DEFAULT_TIMEOUT);
     assertTrue(cartPage.cartPageVisible());
    }

    @When("User clicks on 'Log In' button")
    public void userClicksOnLogInButton() {
        homePage.clickOnSignInButton();
    }

    @And("User click 'Registration' button")
    public void userClickRegistrationButton() {
        logInPage.clickOnRegistrationButton();
    }

//    @And("User click on 'Sign In' button")
//    public void userClickOnSignInButton() {
//registrationPage
//    }

//    @And("User clicks on 'Name' field")
//    public void userClicksOnNameField() {
//        registrationPage.enterName();
//    }

    @And("User enter {string}")
    public void userEnterName(final String name) {
        registrationPage.enterName(name);
    }
//
//    @And("User clicks on 'Surname' field")
//    public void userClicksOnSurnameField() {
//    }
    @And("User write {string}")
    public void userWriteSurname(final String surname) {
        registrationPage.enterSurname(surname);
    }
//
//    @And("User click on 'Phone Number' field")
//    public void userClickOnPhoneNumberField() {
//    }

    @And("User clicks on 'Password' field'")
    public void userClicksOnPasswordField() {
    }

    @Then("User see 'Write e-mail' message")
    public void userSeeWriteEMailMessage() {
    }

    @And("User see {string}")
    public void userSeeMessage() {
    }

    @And("User click {string}")
    public void userClickSortButton() {
    }

    @And("User check that first product cheaper than last")
    public void userCheckThatFirstProductCheaperThanLast() {
    }

    @Then("User check that first product more expensive than last")
    public void userCheckThatFirstProductMoreExpensiveThanLast() {
    }


    @After
    public void tearDown() {
        driver.close();
    }


}
