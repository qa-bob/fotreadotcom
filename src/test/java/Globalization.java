import org.testng.annotations.Test;

public class Globalization extends BaseClass {
    @Test
    public void testCaseHappyPath() {
        System.out.println("Test Happy Path US English");
    }
    @Test
    public void testCaseSupportedLanguages() {
        System.out.println("Test All Supported Languages");
    }
    @Test
    public void testCaseUnsupportedLanguages() {
        System.out.println("Test UnSupported Languages - Turkish");
    }
    @Test
    public void testCaseFormatting() {
        System.out.println("Test Formatting");
    }
    @Test
    public void testCaseAlignment() {
        System.out.println("Test Alignment Spacing Layout");
    }
    @Test
    public void testCaseDates() {
        System.out.println("Test Date and Time");
    }
    @Test
    public void testCaseNumbers() {
        System.out.println("Test Numbers International");
    }
    @Test
    public void testCaseCurrency() {
        System.out.println("Test Currency Money");
    }
    @Test
    public void testCaseLangSpecificCharas() {
        System.out.println("Test Language Specific Charaters - Arabic");
    }
    @Test
    public void testCaseHotkeys() {
        System.out.println("Test Hotkeys");
    }
    @Test
    public void testCaseErrorMessages() {
        System.out.println("Test Error Messages in correct language");
    }
    @Test
    public void testCaseLangTooltips() {
        System.out.println("Test Correct Language for Tooltips");
    }
}
