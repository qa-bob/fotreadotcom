import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

    private static WebDriver driver;

    @BeforeTest
    static WebDriver getWebDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.fortrea.com/");
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BaseClass's Before Test method");

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("BaseClass's After Test method");
        driver.quit();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BaseClass's Before Class method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("BaseClass's After Class method");
        driver.quit();
    }
}
