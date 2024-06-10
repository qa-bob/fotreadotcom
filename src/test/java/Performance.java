import org.testng.annotations.Test;

public class Performance extends BaseClass {
    @Test
    public void testCaseHappyPath() {
        System.out.println("Test Happy Path");
    }
    @Test
    public void testCasePageLoadTime() {
        System.out.println("Test Page Load Time");
    }
    @Test
    public void testCaseConcurrencyTabs() {
        System.out.println("Test Concurrency - multiple tabs");
    }
    @Test
    public void testCaseConcurrencyBrowsers() {
        System.out.println("Test Concurrency - multiple browsers");
    }
    @Test
    public void testCaseBackground() {
        System.out.println("Test Ajax processing");
    }
    @Test
    public void testCasePayload() {
        System.out.println("Test calls back to server");
    }
    @Test
    public void testCaseNetworkLatency() {
        System.out.println("Test Network Latency");
    }
    @Test
    public void testCaseMobileNetworkEffect() {
        System.out.println("Test Mobile Network Latency");
    }
    @Test
    public void testCaseDataUpdates() {
        System.out.println("Test Data Updates triggers");
    }
    @Test
    public void testCasePerformanceTimeouts() {
        System.out.println("Test Performance Timeouts");
    }
}
