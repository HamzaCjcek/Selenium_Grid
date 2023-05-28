import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import static utilities.RemouteDriver.*;

public class FirsGridTest {
    WebDriver driver;

    @Test
    public void test() throws MalformedURLException {
        driver = remouteChromeDriver();
        driver.get("http://www.google.com");
    }
    @Test
    public void test2() throws MalformedURLException {
        driver = remouteEdgeDriver();
        driver.get("http://www.amazon.com");
    }

}
