//package definitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import my.test.Manager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
//
//public class Hooks {
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
//    @After
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }
//
//
//
//}
