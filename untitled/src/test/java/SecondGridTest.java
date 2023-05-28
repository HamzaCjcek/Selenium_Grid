import org.testng.annotations.*;

import java.net.MalformedURLException;

import static utilities.DriverManage.*;

public class SecondGridTest {
    @Parameters("browser")
    @BeforeMethod
    void beforeClass(@Optional("browser")String browser) throws MalformedURLException {
        setDriver("grid_chrome");
    }
    @Test
    void homepage()
    {
        driver.get("http://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @AfterMethod
    void afterClass()
    {
      // closeDriver();
    }
}
