package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class RemouteDriver {
    public static WebDriver driver;

    public static WebDriver remouteChromeDriver() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        // Tarayıcı seçeneklerini yapılandırma
        // Örneğin: options.addArguments("--start-maximized");  - Tarayıcıyı tam ekran olarak başlatır
        driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println(" ************** RemouteChrome Çalıştı ******************");
        return driver;
    }
    public static WebDriver remouteFirefoxDriver() throws MalformedURLException {
        FirefoxOptions options = new FirefoxOptions();
        // Tarayıcı seçeneklerini yapılandırma
        // Örneğin: options.addArguments("--start-maximized");  - Tarayıcıyı tam ekran olarak başlatır
        driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println(" ************** RemouteFirefox Çalıştı ******************");

        return driver;
    }
    public static WebDriver remouteEdgeDriver() throws MalformedURLException {
        EdgeOptions options = new EdgeOptions();
        // Tarayıcı seçeneklerini yapılandırma
        // Örneğin: options.addArguments("--start-maximized");  - Tarayıcıyı tam ekran olarak başlatır
        driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        System.out.println(" ************** RemouteEdge Çalıştı ******************");

        return driver;
    }
    public static WebDriver remouteIEDriver() throws MalformedURLException {
        InternetExplorerOptions options = new InternetExplorerOptions();
        // Tarayıcı seçeneklerini yapılandırma
        // Örneğin: options.addArguments("--start-maximized");  - Tarayıcıyı tam ekran olarak başlatır
        driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), options);
        System.out.println(" ************** RemouteIE Çalıştı ******************");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }


}
