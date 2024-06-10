import org.testng.annotations.Test;

public class Environment extends BaseClass {
    @Test
    public void testCaseDesktop() {
        System.out.println("Test Desktop System");
    }
    @Test
    public void testCaseMobleDevice() {
        System.out.println("Test MobleDevice");
    }
    @Test
    public void testCaseWiFi() {
        System.out.println("Test WiFi");
    }
    @Test
    public void testCaseMobileDataNetwork() {
        System.out.println("Test MobileDataNetwork");
    }
    @Test
    public void testCaseDroppedConnection() {
        System.out.println("Test DroppedConnection");
    }
    @Test
    public void testCaseSwitchingTowers() {
        System.out.println("Test SwitchingTowers");
    }
    @Test
    public void testCase5Gto4G() {
        System.out.println("Test 5Gto4G");
    }
    @Test
    public void testCaseThrottled() {
        System.out.println("Test Throttled");
    }
}
