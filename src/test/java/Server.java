import org.testng.annotations.Test;

public class Server extends BaseClass{
    @Test
    public void testCaseServersideValidation() {
        System.out.println("Test Serverside Validation");
    }
    @Test
    public void testCaseDataAccuracy() {
        System.out.println("Test Data Accuracy");
    }
    @Test
    public void testCaseTimeouts() {
        System.out.println("Test Timeouts");
    }
    @Test
    public void testCaseInaccessible() {
        System.out.println("Test Server is Inaccessible");
    }
    @Test
    public void testCaseUnexpectedResponses() {
        System.out.println("Test Unexpected Responses");
    }
}
