import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.List;

public class Accessibility extends BaseClass{
    @Test
    public void testCaseHotKeys() throws InterruptedException {
        System.out.println("Test HotKeys");
    }

    @Test
    public void testCasePageTitles() {
        System.out.println("Test Page Titles");
    }
    @Test
    public void testCaseTextSize() {
        System.out.println("Test Text Size");
    }
    @Test
    public void testCaseTextColour() {
        System.out.println("Test for Text Colour");
    }
    @Test
    public void testCaseImages() {
        System.out.println("Test Images");
    }
    @Test
    public void testCaseForms() {
        System.out.println("Test Forms");
    }
    @Test
    public void testCaseErrors() {
        System.out.println("Test Errors");
    }
    @Test
    public void testCaseTooltips() {
        System.out.println("Test ToolTips");
    }
}
