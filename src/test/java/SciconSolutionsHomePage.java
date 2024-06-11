import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SciconSolutionsHomePage {
    @Test
    public void testFortrea() {

        WebDriver driver = new ChromeDriver(); //TODO: Add this as part of the @BeforeTest routine
        driver.get("https://www.fortrea.com/");  //TODO: Add this as part of the @BeforeTest routine
        //TODO: Need to handle the Cookies Prompt, and we should create a class to do this
        driver.manage().window().maximize();
        WebElement pageTitle = driver.findElement(By.cssSelector("head > title"));
        Assert.assertTrue(pageTitle.isEnabled());
        //TODO: Create the logging of the test:Name, App, feature, environment, result, type
        driver.quit();  //TODO: Add this as part of the @AfterTest routine
    }
}