import org.testng.annotations.*;

import static utilities.DriverManage.*;

public class ThridGridTest {
    @Parameters("browser")
    @BeforeMethod
    void beforeClass(@Optional ("browser") String browser) throws Exception {
        setDriver("grid_edge");
    }
    @Test
    void test()
    {
        driver.get("http://www.youtube.com");
        System.out.println(driver.getCurrentUrl());
    }
    @AfterMethod
    void afterClass()
    {
        //closeDriver();
    }
}
