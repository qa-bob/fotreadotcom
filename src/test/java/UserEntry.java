import org.testng.annotations.Test;

public class UserEntry extends BaseClass {
    @Test
    public void testCaseHappyPath() {
        System.out.println("Test HappyPath");
    }
    @Test
    public void testCaseBoundaries() {
        System.out.println("Test Boundaries");
    }
    @Test
    public void testCaseValidation() {
        System.out.println("Test Validation");
    }
    @Test
    public void testCaseCopyPasting() {
        System.out.println("Test Copy Paste");
    }
    @Test
    public void testCaseDoubleEncoding() {
        System.out.println("Test Double Encoding");
    }
    @Test
    public void testCaseSQlInjection() {
        System.out.println("Test SQl Injection");
    }
    @Test
    public void testCaseXSS() {
        System.out.println("Test XSS");
    }
}
