package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManage {
     public static WebDriver driver;


/*
 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        System.setProperty("webdriver.msedge.driver", "drivers/msedgedriver.exe");

 */

    public static void setDriver(String browser) throws MalformedURLException {

        switch (browser)
        {
            case "grid_firefox":
            {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), firefoxOptions);
                System.out.println(" ************** RemouteFirefox Çalıştı ******************");
                break;
            }
            case "grid_chrome":
            {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), chromeOptions);
                System.out.println(" ************** RemouteChrome Çalıştı ******************");
                break;
            }
            case "grid_edge":
            {
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("start-maximized");
                driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), edgeOptions);
                System.out.println(" ************** RemouteEdge Çalıştı ******************");
                break;
            }
            case "grid_IE":
            {
                InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
               // internetExplorerOptions.addArguments("start-maximized");
                driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), internetExplorerOptions);
                System.out.println(" ************** RemouteIE Çalıştı ******************");
                break;
            }
            case "chrome":
            {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--romete-allow-origins=*");
                chromeOptions.addArguments("start-maximized");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                break;
            }
            case "firefox":
            {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "edge":
            {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            }
            case "IE":
            {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            }
            default:
            {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--romete-allow-origins=*");
                chromeOptions.addArguments("start-maximized");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    public static void closeDriver()
    {
        if(driver!=null)
        {
            driver.close();
            driver=null;
        }
    }
    public static void quitDriver()
    {
        if(driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }
}
