import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestClass1 {
    public static WebDriver driver;

    @BeforeMethod
    public void launchDriver() throws MalformedURLException {
        URL url = new URL("http://192.168.1.20:4444");
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.ANY);
        driver = new RemoteWebDriver(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void Test1() {
        driver.get("https://www.google.com/");
        System.out.println("Test1 title is " + driver.getTitle());
    }

    @Test
    public void Test2() {
        driver.get("https://www.google.com/");
        System.out.println("Test2 title is " + driver.getTitle());
    }

    @Test
    public void Test3() {
        driver.get("https://www.google.com/");
        System.out.println("Test3 title is " + driver.getTitle());
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

}
