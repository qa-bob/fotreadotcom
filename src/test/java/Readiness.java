import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Readiness {
    @Test
    public void testCase() {
        System.out.println("Test Suite method");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite method");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fortrea.com/");
        WebElement pageTitle = driver.findElement(By.cssSelector("head > title"));
        Assert.assertTrue(pageTitle.isEnabled());
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}
