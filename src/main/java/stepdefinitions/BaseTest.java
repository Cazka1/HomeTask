//package stepdefinitions;
//
//import io.cucumber.java.Before;
//import manager.Manager;
//import org.junit.After;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pages.*;
//
//import java.lang.reflect.Method;
//
//import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
//
//public class BaseTest {
//    private WebDriver driver;
//    private Manager pageFactoryManager;
//private static final String ROZETKA_URL = "https://rozetka.com.ua/";
//    public WebDriver getDriver() {
//        return driver;
//    }
//
//    @Before
//    public void profileSetUp() {
//        chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        pageFactoryManager = new Manager(driver);
//        driver.get(ROZETKA_URL);
//
//    }
//
//
//    @After
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }
//
//
//}
