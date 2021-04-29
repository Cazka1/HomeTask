//package my.test.step.definitions;
//
//import io.cucumber.java.Scenario;
////import myTest.manager.Manager;
//import my.test.pages.*;
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
//
//public class Hooks {
//
//    private WebDriver driver;
//    private static final String ROZETKA_URL = "https://rozetka.com.ua/";
//    @Before
//    public void profileSetUp() {
//        chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(ROZETKA_URL);
//    }
//
//    public WebDriver getDriver() {
//        return driver;
//    }
//    public HomePage getHomePage()    {
//
//        return new HomePage(driver);
//    }
//    public AppleIPhonePage getAppleIPhonePage() {
//        return new AppleIPhonePage(driver);
//    }
//    public CartPage getCartPage() {
//        return new CartPage(driver);
//    }
//    public IPhone12ProPage getIPhone12ProPage() {
//        return new IPhone12ProPage(driver);
//    }
//    public LogInPage getLogInPage() {
//        return new LogInPage(driver);
//    }
//    public RegistrationPage getRegistrationPage() {
//        return new RegistrationPage(driver);
//    }
//    @After
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }
//
//
//
//}
