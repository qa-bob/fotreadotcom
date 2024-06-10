import org.testng.annotations.Test;

public class Authentication extends BaseClass {
    @Test
    public void testCaseHappyPath() {
        System.out.println("Test Happy Path");
    }
    @Test
    public void testCaseLogs() {
        System.out.println("Test Logs contain correct authentication information");
    }
    @Test
    public void testCaseCookies() {
        System.out.println("Test Cookies are properly CRUD");
    }
    @Test
    public void testCaseSession() {
        System.out.println("Test Session Tokens are correct");
    }
    @Test
    public void testCaseSessionStealing() {
        System.out.println("Test Session Stealing");
    }
    @Test
    public void testCaseSessionManipulation() {
        System.out.println("Test Session Manipulation");
    }
}
