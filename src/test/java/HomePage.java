import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseClass{
    @Test
    public void testFortrea() {

        WebDriver driver = getWebDriver();
        WebElement pageTitle = driver.findElement(By.cssSelector("head > title"));
        Assert.assertTrue(pageTitle.isEnabled());
        //TODO: Create the logging of the test:Name, App, feature, environment, result, type
        driver.quit();  //TODO: Add this as part of the @AfterTest routine
    }

    @Test
    public void testFortreaPageText(){
        WebDriver driver = getWebDriver();  //TODO: Need to not build a new driver for each Test
        WebElement pageText = driver.findElement(By.cssSelector("div > h1"));
        String pageTextExpected = "Solutions that bring life-changing treatments to patients faster";
        String pageTextAcual = pageText.getText();
        Assert.assertEquals(pageTextAcual, pageTextExpected, "Page Text is not the same as expected");
        driver.quit();
    }
}