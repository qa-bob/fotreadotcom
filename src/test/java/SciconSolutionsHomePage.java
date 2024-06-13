import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SciconSolutionsHomePage {
    @Test
    public void testFortrea() {

        WebDriver driver = getWebDriver();
        driver.get("https://www.fortrea.com/");  //TODO: Add this as part of the @BeforeTest routine
        //TODO: Need to handle the Cookies Prompt, and we should create a class to do this
        driver.manage().window().maximize();
        WebElement pageTitle = driver.findElement(By.cssSelector("head > title"));
        Assert.assertTrue(pageTitle.isEnabled());
        //TODO: Create the logging of the test:Name, App, feature, environment, result, type
        driver.quit();  //TODO: Add this as part of the @AfterTest routine
    }

    private static WebDriver getWebDriver() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @Test
    public void testFortreaPageText(){
        WebDriver driver = getWebDriver();
        driver.get("https://www.fortrea.com/");
        driver.manage().window().maximize();
        WebElement pageText = driver.findElement(By.cssSelector("div > h1"));
        String pageTextExpected = "Solutions that bring life-changing treatments to patients faster";
        String pageTextAcual = pageText.getText();
        Assert.assertEquals(pageTextAcual, pageTextExpected, "Page Text is not the same as expected");
        //Assert.assertEquals(pageTextAcual.contains(pageTextExpected), "Page Text is not the same as expected");
        driver.quit();
    }
}